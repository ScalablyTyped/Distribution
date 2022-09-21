package typings.googleapis.retailV2Mod.retailV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2SearchRequestBoostSpec extends StObject {
  
  /**
    * Condition boost specifications. If a product matches multiple conditions in the specifictions, boost scores from these specifications are all applied and combined in a non-linear way. Maximum number of specifications is 20.
    */
  var conditionBoostSpecs: js.UndefOr[js.Array[SchemaGoogleCloudRetailV2SearchRequestBoostSpecConditionBoostSpec]] = js.undefined
  
  /**
    * Whether to skip boostspec validation. If this field is set to true, invalid BoostSpec.condition_boost_specs will be ignored and valid BoostSpec.condition_boost_specs will still be applied.
    */
  var skipBoostSpecValidation: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2SearchRequestBoostSpec {
  
  inline def apply(): SchemaGoogleCloudRetailV2SearchRequestBoostSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2SearchRequestBoostSpec]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2SearchRequestBoostSpec](x: Self) {
    
    inline def setConditionBoostSpecs(value: js.Array[SchemaGoogleCloudRetailV2SearchRequestBoostSpecConditionBoostSpec]): Self = StObject.set(x, "conditionBoostSpecs", value.asInstanceOf[js.Any])
    
    inline def setConditionBoostSpecsUndefined: Self = StObject.set(x, "conditionBoostSpecs", js.undefined)
    
    inline def setConditionBoostSpecsVarargs(value: SchemaGoogleCloudRetailV2SearchRequestBoostSpecConditionBoostSpec*): Self = StObject.set(x, "conditionBoostSpecs", js.Array(value*))
    
    inline def setSkipBoostSpecValidation(value: Boolean): Self = StObject.set(x, "skipBoostSpecValidation", value.asInstanceOf[js.Any])
    
    inline def setSkipBoostSpecValidationNull: Self = StObject.set(x, "skipBoostSpecValidation", null)
    
    inline def setSkipBoostSpecValidationUndefined: Self = StObject.set(x, "skipBoostSpecValidation", js.undefined)
  }
}
