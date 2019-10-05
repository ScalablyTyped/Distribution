package typings.graphql

import typings.graphql.languageAstMod.SchemaExtensionNode
import typings.graphql.tsutilsMaybeMod.Maybe
import typings.graphql.typeDefinitionMod.GraphQLNamedType
import typings.graphql.typeDirectivesMod.GraphQLDirective
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowedLegacyNames extends js.Object {
  var allowedLegacyNames: js.Array[String]
  var assumeValid: Boolean
  var directives: js.Array[GraphQLDirective]
  var extensionASTNodes: js.Array[SchemaExtensionNode]
  var extensions: Maybe[Record[String, _]]
  var types: js.Array[GraphQLNamedType]
}

object Anon_AllowedLegacyNames {
  @scala.inline
  def apply(
    allowedLegacyNames: js.Array[String],
    assumeValid: Boolean,
    directives: js.Array[GraphQLDirective],
    extensionASTNodes: js.Array[SchemaExtensionNode],
    types: js.Array[GraphQLNamedType],
    extensions: Maybe[Record[String, _]] = null
  ): Anon_AllowedLegacyNames = {
    val __obj = js.Dynamic.literal(allowedLegacyNames = allowedLegacyNames, assumeValid = assumeValid, directives = directives, extensionASTNodes = extensionASTNodes, types = types)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AllowedLegacyNames]
  }
}

