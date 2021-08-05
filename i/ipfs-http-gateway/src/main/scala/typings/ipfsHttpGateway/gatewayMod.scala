package typings.ipfsHttpGateway

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gatewayMod {
  
  @JSImport("ipfs-http-gateway/dist/src/resources/gateway", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def afterHandler(request: js.Any, h: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("afterHandler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def handler(request: js.Any, h: js.Any): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
}
