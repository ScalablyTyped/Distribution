package typings.ipfsHttpServer

import org.scalablytyped.runtime.Shortcut
import typings.ipfsHttpServer.anon.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcApiRoutesDhtMod extends Shortcut {
  
  @JSImport("ipfs-http-server/dist/src/api/routes/dht", JSImport.Default)
  @js.native
  val default: js.Array[Handler] = js.native
  
  type _To = js.Array[Handler]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcApiRoutesDhtMod.foo` */
  override def _to: js.Array[Handler] = default
}
