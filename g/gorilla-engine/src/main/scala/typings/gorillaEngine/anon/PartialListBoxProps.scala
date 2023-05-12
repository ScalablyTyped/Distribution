package typings.gorillaEngine.anon

import typings.gorillaEngine.gorillaEngineStrings.IBeam
import typings.gorillaEngine.gorillaEngineStrings.`bottom center`
import typings.gorillaEngine.gorillaEngineStrings.`bottom edge resize`
import typings.gorillaEngine.gorillaEngineStrings.`bottom left corner resize`
import typings.gorillaEngine.gorillaEngineStrings.`bottom left`
import typings.gorillaEngine.gorillaEngineStrings.`bottom right corner resize`
import typings.gorillaEngine.gorillaEngineStrings.`bottom right`
import typings.gorillaEngine.gorillaEngineStrings.`centered left`
import typings.gorillaEngine.gorillaEngineStrings.`centered right`
import typings.gorillaEngine.gorillaEngineStrings.`cross hair`
import typings.gorillaEngine.gorillaEngineStrings.`dragging hand`
import typings.gorillaEngine.gorillaEngineStrings.`left edge resize`
import typings.gorillaEngine.gorillaEngineStrings.`left right resize`
import typings.gorillaEngine.gorillaEngineStrings.`pointing hand`
import typings.gorillaEngine.gorillaEngineStrings.`right edge resize`
import typings.gorillaEngine.gorillaEngineStrings.`top center`
import typings.gorillaEngine.gorillaEngineStrings.`top edge resize`
import typings.gorillaEngine.gorillaEngineStrings.`top left corner resize`
import typings.gorillaEngine.gorillaEngineStrings.`top left`
import typings.gorillaEngine.gorillaEngineStrings.`top right corner resize`
import typings.gorillaEngine.gorillaEngineStrings.`top right`
import typings.gorillaEngine.gorillaEngineStrings.`up down left right resize`
import typings.gorillaEngine.gorillaEngineStrings.`up down resize`
import typings.gorillaEngine.gorillaEngineStrings.center
import typings.gorillaEngine.gorillaEngineStrings.copying
import typings.gorillaEngine.gorillaEngineStrings.left
import typings.gorillaEngine.gorillaEngineStrings.none
import typings.gorillaEngine.gorillaEngineStrings.normal
import typings.gorillaEngine.gorillaEngineStrings.right
import typings.gorillaEngine.gorillaEngineStrings.wait
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<gorilla-engine.GorillaEngine.UI.ListBoxProps> */
trait PartialListBoxProps extends StObject {
  
  var allowClicksOnChildren: js.UndefOr[Boolean] = js.undefined
  
  var alpha: js.UndefOr[Double] = js.undefined
  
  var alwaysOnTop: js.UndefOr[Boolean] = js.undefined
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var backgroundImage: js.UndefOr[String] = js.undefined
  
  var border: js.UndefOr[FocusColor] = js.undefined
  
  var cellColor: js.UndefOr[String] = js.undefined
  
  var cellColorSelected: js.UndefOr[String] = js.undefined
  
  var clickGrabsKeyboardFocus: js.UndefOr[Boolean] = js.undefined
  
  var clickMask: js.UndefOr[String] = js.undefined
  
  var cornerRadius: js.UndefOr[Double] = js.undefined
  
  var doubleClickAction: js.UndefOr[String] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var font: js.UndefOr[String] = js.undefined
  
  var fontKerning: js.UndefOr[Double] = js.undefined
  
  var fontSize: js.UndefOr[Double] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var horizontalMargin: js.UndefOr[Double] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var interceptsMouseClicks: js.UndefOr[Boolean] = js.undefined
  
  var items: js.UndefOr[js.Array[String]] = js.undefined
  
  var modifiedClickAction: js.UndefOr[String] = js.undefined
  
  var mouseCursorType: js.UndefOr[
    none | normal | wait | IBeam | (`cross hair`) | copying | (`pointing hand`) | (`dragging hand`) | (`left right resize`) | (`up down resize`) | (`up down left right resize`) | (`top edge resize`) | (`bottom edge resize`) | (`left edge resize`) | (`right edge resize`) | (`top left corner resize`) | (`top right corner resize`) | (`bottom left corner resize`) | (`bottom right corner resize`)
  ] = js.undefined
  
  var mouseEnterAction: js.UndefOr[String] = js.undefined
  
  var mouseExitAction: js.UndefOr[String] = js.undefined
  
  var returnKeyAction: js.UndefOr[String] = js.undefined
  
  var rowClickedAction: js.UndefOr[String] = js.undefined
  
  var rowDoubleClickedAction: js.UndefOr[String] = js.undefined
  
  var scrollbar: js.UndefOr[Background] = js.undefined
  
  var textAlign: js.UndefOr[
    (`centered left`) | (`centered right`) | left | right | center | (`top left`) | (`top right`) | (`top center`) | (`bottom left`) | (`bottom right`) | (`bottom center`)
  ] = js.undefined
  
  var textColor: js.UndefOr[String] = js.undefined
  
  var textColorSelected: js.UndefOr[String] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var wantsKeyboardFocus: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
}
object PartialListBoxProps {
  
