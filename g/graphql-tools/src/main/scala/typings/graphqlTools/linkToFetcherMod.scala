package typings.graphqlTools

import org.scalablytyped.runtime.StringDictionary
import typings.apolloLink.mod.ApolloLink
import typings.apolloLink.typesMod.FetchResult
import typings.apolloLink.typesMod.GraphQLRequest
import typings.graphqlTools.makeRemoteExecutableSchemaMod.Fetcher
import typings.std.Record
import typings.zenObservableTs.zenObservableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/stitching/linkToFetcher", JSImport.Namespace)
@js.native
object linkToFetcherMod extends js.Object {
  def default(link: ApolloLink): Fetcher = js.native
  def execute(link: typings.apolloLink.linkMod.ApolloLink, operation: GraphQLRequest): Observable[FetchResult[StringDictionary[_], Record[String, _], Record[String, _]]] = js.native
}

