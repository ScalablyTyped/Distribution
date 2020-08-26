package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Tooltip/Tooltip.TooltipClassKey>> */
@js.native
trait PartialClassNameMapToolti extends js.Object {
  var popper: js.UndefOr[String] = js.native
  var popperInteractive: js.UndefOr[String] = js.native
  var tooltip: js.UndefOr[String] = js.native
  var tooltipPlacementBottom: js.UndefOr[String] = js.native
  var tooltipPlacementLeft: js.UndefOr[String] = js.native
  var tooltipPlacementRight: js.UndefOr[String] = js.native
  var tooltipPlacementTop: js.UndefOr[String] = js.native
  var touch: js.UndefOr[String] = js.native
}

object PartialClassNameMapToolti {
  @scala.inline
  def apply(): PartialClassNameMapToolti = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapToolti]
  }
  @scala.inline
  implicit class PartialClassNameMapTooltiOps[Self <: PartialClassNameMapToolti] (val x: Self) extends AnyVal {
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
    def setPopper(value: String): Self = this.set("popper", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopper: Self = this.set("popper", js.undefined)
    @scala.inline
    def setPopperInteractive(value: String): Self = this.set("popperInteractive", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopperInteractive: Self = this.set("popperInteractive", js.undefined)
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setTooltipPlacementBottom(value: String): Self = this.set("tooltipPlacementBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipPlacementBottom: Self = this.set("tooltipPlacementBottom", js.undefined)
    @scala.inline
    def setTooltipPlacementLeft(value: String): Self = this.set("tooltipPlacementLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipPlacementLeft: Self = this.set("tooltipPlacementLeft", js.undefined)
    @scala.inline
    def setTooltipPlacementRight(value: String): Self = this.set("tooltipPlacementRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipPlacementRight: Self = this.set("tooltipPlacementRight", js.undefined)
    @scala.inline
    def setTooltipPlacementTop(value: String): Self = this.set("tooltipPlacementTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipPlacementTop: Self = this.set("tooltipPlacementTop", js.undefined)
    @scala.inline
    def setTouch(value: String): Self = this.set("touch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouch: Self = this.set("touch", js.undefined)
  }
  
}

