package typings.materialUi.slideInMod

import typings.materialUi.MaterialUI.propTypes.direction
import typings.react.mod.CSSProperties
import typings.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlideInProps extends Props[SlideIn] {
  var childStyle: js.UndefOr[CSSProperties] = js.native
  var direction: js.UndefOr[typings.materialUi.MaterialUI.propTypes.direction] = js.native
  var enterDelay: js.UndefOr[Double] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object SlideInProps {
  @scala.inline
  def apply(): SlideInProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlideInProps]
  }
  @scala.inline
  implicit class SlideInPropsOps[Self <: SlideInProps] (val x: Self) extends AnyVal {
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
    def setChildStyle(value: CSSProperties): Self = this.set("childStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildStyle: Self = this.set("childStyle", js.undefined)
    @scala.inline
    def setDirection(value: direction): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setEnterDelay(value: Double): Self = this.set("enterDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnterDelay: Self = this.set("enterDelay", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

