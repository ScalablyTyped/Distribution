package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExtensionASTNodesFieldsGraphQLInputFieldConfigMap extends js.Object {
  var extensionASTNodes: js.Array[graphqlLib.languageAstMod.InputObjectTypeExtensionNode]
  var fields: graphqlLib.typeDefinitionMod.GraphQLInputFieldConfigMap
}

object Anon_ExtensionASTNodesFieldsGraphQLInputFieldConfigMap {
  @scala.inline
  def apply(
    extensionASTNodes: js.Array[graphqlLib.languageAstMod.InputObjectTypeExtensionNode],
    fields: graphqlLib.typeDefinitionMod.GraphQLInputFieldConfigMap
  ): Anon_ExtensionASTNodesFieldsGraphQLInputFieldConfigMap = {
    val __obj = js.Dynamic.literal(extensionASTNodes = extensionASTNodes, fields = fields)
  
    __obj.asInstanceOf[Anon_ExtensionASTNodesFieldsGraphQLInputFieldConfigMap]
  }
}

