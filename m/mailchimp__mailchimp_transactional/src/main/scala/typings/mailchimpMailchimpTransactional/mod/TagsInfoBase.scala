package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagsInfoBase extends StObject {
  
  /** the total number of times tracked URLs in messages with this tag have been clicked */
  var clicks: Double
  
  /** the total number of spam complaints received for messages with this tag */
  var complaints: Double
  
  /** the total number of hard bounces by messages with this tag */
  var hard_bounces: Double
  
  /** the total number of times messages with this tag have been opened */
  var opens: Double
  
  /** the total number of rejected messages with this tag */
  var rejects: Double
  
  /** the total number of messages sent with this tag */
  var sent: Double
  
  /** the total number of soft bounces by messages with this tag */
  var soft_bounces: Double
  
  /** the actual tag as a string */
  var tag: String
  
  /** the total number of unsubscribe requests received for messages with this tag */
  var unsubs: Double
}
object TagsInfoBase {
  
  inline def apply(
    clicks: Double,
    complaints: Double,
    hard_bounces: Double,
    opens: Double,
    rejects: Double,
    sent: Double,
    soft_bounces: Double,
    tag: String,
    unsubs: Double
  ): TagsInfoBase = {
    val __obj = js.Dynamic.literal(clicks = clicks.asInstanceOf[js.Any], complaints = complaints.asInstanceOf[js.Any], hard_bounces = hard_bounces.asInstanceOf[js.Any], opens = opens.asInstanceOf[js.Any], rejects = rejects.asInstanceOf[js.Any], sent = sent.asInstanceOf[js.Any], soft_bounces = soft_bounces.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], unsubs = unsubs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagsInfoBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagsInfoBase] (val x: Self) extends AnyVal {
    
    inline def setClicks(value: Double): Self = StObject.set(x, "clicks", value.asInstanceOf[js.Any])
    
    inline def setComplaints(value: Double): Self = StObject.set(x, "complaints", value.asInstanceOf[js.Any])
    
    inline def setHard_bounces(value: Double): Self = StObject.set(x, "hard_bounces", value.asInstanceOf[js.Any])
    
    inline def setOpens(value: Double): Self = StObject.set(x, "opens", value.asInstanceOf[js.Any])
    
    inline def setRejects(value: Double): Self = StObject.set(x, "rejects", value.asInstanceOf[js.Any])
    
    inline def setSent(value: Double): Self = StObject.set(x, "sent", value.asInstanceOf[js.Any])
    
    inline def setSoft_bounces(value: Double): Self = StObject.set(x, "soft_bounces", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setUnsubs(value: Double): Self = StObject.set(x, "unsubs", value.asInstanceOf[js.Any])
  }
}
