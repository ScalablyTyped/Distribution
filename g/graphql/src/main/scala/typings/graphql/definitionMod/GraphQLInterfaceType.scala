package typings.graphql.definitionMod

import typings.graphql.anon.GraphQLInterfaceTypeConfi
import typings.graphql.anon.ReadonlyGraphQLInterfaceT
import typings.graphql.astMod.InterfaceTypeDefinitionNode
import typings.graphql.astMod.InterfaceTypeExtensionNode
import typings.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type/definition", "GraphQLInterfaceType")
@js.native
class GraphQLInterfaceType protected ()
  extends GraphQLAbstractType
     with _GraphQLCompositeType
     with _GraphQLNamedType
     with _GraphQLNullableType
     with _GraphQLOutputType
     with _GraphQLType {
  def this(config: ReadonlyGraphQLInterfaceT) = this()
  var astNode: js.UndefOr[Maybe[InterfaceTypeDefinitionNode]] = js.native
  var description: Maybe[String] = js.native
  var extensionASTNodes: Maybe[js.Array[InterfaceTypeExtensionNode]] = js.native
  var extensions: Maybe[js.Object] = js.native
  var name: String = js.native
  var resolveType: Maybe[GraphQLTypeResolver[_, _]] = js.native
  def getFields(): GraphQLFieldMap[_, _] = js.native
  def getInterfaces(): js.Array[GraphQLInterfaceType] = js.native
  def inspect(): String = js.native
  def toConfig(): GraphQLInterfaceTypeConfi = js.native
  def toJSON(): String = js.native
}

