package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlsStatsResponse extends StObject {
  
  /** the number of times the URL has been clicked from a tracked email */
  var clicks: Double
  
  /** the number of emails that contained the URL */
  var sent: Double
  
  /** the number of unique emails that have generated clicks for this URL */
  var unique_clicks: Double
  
  /** the URL to be tracked */
  var url: String
}
object UrlsStatsResponse {
  
  inline def apply(clicks: Double, sent: Double, unique_clicks: Double, url: String): UrlsStatsResponse = {
    val __obj = js.Dynamic.literal(clicks = clicks.asInstanceOf[js.Any], sent = sent.asInstanceOf[js.Any], unique_clicks = unique_clicks.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlsStatsResponse]
  }
  
  extension [Self <: UrlsStatsResponse](x: Self) {
    
    inline def setClicks(value: Double): Self = StObject.set(x, "clicks", value.asInstanceOf[js.Any])
    
    inline def setSent(value: Double): Self = StObject.set(x, "sent", value.asInstanceOf[js.Any])
    
    inline def setUnique_clicks(value: Double): Self = StObject.set(x, "unique_clicks", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
