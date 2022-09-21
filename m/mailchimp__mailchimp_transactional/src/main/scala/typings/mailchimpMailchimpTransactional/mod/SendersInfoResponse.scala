package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendersInfoResponse extends StObject {
  
  /** the sender's email address */
  var address: String
  
  /** the total number of times tracked URLs in messages by this sender have been clicked */
  var clicks: Double
  
  /** the total number of spam complaints received for messages by this sender */
  var complaints: Double
  
  /**
    * the date and time that the sender was first seen by Mandrill as a UTC date string in
    * YYYY-MM-DD HH:MM:SS format
    */
  var created_at: String
  
  /** the total number of hard bounces by messages by this sender */
  var hard_bounces: Double
  
  /** the total number of times messages by this sender have been opened */
  var opens: Double
  
  /** the total number of rejected messages by this sender */
  var rejects: Double
  
  /** the total number of messages sent by this sender */
  var sent: Double
  
  /** the total number of soft bounces by messages by this sender */
  var soft_bounces: Double
  
  /** an aggregate summary of the sender's sending stats */
  var stats: SendersInfoAggregatedStats
  
  /** the total number of unsubscribe requests received for messages by this sender */
  var unsubs: Double
}
object SendersInfoResponse {
  
  inline def apply(
    address: String,
    clicks: Double,
    complaints: Double,
    created_at: String,
    hard_bounces: Double,
    opens: Double,
    rejects: Double,
    sent: Double,
    soft_bounces: Double,
    stats: SendersInfoAggregatedStats,
    unsubs: Double
  ): SendersInfoResponse = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], clicks = clicks.asInstanceOf[js.Any], complaints = complaints.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], hard_bounces = hard_bounces.asInstanceOf[js.Any], opens = opens.asInstanceOf[js.Any], rejects = rejects.asInstanceOf[js.Any], sent = sent.asInstanceOf[js.Any], soft_bounces = soft_bounces.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], unsubs = unsubs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendersInfoResponse]
  }
  
  extension [Self <: SendersInfoResponse](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setClicks(value: Double): Self = StObject.set(x, "clicks", value.asInstanceOf[js.Any])
    
    inline def setComplaints(value: Double): Self = StObject.set(x, "complaints", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setHard_bounces(value: Double): Self = StObject.set(x, "hard_bounces", value.asInstanceOf[js.Any])
    
    inline def setOpens(value: Double): Self = StObject.set(x, "opens", value.asInstanceOf[js.Any])
    
    inline def setRejects(value: Double): Self = StObject.set(x, "rejects", value.asInstanceOf[js.Any])
    
    inline def setSent(value: Double): Self = StObject.set(x, "sent", value.asInstanceOf[js.Any])
    
    inline def setSoft_bounces(value: Double): Self = StObject.set(x, "soft_bounces", value.asInstanceOf[js.Any])
    
    inline def setStats(value: SendersInfoAggregatedStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setUnsubs(value: Double): Self = StObject.set(x, "unsubs", value.asInstanceOf[js.Any])
  }
}
