package typings.jsrsasign.jsrsasign.KJUR.asn1.ocsp.OCSPUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseInfo extends js.Object {
  
  var certStatus: String = js.native
  
  var nextUpdate: String = js.native
  
  var responseStatus: Double = js.native
  
  var thisUpdate: String = js.native
}
object ResponseInfo {
  
  @scala.inline
  def apply(certStatus: String, nextUpdate: String, responseStatus: Double, thisUpdate: String): ResponseInfo = {
    val __obj = js.Dynamic.literal(certStatus = certStatus.asInstanceOf[js.Any], nextUpdate = nextUpdate.asInstanceOf[js.Any], responseStatus = responseStatus.asInstanceOf[js.Any], thisUpdate = thisUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseInfo]
  }
  
  @scala.inline
  implicit class ResponseInfoOps[Self <: ResponseInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCertStatus(value: String): Self = this.set("certStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextUpdate(value: String): Self = this.set("nextUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseStatus(value: Double): Self = this.set("responseStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThisUpdate(value: String): Self = this.set("thisUpdate", value.asInstanceOf[js.Any])
  }
}
