package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubaccountStats extends StObject {
  
  /** the number of URLs that have been clicked for this subaccount in the last 30 days */
  var clicks: Double
  
  /** the number of spam complaints for this subaccount in the last 30 days */
  var complaints: Double
  
  /** the number of emails hard bounced for this subaccount in the last 30 days */
  var hard_bounces: Double
  
  /** the number of times emails have been opened for this subaccount in the last 30 days */
  var opens: Double
  
  /** the number of emails rejected for sending this subaccount in the last 30 days */
  var rejects: Double
  
  /** the number of emails sent for this subaccount in the last 30 days */
  var sent: Double
  
  /** the number of emails soft bounced for this subaccount in the last 30 days */
  var soft_bounces: Double
  
  /** the number of unique clicks for emails sent for this subaccount in the last 30 days */
  var unique_clicks: Double
  
  /** the number of unique opens for emails sent for this subaccount in the last 30 days */
  var unique_opens: Double
  
  /** the number of unsbuscribes for this subaccount in the last 30 days */
  var unsubs: Double
}
object SubaccountStats {
  
  inline def apply(
    clicks: Double,
    complaints: Double,
    hard_bounces: Double,
    opens: Double,
    rejects: Double,
    sent: Double,
    soft_bounces: Double,
    unique_clicks: Double,
    unique_opens: Double,
    unsubs: Double
  ): SubaccountStats = {
    val __obj = js.Dynamic.literal(clicks = clicks.asInstanceOf[js.Any], complaints = complaints.asInstanceOf[js.Any], hard_bounces = hard_bounces.asInstanceOf[js.Any], opens = opens.asInstanceOf[js.Any], rejects = rejects.asInstanceOf[js.Any], sent = sent.asInstanceOf[js.Any], soft_bounces = soft_bounces.asInstanceOf[js.Any], unique_clicks = unique_clicks.asInstanceOf[js.Any], unique_opens = unique_opens.asInstanceOf[js.Any], unsubs = unsubs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubaccountStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubaccountStats] (val x: Self) extends AnyVal {
    
    inline def setClicks(value: Double): Self = StObject.set(x, "clicks", value.asInstanceOf[js.Any])
    
    inline def setComplaints(value: Double): Self = StObject.set(x, "complaints", value.asInstanceOf[js.Any])
    
    inline def setHard_bounces(value: Double): Self = StObject.set(x, "hard_bounces", value.asInstanceOf[js.Any])
    
    inline def setOpens(value: Double): Self = StObject.set(x, "opens", value.asInstanceOf[js.Any])
    
    inline def setRejects(value: Double): Self = StObject.set(x, "rejects", value.asInstanceOf[js.Any])
    
    inline def setSent(value: Double): Self = StObject.set(x, "sent", value.asInstanceOf[js.Any])
    
    inline def setSoft_bounces(value: Double): Self = StObject.set(x, "soft_bounces", value.asInstanceOf[js.Any])
    
    inline def setUnique_clicks(value: Double): Self = StObject.set(x, "unique_clicks", value.asInstanceOf[js.Any])
    
    inline def setUnique_opens(value: Double): Self = StObject.set(x, "unique_opens", value.asInstanceOf[js.Any])
    
    inline def setUnsubs(value: Double): Self = StObject.set(x, "unsubs", value.asInstanceOf[js.Any])
  }
}
