package typings.graphqlDashBinding

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.graphqlMod.GraphQLObjectType
import typings.graphql.graphqlMod.GraphQLScalarType
import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphql.languageAstMod.DocumentNode
import typings.graphql.typeDefinitionMod.GraphQLOutputType
import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
import typings.graphqlDashBinding.distTypesMod.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-binding/dist/info", JSImport.Namespace)
@js.native
object distInfoMod extends js.Object {
  def addPath(prev: js.Any, key: js.Any): Anon_Key = js.native
  def buildInfo(rootFieldName: String, operation: Operation, schema: GraphQLSchema): GraphQLResolveInfo = js.native
  def buildInfo(rootFieldName: String, operation: Operation, schema: GraphQLSchema, info: String): GraphQLResolveInfo = js.native
  def buildInfo(rootFieldName: String, operation: Operation, schema: GraphQLSchema, info: DocumentNode): GraphQLResolveInfo = js.native
  def buildInfo(rootFieldName: String, operation: Operation, schema: GraphQLSchema, info: GraphQLResolveInfo): GraphQLResolveInfo = js.native
  def buildInfoForAllScalars(rootFieldName: String, schema: GraphQLSchema, operation: Operation): GraphQLResolveInfo = js.native
  def buildInfoFromFragment(rootFieldName: String, schema: GraphQLSchema, operation: Operation, query: String): GraphQLResolveInfo = js.native
  def getDeepType(`type`: GraphQLOutputType): (GraphQLObjectType[_, _, StringDictionary[_]]) | GraphQLScalarType = js.native
  def makeSubInfo(info: GraphQLResolveInfo, path: String): GraphQLResolveInfo | Null = js.native
  def makeSubInfo(info: GraphQLResolveInfo, path: String, fragment: String): GraphQLResolveInfo | Null = js.native
}

