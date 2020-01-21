package typings.httpLinkDataloader

import typings.httpLinkDataloader.typesMod.ClientOptions
import typings.httpLinkDataloader.typesMod.HttpOptions
import typings.httpLinkDataloader.typesMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http-link-dataloader", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class BatchedGraphQLClient protected ()
    extends typings.httpLinkDataloader.batchedGraphQLClientMod.BatchedGraphQLClient {
    def this(uri: String) = this()
    def this(uri: String, options: Options with ClientOptions) = this()
  }
  
  @js.native
  class HTTPLinkDataloader protected ()
    extends typings.httpLinkDataloader.httplinkdataloaderMod.HTTPLinkDataloader {
    def this(options: HttpOptions) = this()
  }
  
  /* static members */
  @js.native
  object HTTPLinkDataloader extends js.Object {
    /* private */ def createBatchedHttpRequest(options: js.Any): js.Any = js.native
  }
  
}

