package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRouterBgpPeerBfd extends StObject {
  
  /**
    * The minimum interval, in milliseconds, between BFD control packets received from the peer router. The actual value is negotiated between the two routers and is equal to the greater of this value and the transmit interval of the other router. If set, this value must be between 1000 and 30000. The default is 1000.
    */
  var minReceiveInterval: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The minimum interval, in milliseconds, between BFD control packets transmitted to the peer router. The actual value is negotiated between the two routers and is equal to the greater of this value and the corresponding receive interval of the other router. If set, this value must be between 1000 and 30000. The default is 1000.
    */
  var minTransmitInterval: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The number of consecutive BFD packets that must be missed before BFD declares that a peer is unavailable. If set, the value must be a value between 5 and 16. The default is 5.
    */
  var multiplier: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The BFD session initialization mode for this BGP peer. If set to ACTIVE, the Cloud Router will initiate the BFD session for this BGP peer. If set to PASSIVE, the Cloud Router will wait for the peer router to initiate the BFD session for this BGP peer. If set to DISABLED, BFD is disabled for this BGP peer. The default is DISABLED.
    */
  var sessionInitializationMode: js.UndefOr[String | Null] = js.undefined
}
object SchemaRouterBgpPeerBfd {
  
  inline def apply(): SchemaRouterBgpPeerBfd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouterBgpPeerBfd]
  }
  
  extension [Self <: SchemaRouterBgpPeerBfd](x: Self) {
    
    inline def setMinReceiveInterval(value: Double): Self = StObject.set(x, "minReceiveInterval", value.asInstanceOf[js.Any])
    
    inline def setMinReceiveIntervalNull: Self = StObject.set(x, "minReceiveInterval", null)
    
    inline def setMinReceiveIntervalUndefined: Self = StObject.set(x, "minReceiveInterval", js.undefined)
    
    inline def setMinTransmitInterval(value: Double): Self = StObject.set(x, "minTransmitInterval", value.asInstanceOf[js.Any])
    
    inline def setMinTransmitIntervalNull: Self = StObject.set(x, "minTransmitInterval", null)
    
    inline def setMinTransmitIntervalUndefined: Self = StObject.set(x, "minTransmitInterval", js.undefined)
    
    inline def setMultiplier(value: Double): Self = StObject.set(x, "multiplier", value.asInstanceOf[js.Any])
    
    inline def setMultiplierNull: Self = StObject.set(x, "multiplier", null)
    
    inline def setMultiplierUndefined: Self = StObject.set(x, "multiplier", js.undefined)
    
    inline def setSessionInitializationMode(value: String): Self = StObject.set(x, "sessionInitializationMode", value.asInstanceOf[js.Any])
    
    inline def setSessionInitializationModeNull: Self = StObject.set(x, "sessionInitializationMode", null)
    
    inline def setSessionInitializationModeUndefined: Self = StObject.set(x, "sessionInitializationMode", js.undefined)
  }
}
