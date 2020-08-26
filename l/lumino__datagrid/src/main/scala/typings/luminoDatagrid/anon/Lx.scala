package typings.luminoDatagrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lx extends js.Object {
  var lx: Double = js.native
  var ly: Double = js.native
}

object Lx {
  @scala.inline
  def apply(lx: Double, ly: Double): Lx = {
    val __obj = js.Dynamic.literal(lx = lx.asInstanceOf[js.Any], ly = ly.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lx]
  }
  @scala.inline
  implicit class LxOps[Self <: Lx] (val x: Self) extends AnyVal {
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
    def setLx(value: Double): Self = this.set("lx", value.asInstanceOf[js.Any])
    @scala.inline
    def setLy(value: Double): Self = this.set("ly", value.asInstanceOf[js.Any])
  }
  
}

