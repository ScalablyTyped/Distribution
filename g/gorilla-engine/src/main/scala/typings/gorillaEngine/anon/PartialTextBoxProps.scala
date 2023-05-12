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
import typings.gorillaEngine.gorillaEngineStrings.float
import typings.gorillaEngine.gorillaEngineStrings.int
import typings.gorillaEngine.gorillaEngineStrings.integer
import typings.gorillaEngine.gorillaEngineStrings.left
import typings.gorillaEngine.gorillaEngineStrings.none
import typings.gorillaEngine.gorillaEngineStrings.normal
import typings.gorillaEngine.gorillaEngineStrings.right
import typings.gorillaEngine.gorillaEngineStrings.string
import typings.gorillaEngine.gorillaEngineStrings.wait
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<gorilla-engine.GorillaEngine.UI.TextBoxProps> */
trait PartialTextBoxProps extends StObject {
  
  var acceptedDataType: js.UndefOr[integer | int | float | string] = js.undefined
  
  var allowClicksOnChildren: js.UndefOr[Boolean] = js.undefined
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var backgroundImage: js.UndefOr[String] = js.undefined
  
  var border: js.UndefOr[FocusColor] = js.undefined
  
  var caretColor: js.UndefOr[String] = js.undefined
  
  var clickMask: js.UndefOr[String] = js.undefined
  
  var cornerRadius: js.UndefOr[Double] = js.undefined
  
  var doubleClickAction: js.UndefOr[String] = js.undefined
  
  var font: js.UndefOr[String] = js.undefined
  
  var fontKerning: js.UndefOr[Double] = js.undefined
  
  var fontSize: js.UndefOr[Double] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var highlightColor: js.UndefOr[String] = js.undefined
  
  var highlightTextColor: js.UndefOr[String] = js.undefined
  
  var interceptsMouseClicks: js.UndefOr[Boolean] = js.undefined
  
  var maxLength: js.UndefOr[Double] = js.undefined
  
  var maxValue: js.UndefOr[Double] = js.undefined
  
  var minValue: js.UndefOr[Double] = js.undefined
  
  var modifiedClickAction: js.UndefOr[String] = js.undefined
  
  var mouseCursorType: js.UndefOr[
    none | normal | wait | IBeam | (`cross hair`) | copying | (`pointing hand`) | (`dragging hand`) | (`left right resize`) | (`up down resize`) | (`up down left right resize`) | (`top edge resize`) | (`bottom edge resize`) | (`left edge resize`) | (`right edge resize`) | (`top left corner resize`) | (`top right corner resize`) | (`bottom left corner resize`) | (`bottom right corner resize`)
  ] = js.undefined
  
  var mouseEnterAction: js.UndefOr[String] = js.undefined
  
  var mouseExitAction: js.UndefOr[String] = js.undefined
  
  var multiLine: js.UndefOr[Boolean] = js.undefined
  
  var palceholder: js.UndefOr[String] = js.undefined
  
  var passwordCharacter: js.UndefOr[String] = js.undefined
  
  var placeHolderColor: js.UndefOr[String] = js.undefined
  
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var textAlign: js.UndefOr[
    (`centered left`) | (`centered right`) | left | right | center | (`top left`) | (`top right`) | (`top center`) | (`bottom left`) | (`bottom right`) | (`bottom center`)
  ] = js.undefined
  
  var textColor: js.UndefOr[String] = js.undefined
  
  var unit: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
}
object PartialTextBoxProps {
  
  inline def apply(): PartialTextBoxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTextBoxProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialTextBoxProps] (val x: Self) extends AnyVal {
    
    inline def setAcceptedDataType(value: integer | int | float | string): Self = StObject.set(x, "acceptedDataType", value.asInstanceOf[js.Any])
    
    inline def setAcceptedDataTypeUndefined: Self = StObject.set(x, "acceptedDataType", js.undefined)
    
    inline def setAllowClicksOnChildren(value: Boolean): Self = StObject.set(x, "allowClicksOnChildren", value.asInstanceOf[js.Any])
    
    inline def setAllowClicksOnChildrenUndefined: Self = StObject.set(x, "allowClicksOnChildren", js.undefined)
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBackgroundImage(value: String): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
    
    inline def setBackgroundImageUndefined: Self = StObject.set(x, "backgroundImage", js.undefined)
    
    inline def setBorder(value: FocusColor): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setCaretColor(value: String): Self = StObject.set(x, "caretColor", value.asInstanceOf[js.Any])
    
    inline def setCaretColorUndefined: Self = StObject.set(x, "caretColor", js.undefined)
    
    inline def setClickMask(value: String): Self = StObject.set(x, "clickMask", value.asInstanceOf[js.Any])
    
    inline def setClickMaskUndefined: Self = StObject.set(x, "clickMask", js.undefined)
    
    inline def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
    
    inline def setDoubleClickAction(value: String): Self = StObject.set(x, "doubleClickAction", value.asInstanceOf[js.Any])
    
    inline def setDoubleClickActionUndefined: Self = StObject.set(x, "doubleClickAction", js.undefined)
    
    inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontKerning(value: Double): Self = StObject.set(x, "fontKerning", value.asInstanceOf[js.Any])
    
    inline def setFontKerningUndefined: Self = StObject.set(x, "fontKerning", js.undefined)
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHighlightColor(value: String): Self = StObject.set(x, "highlightColor", value.asInstanceOf[js.Any])
    
    inline def setHighlightColorUndefined: Self = StObject.set(x, "highlightColor", js.undefined)
    
    inline def setHighlightTextColor(value: String): Self = StObject.set(x, "highlightTextColor", value.asInstanceOf[js.Any])
    
    inline def setHighlightTextColorUndefined: Self = StObject.set(x, "highlightTextColor", js.undefined)
    
    inline def setInterceptsMouseClicks(value: Boolean): Self = StObject.set(x, "interceptsMouseClicks", value.asInstanceOf[js.Any])
    
    inline def setInterceptsMouseClicksUndefined: Self = StObject.set(x, "interceptsMouseClicks", js.undefined)
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
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
    
    inline def setMultiLine(value: Boolean): Self = StObject.set(x, "multiLine", value.asInstanceOf[js.Any])
    
    inline def setMultiLineUndefined: Self = StObject.set(x, "multiLine", js.undefined)
    
    inline def setPalceholder(value: String): Self = StObject.set(x, "palceholder", value.asInstanceOf[js.Any])
    
    inline def setPalceholderUndefined: Self = StObject.set(x, "palceholder", js.undefined)
    
    inline def setPasswordCharacter(value: String): Self = StObject.set(x, "passwordCharacter", value.asInstanceOf[js.Any])
    
    inline def setPasswordCharacterUndefined: Self = StObject.set(x, "passwordCharacter", js.undefined)
    
    inline def setPlaceHolderColor(value: String): Self = StObject.set(x, "placeHolderColor", value.asInstanceOf[js.Any])
    
    inline def setPlaceHolderColorUndefined: Self = StObject.set(x, "placeHolderColor", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextAlign(
      value: (`centered left`) | (`centered right`) | left | right | center | (`top left`) | (`top right`) | (`top center`) | (`bottom left`) | (`bottom right`) | (`bottom center`)
    ): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
