package typings.httpLinkDataloader

import typings.apolloLink.mod.ApolloLink
import typings.httpLinkDataloader.typesMod.HttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http-link-dataloader/dist/src/HTTPLinkDataloader", JSImport.Namespace)
@js.native
object httplinkdataloaderMod extends js.Object {
  @js.native
  class HTTPLinkDataloader protected () extends ApolloLink {
    def this(options: HttpOptions) = this()
  }
  
  /* static members */
  @js.native
  object HTTPLinkDataloader extends js.Object {
    /* private */ def createBatchedHttpRequest(options: js.Any): js.Any = js.native
  }
  
}

