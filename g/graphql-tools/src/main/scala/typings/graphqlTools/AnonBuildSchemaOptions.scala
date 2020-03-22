package typings.graphqlTools

import org.scalablytyped.runtime.StringDictionary
import typings.apolloLink.mod.ApolloLink
import typings.graphql.buildASTSchemaMod.BuildSchemaOptions
import typings.graphql.definitionMod.GraphQLFieldResolver
import typings.graphql.executeMod.ExecutionResult
import typings.graphql.executeMod.ExecutionResultDataDefault
import typings.graphql.mod.GraphQLSchema
import typings.graphqlTools.makeRemoteExecutableSchemaMod.Fetcher
import typings.graphqlTools.makeRemoteExecutableSchemaMod.FetcherOperation
import typings.graphqlTools.makeRemoteExecutableSchemaMod.PrintSchemaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBuildSchemaOptions extends js.Object {
  var buildSchemaOptions: js.UndefOr[BuildSchemaOptions] = js.undefined
  var createResolver: js.UndefOr[
    js.Function1[/* fetcher */ Fetcher, GraphQLFieldResolver[_, _, StringDictionary[_]]]
  ] = js.undefined
  var fetcher: js.UndefOr[Fetcher] = js.undefined
  var link: js.UndefOr[ApolloLink] = js.undefined
  var printSchemaOptions: js.UndefOr[PrintSchemaOptions] = js.undefined
  var schema: GraphQLSchema | String
}

object AnonBuildSchemaOptions {
  @scala.inline
  def apply(
    schema: GraphQLSchema | String,
    buildSchemaOptions: BuildSchemaOptions = null,
    createResolver: /* fetcher */ Fetcher => GraphQLFieldResolver[_, _, StringDictionary[_]] = null,
    fetcher: /* operation */ FetcherOperation => js.Promise[ExecutionResult[ExecutionResultDataDefault]] = null,
    link: ApolloLink = null,
    printSchemaOptions: PrintSchemaOptions = null
  ): AnonBuildSchemaOptions = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    if (buildSchemaOptions != null) __obj.updateDynamic("buildSchemaOptions")(buildSchemaOptions.asInstanceOf[js.Any])
    if (createResolver != null) __obj.updateDynamic("createResolver")(js.Any.fromFunction1(createResolver))
    if (fetcher != null) __obj.updateDynamic("fetcher")(js.Any.fromFunction1(fetcher))
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (printSchemaOptions != null) __obj.updateDynamic("printSchemaOptions")(printSchemaOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBuildSchemaOptions]
  }
}

