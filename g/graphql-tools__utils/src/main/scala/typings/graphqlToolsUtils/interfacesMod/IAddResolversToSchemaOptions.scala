package typings.graphqlToolsUtils.interfacesMod

import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.mod.GraphQLSchema
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAddResolversToSchemaOptions extends js.Object {
  var defaultFieldResolver: js.UndefOr[IFieldResolver[_, _, Record[String, _], _]] = js.undefined
  var inheritResolversFromInterfaces: js.UndefOr[Boolean] = js.undefined
  var resolverValidationOptions: js.UndefOr[IResolverValidationOptions] = js.undefined
  var resolvers: IResolvers[_, _, Record[String, _], _]
  var schema: GraphQLSchema
  var updateResolversInPlace: js.UndefOr[Boolean] = js.undefined
}

object IAddResolversToSchemaOptions {
  @scala.inline
  def apply(
    resolvers: IResolvers[_, _, Record[String, _], _],
    schema: GraphQLSchema,
    defaultFieldResolver: (_, Record[String, _], _, /* info */ GraphQLResolveInfo) => _ = null,
    inheritResolversFromInterfaces: js.UndefOr[Boolean] = js.undefined,
    resolverValidationOptions: IResolverValidationOptions = null,
    updateResolversInPlace: js.UndefOr[Boolean] = js.undefined
  ): IAddResolversToSchemaOptions = {
    val __obj = js.Dynamic.literal(resolvers = resolvers.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    if (defaultFieldResolver != null) __obj.updateDynamic("defaultFieldResolver")(js.Any.fromFunction4(defaultFieldResolver))
    if (!js.isUndefined(inheritResolversFromInterfaces)) __obj.updateDynamic("inheritResolversFromInterfaces")(inheritResolversFromInterfaces.get.asInstanceOf[js.Any])
    if (resolverValidationOptions != null) __obj.updateDynamic("resolverValidationOptions")(resolverValidationOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(updateResolversInPlace)) __obj.updateDynamic("updateResolversInPlace")(updateResolversInPlace.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAddResolversToSchemaOptions]
  }
}

