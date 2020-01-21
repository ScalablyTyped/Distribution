package typings.graphql

import typings.graphql.astMod.SchemaExtensionNode
import typings.graphql.definitionMod.GraphQLNamedType
import typings.graphql.directivesMod.GraphQLDirective
import typings.graphql.maybeMod.Maybe
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowedLegacyNames extends js.Object {
  var allowedLegacyNames: js.Array[String]
  var assumeValid: Boolean
  var directives: js.Array[GraphQLDirective]
  var extensionASTNodes: js.Array[SchemaExtensionNode]
  var extensions: Maybe[Record[String, _]]
  var types: js.Array[GraphQLNamedType]
}

object AnonAllowedLegacyNames {
  @scala.inline
  def apply(
    allowedLegacyNames: js.Array[String],
    assumeValid: Boolean,
    directives: js.Array[GraphQLDirective],
    extensionASTNodes: js.Array[SchemaExtensionNode],
    types: js.Array[GraphQLNamedType],
    extensions: Maybe[Record[String, _]] = null
  ): AnonAllowedLegacyNames = {
    val __obj = js.Dynamic.literal(allowedLegacyNames = allowedLegacyNames.asInstanceOf[js.Any], assumeValid = assumeValid.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], extensionASTNodes = extensionASTNodes.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowedLegacyNames]
  }
}

