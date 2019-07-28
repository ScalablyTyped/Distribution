package typings.graphql.typeDefinitionMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.Anon_ExtensionASTNodesKey
import typings.graphql.languageAstMod.UnionTypeDefinitionNode
import typings.graphql.languageAstMod.UnionTypeExtensionNode
import typings.graphql.tsutilsMaybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type/definition", "GraphQLUnionType")
@js.native
class GraphQLUnionType protected ()
  extends GraphQLAbstractType
     with _GraphQLCompositeType
     with _GraphQLNamedType
     with _GraphQLNullableType
     with _GraphQLOutputType
     with _GraphQLType {
  def this(config: GraphQLUnionTypeConfig[_, _]) = this()
  var astNode: Maybe[UnionTypeDefinitionNode] = js.native
  var description: Maybe[String] = js.native
  var extensionASTNodes: Maybe[js.Array[UnionTypeExtensionNode]] = js.native
  var name: String = js.native
  var resolveType: Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]] = js.native
  def getTypes(): js.Array[GraphQLObjectType[_, _, StringDictionary[_]]] = js.native
  def inspect(): String = js.native
  def toConfig(): (GraphQLUnionTypeConfig[_, _]) with Anon_ExtensionASTNodesKey = js.native
  def toJSON(): String = js.native
}

