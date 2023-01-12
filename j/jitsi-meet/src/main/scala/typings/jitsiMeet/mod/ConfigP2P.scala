package typings.jitsiMeet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigP2P extends StObject {
  
  var backToP2PDelay: js.UndefOr[Double] = js.undefined
  
  var disableH264: js.UndefOr[Boolean] = js.undefined
  
  var disabledCodec: js.UndefOr[String] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var iceTransportPolicy: js.UndefOr[String] = js.undefined
  
  var preferH264: js.UndefOr[Boolean] = js.undefined
  
  var preferredCodec: js.UndefOr[String] = js.undefined
  
  var stunServers: js.UndefOr[js.Array[STUNServer]] = js.undefined
}
object ConfigP2P {
  
  inline def apply(): ConfigP2P = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigP2P]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigP2P] (val x: Self) extends AnyVal {
    
    inline def setBackToP2PDelay(value: Double): Self = StObject.set(x, "backToP2PDelay", value.asInstanceOf[js.Any])
    
    inline def setBackToP2PDelayUndefined: Self = StObject.set(x, "backToP2PDelay", js.undefined)
    
    inline def setDisableH264(value: Boolean): Self = StObject.set(x, "disableH264", value.asInstanceOf[js.Any])
    
    inline def setDisableH264Undefined: Self = StObject.set(x, "disableH264", js.undefined)
    
    inline def setDisabledCodec(value: String): Self = StObject.set(x, "disabledCodec", value.asInstanceOf[js.Any])
    
    inline def setDisabledCodecUndefined: Self = StObject.set(x, "disabledCodec", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setIceTransportPolicy(value: String): Self = StObject.set(x, "iceTransportPolicy", value.asInstanceOf[js.Any])
    
    inline def setIceTransportPolicyUndefined: Self = StObject.set(x, "iceTransportPolicy", js.undefined)
    
    inline def setPreferH264(value: Boolean): Self = StObject.set(x, "preferH264", value.asInstanceOf[js.Any])
    
    inline def setPreferH264Undefined: Self = StObject.set(x, "preferH264", js.undefined)
    
    inline def setPreferredCodec(value: String): Self = StObject.set(x, "preferredCodec", value.asInstanceOf[js.Any])
    
    inline def setPreferredCodecUndefined: Self = StObject.set(x, "preferredCodec", js.undefined)
    
    inline def setStunServers(value: js.Array[STUNServer]): Self = StObject.set(x, "stunServers", value.asInstanceOf[js.Any])
    
    inline def setStunServersUndefined: Self = StObject.set(x, "stunServers", js.undefined)
    
    inline def setStunServersVarargs(value: STUNServer*): Self = StObject.set(x, "stunServers", js.Array(value*))
  }
}
