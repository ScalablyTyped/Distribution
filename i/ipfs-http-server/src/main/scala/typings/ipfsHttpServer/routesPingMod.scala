package typings.ipfsHttpServer

import typings.ipfsHttpServer.anon.Validate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routesPingMod {
  
  @JSImport("ipfs-http-server/dist/src/api/routes/ping", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ipfs-http-server/dist/src/api/routes/ping", "handler")
  @js.native
  def handler(request: js.Any, h: js.Any): js.Promise[_] = js.native
  
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
