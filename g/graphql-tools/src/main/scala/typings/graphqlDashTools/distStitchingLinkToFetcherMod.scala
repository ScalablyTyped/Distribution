package typings.graphqlDashTools

import org.scalablytyped.runtime.StringDictionary
import typings.apolloDashLink.apolloDashLinkMod.ApolloLink
import typings.apolloDashLink.libTypesMod.FetchResult
import typings.apolloDashLink.libTypesMod.GraphQLRequest
import typings.graphqlDashTools.distStitchingMakeRemoteExecutableSchemaMod.Fetcher
import typings.std.Record
import typings.zenDashObservableDashTs.libZenObservableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/stitching/linkToFetcher", JSImport.Namespace)
@js.native
object distStitchingLinkToFetcherMod extends js.Object {
  def default(link: ApolloLink): Fetcher = js.native
  def execute(link: typings.apolloDashLink.libLinkMod.ApolloLink, operation: GraphQLRequest): Observable[FetchResult[StringDictionary[_], Record[String, _], Record[String, _]]] = js.native
}

