package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Popover.PopoverClassKey>> */
@js.native
trait PartialStyleRulesPopoverC extends js.Object {
  
  var paper: js.UndefOr[CSSProperties] = js.native
}
object PartialStyleRulesPopoverC {
  
  @scala.inline
  def apply(): PartialStyleRulesPopoverC = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesPopoverC]
  }
  
  @scala.inline
  implicit class PartialStyleRulesPopoverCOps[Self <: PartialStyleRulesPopoverC] (val x: Self) extends AnyVal {
    
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
    def setPaper(value: CSSProperties): Self = this.set("paper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaper: Self = this.set("paper", js.undefined)
  }
}
