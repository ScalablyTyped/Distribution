package typings.graphql.findBreakingChangesMod

import typings.graphql.graphqlStrings.ARG_DEFAULT_VALUE_CHANGE
import typings.graphql.graphqlStrings.INTERFACE_ADDED_TO_OBJECT
import typings.graphql.graphqlStrings.OPTIONAL_ARG_ADDED
import typings.graphql.graphqlStrings.OPTIONAL_INPUT_FIELD_ADDED
import typings.graphql.graphqlStrings.TYPE_ADDED_TO_UNION
import typings.graphql.graphqlStrings.VALUE_ADDED_TO_ENUM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DangerousChange extends js.Object {
  var description: String
  var `type`: /* keyof graphql.graphql/utilities/findBreakingChanges._DangerousChangeType */ VALUE_ADDED_TO_ENUM | TYPE_ADDED_TO_UNION | OPTIONAL_INPUT_FIELD_ADDED | OPTIONAL_ARG_ADDED | INTERFACE_ADDED_TO_OBJECT | ARG_DEFAULT_VALUE_CHANGE
}

object DangerousChange {
  @scala.inline
  def apply(
    description: String,
    `type`: /* keyof graphql.graphql/utilities/findBreakingChanges._DangerousChangeType */ VALUE_ADDED_TO_ENUM | TYPE_ADDED_TO_UNION | OPTIONAL_INPUT_FIELD_ADDED | OPTIONAL_ARG_ADDED | INTERFACE_ADDED_TO_OBJECT | ARG_DEFAULT_VALUE_CHANGE
  ): DangerousChange = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DangerousChange]
  }
}

