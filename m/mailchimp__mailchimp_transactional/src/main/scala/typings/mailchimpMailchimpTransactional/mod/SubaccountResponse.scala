package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubaccountResponse extends StObject {
  
  /** the date and time that the subaccount was created as a UTC string in YYYY-MM-DD HH:MM:SS format */
  var created_at: String
  
  /**
    * an optional manual hourly quota for the subaccount. If not specified, the hourly quota will
    * be managed based on reputation
    */
  var custom_quota: js.UndefOr[Double | Null] = js.undefined
  
  /** the date and time that the subaccount first sent as a UTC string in YYYY-MM-DD HH:MM:SS format */
  var first_sent_at: String
  
  /** a unique identifier for the subaccount */
  var id: String
  
  /** an optional display name for the subaccount */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** the subaccount's current reputation on a scale from 0 to 100 */
  var reputation: Double
  
  /** the number of emails the subaccount has sent so far this month (months start on midnight of the 1st, UTC) */
  var sent_monthly: Double
  
  /** the number of emails the subaccount has sent since it was created */
  var sent_total: Double
  
  /** the number of emails the subaccount has sent so far this week (weeks start on midnight Monday, UTC) */
  var sent_weekly: Double
  
  /** the current sending status of the subaccount */
  var status: SubaccountsStatus
}
object SubaccountResponse {
  
  inline def apply(
    created_at: String,
    first_sent_at: String,
    id: String,
    reputation: Double,
    sent_monthly: Double,
    sent_total: Double,
    sent_weekly: Double,
    status: SubaccountsStatus
  ): SubaccountResponse = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], first_sent_at = first_sent_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], reputation = reputation.asInstanceOf[js.Any], sent_monthly = sent_monthly.asInstanceOf[js.Any], sent_total = sent_total.asInstanceOf[js.Any], sent_weekly = sent_weekly.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubaccountResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubaccountResponse] (val x: Self) extends AnyVal {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCustom_quota(value: Double): Self = StObject.set(x, "custom_quota", value.asInstanceOf[js.Any])
    
    inline def setCustom_quotaNull: Self = StObject.set(x, "custom_quota", null)
    
    inline def setCustom_quotaUndefined: Self = StObject.set(x, "custom_quota", js.undefined)
    
    inline def setFirst_sent_at(value: String): Self = StObject.set(x, "first_sent_at", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReputation(value: Double): Self = StObject.set(x, "reputation", value.asInstanceOf[js.Any])
    
    inline def setSent_monthly(value: Double): Self = StObject.set(x, "sent_monthly", value.asInstanceOf[js.Any])
    
    inline def setSent_total(value: Double): Self = StObject.set(x, "sent_total", value.asInstanceOf[js.Any])
    
    inline def setSent_weekly(value: Double): Self = StObject.set(x, "sent_weekly", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: SubaccountsStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
