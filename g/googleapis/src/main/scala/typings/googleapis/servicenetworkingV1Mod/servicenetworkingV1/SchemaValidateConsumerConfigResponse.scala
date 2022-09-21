package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaValidateConsumerConfigResponse extends StObject {
  
  /**
    * List of subnetwork candidates from the request which exist with the `ip_cidr_range`, `secondary_ip_cider_ranges`, and `outside_allocation` fields set.
    */
  var existingSubnetworkCandidates: js.UndefOr[js.Array[SchemaSubnetwork]] = js.undefined
  
  /**
    * Indicates whether all the requested validations passed.
    */
  var isValid: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The first validation which failed.
    */
  var validationError: js.UndefOr[String | Null] = js.undefined
}
object SchemaValidateConsumerConfigResponse {
  
  inline def apply(): SchemaValidateConsumerConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaValidateConsumerConfigResponse]
  }
  
  extension [Self <: SchemaValidateConsumerConfigResponse](x: Self) {
    
    inline def setExistingSubnetworkCandidates(value: js.Array[SchemaSubnetwork]): Self = StObject.set(x, "existingSubnetworkCandidates", value.asInstanceOf[js.Any])
    
    inline def setExistingSubnetworkCandidatesUndefined: Self = StObject.set(x, "existingSubnetworkCandidates", js.undefined)
    
    inline def setExistingSubnetworkCandidatesVarargs(value: SchemaSubnetwork*): Self = StObject.set(x, "existingSubnetworkCandidates", js.Array(value*))
    
    inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    inline def setIsValidNull: Self = StObject.set(x, "isValid", null)
    
    inline def setIsValidUndefined: Self = StObject.set(x, "isValid", js.undefined)
    
    inline def setValidationError(value: String): Self = StObject.set(x, "validationError", value.asInstanceOf[js.Any])
    
    inline def setValidationErrorNull: Self = StObject.set(x, "validationError", null)
    
    inline def setValidationErrorUndefined: Self = StObject.set(x, "validationError", js.undefined)
  }
}
