package typings.graphql

import typings.graphql.languageAstMod.InputObjectTypeExtensionNode
import typings.graphql.tsutilsMaybeMod.Maybe
import typings.graphql.typeDefinitionMod.GraphQLInputFieldConfigMap
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExtensionASTNodesExtensionsFields extends js.Object {
  var extensionASTNodes: js.Array[InputObjectTypeExtensionNode]
  var extensions: Maybe[Record[String, _]]
  var fields: GraphQLInputFieldConfigMap
}

object Anon_ExtensionASTNodesExtensionsFields {
  @scala.inline
  def apply(
    extensionASTNodes: js.Array[InputObjectTypeExtensionNode],
    extensions: Maybe[Record[String, _]],
    fields: GraphQLInputFieldConfigMap
  ): Anon_ExtensionASTNodesExtensionsFields = {
    val __obj = js.Dynamic.literal(extensionASTNodes = extensionASTNodes, extensions = extensions.asInstanceOf[js.Any], fields = fields)
  
    __obj.asInstanceOf[Anon_ExtensionASTNodesExtensionsFields]
  }
}

