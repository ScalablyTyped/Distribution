package typings.graphql

import typings.graphql.languageAstMod.InputObjectTypeExtensionNode
import typings.graphql.typeDefinitionMod.GraphQLInputFieldConfigMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExtensionASTNodesFieldsGraphQLInputFieldConfigMap extends js.Object {
  var extensionASTNodes: js.Array[InputObjectTypeExtensionNode]
  var fields: GraphQLInputFieldConfigMap
}

object Anon_ExtensionASTNodesFieldsGraphQLInputFieldConfigMap {
  @scala.inline
  def apply(extensionASTNodes: js.Array[InputObjectTypeExtensionNode], fields: GraphQLInputFieldConfigMap): Anon_ExtensionASTNodesFieldsGraphQLInputFieldConfigMap = {
    val __obj = js.Dynamic.literal(extensionASTNodes = extensionASTNodes, fields = fields)
  
    __obj.asInstanceOf[Anon_ExtensionASTNodesFieldsGraphQLInputFieldConfigMap]
  }
}

