package typings.graphqlTools.interfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphqlTools.TypeofSchemaDirectiveVisi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExecutableSchemaDefinition[TContext] extends js.Object {
  var allowUndefinedInResolve: js.UndefOr[Boolean] = js.undefined
  var connectors: js.UndefOr[IConnectors[TContext]] = js.undefined
  var directiveResolvers: js.UndefOr[IDirectiveResolvers[_, TContext]] = js.undefined
  var inheritResolversFromInterfaces: js.UndefOr[Boolean] = js.undefined
  var logger: js.UndefOr[ILogger] = js.undefined
  var parseOptions: js.UndefOr[GraphQLParseOptions] = js.undefined
  var resolverValidationOptions: js.UndefOr[IResolverValidationOptions] = js.undefined
  var resolvers: js.UndefOr[(IResolvers[_, TContext]) | (js.Array[IResolvers[_, TContext]])] = js.undefined
  var schemaDirectives: js.UndefOr[StringDictionary[TypeofSchemaDirectiveVisi]] = js.undefined
  var typeDefs: ITypeDefinitions
}

object IExecutableSchemaDefinition {
  @scala.inline
  def apply[TContext](
    typeDefs: ITypeDefinitions,
    allowUndefinedInResolve: js.UndefOr[Boolean] = js.undefined,
    connectors: IConnectors[TContext] = null,
    directiveResolvers: IDirectiveResolvers[_, TContext] = null,
    inheritResolversFromInterfaces: js.UndefOr[Boolean] = js.undefined,
    logger: ILogger = null,
    parseOptions: GraphQLParseOptions = null,
    resolverValidationOptions: IResolverValidationOptions = null,
    resolvers: (IResolvers[_, TContext]) | (js.Array[IResolvers[_, TContext]]) = null,
    schemaDirectives: StringDictionary[TypeofSchemaDirectiveVisi] = null
  ): IExecutableSchemaDefinition[TContext] = {
    val __obj = js.Dynamic.literal(typeDefs = typeDefs.asInstanceOf[js.Any])
    if (!js.isUndefined(allowUndefinedInResolve)) __obj.updateDynamic("allowUndefinedInResolve")(allowUndefinedInResolve.asInstanceOf[js.Any])
    if (connectors != null) __obj.updateDynamic("connectors")(connectors.asInstanceOf[js.Any])
    if (directiveResolvers != null) __obj.updateDynamic("directiveResolvers")(directiveResolvers.asInstanceOf[js.Any])
    if (!js.isUndefined(inheritResolversFromInterfaces)) __obj.updateDynamic("inheritResolversFromInterfaces")(inheritResolversFromInterfaces.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (parseOptions != null) __obj.updateDynamic("parseOptions")(parseOptions.asInstanceOf[js.Any])
    if (resolverValidationOptions != null) __obj.updateDynamic("resolverValidationOptions")(resolverValidationOptions.asInstanceOf[js.Any])
    if (resolvers != null) __obj.updateDynamic("resolvers")(resolvers.asInstanceOf[js.Any])
    if (schemaDirectives != null) __obj.updateDynamic("schemaDirectives")(schemaDirectives.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecutableSchemaDefinition[TContext]]
  }
}

