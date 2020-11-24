package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.BigIntegerParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.HexParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.IntegerParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.NameParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.ObjectIdentifierParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.tsp.MessageImprint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mi extends js.Object {
  
  var certreq: Boolean = js.native
  
  var mi: MessageImprint = js.native
  
  var nonce: IntegerParam | BigIntegerParam | HexParam | Double = js.native
  
  var policy: ObjectIdentifierParam | HexParam | NameParam = js.native
}
object Mi {
  
  @scala.inline
  def apply(
    certreq: Boolean,
    mi: MessageImprint,
    nonce: IntegerParam | BigIntegerParam | HexParam | Double,
    policy: ObjectIdentifierParam | HexParam | NameParam
  ): Mi = {
    val __obj = js.Dynamic.literal(certreq = certreq.asInstanceOf[js.Any], mi = mi.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mi]
  }
  
  @scala.inline
  implicit class MiOps[Self <: Mi] (val x: Self) extends AnyVal {
    
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
    def setCertreq(value: Boolean): Self = this.set("certreq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMi(value: MessageImprint): Self = this.set("mi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonce(value: IntegerParam | BigIntegerParam | HexParam | Double): Self = this.set("nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicy(value: ObjectIdentifierParam | HexParam | NameParam): Self = this.set("policy", value.asInstanceOf[js.Any])
  }
}
