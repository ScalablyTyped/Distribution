package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaModelPageOptimizationConfigCandidate extends StObject {
  
  /**
    * This has to be a valid ServingConfig identifier. For example, for a ServingConfig with full name: `projects/x/locations/global/catalogs/default_catalog/servingConfigs/my_candidate_config`, this would be `my_candidate_config`.
    */
  var servingConfigId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaModelPageOptimizationConfigCandidate {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaModelPageOptimizationConfigCandidate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaModelPageOptimizationConfigCandidate]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaModelPageOptimizationConfigCandidate](x: Self) {
    
    inline def setServingConfigId(value: String): Self = StObject.set(x, "servingConfigId", value.asInstanceOf[js.Any])
    
    inline def setServingConfigIdNull: Self = StObject.set(x, "servingConfigId", null)
    
    inline def setServingConfigIdUndefined: Self = StObject.set(x, "servingConfigId", js.undefined)
  }
}
