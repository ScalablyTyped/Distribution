package typings
package graphqlLib.typeDefinitionMod

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
  var astNode: graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.InputObjectTypeDefinitionNode] = js.native
  var description: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String] = js.native
  var extensionASTNodes: graphqlLib.tsutilsMaybeMod.Maybe[js.Array[graphqlLib.languageAstMod.InputObjectTypeExtensionNode]] = js.native
  var name: java.lang.String = js.native
  def getFields(): GraphQLInputFieldMap = js.native
  def inspect(): java.lang.String = js.native
  def toConfig(): GraphQLInputObjectTypeConfig with graphqlLib.Anon_ExtensionASTNodesFieldsGraphQLInputFieldConfigMap = js.native
  def toJSON(): java.lang.String = js.native
}

