package typings.jws.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Header extends CertificateProperties {
  var alg: Algorithm = js.native
  var crit: js.UndefOr[js.Array[String]] = js.native
  var cty: js.UndefOr[String] = js.native
  var jwk: js.UndefOr[JWK] = js.native
  var typ: js.UndefOr[String] = js.native
}

object Header {
  @scala.inline
  def apply(alg: Algorithm): Header = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
  @scala.inline
  implicit class HeaderOps[Self <: Header] (val x: Self) extends AnyVal {
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
    def setAlg(value: Algorithm): Self = this.set("alg", value.asInstanceOf[js.Any])
    @scala.inline
    def setCritVarargs(value: String*): Self = this.set("crit", js.Array(value :_*))
    @scala.inline
    def setCrit(value: js.Array[String]): Self = this.set("crit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrit: Self = this.set("crit", js.undefined)
    @scala.inline
    def setCty(value: String): Self = this.set("cty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCty: Self = this.set("cty", js.undefined)
    @scala.inline
    def setJwk(value: JWK): Self = this.set("jwk", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJwk: Self = this.set("jwk", js.undefined)
    @scala.inline
    def setTyp(value: String): Self = this.set("typ", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTyp: Self = this.set("typ", js.undefined)
  }
  
}

