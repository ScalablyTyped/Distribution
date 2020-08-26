package typings.jsonwebtoken.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JwtHeader extends js.Object {
  var alg: String = js.native
  var jku: js.UndefOr[String] = js.native
  var kid: js.UndefOr[String] = js.native
  var typ: js.UndefOr[String] = js.native
  var x5t: js.UndefOr[String] = js.native
  var x5u: js.UndefOr[String] = js.native
}

object JwtHeader {
  @scala.inline
  def apply(alg: String): JwtHeader = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any])
    __obj.asInstanceOf[JwtHeader]
  }
  @scala.inline
  implicit class JwtHeaderOps[Self <: JwtHeader] (val x: Self) extends AnyVal {
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
    def setJku(value: String): Self = this.set("jku", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJku: Self = this.set("jku", js.undefined)
    @scala.inline
    def setKid(value: String): Self = this.set("kid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKid: Self = this.set("kid", js.undefined)
    @scala.inline
    def setTyp(value: String): Self = this.set("typ", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTyp: Self = this.set("typ", js.undefined)
    @scala.inline
    def setX5t(value: String): Self = this.set("x5t", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX5t: Self = this.set("x5t", js.undefined)
    @scala.inline
    def setX5u(value: String): Self = this.set("x5u", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX5u: Self = this.set("x5u", js.undefined)
  }
  
}

