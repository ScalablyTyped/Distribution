package typings.graphqlToolsSchema.typesMod

import typings.graphqlToolsUtils.interfacesMod.GraphQLParseOptions
import typings.graphqlToolsUtils.interfacesMod.IDirectiveResolvers
import typings.graphqlToolsUtils.interfacesMod.IResolverValidationOptions
import typings.graphqlToolsUtils.interfacesMod.IResolvers
import typings.graphqlToolsUtils.interfacesMod.ITypeDefinitions
import typings.graphqlToolsUtils.interfacesMod.SchemaTransform
import typings.graphqlToolsUtils.pruneMod.PruneSchemaOptions
import typings.graphqlToolsUtils.schemaDirectiveVisitorMod.SchemaDirectiveVisitorClass
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExecutableSchemaDefinition[TContext] extends js.Object {
  var allowUndefinedInResolve: js.UndefOr[Boolean] = js.undefined
  var directiveResolvers: js.UndefOr[IDirectiveResolvers[_, TContext]] = js.undefined
  var inheritResolversFromInterfaces: js.UndefOr[Boolean] = js.undefined
  var logger: js.UndefOr[ILogger] = js.undefined
  var parseOptions: js.UndefOr[GraphQLParseOptions] = js.undefined
  var pruningOptions: js.UndefOr[PruneSchemaOptions] = js.undefined
  var resolverValidationOptions: js.UndefOr[IResolverValidationOptions] = js.undefined
  var resolvers: js.UndefOr[
    (IResolvers[_, TContext, Record[String, _], _]) | (js.Array[IResolvers[_, TContext, Record[String, _], _]])
  ] = js.undefined
  var schemaDirectives: js.UndefOr[Record[String, SchemaDirectiveVisitorClass]] = js.undefined
  var schemaTransforms: js.UndefOr[js.Array[SchemaTransform]] = js.undefined
  var typeDefs: ITypeDefinitions
}

object IExecutableSchemaDefinition {
  @scala.inline
  def apply[TContext](
    typeDefs: ITypeDefinitions,
    allowUndefinedInResolve: js.UndefOr[Boolean] = js.undefined,
    directiveResolvers: IDirectiveResolvers[_, TContext] = null,
    inheritResolversFromInterfaces: js.UndefOr[Boolean] = js.undefined,
    logger: ILogger = null,
    parseOptions: GraphQLParseOptions = null,
    pruningOptions: PruneSchemaOptions = null,
    resolverValidationOptions: IResolverValidationOptions = null,
    resolvers: (IResolvers[_, TContext, Record[String, _], _]) | (js.Array[IResolvers[_, TContext, Record[String, _], _]]) = null,
    schemaDirectives: Record[String, SchemaDirectiveVisitorClass] = null,
    schemaTransforms: js.Array[SchemaTransform] = null
  ): IExecutableSchemaDefinition[TContext] = {
    val __obj = js.Dynamic.literal(typeDefs = typeDefs.asInstanceOf[js.Any])
    if (!js.isUndefined(allowUndefinedInResolve)) __obj.updateDynamic("allowUndefinedInResolve")(allowUndefinedInResolve.get.asInstanceOf[js.Any])
    if (directiveResolvers != null) __obj.updateDynamic("directiveResolvers")(directiveResolvers.asInstanceOf[js.Any])
    if (!js.isUndefined(inheritResolversFromInterfaces)) __obj.updateDynamic("inheritResolversFromInterfaces")(inheritResolversFromInterfaces.get.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (parseOptions != null) __obj.updateDynamic("parseOptions")(parseOptions.asInstanceOf[js.Any])
    if (pruningOptions != null) __obj.updateDynamic("pruningOptions")(pruningOptions.asInstanceOf[js.Any])
    if (resolverValidationOptions != null) __obj.updateDynamic("resolverValidationOptions")(resolverValidationOptions.asInstanceOf[js.Any])
    if (resolvers != null) __obj.updateDynamic("resolvers")(resolvers.asInstanceOf[js.Any])
    if (schemaDirectives != null) __obj.updateDynamic("schemaDirectives")(schemaDirectives.asInstanceOf[js.Any])
    if (schemaTransforms != null) __obj.updateDynamic("schemaTransforms")(schemaTransforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecutableSchemaDefinition[TContext]]
  }
}

