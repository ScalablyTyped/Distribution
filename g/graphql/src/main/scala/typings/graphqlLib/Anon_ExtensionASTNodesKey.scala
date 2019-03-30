package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExtensionASTNodesKey extends js.Object {
  var extensionASTNodes: js.Array[graphqlLib.languageAstMod.UnionTypeExtensionNode]
  var types: js.Array[
    graphqlLib.typeDefinitionMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]]
  ]
}

object Anon_ExtensionASTNodesKey {
  @scala.inline
  def apply(
    extensionASTNodes: js.Array[graphqlLib.languageAstMod.UnionTypeExtensionNode],
    types: js.Array[
      graphqlLib.typeDefinitionMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]]
    ]
  ): Anon_ExtensionASTNodesKey = {
    val __obj = js.Dynamic.literal(extensionASTNodes = extensionASTNodes, types = types)
  
    __obj.asInstanceOf[Anon_ExtensionASTNodesKey]
  }
}

