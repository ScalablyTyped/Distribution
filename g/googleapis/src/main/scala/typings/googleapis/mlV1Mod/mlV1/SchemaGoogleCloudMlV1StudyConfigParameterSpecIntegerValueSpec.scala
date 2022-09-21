package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1StudyConfigParameterSpecIntegerValueSpec extends StObject {
  
  /**
    * Must be specified if type is `INTEGER`. Maximum value of the parameter.
    */
  var maxValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Must be specified if type is `INTEGER`. Minimum value of the parameter.
    */
  var minValue: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudMlV1StudyConfigParameterSpecIntegerValueSpec {
  
  inline def apply(): SchemaGoogleCloudMlV1StudyConfigParameterSpecIntegerValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1StudyConfigParameterSpecIntegerValueSpec]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1StudyConfigParameterSpecIntegerValueSpec](x: Self) {
    
    inline def setMaxValue(value: String): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueNull: Self = StObject.set(x, "maxValue", null)
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: String): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueNull: Self = StObject.set(x, "minValue", null)
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
  }
}
