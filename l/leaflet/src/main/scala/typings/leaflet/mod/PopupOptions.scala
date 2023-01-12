package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopupOptions
  extends StObject
     with DivOverlayOptions {
  
  var autoClose: js.UndefOr[Boolean] = js.undefined
  
  var autoPan: js.UndefOr[Boolean] = js.undefined
  
  var autoPanPadding: js.UndefOr[PointExpression] = js.undefined
  
  var autoPanPaddingBottomRight: js.UndefOr[PointExpression] = js.undefined
  
  var autoPanPaddingTopLeft: js.UndefOr[PointExpression] = js.undefined
  
  var closeButton: js.UndefOr[Boolean] = js.undefined
  
  var closeOnClick: js.UndefOr[Boolean] = js.undefined
  
  var closeOnEscapeKey: js.UndefOr[Boolean] = js.undefined
  
  var keepInView: js.UndefOr[Boolean] = js.undefined
  
  var maxHeight: js.UndefOr[Double] = js.undefined
  
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  var minWidth: js.UndefOr[Double] = js.undefined
}
object PopupOptions {
  
  inline def apply(): PopupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PopupOptions] (val x: Self) extends AnyVal {
    
    inline def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
    
    inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
    
    inline def setAutoPan(value: Boolean): Self = StObject.set(x, "autoPan", value.asInstanceOf[js.Any])
    
    inline def setAutoPanPadding(value: PointExpression): Self = StObject.set(x, "autoPanPadding", value.asInstanceOf[js.Any])
    
    inline def setAutoPanPaddingBottomRight(value: PointExpression): Self = StObject.set(x, "autoPanPaddingBottomRight", value.asInstanceOf[js.Any])
    
    inline def setAutoPanPaddingBottomRightUndefined: Self = StObject.set(x, "autoPanPaddingBottomRight", js.undefined)
    
    inline def setAutoPanPaddingTopLeft(value: PointExpression): Self = StObject.set(x, "autoPanPaddingTopLeft", value.asInstanceOf[js.Any])
    
    inline def setAutoPanPaddingTopLeftUndefined: Self = StObject.set(x, "autoPanPaddingTopLeft", js.undefined)
    
    inline def setAutoPanPaddingUndefined: Self = StObject.set(x, "autoPanPadding", js.undefined)
    
    inline def setAutoPanUndefined: Self = StObject.set(x, "autoPan", js.undefined)
    
    inline def setCloseButton(value: Boolean): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
    
    inline def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
    
    inline def setCloseOnClick(value: Boolean): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
    
    inline def setCloseOnClickUndefined: Self = StObject.set(x, "closeOnClick", js.undefined)
    
    inline def setCloseOnEscapeKey(value: Boolean): Self = StObject.set(x, "closeOnEscapeKey", value.asInstanceOf[js.Any])
    
    inline def setCloseOnEscapeKeyUndefined: Self = StObject.set(x, "closeOnEscapeKey", js.undefined)
    
    inline def setKeepInView(value: Boolean): Self = StObject.set(x, "keepInView", value.asInstanceOf[js.Any])
    
    inline def setKeepInViewUndefined: Self = StObject.set(x, "keepInView", js.undefined)
    
    inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
  }
}
