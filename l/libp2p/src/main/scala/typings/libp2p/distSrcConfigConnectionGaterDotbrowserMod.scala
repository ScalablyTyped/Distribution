package typings.libp2p

import typings.libp2pInterfaceConnectionGater.mod.ConnectionGater
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcConfigConnectionGaterDotbrowserMod {
  
  @JSImport("libp2p/dist/src/config/connection-gater.browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def connectionGater(): ConnectionGater = ^.asInstanceOf[js.Dynamic].applyDynamic("connectionGater")().asInstanceOf[ConnectionGater]
  inline def connectionGater(gater: ConnectionGater): ConnectionGater = ^.asInstanceOf[js.Dynamic].applyDynamic("connectionGater")(gater.asInstanceOf[js.Any]).asInstanceOf[ConnectionGater]
}
