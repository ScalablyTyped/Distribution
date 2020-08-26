package typings.jsrsasign.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ECCPrivateKey extends js.Object {
  var curve: String = js.native
  var d: String = js.native
}

object ECCPrivateKey {
  @scala.inline
  def apply(curve: String, d: String): ECCPrivateKey = {
    val __obj = js.Dynamic.literal(curve = curve.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECCPrivateKey]
  }
  @scala.inline
  implicit class ECCPrivateKeyOps[Self <: ECCPrivateKey] (val x: Self) extends AnyVal {
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
    def setCurve(value: String): Self = this.set("curve", value.asInstanceOf[js.Any])
    @scala.inline
    def setD(value: String): Self = this.set("d", value.asInstanceOf[js.Any])
  }
  
}

