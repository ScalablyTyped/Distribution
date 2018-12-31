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
  var schemaDirectives: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[
      org.scalablytyped.runtime.Instantiable1[
        /* config */ graphqlDashToolsLib.Anon_Name, 
        graphqlDashToolsLib.distSchemaVisitorMod.SchemaDirectiveVisitor
      ]
    ]
  ] = js.undefined
  var typeDefs: ITypeDefinitions
}

