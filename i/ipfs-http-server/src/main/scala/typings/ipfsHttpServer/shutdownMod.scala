package typings.ipfsHttpServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shutdownMod {
  
  @JSImport("ipfs-http-server/dist/src/api/resources/shutdown", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def handler(_request: js.Any, h: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(_request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
