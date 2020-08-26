package typings.jsrsasign.jsrsasign.KJUR.crypto

import typings.jsrsasign.jsrsasign.BigInteger
import typings.jsrsasign.jsrsasign.ECCurveFp
import typings.jsrsasign.jsrsasign.ECPointFp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ECParameter extends js.Object {
  var G: ECPointFp = js.native
  var curve: ECCurveFp = js.native
  var h: BigInteger = js.native
  var info: js.UndefOr[String] = js.native
  var keylen: Double = js.native
  var n: BigInteger = js.native
  var name: String = js.native
  var oid: js.UndefOr[String] = js.native
}

object ECParameter {
  @scala.inline
  def apply(G: ECPointFp, curve: ECCurveFp, h: BigInteger, keylen: Double, n: BigInteger, name: String): ECParameter = {
    val __obj = js.Dynamic.literal(G = G.asInstanceOf[js.Any], curve = curve.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], keylen = keylen.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECParameter]
  }
  @scala.inline
  implicit class ECParameterOps[Self <: ECParameter] (val x: Self) extends AnyVal {
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
    def setG(value: ECPointFp): Self = this.set("G", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurve(value: ECCurveFp): Self = this.set("curve", value.asInstanceOf[js.Any])
    @scala.inline
    def setH(value: BigInteger): Self = this.set("h", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeylen(value: Double): Self = this.set("keylen", value.asInstanceOf[js.Any])
    @scala.inline
    def setN(value: BigInteger): Self = this.set("n", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfo(value: String): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    @scala.inline
    def setOid(value: String): Self = this.set("oid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOid: Self = this.set("oid", js.undefined)
  }
  
}

