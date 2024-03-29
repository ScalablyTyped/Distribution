package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTrafficRule extends StObject {
  
  /**
    * Bandwidth in kbits/second.
    */
  var bandwidth: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Burst size in kbits.
    */
  var burst: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Packet delay, must be \>= 0.
    */
  var delay: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Packet duplication ratio (0.0 - 1.0).
    */
  var packetDuplicationRatio: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Packet loss ratio (0.0 - 1.0).
    */
  var packetLossRatio: js.UndefOr[Double | Null] = js.undefined
}
object SchemaTrafficRule {
  
  inline def apply(): SchemaTrafficRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrafficRule]
  }
  
  extension [Self <: SchemaTrafficRule](x: Self) {
    
    inline def setBandwidth(value: Double): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
    
    inline def setBandwidthNull: Self = StObject.set(x, "bandwidth", null)
    
    inline def setBandwidthUndefined: Self = StObject.set(x, "bandwidth", js.undefined)
    
    inline def setBurst(value: Double): Self = StObject.set(x, "burst", value.asInstanceOf[js.Any])
    
    inline def setBurstNull: Self = StObject.set(x, "burst", null)
    
    inline def setBurstUndefined: Self = StObject.set(x, "burst", js.undefined)
    
    inline def setDelay(value: String): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayNull: Self = StObject.set(x, "delay", null)
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setPacketDuplicationRatio(value: Double): Self = StObject.set(x, "packetDuplicationRatio", value.asInstanceOf[js.Any])
    
    inline def setPacketDuplicationRatioNull: Self = StObject.set(x, "packetDuplicationRatio", null)
    
    inline def setPacketDuplicationRatioUndefined: Self = StObject.set(x, "packetDuplicationRatio", js.undefined)
    
    inline def setPacketLossRatio(value: Double): Self = StObject.set(x, "packetLossRatio", value.asInstanceOf[js.Any])
    
    inline def setPacketLossRatioNull: Self = StObject.set(x, "packetLossRatio", null)
    
    inline def setPacketLossRatioUndefined: Self = StObject.set(x, "packetLossRatio", js.undefined)
  }
}
