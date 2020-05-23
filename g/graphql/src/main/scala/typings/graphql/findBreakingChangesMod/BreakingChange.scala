package typings.graphql.findBreakingChangesMod

import typings.graphql.graphqlStrings.ARG_CHANGED_KIND
import typings.graphql.graphqlStrings.ARG_REMOVED
import typings.graphql.graphqlStrings.DIRECTIVE_ARG_REMOVED
import typings.graphql.graphqlStrings.DIRECTIVE_LOCATION_REMOVED
import typings.graphql.graphqlStrings.DIRECTIVE_REMOVED
import typings.graphql.graphqlStrings.FIELD_CHANGED_KIND
import typings.graphql.graphqlStrings.FIELD_REMOVED
import typings.graphql.graphqlStrings.INTERFACE_REMOVED_FROM_OBJECT
import typings.graphql.graphqlStrings.REQUIRED_ARG_ADDED
import typings.graphql.graphqlStrings.REQUIRED_DIRECTIVE_ARG_ADDED
import typings.graphql.graphqlStrings.REQUIRED_INPUT_FIELD_ADDED
import typings.graphql.graphqlStrings.TYPE_CHANGED_KIND
import typings.graphql.graphqlStrings.TYPE_REMOVED
import typings.graphql.graphqlStrings.TYPE_REMOVED_FROM_UNION
import typings.graphql.graphqlStrings.VALUE_REMOVED_FROM_ENUM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreakingChange extends js.Object {
  var description: String
  var `type`: /* keyof graphql.graphql/utilities/findBreakingChanges._BreakingChangeType */ TYPE_REMOVED | TYPE_CHANGED_KIND | TYPE_REMOVED_FROM_UNION | VALUE_REMOVED_FROM_ENUM | REQUIRED_INPUT_FIELD_ADDED | INTERFACE_REMOVED_FROM_OBJECT | FIELD_REMOVED | FIELD_CHANGED_KIND | REQUIRED_ARG_ADDED | ARG_REMOVED | ARG_CHANGED_KIND | DIRECTIVE_REMOVED | DIRECTIVE_ARG_REMOVED | REQUIRED_DIRECTIVE_ARG_ADDED | DIRECTIVE_LOCATION_REMOVED
}

object BreakingChange {
  @scala.inline
  def apply(
    description: String,
    `type`: /* keyof graphql.graphql/utilities/findBreakingChanges._BreakingChangeType */ TYPE_REMOVED | TYPE_CHANGED_KIND | TYPE_REMOVED_FROM_UNION | VALUE_REMOVED_FROM_ENUM | REQUIRED_INPUT_FIELD_ADDED | INTERFACE_REMOVED_FROM_OBJECT | FIELD_REMOVED | FIELD_CHANGED_KIND | REQUIRED_ARG_ADDED | ARG_REMOVED | ARG_CHANGED_KIND | DIRECTIVE_REMOVED | DIRECTIVE_ARG_REMOVED | REQUIRED_DIRECTIVE_ARG_ADDED | DIRECTIVE_LOCATION_REMOVED
  ): BreakingChange = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreakingChange]
  }
}

