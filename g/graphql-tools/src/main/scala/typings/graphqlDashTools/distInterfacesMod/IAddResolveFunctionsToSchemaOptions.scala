package typings.graphqlDashTools.distInterfacesMod

import typings.graphql.graphqlMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAddResolveFunctionsToSchemaOptions extends js.Object {
  var inheritResolversFromInterfaces: js.UndefOr[Boolean] = js.undefined
  var resolverValidationOptions: js.UndefOr[IResolverValidationOptions] = js.undefined
  var resolvers: IResolvers[_, _]
  var schema: GraphQLSchema
}

object IAddResolveFunctionsToSchemaOptions {
  @scala.inline
  def apply(
    resolvers: IResolvers[_, _],
    schema: GraphQLSchema,
    inheritResolversFromInterfaces: js.UndefOr[Boolean] = js.undefined,
    resolverValidationOptions: IResolverValidationOptions = null
  ): IAddResolveFunctionsToSchemaOptions = {
    val __obj = js.Dynamic.literal(resolvers = resolvers, schema = schema)
    if (!js.isUndefined(inheritResolversFromInterfaces)) __obj.updateDynamic("inheritResolversFromInterfaces")(inheritResolversFromInterfaces)
    if (resolverValidationOptions != null) __obj.updateDynamic("resolverValidationOptions")(resolverValidationOptions)
    __obj.asInstanceOf[IAddResolveFunctionsToSchemaOptions]
  }
}

