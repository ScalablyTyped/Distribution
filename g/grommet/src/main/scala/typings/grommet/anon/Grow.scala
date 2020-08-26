package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Grow extends js.Object {
  var grow: js.UndefOr[Double] = js.native
  var shrink: js.UndefOr[Double] = js.native
}

object Grow {
  @scala.inline
  def apply(): Grow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Grow]
  }
  @scala.inline
  implicit class GrowOps[Self <: Grow] (val x: Self) extends AnyVal {
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
    def setGrow(value: Double): Self = this.set("grow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrow: Self = this.set("grow", js.undefined)
    @scala.inline
    def setShrink(value: Double): Self = this.set("shrink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShrink: Self = this.set("shrink", js.undefined)
  }
  
}

