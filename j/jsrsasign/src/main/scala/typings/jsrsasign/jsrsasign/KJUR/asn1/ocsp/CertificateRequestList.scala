package typings.jsrsasign.jsrsasign.KJUR.asn1.ocsp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificateRequestList extends js.Object {
  
  var reqList: js.Array[CertificateRequest] = js.native
}
object CertificateRequestList {
  
  @scala.inline
  def apply(reqList: js.Array[CertificateRequest]): CertificateRequestList = {
    val __obj = js.Dynamic.literal(reqList = reqList.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateRequestList]
  }
  
  @scala.inline
  implicit class CertificateRequestListOps[Self <: CertificateRequestList] (val x: Self) extends AnyVal {
    
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
    def setReqListVarargs(value: CertificateRequest*): Self = this.set("reqList", js.Array(value :_*))
    
    @scala.inline
    def setReqList(value: js.Array[CertificateRequest]): Self = this.set("reqList", value.asInstanceOf[js.Any])
  }
}
