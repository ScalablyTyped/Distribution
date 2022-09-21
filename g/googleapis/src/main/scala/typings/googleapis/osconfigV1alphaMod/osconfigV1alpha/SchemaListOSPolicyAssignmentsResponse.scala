package typings.googleapis.osconfigV1alphaMod.osconfigV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListOSPolicyAssignmentsResponse extends StObject {
  
  /**
    * The pagination token to retrieve the next page of OS policy assignments.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of assignments
    */
  var osPolicyAssignments: js.UndefOr[js.Array[SchemaOSPolicyAssignment]] = js.undefined
}
object SchemaListOSPolicyAssignmentsResponse {
  
  inline def apply(): SchemaListOSPolicyAssignmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListOSPolicyAssignmentsResponse]
  }
  
  extension [Self <: SchemaListOSPolicyAssignmentsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setOsPolicyAssignments(value: js.Array[SchemaOSPolicyAssignment]): Self = StObject.set(x, "osPolicyAssignments", value.asInstanceOf[js.Any])
    
    inline def setOsPolicyAssignmentsUndefined: Self = StObject.set(x, "osPolicyAssignments", js.undefined)
    
    inline def setOsPolicyAssignmentsVarargs(value: SchemaOSPolicyAssignment*): Self = StObject.set(x, "osPolicyAssignments", js.Array(value*))
  }
}
