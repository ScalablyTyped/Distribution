package typings.materialUi.touchRippleMod

import typings.react.mod.CSSProperties
import typings.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchRippleProps extends Props[TouchRipple] {
  var abortOnScroll: js.UndefOr[Boolean] = js.native
  var centerRipple: js.UndefOr[Boolean] = js.native
  var color: js.UndefOr[String] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object TouchRippleProps {
  @scala.inline
  def apply(): TouchRippleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchRippleProps]
  }
  @scala.inline
  implicit class TouchRipplePropsOps[Self <: TouchRippleProps] (val x: Self) extends AnyVal {
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
    def setAbortOnScroll(value: Boolean): Self = this.set("abortOnScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbortOnScroll: Self = this.set("abortOnScroll", js.undefined)
    @scala.inline
    def setCenterRipple(value: Boolean): Self = this.set("centerRipple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenterRipple: Self = this.set("centerRipple", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

