package typings.jose.mod

import typings.jose.joseStrings.EC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JWKECKey
  extends KeyParameters
     with JSONWebKey
     with _ProduceKeyInput {
  var crv: ECCurve = js.native
  var d: js.UndefOr[String] = js.native
  var kty: EC = js.native
  var x: String = js.native
  var y: String = js.native
}

object JWKECKey {
  @scala.inline
  def apply(crv: ECCurve, kty: EC, x: String, y: String): JWKECKey = {
    val __obj = js.Dynamic.literal(crv = crv.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWKECKey]
  }
  @scala.inline
  implicit class JWKECKeyOps[Self <: JWKECKey] (val x: Self) extends AnyVal {
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
    def setCrv(value: ECCurve): Self = this.set("crv", value.asInstanceOf[js.Any])
    @scala.inline
    def setKty(value: EC): Self = this.set("kty", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: String): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: String): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setD(value: String): Self = this.set("d", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteD: Self = this.set("d", js.undefined)
  }
  
}

