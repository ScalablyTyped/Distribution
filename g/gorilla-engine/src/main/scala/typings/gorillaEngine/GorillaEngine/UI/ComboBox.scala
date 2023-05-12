package typings.gorillaEngine.GorillaEngine.UI

import typings.gorillaEngine.anon.FocusColor
import typings.gorillaEngine.anon.PartialComboBoxPadding
import typings.gorillaEngine.anon.PartialComboBoxPopupStyle
import typings.gorillaEngine.anon.PartialComboBoxPopupStyleBackgroundColor
import typings.gorillaEngine.anon.PartialarrowIconstringarr
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

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.gorillaEngine.GorillaEngine.UI.Common because var conflicts: id. Inlined visible, enabled, wantsKeyboardFocus, clickGrabsKeyboardFocus, alpha, alwaysOnTop
- typings.gorillaEngine.GorillaEngine.UI.ComboBoxProps because var conflicts: id. Inlined value, items, levelSeperator, stretchText, scrollWheelEnabled, styleSubmenu, backgroundColorClicked, backgroundColorHover, itemReselectedAction, padding, images, popup, subPopup */ trait ComboBox
  extends StObject
     with Component
     with Bounds
     with Background
     with Clickable
     with Font {
  
  var alpha: Double
  
  var alwaysOnTop: Boolean
  
  var backgroundColorClicked: String
  
  var backgroundColorHover: String
  
  var clickGrabsKeyboardFocus: Boolean
  
  var enabled: Boolean
  
  var images: PartialarrowIconstringarr
  
  var itemReselectedAction: String
  
  /**
    * List of options
    */
  var items: js.Array[String]
  
  /**
    * The character that signifies heirarchy within the items array
    */
  var levelSeperator: String
  
  var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  
  var padding: PartialComboBoxPadding | Double
  
  var popup: PartialComboBoxPopupStyle
  
  var scrollWheelEnabled: Boolean
  
  var stretchText: Boolean
  
  var styleSubmenu: Boolean
  
  var subPopup: PartialComboBoxPopupStyleBackgroundColor
  
  var value: Double
  
  var visible: Boolean
  
  var wantsKeyboardFocus: Boolean
}
object ComboBox {
  
