package typings.httpDashLinkDashDataloader

import typings.httpDashLinkDashDataloader.distSrcTypesMod.HttpOptions
import typings.httpDashLinkDashDataloader.distSrcTypesMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http-link-dataloader", JSImport.Namespace)
@js.native
object httpDashLinkDashDataloaderMod extends js.Object {
  @js.native
  class BatchedGraphQLClient protected ()
    extends typings.httpDashLinkDashDataloader.distSrcBatchedGraphQLClientMod.BatchedGraphQLClient {
    def this(uri: String) = this()
    def this(
      uri: String,
      options: Options with (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ClientOptions */ js.Any)
    ) = this()
  }
  
  @js.native
  class HTTPLinkDataloader protected ()
    extends typings.httpDashLinkDashDataloader.distSrcHTTPLinkDataloaderMod.HTTPLinkDataloader {
    def this(options: HttpOptions) = this()
  }
  
  /* static members */
  @js.native
  object HTTPLinkDataloader extends js.Object {
    /* private */ def createBatchedHttpRequest(options: js.Any): js.Any = js.native
  }
  
}

