package typings
package graphqlDashToolsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/stitching", JSImport.Namespace)
@js.native
object distStitchingMod extends js.Object {
  val defaultMergedResolver: graphqlLib.typeDefinitionMod.GraphQLFieldResolver[js.Any, js.Any, ScalablyTyped.runtime.StringDictionary[js.Any]] = js.native
  def defaultCreateRemoteResolver(fetcher: graphqlDashToolsLib.distStitchingMakeRemoteExecutableSchemaMod.Fetcher): graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, ScalablyTyped.runtime.StringDictionary[_]] = js.native
  def delegateToSchema(
    options: graphqlDashToolsLib.distInterfacesMod.IDelegateToSchemaOptions[ScalablyTyped.runtime.StringDictionary[_]],
    args: js.Any*
  ): stdLib.Promise[_] = js.native
  def delegateToSchema(options: graphqlLib.graphqlMod.GraphQLSchema, args: js.Any*): stdLib.Promise[_] = js.native
  def introspectSchema(fetcher: apolloDashLinkLib.apolloDashLinkMod.ApolloLink): stdLib.Promise[graphqlLib.graphqlMod.GraphQLSchema] = js.native
  def introspectSchema(
    fetcher: apolloDashLinkLib.apolloDashLinkMod.ApolloLink,
    linkContext: ScalablyTyped.runtime.StringDictionary[js.Any]
  ): stdLib.Promise[graphqlLib.graphqlMod.GraphQLSchema] = js.native
  def introspectSchema(fetcher: graphqlDashToolsLib.distStitchingMakeRemoteExecutableSchemaMod.Fetcher): stdLib.Promise[graphqlLib.graphqlMod.GraphQLSchema] = js.native
  def introspectSchema(
    fetcher: graphqlDashToolsLib.distStitchingMakeRemoteExecutableSchemaMod.Fetcher,
    linkContext: ScalablyTyped.runtime.StringDictionary[js.Any]
  ): stdLib.Promise[graphqlLib.graphqlMod.GraphQLSchema] = js.native
  def makeRemoteExecutableSchema(hasSchemaLinkFetcherCreateResolver: graphqlDashToolsLib.Anon_Fetcher): graphqlLib.graphqlMod.GraphQLSchema = js.native
  def mergeSchemas(
    hasSchemasOnTypeConflictResolversSchemaDirectivesInheritResolversFromInterfaces: graphqlDashToolsLib.Anon_Resolvers
  ): graphqlLib.graphqlMod.GraphQLSchema = js.native
}

