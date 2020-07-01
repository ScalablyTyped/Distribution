package typings.graphqlToolsSchema

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.IAddResolversToSchemaOptions
import typings.graphqlToolsUtils.interfacesMod.IResolverValidationOptions
import typings.graphqlToolsUtils.interfacesMod.IResolvers
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/schema/addResolversToSchema", JSImport.Namespace)
@js.native
object addResolversToSchemaMod extends js.Object {
  def addResolversToSchema(schemaOrOptions: GraphQLSchema): GraphQLSchema = js.native
  def addResolversToSchema(schemaOrOptions: GraphQLSchema, legacyInputResolvers: IResolvers[_, _, Record[String, _], _]): GraphQLSchema = js.native
  def addResolversToSchema(
    schemaOrOptions: GraphQLSchema,
    legacyInputResolvers: IResolvers[_, _, Record[String, _], _],
    legacyInputValidationOptions: IResolverValidationOptions
  ): GraphQLSchema = js.native
  def addResolversToSchema(schemaOrOptions: IAddResolversToSchemaOptions): GraphQLSchema = js.native
  def addResolversToSchema(
    schemaOrOptions: IAddResolversToSchemaOptions,
    legacyInputResolvers: IResolvers[_, _, Record[String, _], _]
  ): GraphQLSchema = js.native
  def addResolversToSchema(
    schemaOrOptions: IAddResolversToSchemaOptions,
    legacyInputResolvers: IResolvers[_, _, Record[String, _], _],
    legacyInputValidationOptions: IResolverValidationOptions
  ): GraphQLSchema = js.native
}

