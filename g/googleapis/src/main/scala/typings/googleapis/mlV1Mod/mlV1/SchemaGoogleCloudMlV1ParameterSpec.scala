package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1ParameterSpec extends StObject {
  
  /**
    * Required if type is `CATEGORICAL`. The list of possible categories.
    */
  var categoricalValues: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Required if type is `DISCRETE`. A list of feasible points. The list should be in strictly increasing order. For instance, this parameter might have possible settings of 1.5, 2.5, and 4.0. This list should not contain more than 1,000 values.
    */
  var discreteValues: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /**
    * Required if type is `DOUBLE` or `INTEGER`. This field should be unset if type is `CATEGORICAL`. This value should be integers if type is `INTEGER`.
    */
  var maxValue: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Required if type is `DOUBLE` or `INTEGER`. This field should be unset if type is `CATEGORICAL`. This value should be integers if type is INTEGER.
    */
  var minValue: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Required. The parameter name must be unique amongst all ParameterConfigs in a HyperparameterSpec message. E.g., "learning_rate".
    */
  var parameterName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. How the parameter should be scaled to the hypercube. Leave unset for categorical parameters. Some kind of scaling is strongly recommended for real or integral parameters (e.g., `UNIT_LINEAR_SCALE`).
    */
  var scaleType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The type of the parameter.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudMlV1ParameterSpec {
  
  inline def apply(): SchemaGoogleCloudMlV1ParameterSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1ParameterSpec]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1ParameterSpec](x: Self) {
    
    inline def setCategoricalValues(value: js.Array[String]): Self = StObject.set(x, "categoricalValues", value.asInstanceOf[js.Any])
    
    inline def setCategoricalValuesNull: Self = StObject.set(x, "categoricalValues", null)
    
    inline def setCategoricalValuesUndefined: Self = StObject.set(x, "categoricalValues", js.undefined)
    
    inline def setCategoricalValuesVarargs(value: String*): Self = StObject.set(x, "categoricalValues", js.Array(value*))
    
    inline def setDiscreteValues(value: js.Array[Double]): Self = StObject.set(x, "discreteValues", value.asInstanceOf[js.Any])
    
    inline def setDiscreteValuesNull: Self = StObject.set(x, "discreteValues", null)
    
    inline def setDiscreteValuesUndefined: Self = StObject.set(x, "discreteValues", js.undefined)
    
    inline def setDiscreteValuesVarargs(value: Double*): Self = StObject.set(x, "discreteValues", js.Array(value*))
    
    inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueNull: Self = StObject.set(x, "maxValue", null)
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueNull: Self = StObject.set(x, "minValue", null)
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    inline def setParameterName(value: String): Self = StObject.set(x, "parameterName", value.asInstanceOf[js.Any])
    
    inline def setParameterNameNull: Self = StObject.set(x, "parameterName", null)
    
    inline def setParameterNameUndefined: Self = StObject.set(x, "parameterName", js.undefined)
    
    inline def setScaleType(value: String): Self = StObject.set(x, "scaleType", value.asInstanceOf[js.Any])
    
    inline def setScaleTypeNull: Self = StObject.set(x, "scaleType", null)
    
    inline def setScaleTypeUndefined: Self = StObject.set(x, "scaleType", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
