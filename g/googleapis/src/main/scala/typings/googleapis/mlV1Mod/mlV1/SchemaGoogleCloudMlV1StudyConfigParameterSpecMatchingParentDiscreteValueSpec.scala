package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1StudyConfigParameterSpecMatchingParentDiscreteValueSpec extends StObject {
  
  /**
    * Matches values of the parent parameter with type 'DISCRETE'. All values must exist in `discrete_value_spec` of parent parameter.
    */
  var values: js.UndefOr[js.Array[Double] | Null] = js.undefined
}
object SchemaGoogleCloudMlV1StudyConfigParameterSpecMatchingParentDiscreteValueSpec {
  
  inline def apply(): SchemaGoogleCloudMlV1StudyConfigParameterSpecMatchingParentDiscreteValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1StudyConfigParameterSpecMatchingParentDiscreteValueSpec]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1StudyConfigParameterSpecMatchingParentDiscreteValueSpec](x: Self) {
    
    inline def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesNull: Self = StObject.set(x, "values", null)
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
