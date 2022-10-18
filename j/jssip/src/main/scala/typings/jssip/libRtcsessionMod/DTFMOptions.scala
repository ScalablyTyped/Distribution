package typings.jssip.libRtcsessionMod

import typings.jssip.libConstantsMod.DTMF_TRANSPORT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DTFMOptions
  extends StObject
     with ExtraHeaders {
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var interToneGap: js.UndefOr[Double] = js.undefined
  
  var transportType: js.UndefOr[DTMF_TRANSPORT] = js.undefined
}
object DTFMOptions {
  
  inline def apply(): DTFMOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DTFMOptions]
  }
  
  extension [Self <: DTFMOptions](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setInterToneGap(value: Double): Self = StObject.set(x, "interToneGap", value.asInstanceOf[js.Any])
    
    inline def setInterToneGapUndefined: Self = StObject.set(x, "interToneGap", js.undefined)
    
    inline def setTransportType(value: DTMF_TRANSPORT): Self = StObject.set(x, "transportType", value.asInstanceOf[js.Any])
    
    inline def setTransportTypeUndefined: Self = StObject.set(x, "transportType", js.undefined)
  }
}
