package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Widget //////////////////////////////////////////////////
@js.native
trait WidgetOptions extends StObject {
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var hide: js.UndefOr[js.Any] = js.native
  
  var show: js.UndefOr[js.Any] = js.native
}
object WidgetOptions {
  
  @scala.inline
  def apply(): WidgetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WidgetOptions]
  }
  
  @scala.inline
  implicit class WidgetOptionsMutableBuilder[Self <: WidgetOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setHide(value: js.Any): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    @scala.inline
    def setShow(value: js.Any): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
