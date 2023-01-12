package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagesClickDetail extends StObject {
  
  /** the IP address that generated the click */
  var ip: String
  
  /** the approximate region and country that the clicking IP is located */
  var location: String
  
  /** the unix timestamp from when the message was clicked */
  var ts: Double
  
  /** the email client or browser data of the click */
  var ua: String
  
  /** the URL that was clicked on */
  var url: String
}
object MessagesClickDetail {
  
  inline def apply(ip: String, location: String, ts: Double, ua: String, url: String): MessagesClickDetail = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any], ua = ua.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagesClickDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessagesClickDetail] (val x: Self) extends AnyVal {
    
    inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
    
    inline def setUa(value: String): Self = StObject.set(x, "ua", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
