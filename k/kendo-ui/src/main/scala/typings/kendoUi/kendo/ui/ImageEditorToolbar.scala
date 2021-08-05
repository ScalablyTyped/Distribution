package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageEditorToolbar extends StObject {
  
  var click: js.UndefOr[js.Function] = js.undefined
  
  var close: js.UndefOr[js.Function] = js.undefined
  
  var items: js.UndefOr[js.Array[ImageEditorToolbarItem]] = js.undefined
  
  var open: js.UndefOr[js.Function] = js.undefined
  
  var overflowClose: js.UndefOr[js.Function] = js.undefined
  
  var overflowOpen: js.UndefOr[js.Function] = js.undefined
  
  var toggle: js.UndefOr[js.Function] = js.undefined
}
object ImageEditorToolbar {
  
  inline def apply(): ImageEditorToolbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageEditorToolbar]
  }
  
  extension [Self <: ImageEditorToolbar](x: Self) {
    
    inline def setClick(value: js.Function): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    inline def setClose(value: js.Function): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setItems(value: js.Array[ImageEditorToolbarItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ImageEditorToolbarItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setOpen(value: js.Function): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setOverflowClose(value: js.Function): Self = StObject.set(x, "overflowClose", value.asInstanceOf[js.Any])
    
    inline def setOverflowCloseUndefined: Self = StObject.set(x, "overflowClose", js.undefined)
    
    inline def setOverflowOpen(value: js.Function): Self = StObject.set(x, "overflowOpen", value.asInstanceOf[js.Any])
    
    inline def setOverflowOpenUndefined: Self = StObject.set(x, "overflowOpen", js.undefined)
    
    inline def setToggle(value: js.Function): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
    
    inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
  }
}
