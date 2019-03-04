package typings
package graphqlDashToolsLib.distInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExecutableSchemaDefinition[TContext] extends js.Object {
  var allowUndefinedInResolve: js.UndefOr[scala.Boolean] = js.undefined
  var connectors: js.UndefOr[IConnectors[TContext]] = js.undefined
  var directiveResolvers: js.UndefOr[IDirectiveResolvers[_, TContext]] = js.undefined
  var inheritResolversFromInterfaces: js.UndefOr[scala.Boolean] = js.undefined
  var logger: js.UndefOr[ILogger] = js.undefined
  var parseOptions: js.UndefOr[GraphQLParseOptions] = js.undefined
  var resolverValidationOptions: js.UndefOr[IResolverValidationOptions] = js.undefined
  var resolvers: js.UndefOr[(IResolvers[_, TContext]) | (js.Array[IResolvers[_, TContext]])] = js.undefined
  var schemaDirectives: js.UndefOr[org.scalablytyped.runtime.StringDictionary[graphqlDashToolsLib.Anon_Config]] = js.undefined
  var typeDefs: ITypeDefinitions
}

object IExecutableSchemaDefinition {
  @scala.inline
  def apply[TContext](
    typeDefs: ITypeDefinitions,
    allowUndefinedInResolve: js.UndefOr[scala.Boolean] = js.undefined,
    connectors: IConnectors[TContext] = null,
    directiveResolvers: IDirectiveResolvers[_, TContext] = null,
    inheritResolversFromInterfaces: js.UndefOr[scala.Boolean] = js.undefined,
    logger: ILogger = null,
    parseOptions: GraphQLParseOptions = null,
    resolverValidationOptions: IResolverValidationOptions = null,
    resolvers: (IResolvers[_, TContext]) | (js.Array[IResolvers[_, TContext]]) = null,
    schemaDirectives: org.scalablytyped.runtime.StringDictionary[graphqlDashToolsLib.Anon_Config] = null
  ): IExecutableSchemaDefinition[TContext] = {
    val __obj = js.Dynamic.literal(typeDefs = typeDefs.asInstanceOf[js.Any])
    if (!js.isUndefined(allowUndefinedInResolve)) __obj.updateDynamic("allowUndefinedInResolve")(allowUndefinedInResolve)
    if (connectors != null) __obj.updateDynamic("connectors")(connectors)
    if (directiveResolvers != null) __obj.updateDynamic("directiveResolvers")(directiveResolvers)
    if (!js.isUndefined(inheritResolversFromInterfaces)) __obj.updateDynamic("inheritResolversFromInterfaces")(inheritResolversFromInterfaces)
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (parseOptions != null) __obj.updateDynamic("parseOptions")(parseOptions)
    if (resolverValidationOptions != null) __obj.updateDynamic("resolverValidationOptions")(resolverValidationOptions)
    if (resolvers != null) __obj.updateDynamic("resolvers")(resolvers.asInstanceOf[js.Any])
    if (schemaDirectives != null) __obj.updateDynamic("schemaDirectives")(schemaDirectives)
    __obj.asInstanceOf[IExecutableSchemaDefinition[TContext]]
  }
}

