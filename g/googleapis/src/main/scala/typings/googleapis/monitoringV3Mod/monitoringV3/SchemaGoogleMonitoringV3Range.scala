package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleMonitoringV3Range extends StObject {
  
  /**
    * Range maximum.
    */
  var max: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Range minimum.
    */
  var min: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleMonitoringV3Range {
  
  inline def apply(): SchemaGoogleMonitoringV3Range = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleMonitoringV3Range]
  }
  
  extension [Self <: SchemaGoogleMonitoringV3Range](x: Self) {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxNull: Self = StObject.set(x, "max", null)
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinNull: Self = StObject.set(x, "min", null)
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
