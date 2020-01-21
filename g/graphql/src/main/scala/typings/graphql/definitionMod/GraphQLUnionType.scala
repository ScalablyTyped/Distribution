package typings.graphql.definitionMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.AnonExtensionASTNodesKey
import typings.graphql.astMod.UnionTypeDefinitionNode
import typings.graphql.astMod.UnionTypeExtensionNode
import typings.graphql.maybeMod.Maybe
import typings.std.Record
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
  var extensions: Maybe[Record[String, _]] = js.native
  var name: String = js.native
  var resolveType: Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]] = js.native
  def getTypes(): js.Array[GraphQLObjectType[_, _, StringDictionary[_]]] = js.native
  def inspect(): String = js.native
  def toConfig(): (GraphQLUnionTypeConfig[_, _]) with AnonExtensionASTNodesKey = js.native
  def toJSON(): String = js.native
}

