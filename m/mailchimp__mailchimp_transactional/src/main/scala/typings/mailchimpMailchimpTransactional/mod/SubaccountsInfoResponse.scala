package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubaccountsInfoResponse extends StObject {
  
  /** the date and time that the subaccount was created as a UTC string in YYYY-MM-DD HH:MM:SS format */
  var created_at: String
  
  /**
    * an optional manual hourly quota for the subaccount. If not specified, the hourly quota will be
    * managed based on reputation
    */
  var custom_quota: js.UndefOr[Double | Null] = js.undefined
  
  /** the date and time that the subaccount first sent as a UTC string in YYYY-MM-DD HH:MM:SS format */
  var first_sent_at: String
  
  /** the current hourly quota for the subaccount, either manual or reputation-based */
  var hourly_quota: Double
  
  /** a unique identifier for the subaccount */
  var id: String
  
  /** stats for this subaccount in the last 30 days */
  var last_30_days: SubaccountStats
  
  /** an optional display name for the subaccount */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** optional extra text to associate with the subaccount */
  var notes: js.UndefOr[String | Null] = js.undefined
  
  /** the subaccount's current reputation on a scale from 0 to 100 */
  var reputation: Double
  
  /** the number of emails the subaccount has sent in the last hour */
  var sent_hourly: Double
  
  /** the number of emails the subaccount has sent so far this month (months start on midnight of the 1st, UTC) */
  var sent_monthly: Double
  
  /** the number of emails the subaccount has sent since it was created */
  var sent_total: Double
  
  /** the number of emails the subaccount has sent so far this week (weeks start on midnight Monday, UTC) */
  var sent_weekly: Double
  
  /** the current sending status of the subaccount */
  var status: SubaccountsStatus
}
object SubaccountsInfoResponse {
  
  inline def apply(
    created_at: String,
    first_sent_at: String,
    hourly_quota: Double,
    id: String,
    last_30_days: SubaccountStats,
    reputation: Double,
    sent_hourly: Double,
    sent_monthly: Double,
    sent_total: Double,
    sent_weekly: Double,
    status: SubaccountsStatus
  ): SubaccountsInfoResponse = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], first_sent_at = first_sent_at.asInstanceOf[js.Any], hourly_quota = hourly_quota.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last_30_days = last_30_days.asInstanceOf[js.Any], reputation = reputation.asInstanceOf[js.Any], sent_hourly = sent_hourly.asInstanceOf[js.Any], sent_monthly = sent_monthly.asInstanceOf[js.Any], sent_total = sent_total.asInstanceOf[js.Any], sent_weekly = sent_weekly.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubaccountsInfoResponse]
  }
  
  extension [Self <: SubaccountsInfoResponse](x: Self) {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCustom_quota(value: Double): Self = StObject.set(x, "custom_quota", value.asInstanceOf[js.Any])
    
    inline def setCustom_quotaNull: Self = StObject.set(x, "custom_quota", null)
    
    inline def setCustom_quotaUndefined: Self = StObject.set(x, "custom_quota", js.undefined)
    
    inline def setFirst_sent_at(value: String): Self = StObject.set(x, "first_sent_at", value.asInstanceOf[js.Any])
    
    inline def setHourly_quota(value: Double): Self = StObject.set(x, "hourly_quota", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLast_30_days(value: SubaccountStats): Self = StObject.set(x, "last_30_days", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesNull: Self = StObject.set(x, "notes", null)
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setReputation(value: Double): Self = StObject.set(x, "reputation", value.asInstanceOf[js.Any])
    
    inline def setSent_hourly(value: Double): Self = StObject.set(x, "sent_hourly", value.asInstanceOf[js.Any])
    
    inline def setSent_monthly(value: Double): Self = StObject.set(x, "sent_monthly", value.asInstanceOf[js.Any])
    
    inline def setSent_total(value: Double): Self = StObject.set(x, "sent_total", value.asInstanceOf[js.Any])
    
    inline def setSent_weekly(value: Double): Self = StObject.set(x, "sent_weekly", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: SubaccountsStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
