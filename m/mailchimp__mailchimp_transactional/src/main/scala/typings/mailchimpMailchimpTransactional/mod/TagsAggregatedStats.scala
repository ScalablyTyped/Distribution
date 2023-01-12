package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagsAggregatedStats extends StObject {
  
  /** stats with this tag in the last 30 days */
  var last_30_days: TagsInfoStats
  
  /** stats with this tag in the last 60 days */
  var last_60_days: TagsInfoStats
  
  /** stats with this tag in the last 7 days */
  var last_7_days: TagsInfoStats
  
  /** stats with this tag in the last 90 days */
  var last_90_days: TagsInfoStats
  
  /** stats with this tag so far today */
  var today: TagsInfoStats
}
object TagsAggregatedStats {
  
  inline def apply(
    last_30_days: TagsInfoStats,
    last_60_days: TagsInfoStats,
    last_7_days: TagsInfoStats,
    last_90_days: TagsInfoStats,
    today: TagsInfoStats
  ): TagsAggregatedStats = {
    val __obj = js.Dynamic.literal(last_30_days = last_30_days.asInstanceOf[js.Any], last_60_days = last_60_days.asInstanceOf[js.Any], last_7_days = last_7_days.asInstanceOf[js.Any], last_90_days = last_90_days.asInstanceOf[js.Any], today = today.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagsAggregatedStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagsAggregatedStats] (val x: Self) extends AnyVal {
    
    inline def setLast_30_days(value: TagsInfoStats): Self = StObject.set(x, "last_30_days", value.asInstanceOf[js.Any])
    
    inline def setLast_60_days(value: TagsInfoStats): Self = StObject.set(x, "last_60_days", value.asInstanceOf[js.Any])
    
    inline def setLast_7_days(value: TagsInfoStats): Self = StObject.set(x, "last_7_days", value.asInstanceOf[js.Any])
    
    inline def setLast_90_days(value: TagsInfoStats): Self = StObject.set(x, "last_90_days", value.asInstanceOf[js.Any])
    
    inline def setToday(value: TagsInfoStats): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
  }
}
