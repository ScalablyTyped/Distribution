package typings
package graphqlDashToolsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgName extends js.Object {
  var buildSchemaOptions: js.UndefOr[graphqlLib.utilitiesBuildASTSchemaMod.BuildSchemaOptions] = js.undefined
  var createResolver: js.UndefOr[
    js.Function1[
      /* fetcher */ graphqlDashToolsLib.distStitchingMakeRemoteExecutableSchemaMod.Fetcher, 
      graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, org.scalablytyped.runtime.StringDictionary[_]]
    ]
  ] = js.undefined
  var fetcher: js.UndefOr[graphqlDashToolsLib.distStitchingMakeRemoteExecutableSchemaMod.Fetcher] = js.undefined
  var link: js.UndefOr[apolloDashLinkLib.apolloDashLinkMod.ApolloLink] = js.undefined
  var printSchemaOptions: js.UndefOr[graphqlLib.utilitiesSchemaPrinterMod.Options] = js.undefined
  var schema: graphqlLib.graphqlMod.GraphQLSchema | java.lang.String
}

object Anon_ArgName {
  @scala.inline
  def apply(
    schema: graphqlLib.graphqlMod.GraphQLSchema | java.lang.String,
    buildSchemaOptions: graphqlLib.utilitiesBuildASTSchemaMod.BuildSchemaOptions = null,
    createResolver: /* fetcher */ graphqlDashToolsLib.distStitchingMakeRemoteExecutableSchemaMod.Fetcher => graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, org.scalablytyped.runtime.StringDictionary[_]] = null,
    fetcher: graphqlDashToolsLib.distStitchingMakeRemoteExecutableSchemaMod.Fetcher = null,
    link: apolloDashLinkLib.apolloDashLinkMod.ApolloLink = null,
    printSchemaOptions: graphqlLib.utilitiesSchemaPrinterMod.Options = null
  ): Anon_ArgName = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    if (buildSchemaOptions != null) __obj.updateDynamic("buildSchemaOptions")(buildSchemaOptions)
    if (createResolver != null) __obj.updateDynamic("createResolver")(js.Any.fromFunction1(createResolver))
    if (fetcher != null) __obj.updateDynamic("fetcher")(fetcher)
    if (link != null) __obj.updateDynamic("link")(link)
    if (printSchemaOptions != null) __obj.updateDynamic("printSchemaOptions")(printSchemaOptions)
    __obj.asInstanceOf[Anon_ArgName]
  }
}

