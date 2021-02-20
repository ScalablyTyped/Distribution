package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// SelectMenu //////////////////////////////////////////////////
@js.native
trait SelectMenuOptions extends SelectMenuEvents {
  
  var appendTo: js.UndefOr[String] = js.native
  
  var classes: js.UndefOr[SelectMenuClasses] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var icons: js.UndefOr[js.Any] = js.native
  
  var position: js.UndefOr[JQueryPositionOptions] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object SelectMenuOptions {
  
  @scala.inline
  def apply(): SelectMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectMenuOptions]
  }
  
  @scala.inline
  implicit class SelectMenuOptionsMutableBuilder[Self <: SelectMenuOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppendTo(value: String): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
    
    @scala.inline
    def setClasses(value: SelectMenuClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setIcons(value: js.Any): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    @scala.inline
    def setPosition(value: JQueryPositionOptions): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
