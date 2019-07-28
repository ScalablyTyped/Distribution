package typings.graphqlDashTools

import org.scalablytyped.runtime.StringDictionary
import typings.apolloDashLink.apolloDashLinkMod.ApolloLink
import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphqlDashTools.distStitchingMakeRemoteExecutableSchemaMod.Fetcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/stitching/introspectSchema", JSImport.Namespace)
@js.native
object distStitchingIntrospectSchemaMod extends js.Object {
  def default(fetcher: ApolloLink): js.Promise[GraphQLSchema] = js.native
  def default(fetcher: ApolloLink, linkContext: StringDictionary[js.Any]): js.Promise[GraphQLSchema] = js.native
  def default(fetcher: Fetcher): js.Promise[GraphQLSchema] = js.native
  def default(fetcher: Fetcher, linkContext: StringDictionary[js.Any]): js.Promise[GraphQLSchema] = js.native
}

