package typings.jsrsasign.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ECPointFp extends js.Object {
  var curve: ECFieldElementFp = js.native
  var x: ECFieldElementFp = js.native
  var y: ECFieldElementFp = js.native
  var z: BigInteger = js.native
  var zinv: BigInteger | Null = js.native
}

object ECPointFp {
  @scala.inline
  def apply(curve: ECFieldElementFp, x: ECFieldElementFp, y: ECFieldElementFp, z: BigInteger): ECPointFp = {
    val __obj = js.Dynamic.literal(curve = curve.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECPointFp]
  }
  @scala.inline
  implicit class ECPointFpOps[Self <: ECPointFp] (val x: Self) extends AnyVal {
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
    def setCurve(value: ECFieldElementFp): Self = this.set("curve", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: ECFieldElementFp): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: ECFieldElementFp): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setZ(value: BigInteger): Self = this.set("z", value.asInstanceOf[js.Any])
    @scala.inline
    def setZinv(value: BigInteger): Self = this.set("zinv", value.asInstanceOf[js.Any])
    @scala.inline
    def setZinvNull: Self = this.set("zinv", null)
  }
  
}