  inline def apply(
    allowClicksOnChildren: Boolean,
    alpha: Double,
    alwaysOnTop: Boolean,
    appendChild: Component => Unit,
    backgroundColor: String,
    backgroundColorClicked: String,
    backgroundColorHover: String,
    backgroundImage: String,
    border: FocusColor,
    children: js.Array[Component],
    clickGrabsKeyboardFocus: Boolean,
    clickMask: String,
    cornerRadius: Double,
    doubleClickAction: String,
    enabled: Boolean,
    font: String,
    fontKerning: Double,
    fontSize: Double,
    height: Double,
    id: String,
    images: PartialarrowIconstringarr,
    insertBefore: (Component, Component) => Unit,
    interceptsMouseClicks: Boolean,
    itemReselectedAction: String,
    items: js.Array[String],
    levelSeperator: String,
    modifiedClickAction: String,
    mouseCursorType: none | normal | wait | IBeam | (`cross hair`) | copying | (`pointing hand`) | (`dragging hand`) | (`left right resize`) | (`up down resize`) | (`up down left right resize`) | (`top edge resize`) | (`bottom edge resize`) | (`left edge resize`) | (`right edge resize`) | (`top left corner resize`) | (`top right corner resize`) | (`bottom left corner resize`) | (`bottom right corner resize`),
    mouseEnterAction: String,
    mouseExitAction: String,
    on: (String, Any) => Unit,
    padding: PartialComboBoxPadding | Double,
    parent: Component,
    popup: PartialComboBoxPopupStyle,
    removeChild: Component => Unit,
    scrollWheelEnabled: Boolean,
    stretchText: Boolean,
    styleSubmenu: Boolean,
    subPopup: PartialComboBoxPopupStyleBackgroundColor,
    textAlign: (`centered left`) | (`centered right`) | left | right | center | (`top left`) | (`top right`) | (`top center`) | (`bottom left`) | (`bottom right`) | (`bottom center`),
    textColor: String,
    value: Double,
    visible: Boolean,
    wantsKeyboardFocus: Boolean,
    width: Double,
    x: Double,
    y: Double
  ): ComboBox = {
    val __obj = js.Dynamic.literal(allowClicksOnChildren = allowClicksOnChildren.asInstanceOf[js.Any], alpha = alpha.asInstanceOf[js.Any], alwaysOnTop = alwaysOnTop.asInstanceOf[js.Any], appendChild = js.Any.fromFunction1(appendChild), backgroundColor = backgroundColor.asInstanceOf[js.Any], backgroundColorClicked = backgroundColorClicked.asInstanceOf[js.Any], backgroundColorHover = backgroundColorHover.asInstanceOf[js.Any], backgroundImage = backgroundImage.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], clickGrabsKeyboardFocus = clickGrabsKeyboardFocus.asInstanceOf[js.Any], clickMask = clickMask.asInstanceOf[js.Any], cornerRadius = cornerRadius.asInstanceOf[js.Any], doubleClickAction = doubleClickAction.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], fontKerning = fontKerning.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], insertBefore = js.Any.fromFunction2(insertBefore), interceptsMouseClicks = interceptsMouseClicks.asInstanceOf[js.Any], itemReselectedAction = itemReselectedAction.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], levelSeperator = levelSeperator.asInstanceOf[js.Any], modifiedClickAction = modifiedClickAction.asInstanceOf[js.Any], mouseCursorType = mouseCursorType.asInstanceOf[js.Any], mouseEnterAction = mouseEnterAction.asInstanceOf[js.Any], mouseExitAction = mouseExitAction.asInstanceOf[js.Any], on = js.Any.fromFunction2(on), padding = padding.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], removeChild = js.Any.fromFunction1(removeChild), scrollWheelEnabled = scrollWheelEnabled.asInstanceOf[js.Any], stretchText = stretchText.asInstanceOf[js.Any], styleSubmenu = styleSubmenu.asInstanceOf[js.Any], subPopup = subPopup.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], wantsKeyboardFocus = wantsKeyboardFocus.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComboBox]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComboBox] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlwaysOnTop(value: Boolean): Self = StObject.set(x, "alwaysOnTop", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorClicked(value: String): Self = StObject.set(x, "backgroundColorClicked", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorHover(value: String): Self = StObject.set(x, "backgroundColorHover", value.asInstanceOf[js.Any])
    
    inline def setClickGrabsKeyboardFocus(value: Boolean): Self = StObject.set(x, "clickGrabsKeyboardFocus", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setImages(value: PartialarrowIconstringarr): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setItemReselectedAction(value: String): Self = StObject.set(x, "itemReselectedAction", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[String]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: String*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setLevelSeperator(value: String): Self = StObject.set(x, "levelSeperator", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: /* value */ Double => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setPadding(value: PartialComboBoxPadding | Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPopup(value: PartialComboBoxPopupStyle): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    
    inline def setScrollWheelEnabled(value: Boolean): Self = StObject.set(x, "scrollWheelEnabled", value.asInstanceOf[js.Any])
    
    inline def setStretchText(value: Boolean): Self = StObject.set(x, "stretchText", value.asInstanceOf[js.Any])
    
    inline def setStyleSubmenu(value: Boolean): Self = StObject.set(x, "styleSubmenu", value.asInstanceOf[js.Any])
    
    inline def setSubPopup(value: PartialComboBoxPopupStyleBackgroundColor): Self = StObject.set(x, "subPopup", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setWantsKeyboardFocus(value: Boolean): Self = StObject.set(x, "wantsKeyboardFocus", value.asInstanceOf[js.Any])
  }
}
