package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlsTimeSeriesResponse extends StObject {
  
  /** the number of times the URL was clicked during the hour */
  var clicks: Double
  
  /** the number of emails that were sent with the URL during the hour */
  var sent: Double
  
  /** the hour as a UTC date string in YYYY-MM-DD HH:MM:SS format */
  var time: String
  
  /** the number of unique clicks generated for emails sent with this URL during the hour */
  var unique_clicks: Double
}
object UrlsTimeSeriesResponse {
  
  inline def apply(clicks: Double, sent: Double, time: String, unique_clicks: Double): UrlsTimeSeriesResponse = {
    val __obj = js.Dynamic.literal(clicks = clicks.asInstanceOf[js.Any], sent = sent.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], unique_clicks = unique_clicks.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlsTimeSeriesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UrlsTimeSeriesResponse] (val x: Self) extends AnyVal {
    
    inline def setClicks(value: Double): Self = StObject.set(x, "clicks", value.asInstanceOf[js.Any])
    
    inline def setSent(value: Double): Self = StObject.set(x, "sent", value.asInstanceOf[js.Any])
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setUnique_clicks(value: Double): Self = StObject.set(x, "unique_clicks", value.asInstanceOf[js.Any])
  }
}
