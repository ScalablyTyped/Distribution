package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagsInfoResponse
  extends StObject
     with TagsInfoBase {
  
  /** stats with this tag so far today */
  var stats: TagsAggregatedStats
}
object TagsInfoResponse {
  
  inline def apply(
    clicks: Double,
    complaints: Double,
    hard_bounces: Double,
    opens: Double,
    rejects: Double,
    sent: Double,
    soft_bounces: Double,
    stats: TagsAggregatedStats,
    tag: String,
    unsubs: Double
  ): TagsInfoResponse = {
    val __obj = js.Dynamic.literal(clicks = clicks.asInstanceOf[js.Any], complaints = complaints.asInstanceOf[js.Any], hard_bounces = hard_bounces.asInstanceOf[js.Any], opens = opens.asInstanceOf[js.Any], rejects = rejects.asInstanceOf[js.Any], sent = sent.asInstanceOf[js.Any], soft_bounces = soft_bounces.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], unsubs = unsubs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagsInfoResponse]
  }
  
  extension [Self <: TagsInfoResponse](x: Self) {
    
    inline def setStats(value: TagsAggregatedStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}
