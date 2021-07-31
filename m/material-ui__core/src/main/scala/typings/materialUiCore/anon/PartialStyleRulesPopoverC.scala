package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Popover.PopoverClassKey>> */
trait PartialStyleRulesPopoverC extends StObject {
  
  var paper: js.UndefOr[CSSProperties] = js.undefined
}
object PartialStyleRulesPopoverC {
  
  @scala.inline
  def apply(): PartialStyleRulesPopoverC = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesPopoverC]
  }
  
  @scala.inline
  implicit class PartialStyleRulesPopoverCMutableBuilder[Self <: PartialStyleRulesPopoverC] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPaper(value: CSSProperties): Self = StObject.set(x, "paper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaperUndefined: Self = StObject.set(x, "paper", js.undefined)
  }
}
