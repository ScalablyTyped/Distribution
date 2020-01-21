package typings.graphql

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.UnionTypeExtensionNode
import typings.graphql.definitionMod.GraphQLObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtensionASTNodesKey extends js.Object {
  var extensionASTNodes: js.Array[UnionTypeExtensionNode]
  var types: js.Array[GraphQLObjectType[_, _, StringDictionary[_]]]
}

object AnonExtensionASTNodesKey {
  @scala.inline
  def apply(
    extensionASTNodes: js.Array[UnionTypeExtensionNode],
    types: js.Array[GraphQLObjectType[_, _, StringDictionary[_]]]
  ): AnonExtensionASTNodesKey = {
    val __obj = js.Dynamic.literal(extensionASTNodes = extensionASTNodes.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExtensionASTNodesKey]
  }
}

