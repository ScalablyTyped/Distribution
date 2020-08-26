package typings.jws.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateProperties extends PrivateProperties {
  var kid: js.UndefOr[String] = js.native
  var x5c: js.UndefOr[js.Array[String]] = js.native
  var x5t: js.UndefOr[String] = js.native
  @JSName("x5t#S256")
  var x5tNumbersignS256: js.UndefOr[String] = js.native
  var x5u: js.UndefOr[String] = js.native
}

object CertificateProperties {
  @scala.inline
  def apply(): CertificateProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateProperties]
  }
  @scala.inline
  implicit class CertificatePropertiesOps[Self <: CertificateProperties] (val x: Self) extends AnyVal {
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
    def setKid(value: String): Self = this.set("kid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKid: Self = this.set("kid", js.undefined)
    @scala.inline
    def setX5cVarargs(value: String*): Self = this.set("x5c", js.Array(value :_*))
    @scala.inline
    def setX5c(value: js.Array[String]): Self = this.set("x5c", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX5c: Self = this.set("x5c", js.undefined)
    @scala.inline
    def setX5t(value: String): Self = this.set("x5t", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX5t: Self = this.set("x5t", js.undefined)
    @scala.inline
    def setX5tNumbersignS256(value: String): Self = this.set("x5t#S256", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX5tNumbersignS256: Self = this.set("x5t#S256", js.undefined)
    @scala.inline
    def setX5u(value: String): Self = this.set("x5u", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX5u: Self = this.set("x5u", js.undefined)
  }
  
}

