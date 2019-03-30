package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExtensionASTNodesFieldsKey extends js.Object {
  var extensionASTNodes: js.Array[graphqlLib.languageAstMod.InterfaceTypeExtensionNode]
  var fields: graphqlLib.typeDefinitionMod.GraphQLFieldConfigMap[_, _, org.scalablytyped.runtime.StringDictionary[_]]
}

object Anon_ExtensionASTNodesFieldsKey {
  @scala.inline
  def apply(
    extensionASTNodes: js.Array[graphqlLib.languageAstMod.InterfaceTypeExtensionNode],
    fields: graphqlLib.typeDefinitionMod.GraphQLFieldConfigMap[_, _, org.scalablytyped.runtime.StringDictionary[_]]
  ): Anon_ExtensionASTNodesFieldsKey = {
    val __obj = js.Dynamic.literal(extensionASTNodes = extensionASTNodes, fields = fields)
  
    __obj.asInstanceOf[Anon_ExtensionASTNodesFieldsKey]
  }
}

