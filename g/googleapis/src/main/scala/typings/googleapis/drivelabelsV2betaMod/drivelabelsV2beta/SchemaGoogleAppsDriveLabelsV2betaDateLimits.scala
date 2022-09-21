package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2betaDateLimits extends StObject {
  
  /**
    * Maximum value for the date Field type.
    */
  var maxValue: js.UndefOr[SchemaGoogleTypeDate] = js.undefined
  
  /**
    * Minimum value for the date Field type.
    */
  var minValue: js.UndefOr[SchemaGoogleTypeDate] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2betaDateLimits {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2betaDateLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2betaDateLimits]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2betaDateLimits](x: Self) {
    
    inline def setMaxValue(value: SchemaGoogleTypeDate): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: SchemaGoogleTypeDate): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
  }
}
