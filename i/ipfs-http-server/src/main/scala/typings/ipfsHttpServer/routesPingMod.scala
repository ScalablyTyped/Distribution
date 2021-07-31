package typings.ipfsHttpServer

import typings.ipfsHttpServer.anon.Validate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routesPingMod {
  
  @JSImport("ipfs-http-server/dist/src/api/routes/ping", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def handler(request: js.Any, h: js.Any): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  @JSImport("ipfs-http-server/dist/src/api/routes/ping", "method")
  @js.native
  def method: String = js.native
  @scala.inline
  def method_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("method")(x.asInstanceOf[js.Any])
  
  @JSImport("ipfs-http-server/dist/src/api/routes/ping", "options")
  @js.native
  def options: Validate = js.native
  @scala.inline
  def options_=(x: Validate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
  
  @JSImport("ipfs-http-server/dist/src/api/routes/ping", "path")
  @js.native
  def path: String = js.native
  @scala.inline
  def path_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("path")(x.asInstanceOf[js.Any])
}
