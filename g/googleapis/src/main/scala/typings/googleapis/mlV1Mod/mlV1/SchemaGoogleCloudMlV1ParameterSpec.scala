package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a single hyperparameter to optimize.
  */
@js.native
trait SchemaGoogleCloudMlV1ParameterSpec extends StObject {
  
  /**
    * Required if type is `CATEGORICAL`. The list of possible categories.
    */
  var categoricalValues: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Required if type is `DISCRETE`. A list of feasible points. The list
    * should be in strictly increasing order. For instance, this parameter
    * might have possible settings of 1.5, 2.5, and 4.0. This list should not
    * contain more than 1,000 values.
    */
  var discreteValues: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Required if type is `DOUBLE` or `INTEGER`. This field should be unset if
    * type is `CATEGORICAL`. This value should be integers if type is
    * `INTEGER`.
    */
  var maxValue: js.UndefOr[Double] = js.native
  
  /**
    * Required if type is `DOUBLE` or `INTEGER`. This field should be unset if
    * type is `CATEGORICAL`. This value should be integers if type is INTEGER.
    */
  var minValue: js.UndefOr[Double] = js.native
  
  /**
    * Required. The parameter name must be unique amongst all ParameterConfigs
    * in a HyperparameterSpec message. E.g., &quot;learning_rate&quot;.
    */
  var parameterName: js.UndefOr[String] = js.native
  
  /**
    * Optional. How the parameter should be scaled to the hypercube. Leave
    * unset for categorical parameters. Some kind of scaling is strongly
    * recommended for real or integral parameters (e.g., `UNIT_LINEAR_SCALE`).
    */
  var scaleType: js.UndefOr[String] = js.native
  
  /**
    * Required. The type of the parameter.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudMlV1ParameterSpec {
  
  @scala.inline
  def apply(): SchemaGoogleCloudMlV1ParameterSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1ParameterSpec]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudMlV1ParameterSpecMutableBuilder[Self <: SchemaGoogleCloudMlV1ParameterSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategoricalValues(value: js.Array[String]): Self = StObject.set(x, "categoricalValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoricalValuesUndefined: Self = StObject.set(x, "categoricalValues", js.undefined)
    
    @scala.inline
    def setCategoricalValuesVarargs(value: String*): Self = StObject.set(x, "categoricalValues", js.Array(value :_*))
    
    @scala.inline
    def setDiscreteValues(value: js.Array[Double]): Self = StObject.set(x, "discreteValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscreteValuesUndefined: Self = StObject.set(x, "discreteValues", js.undefined)
    
    @scala.inline
    def setDiscreteValuesVarargs(value: Double*): Self = StObject.set(x, "discreteValues", js.Array(value :_*))
    
    @scala.inline
    def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    @scala.inline
    def setParameterName(value: String): Self = StObject.set(x, "parameterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterNameUndefined: Self = StObject.set(x, "parameterName", js.undefined)
    
    @scala.inline
    def setScaleType(value: String): Self = StObject.set(x, "scaleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleTypeUndefined: Self = StObject.set(x, "scaleType", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
