package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HideTooltipEventUIParam extends js.Object {
  /**
    * Used to obtain reference to jquery object which represents tooltip or value of ui.element from last updateTooltip event. Value of that member can be replaced by custom element.
    */
  var element: js.UndefOr[js.Any] = js.native
  /**
    * Used to obtain reference to item.
    */
  var item: js.UndefOr[js.Any] = js.native
  /**
    * Used to obtain reference to chart widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
}

object HideTooltipEventUIParam {
  @scala.inline
  def apply(): HideTooltipEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HideTooltipEventUIParam]
  }
  @scala.inline
  implicit class HideTooltipEventUIParamOps[Self <: HideTooltipEventUIParam] (val x: Self) extends AnyVal {
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
    def setElement(value: js.Any): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setItem(value: js.Any): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
  
}

