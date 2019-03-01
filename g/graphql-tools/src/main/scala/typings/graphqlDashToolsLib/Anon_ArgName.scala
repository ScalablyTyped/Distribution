package typings
package graphqlDashToolsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgName extends js.Object {
  var createResolver: js.UndefOr[
    js.Function1[
      /* fetcher */ graphqlDashToolsLib.distStitchingMakeRemoteExecutableSchemaMod.Fetcher, 
      graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, org.scalablytyped.runtime.StringDictionary[_]]
    ]
  ] = js.undefined
  var fetcher: js.UndefOr[graphqlDashToolsLib.distStitchingMakeRemoteExecutableSchemaMod.Fetcher] = js.undefined
  var link: js.UndefOr[apolloDashLinkLib.apolloDashLinkMod.ApolloLink] = js.undefined
  var schema: graphqlLib.graphqlMod.GraphQLSchema | java.lang.String
}

object Anon_ArgName {
  @scala.inline
  def apply(
    schema: graphqlLib.graphqlMod.GraphQLSchema | java.lang.String,
    createResolver: js.Function1[
      /* fetcher */ graphqlDashToolsLib.distStitchingMakeRemoteExecutableSchemaMod.Fetcher, 
      graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, org.scalablytyped.runtime.StringDictionary[_]]
    ] = null,
    fetcher: graphqlDashToolsLib.distStitchingMakeRemoteExecutableSchemaMod.Fetcher = null,
    link: apolloDashLinkLib.apolloDashLinkMod.ApolloLink = null
  ): Anon_ArgName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (createResolver != null) __obj.updateDynamic("createResolver")(createResolver)
    if (fetcher != null) __obj.updateDynamic("fetcher")(fetcher)
    if (link != null) __obj.updateDynamic("link")(link)
    __obj.asInstanceOf[Anon_ArgName]
  }
}

