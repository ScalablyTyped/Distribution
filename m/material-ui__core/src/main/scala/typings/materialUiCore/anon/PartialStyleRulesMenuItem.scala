package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/MenuItem.MenuItemClassKey>> */
@js.native
trait PartialStyleRulesMenuItem extends StObject {
  
  var gutters: js.UndefOr[CSSProperties] = js.native
  
  var root: js.UndefOr[CSSProperties] = js.native
  
  var selected: js.UndefOr[CSSProperties] = js.native
}
object PartialStyleRulesMenuItem {
  
  @scala.inline
  def apply(): PartialStyleRulesMenuItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesMenuItem]
  }
  
  @scala.inline
  implicit class PartialStyleRulesMenuItemMutableBuilder[Self <: PartialStyleRulesMenuItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGutters(value: CSSProperties): Self = StObject.set(x, "gutters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuttersUndefined: Self = StObject.set(x, "gutters", js.undefined)
    
    @scala.inline
    def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setSelected(value: CSSProperties): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
  }
}
