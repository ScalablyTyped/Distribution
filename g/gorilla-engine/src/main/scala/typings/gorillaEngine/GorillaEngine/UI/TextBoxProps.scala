package typings.gorillaEngine.GorillaEngine.UI

import typings.gorillaEngine.anon.FocusColor
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

trait TextBoxProps
  extends StObject
     with Font
     with Clickable
     with Bounds
     with Background {
  
  var acceptedDataType: integer | int | float | string
  
  var caretColor: String
  
  var highlightColor: String
  
  var highlightTextColor: String
  
  var maxLength: Double
  
  var maxValue: Double
  
  var minValue: Double
  
  var multiLine: Boolean
  
  var palceholder: String
  
  var passwordCharacter: String
  
  var placeHolderColor: String
  
  var readOnly: Boolean
  
  var text: String
  
  var unit: String
}
object TextBoxProps {
  
  inline def apply(
    acceptedDataType: integer | int | float | string,
    allowClicksOnChildren: Boolean,
    backgroundColor: String,
    backgroundImage: String,
    border: FocusColor,
    caretColor: String,
    clickMask: String,
    cornerRadius: Double,
    doubleClickAction: String,
    font: String,
    fontKerning: Double,
    fontSize: Double,
    height: Double,
    highlightColor: String,
    highlightTextColor: String,
    interceptsMouseClicks: Boolean,
    maxLength: Double,
    maxValue: Double,
    minValue: Double,
    modifiedClickAction: String,
    mouseCursorType: none | normal | wait | IBeam | (`cross hair`) | copying | (`pointing hand`) | (`dragging hand`) | (`left right resize`) | (`up down resize`) | (`up down left right resize`) | (`top edge resize`) | (`bottom edge resize`) | (`left edge resize`) | (`right edge resize`) | (`top left corner resize`) | (`top right corner resize`) | (`bottom left corner resize`) | (`bottom right corner resize`),
    mouseEnterAction: String,
    mouseExitAction: String,
    multiLine: Boolean,
    palceholder: String,
    passwordCharacter: String,
    placeHolderColor: String,
    readOnly: Boolean,
    text: String,
    textAlign: (`centered left`) | (`centered right`) | left | right | center | (`top left`) | (`top right`) | (`top center`) | (`bottom left`) | (`bottom right`) | (`bottom center`),
    textColor: String,
    unit: String,
    width: Double,
    x: Double,
    y: Double
  ): TextBoxProps = {
    val __obj = js.Dynamic.literal(acceptedDataType = acceptedDataType.asInstanceOf[js.Any], allowClicksOnChildren = allowClicksOnChildren.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], backgroundImage = backgroundImage.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], caretColor = caretColor.asInstanceOf[js.Any], clickMask = clickMask.asInstanceOf[js.Any], cornerRadius = cornerRadius.asInstanceOf[js.Any], doubleClickAction = doubleClickAction.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], fontKerning = fontKerning.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], highlightColor = highlightColor.asInstanceOf[js.Any], highlightTextColor = highlightTextColor.asInstanceOf[js.Any], interceptsMouseClicks = interceptsMouseClicks.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], modifiedClickAction = modifiedClickAction.asInstanceOf[js.Any], mouseCursorType = mouseCursorType.asInstanceOf[js.Any], mouseEnterAction = mouseEnterAction.asInstanceOf[js.Any], mouseExitAction = mouseExitAction.asInstanceOf[js.Any], multiLine = multiLine.asInstanceOf[js.Any], palceholder = palceholder.asInstanceOf[js.Any], passwordCharacter = passwordCharacter.asInstanceOf[js.Any], placeHolderColor = placeHolderColor.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextBoxProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextBoxProps] (val x: Self) extends AnyVal {
    
    inline def setAcceptedDataType(value: integer | int | float | string): Self = StObject.set(x, "acceptedDataType", value.asInstanceOf[js.Any])
    
    inline def setCaretColor(value: String): Self = StObject.set(x, "caretColor", value.asInstanceOf[js.Any])
    
    inline def setHighlightColor(value: String): Self = StObject.set(x, "highlightColor", value.asInstanceOf[js.Any])
    
    inline def setHighlightTextColor(value: String): Self = StObject.set(x, "highlightTextColor", value.asInstanceOf[js.Any])
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMultiLine(value: Boolean): Self = StObject.set(x, "multiLine", value.asInstanceOf[js.Any])
    
    inline def setPalceholder(value: String): Self = StObject.set(x, "palceholder", value.asInstanceOf[js.Any])
    
    inline def setPasswordCharacter(value: String): Self = StObject.set(x, "passwordCharacter", value.asInstanceOf[js.Any])
    
    inline def setPlaceHolderColor(value: String): Self = StObject.set(x, "placeHolderColor", value.asInstanceOf[js.Any])
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
  }
}
