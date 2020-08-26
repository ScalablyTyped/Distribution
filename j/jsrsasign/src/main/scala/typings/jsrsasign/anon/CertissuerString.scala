package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.GeneralNameParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertissuerString extends GeneralNameParam {
  var certissuer: String = js.native
}

object CertissuerString {
  @scala.inline
  def apply(certissuer: String): CertissuerString = {
    val __obj = js.Dynamic.literal(certissuer = certissuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertissuerString]
  }
  @scala.inline
  implicit class CertissuerStringOps[Self <: CertissuerString] (val x: Self) extends AnyVal {
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
    def setCertissuer(value: String): Self = this.set("certissuer", value.asInstanceOf[js.Any])
  }
  
}

