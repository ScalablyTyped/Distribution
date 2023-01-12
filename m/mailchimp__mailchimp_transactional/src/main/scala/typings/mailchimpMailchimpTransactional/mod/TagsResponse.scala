package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagsResponse
  extends StObject
     with TagsInfoBase {
  
  /** the tag's current reputation on a scale from 0 to 100. */
  var reputation: Double
  
  /** the number of unique clicks for emails sent with this tag */
  var unique_clicks: Double
  
  /** the number of unique opens for emails sent with this tag */
  var unique_opens: Double
}
object TagsResponse {
  
  inline def apply(
    clicks: Double,
    complaints: Double,
    hard_bounces: Double,
    opens: Double,
    rejects: Double,
    reputation: Double,
    sent: Double,
    soft_bounces: Double,
    tag: String,
    unique_clicks: Double,
    unique_opens: Double,
    unsubs: Double
  ): TagsResponse = {
    val __obj = js.Dynamic.literal(clicks = clicks.asInstanceOf[js.Any], complaints = complaints.asInstanceOf[js.Any], hard_bounces = hard_bounces.asInstanceOf[js.Any], opens = opens.asInstanceOf[js.Any], rejects = rejects.asInstanceOf[js.Any], reputation = reputation.asInstanceOf[js.Any], sent = sent.asInstanceOf[js.Any], soft_bounces = soft_bounces.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], unique_clicks = unique_clicks.asInstanceOf[js.Any], unique_opens = unique_opens.asInstanceOf[js.Any], unsubs = unsubs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagsResponse] (val x: Self) extends AnyVal {
    
    inline def setReputation(value: Double): Self = StObject.set(x, "reputation", value.asInstanceOf[js.Any])
    
    inline def setUnique_clicks(value: Double): Self = StObject.set(x, "unique_clicks", value.asInstanceOf[js.Any])
    
    inline def setUnique_opens(value: Double): Self = StObject.set(x, "unique_opens", value.asInstanceOf[js.Any])
  }
}
