package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.GeneralNameParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Certsubj extends GeneralNameParam {
  var certsubj: String = js.native
}

object Certsubj {
  @scala.inline
  def apply(certsubj: String): Certsubj = {
    val __obj = js.Dynamic.literal(certsubj = certsubj.asInstanceOf[js.Any])
    __obj.asInstanceOf[Certsubj]
  }
  @scala.inline
  implicit class CertsubjOps[Self <: Certsubj] (val x: Self) extends AnyVal {
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
    def setCertsubj(value: String): Self = this.set("certsubj", value.asInstanceOf[js.Any])
  }
  
}

