package typings.ipfsHttpServer

import typings.hapiHapi.mod.ReqRefDefaults
import typings.hapiHapi.mod.Request
import typings.hapiHapi.mod.ResponseObject
import typings.hapiHapi.mod.ResponseToolkit
import typings.ipfsHttpServer.anon.OnEnd
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsStreamResponseMod {
  
  @JSImport("ipfs-http-server/dist/src/utils/stream-response", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def streamResponse(
    request: Request[ReqRefDefaults],
    h: ResponseToolkit[ReqRefDefaults],
    getSource: js.Function0[AsyncIterable[Any]]
  ): js.Promise[ResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("streamResponse")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any], getSource.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseObject]]
  inline def streamResponse(
    request: Request[ReqRefDefaults],
    h: ResponseToolkit[ReqRefDefaults],
    getSource: js.Function0[AsyncIterable[Any]],
    options: OnEnd
  ): js.Promise[ResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("streamResponse")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any], getSource.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseObject]]
}
