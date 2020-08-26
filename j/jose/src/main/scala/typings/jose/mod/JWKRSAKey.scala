package typings.jose.mod

import typings.jose.joseStrings.RSA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JWKRSAKey
  extends KeyParameters
     with JSONWebKey
     with _ProduceKeyInput {
  var d: js.UndefOr[String] = js.native
  var dp: js.UndefOr[String] = js.native
  var dq: js.UndefOr[String] = js.native
  var e: String = js.native
  var kty: RSA = js.native
  var n: String = js.native
  var p: js.UndefOr[String] = js.native
  var q: js.UndefOr[String] = js.native
  var qi: js.UndefOr[String] = js.native
}

object JWKRSAKey {
  @scala.inline
  def apply(e: String, kty: RSA, n: String): JWKRSAKey = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWKRSAKey]
  }
  @scala.inline
  implicit class JWKRSAKeyOps[Self <: JWKRSAKey] (val x: Self) extends AnyVal {
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
    def setE(value: String): Self = this.set("e", value.asInstanceOf[js.Any])
    @scala.inline
    def setKty(value: RSA): Self = this.set("kty", value.asInstanceOf[js.Any])
    @scala.inline
    def setN(value: String): Self = this.set("n", value.asInstanceOf[js.Any])
    @scala.inline
    def setD(value: String): Self = this.set("d", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteD: Self = this.set("d", js.undefined)
    @scala.inline
    def setDp(value: String): Self = this.set("dp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDp: Self = this.set("dp", js.undefined)
    @scala.inline
    def setDq(value: String): Self = this.set("dq", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDq: Self = this.set("dq", js.undefined)
    @scala.inline
    def setP(value: String): Self = this.set("p", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteP: Self = this.set("p", js.undefined)
    @scala.inline
    def setQ(value: String): Self = this.set("q", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQ: Self = this.set("q", js.undefined)
    @scala.inline
    def setQi(value: String): Self = this.set("qi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQi: Self = this.set("qi", js.undefined)
  }
  
}

