package typings.jquerymobile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogOptions extends StObject {
  
  var closeBtn: js.UndefOr[String] = js.native
  
  var closeBtnText: js.UndefOr[String] = js.native
  
  var corners: js.UndefOr[Boolean] = js.native
  
  var initSelector: js.UndefOr[String] = js.native
  
  var overlayTheme: js.UndefOr[String] = js.native
}
object DialogOptions {
  
  @scala.inline
  def apply(): DialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogOptions]
  }
  
  @scala.inline
  implicit class DialogOptionsMutableBuilder[Self <: DialogOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloseBtn(value: String): Self = StObject.set(x, "closeBtn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseBtnText(value: String): Self = StObject.set(x, "closeBtnText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseBtnTextUndefined: Self = StObject.set(x, "closeBtnText", js.undefined)
    
    @scala.inline
    def setCloseBtnUndefined: Self = StObject.set(x, "closeBtn", js.undefined)
    
    @scala.inline
    def setCorners(value: Boolean): Self = StObject.set(x, "corners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornersUndefined: Self = StObject.set(x, "corners", js.undefined)
    
    @scala.inline
    def setInitSelector(value: String): Self = StObject.set(x, "initSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitSelectorUndefined: Self = StObject.set(x, "initSelector", js.undefined)
    
    @scala.inline
    def setOverlayTheme(value: String): Self = StObject.set(x, "overlayTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayThemeUndefined: Self = StObject.set(x, "overlayTheme", js.undefined)
  }
}
