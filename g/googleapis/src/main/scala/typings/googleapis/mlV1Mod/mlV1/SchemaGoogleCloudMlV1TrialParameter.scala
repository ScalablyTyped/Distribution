package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1TrialParameter extends StObject {
  
  /**
    * Must be set if ParameterType is DOUBLE or DISCRETE.
    */
  var floatValue: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Must be set if ParameterType is INTEGER
    */
  var intValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the parameter.
    */
  var parameter: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Must be set if ParameterTypeis CATEGORICAL
    */
  var stringValue: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudMlV1TrialParameter {
  
  inline def apply(): SchemaGoogleCloudMlV1TrialParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1TrialParameter]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1TrialParameter](x: Self) {
    
    inline def setFloatValue(value: Double): Self = StObject.set(x, "floatValue", value.asInstanceOf[js.Any])
    
    inline def setFloatValueNull: Self = StObject.set(x, "floatValue", null)
    
    inline def setFloatValueUndefined: Self = StObject.set(x, "floatValue", js.undefined)
    
    inline def setIntValue(value: String): Self = StObject.set(x, "intValue", value.asInstanceOf[js.Any])
    
    inline def setIntValueNull: Self = StObject.set(x, "intValue", null)
    
    inline def setIntValueUndefined: Self = StObject.set(x, "intValue", js.undefined)
    
    inline def setParameter(value: String): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    inline def setParameterNull: Self = StObject.set(x, "parameter", null)
    
    inline def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
    
    inline def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueNull: Self = StObject.set(x, "stringValue", null)
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
