package typings.graphqlTools

import typings.graphql.mod.GraphQLSchema
import typings.graphqlTools.interfacesMod.IAddResolveFunctionsToSchemaOptions
import typings.graphqlTools.interfacesMod.IResolverValidationOptions
import typings.graphqlTools.interfacesMod.IResolvers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/generate/addResolveFunctionsToSchema", JSImport.Namespace)
@js.native
object addResolveFunctionsToSchemaMod extends js.Object {
  def default(options: GraphQLSchema): GraphQLSchema = js.native
  def default(options: GraphQLSchema, legacyInputResolvers: IResolvers[_, _]): GraphQLSchema = js.native
  def default(
    options: GraphQLSchema,
    legacyInputResolvers: IResolvers[_, _],
    legacyInputValidationOptions: IResolverValidationOptions
  ): GraphQLSchema = js.native
  def default(options: IAddResolveFunctionsToSchemaOptions): GraphQLSchema = js.native
  def default(options: IAddResolveFunctionsToSchemaOptions, legacyInputResolvers: IResolvers[_, _]): GraphQLSchema = js.native
  def default(
    options: IAddResolveFunctionsToSchemaOptions,
    legacyInputResolvers: IResolvers[_, _],
    legacyInputValidationOptions: IResolverValidationOptions
  ): GraphQLSchema = js.native
}

