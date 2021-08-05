package typings.got.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GotTimingsPhases extends StObject {
  
  var dns: Double
  
  var download: Double
  
  var firstByte: Double
  
  var request: Double
  
  var tcp: Double
  
  var total: Double
  
  @JSName("wait")
  var wait_FGotTimingsPhases: Double
}
object GotTimingsPhases {
  
  inline def apply(
    dns: Double,
    download: Double,
    firstByte: Double,
    request: Double,
    tcp: Double,
    total: Double,
    wait_ : Double
  ): GotTimingsPhases = {
    val __obj = js.Dynamic.literal(dns = dns.asInstanceOf[js.Any], download = download.asInstanceOf[js.Any], firstByte = firstByte.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], tcp = tcp.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.updateDynamic("wait")(wait_.asInstanceOf[js.Any])
    __obj.asInstanceOf[GotTimingsPhases]
  }
  
  extension [Self <: GotTimingsPhases](x: Self) {
    
    inline def setDns(value: Double): Self = StObject.set(x, "dns", value.asInstanceOf[js.Any])
    
    inline def setDownload(value: Double): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    inline def setFirstByte(value: Double): Self = StObject.set(x, "firstByte", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: Double): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setTcp(value: Double): Self = StObject.set(x, "tcp", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setWait_(value: Double): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
  }
}
