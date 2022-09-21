package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1StudyConfigParameterSpecCategoricalValueSpec extends StObject {
  
  /**
    * Must be specified if type is `CATEGORICAL`. The list of possible categories.
    */
  var values: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudMlV1StudyConfigParameterSpecCategoricalValueSpec {
  
  inline def apply(): SchemaGoogleCloudMlV1StudyConfigParameterSpecCategoricalValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1StudyConfigParameterSpecCategoricalValueSpec]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1StudyConfigParameterSpecCategoricalValueSpec](x: Self) {
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesNull: Self = StObject.set(x, "values", null)
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
