package typings.ipfsCoreTypes.distSrcConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwarmConfig extends StObject {
  
  var ConnMgr: js.UndefOr[ConnMgrConfig] = js.undefined
  
  var DisableNatPortMap: js.UndefOr[Boolean] = js.undefined
}
object SwarmConfig {
  
  inline def apply(): SwarmConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwarmConfig]
  }
  
  extension [Self <: SwarmConfig](x: Self) {
    
    inline def setConnMgr(value: ConnMgrConfig): Self = StObject.set(x, "ConnMgr", value.asInstanceOf[js.Any])
    
    inline def setConnMgrUndefined: Self = StObject.set(x, "ConnMgr", js.undefined)
    
    inline def setDisableNatPortMap(value: Boolean): Self = StObject.set(x, "DisableNatPortMap", value.asInstanceOf[js.Any])
    
    inline def setDisableNatPortMapUndefined: Self = StObject.set(x, "DisableNatPortMap", js.undefined)
  }
}
