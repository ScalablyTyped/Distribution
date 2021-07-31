package typings.jquerymobile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopupOptions extends StObject {
  
  var corners: js.UndefOr[Boolean] = js.undefined
  
  var history: js.UndefOr[Boolean] = js.undefined
  
  var initSelector: js.UndefOr[String] = js.undefined
  
  var overlayTheme: js.UndefOr[String] = js.undefined
  
  var positionTo: js.UndefOr[String] = js.undefined
  
  var shadow: js.UndefOr[Boolean] = js.undefined
  
  var theme: js.UndefOr[String] = js.undefined
  
  var tolerance: js.UndefOr[String] = js.undefined
  
  var transition: js.UndefOr[String] = js.undefined
}
object PopupOptions {
  
  @scala.inline
  def apply(): PopupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupOptions]
  }
  
  @scala.inline
  implicit class PopupOptionsMutableBuilder[Self <: PopupOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCorners(value: Boolean): Self = StObject.set(x, "corners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornersUndefined: Self = StObject.set(x, "corners", js.undefined)
    
    @scala.inline
    def setHistory(value: Boolean): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    @scala.inline
    def setInitSelector(value: String): Self = StObject.set(x, "initSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitSelectorUndefined: Self = StObject.set(x, "initSelector", js.undefined)
    
    @scala.inline
    def setOverlayTheme(value: String): Self = StObject.set(x, "overlayTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayThemeUndefined: Self = StObject.set(x, "overlayTheme", js.undefined)
    
    @scala.inline
    def setPositionTo(value: String): Self = StObject.set(x, "positionTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionToUndefined: Self = StObject.set(x, "positionTo", js.undefined)
    
    @scala.inline
    def setShadow(value: Boolean): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setTolerance(value: String): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
    
    @scala.inline
    def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
  }
}
