package typings.materialUi.clickAwayListenerMod

import typings.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClickAwayListenerProps extends Props[ClickAwayListener] {
  var onClickAway: js.UndefOr[js.Any] = js.native
}

object ClickAwayListenerProps {
  @scala.inline
  def apply(): ClickAwayListenerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClickAwayListenerProps]
  }
  @scala.inline
  implicit class ClickAwayListenerPropsOps[Self <: ClickAwayListenerProps] (val x: Self) extends AnyVal {
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
    def setOnClickAway(value: js.Any): Self = this.set("onClickAway", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnClickAway: Self = this.set("onClickAway", js.undefined)
  }
  
}

