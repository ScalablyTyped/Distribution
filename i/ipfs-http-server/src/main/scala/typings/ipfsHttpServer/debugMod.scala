package typings.ipfsHttpServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debugMod {
  
  @JSImport("ipfs-http-server/dist/src/api/routes/debug", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def handler(request: js.Any, h: js.Any): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  @JSImport("ipfs-http-server/dist/src/api/routes/debug", "method")
  @js.native
  val method: String = js.native
  
  @JSImport("ipfs-http-server/dist/src/api/routes/debug", "path")
  @js.native
  val path: String = js.native
}
