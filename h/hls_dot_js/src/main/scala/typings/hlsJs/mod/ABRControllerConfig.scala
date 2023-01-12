package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ABRControllerConfig extends StObject {
  
  var abrBandWidthFactor: Double
  
  var abrBandWidthUpFactor: Double
  
  var abrEwmaDefaultEstimate: Double
  
  var abrEwmaFastLive: Double
  
  var abrEwmaFastVoD: Double
  
  var abrEwmaSlowLive: Double
  
  var abrEwmaSlowVoD: Double
  
  var abrMaxWithRealBitrate: Boolean
  
  var maxLoadingDelay: Double
  
  var maxStarvationDelay: Double
}
object ABRControllerConfig {
  
  inline def apply(
    abrBandWidthFactor: Double,
    abrBandWidthUpFactor: Double,
    abrEwmaDefaultEstimate: Double,
    abrEwmaFastLive: Double,
    abrEwmaFastVoD: Double,
    abrEwmaSlowLive: Double,
    abrEwmaSlowVoD: Double,
    abrMaxWithRealBitrate: Boolean,
    maxLoadingDelay: Double,
    maxStarvationDelay: Double
  ): ABRControllerConfig = {
    val __obj = js.Dynamic.literal(abrBandWidthFactor = abrBandWidthFactor.asInstanceOf[js.Any], abrBandWidthUpFactor = abrBandWidthUpFactor.asInstanceOf[js.Any], abrEwmaDefaultEstimate = abrEwmaDefaultEstimate.asInstanceOf[js.Any], abrEwmaFastLive = abrEwmaFastLive.asInstanceOf[js.Any], abrEwmaFastVoD = abrEwmaFastVoD.asInstanceOf[js.Any], abrEwmaSlowLive = abrEwmaSlowLive.asInstanceOf[js.Any], abrEwmaSlowVoD = abrEwmaSlowVoD.asInstanceOf[js.Any], abrMaxWithRealBitrate = abrMaxWithRealBitrate.asInstanceOf[js.Any], maxLoadingDelay = maxLoadingDelay.asInstanceOf[js.Any], maxStarvationDelay = maxStarvationDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[ABRControllerConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ABRControllerConfig] (val x: Self) extends AnyVal {
    
    inline def setAbrBandWidthFactor(value: Double): Self = StObject.set(x, "abrBandWidthFactor", value.asInstanceOf[js.Any])
    
    inline def setAbrBandWidthUpFactor(value: Double): Self = StObject.set(x, "abrBandWidthUpFactor", value.asInstanceOf[js.Any])
    
    inline def setAbrEwmaDefaultEstimate(value: Double): Self = StObject.set(x, "abrEwmaDefaultEstimate", value.asInstanceOf[js.Any])
    
    inline def setAbrEwmaFastLive(value: Double): Self = StObject.set(x, "abrEwmaFastLive", value.asInstanceOf[js.Any])
    
    inline def setAbrEwmaFastVoD(value: Double): Self = StObject.set(x, "abrEwmaFastVoD", value.asInstanceOf[js.Any])
    
    inline def setAbrEwmaSlowLive(value: Double): Self = StObject.set(x, "abrEwmaSlowLive", value.asInstanceOf[js.Any])
    
    inline def setAbrEwmaSlowVoD(value: Double): Self = StObject.set(x, "abrEwmaSlowVoD", value.asInstanceOf[js.Any])
    
    inline def setAbrMaxWithRealBitrate(value: Boolean): Self = StObject.set(x, "abrMaxWithRealBitrate", value.asInstanceOf[js.Any])
    
    inline def setMaxLoadingDelay(value: Double): Self = StObject.set(x, "maxLoadingDelay", value.asInstanceOf[js.Any])
    
    inline def setMaxStarvationDelay(value: Double): Self = StObject.set(x, "maxStarvationDelay", value.asInstanceOf[js.Any])
  }
}
