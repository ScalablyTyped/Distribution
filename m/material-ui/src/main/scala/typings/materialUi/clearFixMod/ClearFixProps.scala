package typings.materialUi.clearFixMod

import typings.react.mod.CSSProperties
import typings.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearFixProps extends Props[ClearFix] {
  var style: js.UndefOr[CSSProperties] = js.native
}

object ClearFixProps {
  @scala.inline
  def apply(): ClearFixProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearFixProps]
  }
  @scala.inline
  implicit class ClearFixPropsOps[Self <: ClearFixProps] (val x: Self) extends AnyVal {
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
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

