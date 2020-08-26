package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Tooltip.TooltipClassKey>> */
@js.native
trait PartialStyleRulesTooltipC extends js.Object {
  var popper: js.UndefOr[CSSProperties] = js.native
  var popperInteractive: js.UndefOr[CSSProperties] = js.native
  var tooltip: js.UndefOr[CSSProperties] = js.native
  var tooltipPlacementBottom: js.UndefOr[CSSProperties] = js.native
  var tooltipPlacementLeft: js.UndefOr[CSSProperties] = js.native
  var tooltipPlacementRight: js.UndefOr[CSSProperties] = js.native
  var tooltipPlacementTop: js.UndefOr[CSSProperties] = js.native
  var touch: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesTooltipC {
  @scala.inline
  def apply(): PartialStyleRulesTooltipC = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesTooltipC]
  }
  @scala.inline
  implicit class PartialStyleRulesTooltipCOps[Self <: PartialStyleRulesTooltipC] (val x: Self) extends AnyVal {
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
    def setPopper(value: CSSProperties): Self = this.set("popper", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopper: Self = this.set("popper", js.undefined)
    @scala.inline
    def setPopperInteractive(value: CSSProperties): Self = this.set("popperInteractive", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopperInteractive: Self = this.set("popperInteractive", js.undefined)
    @scala.inline
    def setTooltip(value: CSSProperties): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setTooltipPlacementBottom(value: CSSProperties): Self = this.set("tooltipPlacementBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipPlacementBottom: Self = this.set("tooltipPlacementBottom", js.undefined)
    @scala.inline
    def setTooltipPlacementLeft(value: CSSProperties): Self = this.set("tooltipPlacementLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipPlacementLeft: Self = this.set("tooltipPlacementLeft", js.undefined)
    @scala.inline
    def setTooltipPlacementRight(value: CSSProperties): Self = this.set("tooltipPlacementRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipPlacementRight: Self = this.set("tooltipPlacementRight", js.undefined)
    @scala.inline
    def setTooltipPlacementTop(value: CSSProperties): Self = this.set("tooltipPlacementTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipPlacementTop: Self = this.set("tooltipPlacementTop", js.undefined)
    @scala.inline
    def setTouch(value: CSSProperties): Self = this.set("touch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouch: Self = this.set("touch", js.undefined)
  }
  
}

