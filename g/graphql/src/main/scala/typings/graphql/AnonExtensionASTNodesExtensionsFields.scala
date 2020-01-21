package typings.graphql

import typings.graphql.astMod.InputObjectTypeExtensionNode
import typings.graphql.definitionMod.GraphQLInputFieldConfigMap
import typings.graphql.maybeMod.Maybe
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtensionASTNodesExtensionsFields extends js.Object {
  var extensionASTNodes: js.Array[InputObjectTypeExtensionNode]
  var extensions: Maybe[Record[String, _]]
  var fields: GraphQLInputFieldConfigMap
}

object AnonExtensionASTNodesExtensionsFields {
  @scala.inline
  def apply(
    extensionASTNodes: js.Array[InputObjectTypeExtensionNode],
    fields: GraphQLInputFieldConfigMap,
    extensions: Maybe[Record[String, _]] = null
  ): AnonExtensionASTNodesExtensionsFields = {
    val __obj = js.Dynamic.literal(extensionASTNodes = extensionASTNodes.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExtensionASTNodesExtensionsFields]
  }
}

