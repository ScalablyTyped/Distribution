package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.tsp.MessageImprint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Certreq extends js.Object {
  
  var certreq: js.UndefOr[Boolean] = js.native
  
  var mi: MessageImprint = js.native
  
  var nonce: js.UndefOr[String] = js.native
  
  var policy: js.UndefOr[String] = js.native
}
object Certreq {
  
  @scala.inline
  def apply(mi: MessageImprint): Certreq = {
    val __obj = js.Dynamic.literal(mi = mi.asInstanceOf[js.Any])
    __obj.asInstanceOf[Certreq]
  }
  
  @scala.inline
  implicit class CertreqOps[Self <: Certreq] (val x: Self) extends AnyVal {
    
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
    def setMi(value: MessageImprint): Self = this.set("mi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertreq(value: Boolean): Self = this.set("certreq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertreq: Self = this.set("certreq", js.undefined)
    
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
    
    @scala.inline
    def setPolicy(value: String): Self = this.set("policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
  }
}
