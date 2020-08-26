package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/transitions.Easing> */
@js.native
trait PartialEasing extends js.Object {
  var easeIn: js.UndefOr[String] = js.native
  var easeInOut: js.UndefOr[String] = js.native
  var easeOut: js.UndefOr[String] = js.native
  var sharp: js.UndefOr[String] = js.native
}

object PartialEasing {
  @scala.inline
  def apply(): PartialEasing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialEasing]
  }
  @scala.inline
  implicit class PartialEasingOps[Self <: PartialEasing] (val x: Self) extends AnyVal {
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
    def setEaseIn(value: String): Self = this.set("easeIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEaseIn: Self = this.set("easeIn", js.undefined)
    @scala.inline
    def setEaseInOut(value: String): Self = this.set("easeInOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEaseInOut: Self = this.set("easeInOut", js.undefined)
    @scala.inline
    def setEaseOut(value: String): Self = this.set("easeOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEaseOut: Self = this.set("easeOut", js.undefined)
    @scala.inline
    def setSharp(value: String): Self = this.set("sharp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharp: Self = this.set("sharp", js.undefined)
  }
  
}

