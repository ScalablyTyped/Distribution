package typings.graphql.typeSchemaMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.Anon_AllowedLegacyNames
import typings.graphql.languageAstMod.SchemaDefinitionNode
import typings.graphql.languageAstMod.SchemaExtensionNode
import typings.graphql.tsutilsMaybeMod.Maybe
import typings.graphql.typeDefinitionMod.GraphQLAbstractType
import typings.graphql.typeDefinitionMod.GraphQLNamedType
import typings.graphql.typeDefinitionMod.GraphQLObjectType
import typings.graphql.typeDirectivesMod.GraphQLDirective
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type/schema", "GraphQLSchema")
@js.native
class GraphQLSchema protected () extends js.Object {
  def this(config: GraphQLSchemaConfig) = this()
  var astNode: Maybe[SchemaDefinitionNode] = js.native
  var extensionASTNodes: Maybe[js.Array[SchemaExtensionNode]] = js.native
  var extensions: Maybe[Record[String, _]] = js.native
  def getDirective(name: String): Maybe[GraphQLDirective] = js.native
  def getDirectives(): js.Array[GraphQLDirective] = js.native
  def getMutationType(): Maybe[GraphQLObjectType[_, _, StringDictionary[_]]] = js.native
  def getPossibleTypes(abstractType: GraphQLAbstractType): js.Array[GraphQLObjectType[_, _, StringDictionary[_]]] = js.native
  def getQueryType(): Maybe[GraphQLObjectType[_, _, StringDictionary[_]]] = js.native
  def getSubscriptionType(): Maybe[GraphQLObjectType[_, _, StringDictionary[_]]] = js.native
  def getType(name: String): Maybe[GraphQLNamedType] = js.native
  def getTypeMap(): TypeMap = js.native
  def isPossibleType(abstractType: GraphQLAbstractType, possibleType: GraphQLObjectType[_, _, StringDictionary[_]]): Boolean = js.native
  def toConfig(): GraphQLSchemaConfig with Anon_AllowedLegacyNames = js.native
}

