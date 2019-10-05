package typings.httpDashLinkDashDataloader

import typings.apolloDashLink.apolloDashLinkMod.ApolloLink
import typings.httpDashLinkDashDataloader.distSrcTypesMod.HttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http-link-dataloader/dist/src/HTTPLinkDataloader", JSImport.Namespace)
@js.native
object distSrcHTTPLinkDataloaderMod extends js.Object {
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

