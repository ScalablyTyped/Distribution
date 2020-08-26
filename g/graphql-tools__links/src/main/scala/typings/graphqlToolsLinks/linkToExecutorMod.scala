package typings.graphqlToolsLinks

import typings.apolloLink.mod.ApolloLink
import typings.apolloLink.typesMod.FetchResult
import typings.graphqlToolsLinks.anon.Context
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/links/linkToExecutor", JSImport.Namespace)
@js.native
object linkToExecutorMod extends js.Object {
  def linkToExecutor(link: ApolloLink): js.Function1[
    /* hasDocumentVariablesContextInfo */ Context[_, _], 
    js.Promise[FetchResult[_, Record[String, _], Record[String, _]]]
  ] = js.native
}

