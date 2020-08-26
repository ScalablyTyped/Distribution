package typings.luminoDatagrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vx extends js.Object {
  var vx: Double = js.native
  var vy: Double = js.native
}

object Vx {
  @scala.inline
  def apply(vx: Double, vy: Double): Vx = {
    val __obj = js.Dynamic.literal(vx = vx.asInstanceOf[js.Any], vy = vy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vx]
  }
  @scala.inline
  implicit class VxOps[Self <: Vx] (val x: Self) extends AnyVal {
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
    def setVx(value: Double): Self = this.set("vx", value.asInstanceOf[js.Any])
    @scala.inline
    def setVy(value: Double): Self = this.set("vy", value.asInstanceOf[js.Any])
  }
  
}

