package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExtensionASTNodesFields extends js.Object {
  var extensionASTNodes: js.Array[graphqlLib.languageAstMod.ObjectTypeExtensionNode]
  var fields: graphqlLib.typeDefinitionMod.GraphQLFieldConfigMap[_, _, org.scalablytyped.runtime.StringDictionary[_]]
  var interfaces: js.Array[graphqlLib.typeDefinitionMod.GraphQLInterfaceType]
}

object Anon_ExtensionASTNodesFields {
  @scala.inline
  def apply(
    extensionASTNodes: js.Array[graphqlLib.languageAstMod.ObjectTypeExtensionNode],
    fields: graphqlLib.typeDefinitionMod.GraphQLFieldConfigMap[_, _, org.scalablytyped.runtime.StringDictionary[_]],
    interfaces: js.Array[graphqlLib.typeDefinitionMod.GraphQLInterfaceType]
  ): Anon_ExtensionASTNodesFields = {
    val __obj = js.Dynamic.literal(extensionASTNodes = extensionASTNodes, fields = fields, interfaces = interfaces)
  
    __obj.asInstanceOf[Anon_ExtensionASTNodesFields]
  }
}

