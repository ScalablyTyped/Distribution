package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopupOptions extends StObject {
  
  var anchor: js.UndefOr[PositionAnchor] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var closeButton: js.UndefOr[Boolean] = js.undefined
  
  var closeOnClick: js.UndefOr[Boolean] = js.undefined
  
  var closeOnMove: js.UndefOr[Boolean] = js.undefined
  
  var focusAfterOpen: js.UndefOr[Boolean] = js.undefined
  
  var maxWidth: js.UndefOr[String] = js.undefined
  
  var offset: js.UndefOr[Offset] = js.undefined
}
object PopupOptions {
  
  inline def apply(): PopupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupOptions]
  }
  
  extension [Self <: PopupOptions](x: Self) {
    
    inline def setAnchor(value: PositionAnchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCloseButton(value: Boolean): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
    
    inline def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
    
    inline def setCloseOnClick(value: Boolean): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
    
    inline def setCloseOnClickUndefined: Self = StObject.set(x, "closeOnClick", js.undefined)
    
    inline def setCloseOnMove(value: Boolean): Self = StObject.set(x, "closeOnMove", value.asInstanceOf[js.Any])
    
    inline def setCloseOnMoveUndefined: Self = StObject.set(x, "closeOnMove", js.undefined)
    
    inline def setFocusAfterOpen(value: Boolean): Self = StObject.set(x, "focusAfterOpen", value.asInstanceOf[js.Any])
    
    inline def setFocusAfterOpenUndefined: Self = StObject.set(x, "focusAfterOpen", js.undefined)
    
    inline def setMaxWidth(value: String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setOffset(value: Offset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
