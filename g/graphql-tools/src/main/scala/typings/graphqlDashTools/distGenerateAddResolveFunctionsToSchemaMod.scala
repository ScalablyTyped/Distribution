package typings.graphqlDashTools

import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphqlDashTools.distInterfacesMod.IAddResolveFunctionsToSchemaOptions
import typings.graphqlDashTools.distInterfacesMod.IResolverValidationOptions
import typings.graphqlDashTools.distInterfacesMod.IResolvers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/generate/addResolveFunctionsToSchema", JSImport.Namespace)
@js.native
object distGenerateAddResolveFunctionsToSchemaMod extends js.Object {
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

