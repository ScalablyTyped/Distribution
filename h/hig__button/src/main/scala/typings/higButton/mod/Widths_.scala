package typings.higButton.mod

import typings.higButton.higButtonStrings.grow
import typings.higButton.higButtonStrings.shrink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Widths_ extends js.Object {
  var GROW: grow = js.native
  var SHRINK: shrink = js.native
}

object Widths_ {
  @scala.inline
  def apply(GROW: grow, SHRINK: shrink): Widths_ = {
    val __obj = js.Dynamic.literal(GROW = GROW.asInstanceOf[js.Any], SHRINK = SHRINK.asInstanceOf[js.Any])
    __obj.asInstanceOf[Widths_]
  }
  @scala.inline
  implicit class Widths_Ops[Self <: Widths_] (val x: Self) extends AnyVal {
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
    def setGROW(value: grow): Self = this.set("GROW", value.asInstanceOf[js.Any])
    @scala.inline
    def setSHRINK(value: shrink): Self = this.set("SHRINK", value.asInstanceOf[js.Any])
  }
  
}

