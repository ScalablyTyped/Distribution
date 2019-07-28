package typings.graphql.typeDefinitionMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.Anon_ExtensionASTNodesFieldsKey
import typings.graphql.languageAstMod.InterfaceTypeDefinitionNode
import typings.graphql.languageAstMod.InterfaceTypeExtensionNode
import typings.graphql.tsutilsMaybeMod.Maybe
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
  def this(config: GraphQLInterfaceTypeConfig[_, _, StringDictionary[_]]) = this()
  var astNode: js.UndefOr[Maybe[InterfaceTypeDefinitionNode]] = js.native
  var description: Maybe[String] = js.native
  var extensionASTNodes: Maybe[js.Array[InterfaceTypeExtensionNode]] = js.native
  var name: String = js.native
  var resolveType: Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]] = js.native
  def getFields(): GraphQLFieldMap[_, _, StringDictionary[_]] = js.native
  def inspect(): String = js.native
  def toConfig(): (GraphQLInterfaceTypeConfig[_, _, StringDictionary[_]]) with Anon_ExtensionASTNodesFieldsKey = js.native
  def toJSON(): String = js.native
}

