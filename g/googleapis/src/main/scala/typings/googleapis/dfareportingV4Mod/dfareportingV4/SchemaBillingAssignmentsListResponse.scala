package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBillingAssignmentsListResponse extends StObject {
  
  /**
    * Billing assignments collection.
    */
  var billingAssignments: js.UndefOr[js.Array[SchemaBillingAssignment]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#billingAssignmentsListResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaBillingAssignmentsListResponse {
  
  inline def apply(): SchemaBillingAssignmentsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBillingAssignmentsListResponse]
  }
  
  extension [Self <: SchemaBillingAssignmentsListResponse](x: Self) {
    
    inline def setBillingAssignments(value: js.Array[SchemaBillingAssignment]): Self = StObject.set(x, "billingAssignments", value.asInstanceOf[js.Any])
    
    inline def setBillingAssignmentsUndefined: Self = StObject.set(x, "billingAssignments", js.undefined)
    
    inline def setBillingAssignmentsVarargs(value: SchemaBillingAssignment*): Self = StObject.set(x, "billingAssignments", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
