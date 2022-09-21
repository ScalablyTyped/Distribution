package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendersInfoAggregatedStats extends StObject {
  
  /** stats for this sender in the last 30 days */
  var last_30_days: SendersInfoStats
  
  /** stats for this sender in the last 60 days */
  var last_60_days: SendersInfoStats
  
  /** stats for this sender in the last 7 days */
  var last_7_days: SendersInfoStats
  
  /** stats for this sender in the last 90 days */
  var last_90_days: SendersInfoStats
  
  /** stats for this sender so far today */
  var today: SendersInfoStats
}
object SendersInfoAggregatedStats {
  
  inline def apply(
    last_30_days: SendersInfoStats,
    last_60_days: SendersInfoStats,
    last_7_days: SendersInfoStats,
    last_90_days: SendersInfoStats,
    today: SendersInfoStats
  ): SendersInfoAggregatedStats = {
    val __obj = js.Dynamic.literal(last_30_days = last_30_days.asInstanceOf[js.Any], last_60_days = last_60_days.asInstanceOf[js.Any], last_7_days = last_7_days.asInstanceOf[js.Any], last_90_days = last_90_days.asInstanceOf[js.Any], today = today.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendersInfoAggregatedStats]
  }
  
  extension [Self <: SendersInfoAggregatedStats](x: Self) {
    
    inline def setLast_30_days(value: SendersInfoStats): Self = StObject.set(x, "last_30_days", value.asInstanceOf[js.Any])
    
    inline def setLast_60_days(value: SendersInfoStats): Self = StObject.set(x, "last_60_days", value.asInstanceOf[js.Any])
    
    inline def setLast_7_days(value: SendersInfoStats): Self = StObject.set(x, "last_7_days", value.asInstanceOf[js.Any])
    
    inline def setLast_90_days(value: SendersInfoStats): Self = StObject.set(x, "last_90_days", value.asInstanceOf[js.Any])
    
    inline def setToday(value: SendersInfoStats): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
  }
}
