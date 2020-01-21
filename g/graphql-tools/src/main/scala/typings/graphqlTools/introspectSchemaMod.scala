package typings.graphqlTools

import org.scalablytyped.runtime.StringDictionary
import typings.apolloLink.mod.ApolloLink
import typings.graphql.mod.GraphQLSchema
import typings.graphqlTools.makeRemoteExecutableSchemaMod.Fetcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/stitching/introspectSchema", JSImport.Namespace)
@js.native
object introspectSchemaMod extends js.Object {
  def default(fetcher: ApolloLink): js.Promise[GraphQLSchema] = js.native
  def default(fetcher: ApolloLink, linkContext: StringDictionary[js.Any]): js.Promise[GraphQLSchema] = js.native
  def default(fetcher: Fetcher): js.Promise[GraphQLSchema] = js.native
  def default(fetcher: Fetcher, linkContext: StringDictionary[js.Any]): js.Promise[GraphQLSchema] = js.native
}

