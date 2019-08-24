package typings.graphql.typeDefinitionMod

import typings.graphql.Anon_ExtensionASTNodesExtensionsFields
import typings.graphql.languageAstMod.InputObjectTypeDefinitionNode
import typings.graphql.languageAstMod.InputObjectTypeExtensionNode
import typings.graphql.tsutilsMaybeMod.Maybe
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type/definition", "GraphQLInputObjectType")
@js.native
class GraphQLInputObjectType protected ()
  extends _GraphQLInputType
     with _GraphQLNamedType
     with _GraphQLNullableType
     with _GraphQLType {
  def this(config: GraphQLInputObjectTypeConfig) = this()
  var astNode: Maybe[InputObjectTypeDefinitionNode] = js.native
  var description: Maybe[String] = js.native
  var extensionASTNodes: Maybe[js.Array[InputObjectTypeExtensionNode]] = js.native
  var extensions: Maybe[Record[String, _]] = js.native
  var name: String = js.native
  def getFields(): GraphQLInputFieldMap = js.native
  def inspect(): String = js.native
  def toConfig(): GraphQLInputObjectTypeConfig with Anon_ExtensionASTNodesExtensionsFields = js.native
  def toJSON(): String = js.native
}

