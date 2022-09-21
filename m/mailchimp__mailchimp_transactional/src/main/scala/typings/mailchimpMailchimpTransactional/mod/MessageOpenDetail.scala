package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageOpenDetail extends StObject {
  
  /** the IP address that generated the open */
  var ip: String
  
  /** the approximate region and country that the opening IP is located */
  var location: String
  
  /** the unix timestamp from when the message was opened */
  var ts: Double
  
  /** the email client or browser data of the open */
  var ua: String
}
object MessageOpenDetail {
  
  inline def apply(ip: String, location: String, ts: Double, ua: String): MessageOpenDetail = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any], ua = ua.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageOpenDetail]
  }
  
  extension [Self <: MessageOpenDetail](x: Self) {
    
    inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
    
    inline def setUa(value: String): Self = StObject.set(x, "ua", value.asInstanceOf[js.Any])
  }
}
