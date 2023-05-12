package typings.libp2pWebsockets

import typings.libp2pInterfaceTransport.mod.Listener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcListenerDotbrowserMod {
  
  @JSImport("@libp2p/websockets/dist/src/listener.browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createListener(): Listener = ^.asInstanceOf[js.Dynamic].applyDynamic("createListener")().asInstanceOf[Listener]
}
