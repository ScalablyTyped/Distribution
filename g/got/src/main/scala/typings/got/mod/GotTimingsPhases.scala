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
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class GotTimingsPhasesMutableBuilder[Self <: GotTimingsPhases] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDns(value: Double): Self = StObject.set(x, "dns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownload(value: Double): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstByte(value: Double): Self = StObject.set(x, "firstByte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: Double): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTcp(value: Double): Self = StObject.set(x, "tcp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWait_(value: Double): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
  }
}
