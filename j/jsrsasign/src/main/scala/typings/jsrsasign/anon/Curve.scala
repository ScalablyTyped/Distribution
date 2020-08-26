package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Curve extends js.Object {
  var curve: String = js.native
  var pub: js.UndefOr[String] = js.native
}

object Curve {
  @scala.inline
  def apply(curve: String): Curve = {
    val __obj = js.Dynamic.literal(curve = curve.asInstanceOf[js.Any])
    __obj.asInstanceOf[Curve]
  }
  @scala.inline
  implicit class CurveOps[Self <: Curve] (val x: Self) extends AnyVal {
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
    def setPub(value: String): Self = this.set("pub", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePub: Self = this.set("pub", js.undefined)
  }
  
}

