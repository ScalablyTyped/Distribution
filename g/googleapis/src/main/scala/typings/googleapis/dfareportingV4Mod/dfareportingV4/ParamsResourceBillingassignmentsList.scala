package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBillingassignmentsList
  extends StObject
     with StandardParameters {
  
  /**
    * Billing profile ID of this billing assignment.
    */
  var billingProfileId: js.UndefOr[String] = js.undefined
  
  /**
    * User profile ID associated with this request.
    */
  var profileId: js.UndefOr[String] = js.undefined
}
object ParamsResourceBillingassignmentsList {
  
  inline def apply(): ParamsResourceBillingassignmentsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBillingassignmentsList]
  }
  
  extension [Self <: ParamsResourceBillingassignmentsList](x: Self) {
    
    inline def setBillingProfileId(value: String): Self = StObject.set(x, "billingProfileId", value.asInstanceOf[js.Any])
    
    inline def setBillingProfileIdUndefined: Self = StObject.set(x, "billingProfileId", js.undefined)
    
    inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
  }
}