  inline def apply(): PartialListBoxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialListBoxProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialListBoxProps] (val x: Self) extends AnyVal {
    
    inline def setAllowClicksOnChildren(value: Boolean): Self = StObject.set(x, "allowClicksOnChildren", value.asInstanceOf[js.Any])
    
    inline def setAllowClicksOnChildrenUndefined: Self = StObject.set(x, "allowClicksOnChildren", js.undefined)
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setAlwaysOnTop(value: Boolean): Self = StObject.set(x, "alwaysOnTop", value.asInstanceOf[js.Any])
    
    inline def setAlwaysOnTopUndefined: Self = StObject.set(x, "alwaysOnTop", js.undefined)
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBackgroundImage(value: String): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
    
    inline def setBackgroundImageUndefined: Self = StObject.set(x, "backgroundImage", js.undefined)
    
    inline def setBorder(value: FocusColor): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setCellColor(value: String): Self = StObject.set(x, "cellColor", value.asInstanceOf[js.Any])
    
    inline def setCellColorSelected(value: String): Self = StObject.set(x, "cellColorSelected", value.asInstanceOf[js.Any])
    
    inline def setCellColorSelectedUndefined: Self = StObject.set(x, "cellColorSelected", js.undefined)
    
    inline def setCellColorUndefined: Self = StObject.set(x, "cellColor", js.undefined)
    
    inline def setClickGrabsKeyboardFocus(value: Boolean): Self = StObject.set(x, "clickGrabsKeyboardFocus", value.asInstanceOf[js.Any])
    
    inline def setClickGrabsKeyboardFocusUndefined: Self = StObject.set(x, "clickGrabsKeyboardFocus", js.undefined)
    
    inline def setClickMask(value: String): Self = StObject.set(x, "clickMask", value.asInstanceOf[js.Any])
    
    inline def setClickMaskUndefined: Self = StObject.set(x, "clickMask", js.undefined)
    
    inline def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
    
    inline def setDoubleClickAction(value: String): Self = StObject.set(x, "doubleClickAction", value.asInstanceOf[js.Any])
    
    inline def setDoubleClickActionUndefined: Self = StObject.set(x, "doubleClickAction", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontKerning(value: Double): Self = StObject.set(x, "fontKerning", value.asInstanceOf[js.Any])
    
    inline def setFontKerningUndefined: Self = StObject.set(x, "fontKerning", js.undefined)
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHorizontalMargin(value: Double): Self = StObject.set(x, "horizontalMargin", value.asInstanceOf[js.Any])
    
    inline def setHorizontalMarginUndefined: Self = StObject.set(x, "horizontalMargin", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInterceptsMouseClicks(value: Boolean): Self = StObject.set(x, "interceptsMouseClicks", value.asInstanceOf[js.Any])
    
    inline def setInterceptsMouseClicksUndefined: Self = StObject.set(x, "interceptsMouseClicks", js.undefined)
    
    inline def setItems(value: js.Array[String]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: String*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setModifiedClickAction(value: String): Self = StObject.set(x, "modifiedClickAction", value.asInstanceOf[js.Any])
    
    inline def setModifiedClickActionUndefined: Self = StObject.set(x, "modifiedClickAction", js.undefined)
    
    inline def setMouseCursorType(
      value: none | normal | wait | IBeam | (`cross hair`) | copying | (`pointing hand`) | (`dragging hand`) | (`left right resize`) | (`up down resize`) | (`up down left right resize`) | (`top edge resize`) | (`bottom edge resize`) | (`left edge resize`) | (`right edge resize`) | (`top left corner resize`) | (`top right corner resize`) | (`bottom left corner resize`) | (`bottom right corner resize`)
    ): Self = StObject.set(x, "mouseCursorType", value.asInstanceOf[js.Any])
    
    inline def setMouseCursorTypeUndefined: Self = StObject.set(x, "mouseCursorType", js.undefined)
    
    inline def setMouseEnterAction(value: String): Self = StObject.set(x, "mouseEnterAction", value.asInstanceOf[js.Any])
    
    inline def setMouseEnterActionUndefined: Self = StObject.set(x, "mouseEnterAction", js.undefined)
    
    inline def setMouseExitAction(value: String): Self = StObject.set(x, "mouseExitAction", value.asInstanceOf[js.Any])
    
    inline def setMouseExitActionUndefined: Self = StObject.set(x, "mouseExitAction", js.undefined)
    
    inline def setReturnKeyAction(value: String): Self = StObject.set(x, "returnKeyAction", value.asInstanceOf[js.Any])
    
    inline def setReturnKeyActionUndefined: Self = StObject.set(x, "returnKeyAction", js.undefined)
    
    inline def setRowClickedAction(value: String): Self = StObject.set(x, "rowClickedAction", value.asInstanceOf[js.Any])
    
    inline def setRowClickedActionUndefined: Self = StObject.set(x, "rowClickedAction", js.undefined)
    
    inline def setRowDoubleClickedAction(value: String): Self = StObject.set(x, "rowDoubleClickedAction", value.asInstanceOf[js.Any])
    
    inline def setRowDoubleClickedActionUndefined: Self = StObject.set(x, "rowDoubleClickedAction", js.undefined)
    
    inline def setScrollbar(value: Background): Self = StObject.set(x, "scrollbar", value.asInstanceOf[js.Any])
    
    inline def setScrollbarUndefined: Self = StObject.set(x, "scrollbar", js.undefined)
    
    inline def setTextAlign(
      value: (`centered left`) | (`centered right`) | left | right | center | (`top left`) | (`top right`) | (`top center`) | (`bottom left`) | (`bottom right`) | (`bottom center`)
    ): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTextColorSelected(value: String): Self = StObject.set(x, "textColorSelected", value.asInstanceOf[js.Any])
    
    inline def setTextColorSelectedUndefined: Self = StObject.set(x, "textColorSelected", js.undefined)
    
    inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWantsKeyboardFocus(value: Boolean): Self = StObject.set(x, "wantsKeyboardFocus", value.asInstanceOf[js.Any])
    
    inline def setWantsKeyboardFocusUndefined: Self = StObject.set(x, "wantsKeyboardFocus", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
