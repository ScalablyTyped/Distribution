package typings
package graphqlDashToolsLib.distInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAddResolveFunctionsToSchemaOptions extends js.Object {
  var inheritResolversFromInterfaces: js.UndefOr[scala.Boolean] = js.undefined
  var resolverValidationOptions: js.UndefOr[IResolverValidationOptions] = js.undefined
  var resolvers: IResolvers[_, _]
  var schema: graphqlLib.graphqlMod.GraphQLSchema
}

object IAddResolveFunctionsToSchemaOptions {
  @scala.inline
  def apply(
    resolvers: IResolvers[_, _],
    schema: graphqlLib.graphqlMod.GraphQLSchema,
    inheritResolversFromInterfaces: js.UndefOr[scala.Boolean] = js.undefined,
    resolverValidationOptions: IResolverValidationOptions = null
  ): IAddResolveFunctionsToSchemaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("resolvers")(resolvers)
    __obj.updateDynamic("schema")(schema)
    if (!js.isUndefined(inheritResolversFromInterfaces)) __obj.updateDynamic("inheritResolversFromInterfaces")(inheritResolversFromInterfaces)
    if (resolverValidationOptions != null) __obj.updateDynamic("resolverValidationOptions")(resolverValidationOptions)
    __obj.asInstanceOf[IAddResolveFunctionsToSchemaOptions]
  }
}

