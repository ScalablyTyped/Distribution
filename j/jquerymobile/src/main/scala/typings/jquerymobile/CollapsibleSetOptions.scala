package typings.jquerymobile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollapsibleSetOptions extends StObject {
  
  var collapsedIcon: js.UndefOr[String] = js.native
  
  var expandedIcon: js.UndefOr[String] = js.native
  
  var iconpos: js.UndefOr[String] = js.native
  
  var initSelector: js.UndefOr[String] = js.native
  
  var inset: js.UndefOr[Boolean] = js.native
  
  var mini: js.UndefOr[Boolean] = js.native
  
  var theme: js.UndefOr[String] = js.native
}
object CollapsibleSetOptions {
  
  @scala.inline
  def apply(): CollapsibleSetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapsibleSetOptions]
  }
  
  @scala.inline
  implicit class CollapsibleSetOptionsMutableBuilder[Self <: CollapsibleSetOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollapsedIcon(value: String): Self = StObject.set(x, "collapsedIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapsedIconUndefined: Self = StObject.set(x, "collapsedIcon", js.undefined)
    
    @scala.inline
    def setExpandedIcon(value: String): Self = StObject.set(x, "expandedIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedIconUndefined: Self = StObject.set(x, "expandedIcon", js.undefined)
    
    @scala.inline
    def setIconpos(value: String): Self = StObject.set(x, "iconpos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconposUndefined: Self = StObject.set(x, "iconpos", js.undefined)
    
    @scala.inline
    def setInitSelector(value: String): Self = StObject.set(x, "initSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitSelectorUndefined: Self = StObject.set(x, "initSelector", js.undefined)
    
    @scala.inline
    def setInset(value: Boolean): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsetUndefined: Self = StObject.set(x, "inset", js.undefined)
    
    @scala.inline
    def setMini(value: Boolean): Self = StObject.set(x, "mini", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiniUndefined: Self = StObject.set(x, "mini", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
