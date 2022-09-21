package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1StudyConfigParameterSpec extends StObject {
  
  /**
    * The value spec for a 'CATEGORICAL' parameter.
    */
  var categoricalValueSpec: js.UndefOr[SchemaGoogleCloudMlV1StudyConfigParameterSpecCategoricalValueSpec] = js.undefined
  
  /**
    * A child node is active if the parameter's value matches the child node's matching_parent_values. If two items in child_parameter_specs have the same name, they must have disjoint matching_parent_values.
    */
  var childParameterSpecs: js.UndefOr[js.Array[SchemaGoogleCloudMlV1StudyConfigParameterSpec]] = js.undefined
  
  /**
    * The value spec for a 'DISCRETE' parameter.
    */
  var discreteValueSpec: js.UndefOr[SchemaGoogleCloudMlV1StudyConfigParameterSpecDiscreteValueSpec] = js.undefined
  
  /**
    * The value spec for a 'DOUBLE' parameter.
    */
  var doubleValueSpec: js.UndefOr[SchemaGoogleCloudMlV1StudyConfigParameterSpecDoubleValueSpec] = js.undefined
  
  /**
    * The value spec for an 'INTEGER' parameter.
    */
  var integerValueSpec: js.UndefOr[SchemaGoogleCloudMlV1StudyConfigParameterSpecIntegerValueSpec] = js.undefined
  
  /**
    * Required. The parameter name must be unique amongst all ParameterSpecs.
    */
  var parameter: js.UndefOr[String | Null] = js.undefined
  
  var parentCategoricalValues: js.UndefOr[SchemaGoogleCloudMlV1StudyConfigParameterSpecMatchingParentCategoricalValueSpec] = js.undefined
  
  var parentDiscreteValues: js.UndefOr[SchemaGoogleCloudMlV1StudyConfigParameterSpecMatchingParentDiscreteValueSpec] = js.undefined
  
  var parentIntValues: js.UndefOr[SchemaGoogleCloudMlV1StudyConfigParameterSpecMatchingParentIntValueSpec] = js.undefined
  
  /**
    * How the parameter should be scaled. Leave unset for categorical parameters.
    */
  var scaleType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The type of the parameter.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudMlV1StudyConfigParameterSpec {
  
  inline def apply(): SchemaGoogleCloudMlV1StudyConfigParameterSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1StudyConfigParameterSpec]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1StudyConfigParameterSpec](x: Self) {
    
    inline def setCategoricalValueSpec(value: SchemaGoogleCloudMlV1StudyConfigParameterSpecCategoricalValueSpec): Self = StObject.set(x, "categoricalValueSpec", value.asInstanceOf[js.Any])
    
    inline def setCategoricalValueSpecUndefined: Self = StObject.set(x, "categoricalValueSpec", js.undefined)
    
    inline def setChildParameterSpecs(value: js.Array[SchemaGoogleCloudMlV1StudyConfigParameterSpec]): Self = StObject.set(x, "childParameterSpecs", value.asInstanceOf[js.Any])
    
    inline def setChildParameterSpecsUndefined: Self = StObject.set(x, "childParameterSpecs", js.undefined)
    
    inline def setChildParameterSpecsVarargs(value: SchemaGoogleCloudMlV1StudyConfigParameterSpec*): Self = StObject.set(x, "childParameterSpecs", js.Array(value*))
    
    inline def setDiscreteValueSpec(value: SchemaGoogleCloudMlV1StudyConfigParameterSpecDiscreteValueSpec): Self = StObject.set(x, "discreteValueSpec", value.asInstanceOf[js.Any])
    
    inline def setDiscreteValueSpecUndefined: Self = StObject.set(x, "discreteValueSpec", js.undefined)
    
    inline def setDoubleValueSpec(value: SchemaGoogleCloudMlV1StudyConfigParameterSpecDoubleValueSpec): Self = StObject.set(x, "doubleValueSpec", value.asInstanceOf[js.Any])
    
    inline def setDoubleValueSpecUndefined: Self = StObject.set(x, "doubleValueSpec", js.undefined)
    
    inline def setIntegerValueSpec(value: SchemaGoogleCloudMlV1StudyConfigParameterSpecIntegerValueSpec): Self = StObject.set(x, "integerValueSpec", value.asInstanceOf[js.Any])
    
    inline def setIntegerValueSpecUndefined: Self = StObject.set(x, "integerValueSpec", js.undefined)
    
    inline def setParameter(value: String): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    inline def setParameterNull: Self = StObject.set(x, "parameter", null)
    
    inline def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
    
    inline def setParentCategoricalValues(value: SchemaGoogleCloudMlV1StudyConfigParameterSpecMatchingParentCategoricalValueSpec): Self = StObject.set(x, "parentCategoricalValues", value.asInstanceOf[js.Any])
    
    inline def setParentCategoricalValuesUndefined: Self = StObject.set(x, "parentCategoricalValues", js.undefined)
    
    inline def setParentDiscreteValues(value: SchemaGoogleCloudMlV1StudyConfigParameterSpecMatchingParentDiscreteValueSpec): Self = StObject.set(x, "parentDiscreteValues", value.asInstanceOf[js.Any])
    
    inline def setParentDiscreteValuesUndefined: Self = StObject.set(x, "parentDiscreteValues", js.undefined)
    
    inline def setParentIntValues(value: SchemaGoogleCloudMlV1StudyConfigParameterSpecMatchingParentIntValueSpec): Self = StObject.set(x, "parentIntValues", value.asInstanceOf[js.Any])
    
    inline def setParentIntValuesUndefined: Self = StObject.set(x, "parentIntValues", js.undefined)
    
    inline def setScaleType(value: String): Self = StObject.set(x, "scaleType", value.asInstanceOf[js.Any])
    
    inline def setScaleTypeNull: Self = StObject.set(x, "scaleType", null)
    
    inline def setScaleTypeUndefined: Self = StObject.set(x, "scaleType", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
