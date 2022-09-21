package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FloatingActionButtonOptions extends StObject {
  
  var align: js.UndefOr[String] = js.undefined
  
  var alignOffset: js.UndefOr[FloatingActionButtonAlignOffset] = js.undefined
  
  var click: js.UndefOr[js.Function1[/* e */ FloatingActionButtonClickEvent, Unit]] = js.undefined
  
  var collapse: js.UndefOr[js.Function1[/* e */ FloatingActionButtonCollapseEvent, Unit]] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var expand: js.UndefOr[js.Function1[/* e */ FloatingActionButtonExpandEvent, Unit]] = js.undefined
  
  var fillMode: js.UndefOr[String] = js.undefined
  
  var icon: js.UndefOr[String] = js.undefined
  
  var items: js.UndefOr[js.Array[FloatingActionButtonItem]] = js.undefined
  
  var positionMode: js.UndefOr[String] = js.undefined
  
  var rounded: js.UndefOr[String] = js.undefined
  
  var shape: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[String] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var themeColor: js.UndefOr[String] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object FloatingActionButtonOptions {
  
  inline def apply(): FloatingActionButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloatingActionButtonOptions]
  }
  
  extension [Self <: FloatingActionButtonOptions](x: Self) {
    
    inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignOffset(value: FloatingActionButtonAlignOffset): Self = StObject.set(x, "alignOffset", value.asInstanceOf[js.Any])
    
    inline def setAlignOffsetUndefined: Self = StObject.set(x, "alignOffset", js.undefined)
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setClick(value: /* e */ FloatingActionButtonClickEvent => Unit): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
    
    inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    inline def setCollapse(value: /* e */ FloatingActionButtonCollapseEvent => Unit): Self = StObject.set(x, "collapse", js.Any.fromFunction1(value))
    
    inline def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setExpand(value: /* e */ FloatingActionButtonExpandEvent => Unit): Self = StObject.set(x, "expand", js.Any.fromFunction1(value))
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    inline def setFillMode(value: String): Self = StObject.set(x, "fillMode", value.asInstanceOf[js.Any])
    
    inline def setFillModeUndefined: Self = StObject.set(x, "fillMode", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setItems(value: js.Array[FloatingActionButtonItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: FloatingActionButtonItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setPositionMode(value: String): Self = StObject.set(x, "positionMode", value.asInstanceOf[js.Any])
    
    inline def setPositionModeUndefined: Self = StObject.set(x, "positionMode", js.undefined)
    
    inline def setRounded(value: String): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
    
    inline def setRoundedUndefined: Self = StObject.set(x, "rounded", js.undefined)
    
    inline def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setThemeColor(value: String): Self = StObject.set(x, "themeColor", value.asInstanceOf[js.Any])
    
    inline def setThemeColorUndefined: Self = StObject.set(x, "themeColor", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
