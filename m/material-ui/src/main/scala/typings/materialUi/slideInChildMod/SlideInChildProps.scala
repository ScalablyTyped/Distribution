package typings.materialUi.slideInChildMod

import typings.react.mod.CSSProperties
import typings.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlideInChildProps extends Props[SlideInChild] {
  var direction: js.UndefOr[String] = js.native
  var enterDelay: js.UndefOr[Double] = js.native
  var getLeaveDirection: js.Function = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object SlideInChildProps {
  @scala.inline
  def apply(getLeaveDirection: js.Function): SlideInChildProps = {
    val __obj = js.Dynamic.literal(getLeaveDirection = getLeaveDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideInChildProps]
  }
  @scala.inline
  implicit class SlideInChildPropsOps[Self <: SlideInChildProps] (val x: Self) extends AnyVal {
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
    def setGetLeaveDirection(value: js.Function): Self = this.set("getLeaveDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
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

