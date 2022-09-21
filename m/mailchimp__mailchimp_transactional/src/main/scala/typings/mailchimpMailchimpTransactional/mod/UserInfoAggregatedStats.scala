package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserInfoAggregatedStats extends StObject {
  
  /** stats for the lifetime of the user's account */
  var all_time: UserInfoStats
  
  /** stats for this user in the last 30 days */
  var last_30_days: UserInfoStats
  
  /** stats for this user in the last 60 days */
  var last_60_days: UserInfoStats
  
  /** stats for this user in the last 7 days */
  var last_7_days: UserInfoStats
  
  /** stats for this user in the last 90 days */
  var last_90_days: UserInfoStats
  
  /** stats for this user so far today */
  var today: UserInfoStats
}
object UserInfoAggregatedStats {
  
  inline def apply(
    all_time: UserInfoStats,
    last_30_days: UserInfoStats,
    last_60_days: UserInfoStats,
    last_7_days: UserInfoStats,
    last_90_days: UserInfoStats,
    today: UserInfoStats
  ): UserInfoAggregatedStats = {
    val __obj = js.Dynamic.literal(all_time = all_time.asInstanceOf[js.Any], last_30_days = last_30_days.asInstanceOf[js.Any], last_60_days = last_60_days.asInstanceOf[js.Any], last_7_days = last_7_days.asInstanceOf[js.Any], last_90_days = last_90_days.asInstanceOf[js.Any], today = today.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserInfoAggregatedStats]
  }
  
  extension [Self <: UserInfoAggregatedStats](x: Self) {
    
    inline def setAll_time(value: UserInfoStats): Self = StObject.set(x, "all_time", value.asInstanceOf[js.Any])
    
    inline def setLast_30_days(value: UserInfoStats): Self = StObject.set(x, "last_30_days", value.asInstanceOf[js.Any])
    
    inline def setLast_60_days(value: UserInfoStats): Self = StObject.set(x, "last_60_days", value.asInstanceOf[js.Any])
    
    inline def setLast_7_days(value: UserInfoStats): Self = StObject.set(x, "last_7_days", value.asInstanceOf[js.Any])
    
    inline def setLast_90_days(value: UserInfoStats): Self = StObject.set(x, "last_90_days", value.asInstanceOf[js.Any])
    
    inline def setToday(value: UserInfoStats): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
  }
}
