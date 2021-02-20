package typings.ipfsHttpServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routesShutdownMod {
  
  @JSImport("ipfs-http-server/dist/src/api/routes/shutdown", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ipfs-http-server/dist/src/api/routes/shutdown", "handler")
  @js.native
  def handler(_request: js.Any, h: js.Any): js.Any = js.native
  
  @JSImport("ipfs-http-server/dist/src/api/routes/shutdown", "method")
  @js.native
  def method: String = js.native
  @scala.inline
  def method_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("method")(x.asInstanceOf[js.Any])
  
  @JSImport("ipfs-http-server/dist/src/api/routes/shutdown", "path")
  @js.native
  def path: String = js.native
  @scala.inline
  def path_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("path")(x.asInstanceOf[js.Any])
}
