package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FPSControllerConfig extends StObject {
  
  var capLevelOnFPSDrop: Boolean
  
  var fpsDroppedMonitoringPeriod: Double
  
  var fpsDroppedMonitoringThreshold: Double
}
object FPSControllerConfig {
  
  inline def apply(
    capLevelOnFPSDrop: Boolean,
    fpsDroppedMonitoringPeriod: Double,
    fpsDroppedMonitoringThreshold: Double
  ): FPSControllerConfig = {
    val __obj = js.Dynamic.literal(capLevelOnFPSDrop = capLevelOnFPSDrop.asInstanceOf[js.Any], fpsDroppedMonitoringPeriod = fpsDroppedMonitoringPeriod.asInstanceOf[js.Any], fpsDroppedMonitoringThreshold = fpsDroppedMonitoringThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[FPSControllerConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FPSControllerConfig] (val x: Self) extends AnyVal {
    
    inline def setCapLevelOnFPSDrop(value: Boolean): Self = StObject.set(x, "capLevelOnFPSDrop", value.asInstanceOf[js.Any])
    
    inline def setFpsDroppedMonitoringPeriod(value: Double): Self = StObject.set(x, "fpsDroppedMonitoringPeriod", value.asInstanceOf[js.Any])
    
    inline def setFpsDroppedMonitoringThreshold(value: Double): Self = StObject.set(x, "fpsDroppedMonitoringThreshold", value.asInstanceOf[js.Any])
  }
}
