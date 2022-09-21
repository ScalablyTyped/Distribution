package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1StudyConfigParameterSpecDoubleValueSpec extends StObject {
  
  /**
    * Must be specified if type is `DOUBLE`. Maximum value of the parameter.
    */
  var maxValue: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Must be specified if type is `DOUBLE`. Minimum value of the parameter.
    */
  var minValue: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudMlV1StudyConfigParameterSpecDoubleValueSpec {
  
  inline def apply(): SchemaGoogleCloudMlV1StudyConfigParameterSpecDoubleValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1StudyConfigParameterSpecDoubleValueSpec]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1StudyConfigParameterSpecDoubleValueSpec](x: Self) {
    
    inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueNull: Self = StObject.set(x, "maxValue", null)
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueNull: Self = StObject.set(x, "minValue", null)
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
  }
}
