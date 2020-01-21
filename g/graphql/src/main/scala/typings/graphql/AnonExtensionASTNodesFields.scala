package typings.graphql

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.ObjectTypeExtensionNode
import typings.graphql.definitionMod.GraphQLFieldConfigMap
import typings.graphql.definitionMod.GraphQLInterfaceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtensionASTNodesFields extends js.Object {
  var extensionASTNodes: js.Array[ObjectTypeExtensionNode]
  var fields: GraphQLFieldConfigMap[_, _, StringDictionary[_]]
  var interfaces: js.Array[GraphQLInterfaceType]
}

object AnonExtensionASTNodesFields {
  @scala.inline
  def apply(
    extensionASTNodes: js.Array[ObjectTypeExtensionNode],
    fields: GraphQLFieldConfigMap[_, _, StringDictionary[_]],
    interfaces: js.Array[GraphQLInterfaceType]
  ): AnonExtensionASTNodesFields = {
    val __obj = js.Dynamic.literal(extensionASTNodes = extensionASTNodes.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], interfaces = interfaces.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExtensionASTNodesFields]
  }
}

