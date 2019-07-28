package typings.graphql

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.languageAstMod.InterfaceTypeExtensionNode
import typings.graphql.typeDefinitionMod.GraphQLFieldConfigMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExtensionASTNodesFieldsKey extends js.Object {
  var extensionASTNodes: js.Array[InterfaceTypeExtensionNode]
  var fields: GraphQLFieldConfigMap[_, _, StringDictionary[_]]
}

object Anon_ExtensionASTNodesFieldsKey {
  @scala.inline
  def apply(
    extensionASTNodes: js.Array[InterfaceTypeExtensionNode],
    fields: GraphQLFieldConfigMap[_, _, StringDictionary[_]]
  ): Anon_ExtensionASTNodesFieldsKey = {
    val __obj = js.Dynamic.literal(extensionASTNodes = extensionASTNodes, fields = fields)
  
    __obj.asInstanceOf[Anon_ExtensionASTNodesFieldsKey]
  }
}

