package typings.graphqlDashTools

import org.scalablytyped.runtime.StringDictionary
import typings.apolloDashLink.apolloDashLinkMod.ApolloLink
import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphql.typeDefinitionMod.GraphQLFieldResolver
import typings.graphql.utilitiesBuildASTSchemaMod.BuildSchemaOptions
import typings.graphql.utilitiesSchemaPrinterMod.Options
import typings.graphqlDashTools.distStitchingMakeRemoteExecutableSchemaMod.Fetcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgName extends js.Object {
  var buildSchemaOptions: js.UndefOr[BuildSchemaOptions] = js.undefined
  var createResolver: js.UndefOr[
    js.Function1[/* fetcher */ Fetcher, GraphQLFieldResolver[_, _, StringDictionary[_]]]
  ] = js.undefined
  var fetcher: js.UndefOr[Fetcher] = js.undefined
  var link: js.UndefOr[ApolloLink] = js.undefined
  var printSchemaOptions: js.UndefOr[Options] = js.undefined
  var schema: GraphQLSchema | String
}

object Anon_ArgName {
  @scala.inline
  def apply(
    schema: GraphQLSchema | String,
    buildSchemaOptions: BuildSchemaOptions = null,
    createResolver: /* fetcher */ Fetcher => GraphQLFieldResolver[_, _, StringDictionary[_]] = null,
    fetcher: Fetcher = null,
    link: ApolloLink = null,
    printSchemaOptions: Options = null
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

