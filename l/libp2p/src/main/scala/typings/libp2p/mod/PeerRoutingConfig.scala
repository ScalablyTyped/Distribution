package typings.libp2p.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeerRoutingConfig extends StObject {
  
  var refreshManager: RefreshManagerConfig
}
object PeerRoutingConfig {
  
  inline def apply(refreshManager: RefreshManagerConfig): PeerRoutingConfig = {
    val __obj = js.Dynamic.literal(refreshManager = refreshManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerRoutingConfig]
  }
  
  extension [Self <: PeerRoutingConfig](x: Self) {
    
    inline def setRefreshManager(value: RefreshManagerConfig): Self = StObject.set(x, "refreshManager", value.asInstanceOf[js.Any])
  }
}
