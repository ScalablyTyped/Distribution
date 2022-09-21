package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingAssignmentsListResponse extends StObject {
  
  /** Billing assignments collection. */
  var billingAssignments: js.UndefOr[js.Array[BillingAssignment]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#billingAssignmentsListResponse". */
  var kind: js.UndefOr[String] = js.undefined
}
object BillingAssignmentsListResponse {
  
  inline def apply(): BillingAssignmentsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingAssignmentsListResponse]
  }
  
  extension [Self <: BillingAssignmentsListResponse](x: Self) {
    
    inline def setBillingAssignments(value: js.Array[BillingAssignment]): Self = StObject.set(x, "billingAssignments", value.asInstanceOf[js.Any])
    
    inline def setBillingAssignmentsUndefined: Self = StObject.set(x, "billingAssignments", js.undefined)
    
    inline def setBillingAssignmentsVarargs(value: BillingAssignment*): Self = StObject.set(x, "billingAssignments", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
