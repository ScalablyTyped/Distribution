package typings.googleapis.osconfigV1alphaMod.osconfigV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListInstanceOSPoliciesCompliancesResponse extends StObject {
  
  /**
    * List of instance OS policies compliance objects.
    */
  var instanceOsPoliciesCompliances: js.UndefOr[js.Array[SchemaInstanceOSPoliciesCompliance]] = js.undefined
  
  /**
    * The pagination token to retrieve the next page of instance OS policies compliance objects.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListInstanceOSPoliciesCompliancesResponse {
  
  inline def apply(): SchemaListInstanceOSPoliciesCompliancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListInstanceOSPoliciesCompliancesResponse]
  }
  
  extension [Self <: SchemaListInstanceOSPoliciesCompliancesResponse](x: Self) {
    
    inline def setInstanceOsPoliciesCompliances(value: js.Array[SchemaInstanceOSPoliciesCompliance]): Self = StObject.set(x, "instanceOsPoliciesCompliances", value.asInstanceOf[js.Any])
    
    inline def setInstanceOsPoliciesCompliancesUndefined: Self = StObject.set(x, "instanceOsPoliciesCompliances", js.undefined)
    
    inline def setInstanceOsPoliciesCompliancesVarargs(value: SchemaInstanceOSPoliciesCompliance*): Self = StObject.set(x, "instanceOsPoliciesCompliances", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
