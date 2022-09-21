package typings.googleapis.osconfigV1alphaMod.osconfigV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListOSPolicyAssignmentReportsResponse extends StObject {
  
  /**
    * The pagination token to retrieve the next page of OS policy assignment report objects.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of OS policy assignment reports.
    */
  var osPolicyAssignmentReports: js.UndefOr[js.Array[SchemaOSPolicyAssignmentReport]] = js.undefined
}
object SchemaListOSPolicyAssignmentReportsResponse {
  
  inline def apply(): SchemaListOSPolicyAssignmentReportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListOSPolicyAssignmentReportsResponse]
  }
  
  extension [Self <: SchemaListOSPolicyAssignmentReportsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setOsPolicyAssignmentReports(value: js.Array[SchemaOSPolicyAssignmentReport]): Self = StObject.set(x, "osPolicyAssignmentReports", value.asInstanceOf[js.Any])
    
    inline def setOsPolicyAssignmentReportsUndefined: Self = StObject.set(x, "osPolicyAssignmentReports", js.undefined)
    
    inline def setOsPolicyAssignmentReportsVarargs(value: SchemaOSPolicyAssignmentReport*): Self = StObject.set(x, "osPolicyAssignmentReports", js.Array(value*))
  }
}
