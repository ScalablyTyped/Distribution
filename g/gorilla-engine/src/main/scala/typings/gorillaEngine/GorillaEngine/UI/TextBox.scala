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

trait TextBox
  extends StObject
     with Component
     with TextBoxProps {
  
  def grabKeyboardFocus(): Unit
}
object TextBox {
  
  inline def apply(
    acceptedDataType: integer | int | float | string,
    allowClicksOnChildren: Boolean,
    appendChild: Component => Unit,
    backgroundColor: String,
    backgroundImage: String,
    border: FocusColor,
    caretColor: String,
    children: js.Array[Component],
    clickMask: String,
    cornerRadius: Double,
    doubleClickAction: String,
    font: String,
    fontKerning: Double,
    fontSize: Double,
    grabKeyboardFocus: () => Unit,
    height: Double,
    highlightColor: String,
    highlightTextColor: String,
    id: String,
    insertBefore: (Component, Component) => Unit,
    interceptsMouseClicks: Boolean,
    maxLength: Double,
    maxValue: Double,
    minValue: Double,
    modifiedClickAction: String,
    mouseCursorType: none | normal | wait | IBeam | (`cross hair`) | copying | (`pointing hand`) | (`dragging hand`) | (`left right resize`) | (`up down resize`) | (`up down left right resize`) | (`top edge resize`) | (`bottom edge resize`) | (`left edge resize`) | (`right edge resize`) | (`top left corner resize`) | (`top right corner resize`) | (`bottom left corner resize`) | (`bottom right corner resize`),
    mouseEnterAction: String,
    mouseExitAction: String,
    multiLine: Boolean,
    on: (String, Any) => Unit,
    palceholder: String,
    parent: Component,
    passwordCharacter: String,
    placeHolderColor: String,
    readOnly: Boolean,
    removeChild: Component => Unit,
    text: String,
    textAlign: (`centered left`) | (`centered right`) | left | right | center | (`top left`) | (`top right`) | (`top center`) | (`bottom left`) | (`bottom right`) | (`bottom center`),
    textColor: String,
    unit: String,
    width: Double,
    x: Double,
    y: Double
  ): TextBox = {
    val __obj = js.Dynamic.literal(acceptedDataType = acceptedDataType.asInstanceOf[js.Any], allowClicksOnChildren = allowClicksOnChildren.asInstanceOf[js.Any], appendChild = js.Any.fromFunction1(appendChild), backgroundColor = backgroundColor.asInstanceOf[js.Any], backgroundImage = backgroundImage.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], caretColor = caretColor.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], clickMask = clickMask.asInstanceOf[js.Any], cornerRadius = cornerRadius.asInstanceOf[js.Any], doubleClickAction = doubleClickAction.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], fontKerning = fontKerning.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], grabKeyboardFocus = js.Any.fromFunction0(grabKeyboardFocus), height = height.asInstanceOf[js.Any], highlightColor = highlightColor.asInstanceOf[js.Any], highlightTextColor = highlightTextColor.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], insertBefore = js.Any.fromFunction2(insertBefore), interceptsMouseClicks = interceptsMouseClicks.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], modifiedClickAction = modifiedClickAction.asInstanceOf[js.Any], mouseCursorType = mouseCursorType.asInstanceOf[js.Any], mouseEnterAction = mouseEnterAction.asInstanceOf[js.Any], mouseExitAction = mouseExitAction.asInstanceOf[js.Any], multiLine = multiLine.asInstanceOf[js.Any], on = js.Any.fromFunction2(on), palceholder = palceholder.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], passwordCharacter = passwordCharacter.asInstanceOf[js.Any], placeHolderColor = placeHolderColor.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], removeChild = js.Any.fromFunction1(removeChild), text = text.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextBox]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextBox] (val x: Self) extends AnyVal {
    
    inline def setGrabKeyboardFocus(value: () => Unit): Self = StObject.set(x, "grabKeyboardFocus", js.Any.fromFunction0(value))
  }
}
