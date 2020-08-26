package typings.jose.mod

import typings.jose.joseStrings.OKP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JWKOKPKey
  extends KeyParameters
     with JSONWebKey
     with _ProduceKeyInput {
  var crv: OKPCurve = js.native
  var d: js.UndefOr[String] = js.native
  var kty: OKP = js.native
  var x: String = js.native
}

object JWKOKPKey {
  @scala.inline
  def apply(crv: OKPCurve, kty: OKP, x: String): JWKOKPKey = {
    val __obj = js.Dynamic.literal(crv = crv.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWKOKPKey]
  }
  @scala.inline
  implicit class JWKOKPKeyOps[Self <: JWKOKPKey] (val x: Self) extends AnyVal {
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
    def setCrv(value: OKPCurve): Self = this.set("crv", value.asInstanceOf[js.Any])
    @scala.inline
    def setKty(value: OKP): Self = this.set("kty", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: String): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setD(value: String): Self = this.set("d", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteD: Self = this.set("d", js.undefined)
  }
  
}

