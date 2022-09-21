package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubaccountsAddRequest
  extends StObject
     with BaseRequest {
  
  /**
    * an optional manual hourly quota for the subaccount. If not specified, Mandrill will
    * manage this based on reputation
    */
  var custom_quota: js.UndefOr[Double] = js.undefined
  
  /** a unique identifier for the subaccount to be used in sending calls */
  var id: String
  
  /** an optional display name to further identify the subaccount */
  var name: js.UndefOr[String] = js.undefined
  
  /** optional extra text to associate with the subaccount */
  var notes: js.UndefOr[String] = js.undefined
}
object SubaccountsAddRequest {
  
  inline def apply(id: String): SubaccountsAddRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubaccountsAddRequest]
  }
  
  extension [Self <: SubaccountsAddRequest](x: Self) {
    
    inline def setCustom_quota(value: Double): Self = StObject.set(x, "custom_quota", value.asInstanceOf[js.Any])
    
    inline def setCustom_quotaUndefined: Self = StObject.set(x, "custom_quota", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
  }
}
