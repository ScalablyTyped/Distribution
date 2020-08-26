package typings.graphqlToolsUtils

import typings.graphql.mod.GraphQLEnumType
import typings.graphql.mod.GraphQLInputObjectType
import typings.graphql.mod.GraphQLInterfaceType
import typings.graphql.mod.GraphQLObjectType
import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.SchemaMapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/utils/mapSchema", JSImport.Namespace)
@js.native
object mapSchemaMod extends js.Object {
  def correctASTNodes(`type`: GraphQLEnumType): GraphQLEnumType = js.native
  def correctASTNodes(`type`: GraphQLInputObjectType): GraphQLInputObjectType = js.native
  def correctASTNodes(`type`: GraphQLInterfaceType): GraphQLInterfaceType = js.native
  def correctASTNodes(`type`: GraphQLObjectType[_, _]): GraphQLObjectType[_, _] = js.native
  def mapSchema(schema: GraphQLSchema): GraphQLSchema = js.native
  def mapSchema(schema: GraphQLSchema, schemaMapper: SchemaMapper): GraphQLSchema = js.native
}

