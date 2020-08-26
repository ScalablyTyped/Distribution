package typings.graphqlToolsLinks

import typings.apolloLink.mod.ApolloLink
import typings.apolloLink.typesMod.FetchResult
import typings.graphql.mod.GraphQLScalarType
import typings.graphqlToolsLinks.anon.Context
import typings.std.AsyncIterator
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/links", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class AwaitVariablesLink ()
    extends typings.graphqlToolsLinks.awaitVariablesLinkMod.AwaitVariablesLink
  
  val GraphQLUpload: GraphQLScalarType = js.native
  def createServerHttpLink(options: js.Any): ApolloLink = js.native
  def linkToExecutor(link: ApolloLink): js.Function1[
    /* hasDocumentVariablesContextInfo */ Context[_, _], 
    js.Promise[FetchResult[_, Record[String, _], Record[String, _]]]
  ] = js.native
  def linkToSubscriber(link: ApolloLink): js.Function1[
    /* hasDocumentVariablesContextInfo */ Context[_, _], 
    js.Promise[
      (AsyncIterator[FetchResult[_, Record[String, _], Record[String, _]], _, js.UndefOr[scala.Nothing]]) with typings.graphqlToolsLinks.anon.AsyncIterator[_]
    ]
  ] = js.native
}

