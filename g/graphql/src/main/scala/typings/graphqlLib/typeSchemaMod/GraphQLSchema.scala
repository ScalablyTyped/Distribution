package typings
package graphqlLib.typeSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type/schema", "GraphQLSchema")
@js.native
class GraphQLSchema protected () extends js.Object {
  def this(config: GraphQLSchemaConfig) = this()
  var astNode: graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.SchemaDefinitionNode] = js.native
  var extensionASTNodes: graphqlLib.tsutilsMaybeMod.Maybe[js.Array[graphqlLib.languageAstMod.SchemaExtensionNode]] = js.native
  def getDirective(name: java.lang.String): graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.typeDirectivesMod.GraphQLDirective] = js.native
  def getDirectives(): js.Array[graphqlLib.typeDirectivesMod.GraphQLDirective] = js.native
  def getMutationType(): graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.typeDefinitionMod.GraphQLObjectType] = js.native
  def getPossibleTypes(abstractType: graphqlLib.typeDefinitionMod.GraphQLAbstractType): js.Array[graphqlLib.typeDefinitionMod.GraphQLObjectType] = js.native
  def getQueryType(): graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.typeDefinitionMod.GraphQLObjectType] = js.native
  def getSubscriptionType(): graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.typeDefinitionMod.GraphQLObjectType] = js.native
  def getType(name: java.lang.String): graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.typeDefinitionMod.GraphQLNamedType] = js.native
  def getTypeMap(): TypeMap = js.native
  def isPossibleType(
    abstractType: graphqlLib.typeDefinitionMod.GraphQLAbstractType,
    possibleType: graphqlLib.typeDefinitionMod.GraphQLObjectType
  ): scala.Boolean = js.native
}

