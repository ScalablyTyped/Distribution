package typings.graphql

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.languageAstMod.UnionTypeExtensionNode
import typings.graphql.typeDefinitionMod.GraphQLObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExtensionASTNodesKey extends js.Object {
  var extensionASTNodes: js.Array[UnionTypeExtensionNode]
  var types: js.Array[GraphQLObjectType[_, _, StringDictionary[_]]]
}

object Anon_ExtensionASTNodesKey {
  @scala.inline
  def apply(
    extensionASTNodes: js.Array[UnionTypeExtensionNode],
    types: js.Array[GraphQLObjectType[_, _, StringDictionary[_]]]
  ): Anon_ExtensionASTNodesKey = {
    val __obj = js.Dynamic.literal(extensionASTNodes = extensionASTNodes.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ExtensionASTNodesKey]
  }
}

