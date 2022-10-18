package typings.ipfsCoreTypes.distSrcConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnMgrConfig extends StObject {
  
  var HighWater: js.UndefOr[Double] = js.undefined
  
  var LowWater: js.UndefOr[Double] = js.undefined
}
object ConnMgrConfig {
  
  inline def apply(): ConnMgrConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnMgrConfig]
  }
  
  extension [Self <: ConnMgrConfig](x: Self) {
    
    inline def setHighWater(value: Double): Self = StObject.set(x, "HighWater", value.asInstanceOf[js.Any])
    
    inline def setHighWaterUndefined: Self = StObject.set(x, "HighWater", js.undefined)
    
    inline def setLowWater(value: Double): Self = StObject.set(x, "LowWater", value.asInstanceOf[js.Any])
    
    inline def setLowWaterUndefined: Self = StObject.set(x, "LowWater", js.undefined)
  }
}
