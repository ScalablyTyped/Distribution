package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlgCert extends js.Object {
  var alg: String = js.native
  var cert: String = js.native
}

object AlgCert {
  @scala.inline
  def apply(alg: String, cert: String): AlgCert = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], cert = cert.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlgCert]
  }
  @scala.inline
  implicit class AlgCertOps[Self <: AlgCert] (val x: Self) extends AnyVal {
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
    def setAlg(value: String): Self = this.set("alg", value.asInstanceOf[js.Any])
    @scala.inline
    def setCert(value: String): Self = this.set("cert", value.asInstanceOf[js.Any])
  }
  
}

