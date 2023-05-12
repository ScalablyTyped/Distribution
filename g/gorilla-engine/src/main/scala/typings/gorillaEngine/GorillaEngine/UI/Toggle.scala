package typings.gorillaEngine.GorillaEngine.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.gorillaEngine.GorillaEngine.UI.Common because var conflicts: id. Inlined visible, enabled, wantsKeyboardFocus, clickGrabsKeyboardFocus, alpha, alwaysOnTop
- typings.gorillaEngine.GorillaEngine.UI.ToggleProps because var conflicts: id. Inlined text, onColor, offColor, onColorHover, offColorHover, textColorOn, textColorOff, textColorOnHover, textColorOffHover, onImage, onImagePressed, onImageHovered, offImage, offImagePressed, offImageHovered, disabledImage, radioIndex, radioValue, drawTick, fitToText, value, animation */ trait Toggle
  extends StObject
     with Component
     with Bounds {
  
  var alpha: Double
  
  var alwaysOnTop: Boolean
  
  var animation: LottieAnimation
  
  var clickGrabsKeyboardFocus: Boolean
  
  var disabledImage: String
  
  var drawTick: Boolean
  
  var enabled: Boolean
  
  var fitToText: Boolean
  
  var offColor: String
  
  var offColorHover: String
  
  var offImage: String
  
  var offImageHovered: String
  
  var offImagePressed: String
  
  var onColor: String
  
  var onColorHover: String
  
  var onImage: String
  
  var onImageHovered: String
  
  var onImagePressed: String
  
  var radioIndex: Double
  
  var radioValue: Double
  
  var text: String
  
  var textColorOff: String
  
  var textColorOffHover: String
  
  var textColorOn: String
  
  var textColorOnHover: String
  
  var value: Boolean
  
  var visible: Boolean
  
  var wantsKeyboardFocus: Boolean
}
object Toggle {
  
  inline def apply(
    alpha: Double,
    alwaysOnTop: Boolean,
    animation: LottieAnimation,
    appendChild: Component => Unit,
    children: js.Array[Component],
    clickGrabsKeyboardFocus: Boolean,
    disabledImage: String,
    drawTick: Boolean,
    enabled: Boolean,
    fitToText: Boolean,
    height: Double,
    id: String,
    insertBefore: (Component, Component) => Unit,
    offColor: String,
    offColorHover: String,
    offImage: String,
    offImageHovered: String,
    offImagePressed: String,
    on: (String, Any) => Unit,
    onColor: String,
    onColorHover: String,
    onImage: String,
    onImageHovered: String,
    onImagePressed: String,
    parent: Component,
    radioIndex: Double,
    radioValue: Double,
    removeChild: Component => Unit,
    text: String,
    textColorOff: String,
    textColorOffHover: String,
    textColorOn: String,
    textColorOnHover: String,
    value: Boolean,
    visible: Boolean,
    wantsKeyboardFocus: Boolean,
    width: Double,
    x: Double,
    y: Double
  ): Toggle = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], alwaysOnTop = alwaysOnTop.asInstanceOf[js.Any], animation = animation.asInstanceOf[js.Any], appendChild = js.Any.fromFunction1(appendChild), children = children.asInstanceOf[js.Any], clickGrabsKeyboardFocus = clickGrabsKeyboardFocus.asInstanceOf[js.Any], disabledImage = disabledImage.asInstanceOf[js.Any], drawTick = drawTick.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], fitToText = fitToText.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], insertBefore = js.Any.fromFunction2(insertBefore), offColor = offColor.asInstanceOf[js.Any], offColorHover = offColorHover.asInstanceOf[js.Any], offImage = offImage.asInstanceOf[js.Any], offImageHovered = offImageHovered.asInstanceOf[js.Any], offImagePressed = offImagePressed.asInstanceOf[js.Any], on = js.Any.fromFunction2(on), onColor = onColor.asInstanceOf[js.Any], onColorHover = onColorHover.asInstanceOf[js.Any], onImage = onImage.asInstanceOf[js.Any], onImageHovered = onImageHovered.asInstanceOf[js.Any], onImagePressed = onImagePressed.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], radioIndex = radioIndex.asInstanceOf[js.Any], radioValue = radioValue.asInstanceOf[js.Any], removeChild = js.Any.fromFunction1(removeChild), text = text.asInstanceOf[js.Any], textColorOff = textColorOff.asInstanceOf[js.Any], textColorOffHover = textColorOffHover.asInstanceOf[js.Any], textColorOn = textColorOn.asInstanceOf[js.Any], textColorOnHover = textColorOnHover.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], wantsKeyboardFocus = wantsKeyboardFocus.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Toggle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Toggle] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlwaysOnTop(value: Boolean): Self = StObject.set(x, "alwaysOnTop", value.asInstanceOf[js.Any])
    
    inline def setAnimation(value: LottieAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setClickGrabsKeyboardFocus(value: Boolean): Self = StObject.set(x, "clickGrabsKeyboardFocus", value.asInstanceOf[js.Any])
    
    inline def setDisabledImage(value: String): Self = StObject.set(x, "disabledImage", value.asInstanceOf[js.Any])
    
    inline def setDrawTick(value: Boolean): Self = StObject.set(x, "drawTick", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setFitToText(value: Boolean): Self = StObject.set(x, "fitToText", value.asInstanceOf[js.Any])
    
    inline def setOffColor(value: String): Self = StObject.set(x, "offColor", value.asInstanceOf[js.Any])
    
    inline def setOffColorHover(value: String): Self = StObject.set(x, "offColorHover", value.asInstanceOf[js.Any])
    
    inline def setOffImage(value: String): Self = StObject.set(x, "offImage", value.asInstanceOf[js.Any])
    
    inline def setOffImageHovered(value: String): Self = StObject.set(x, "offImageHovered", value.asInstanceOf[js.Any])
    
    inline def setOffImagePressed(value: String): Self = StObject.set(x, "offImagePressed", value.asInstanceOf[js.Any])
    
    inline def setOnColor(value: String): Self = StObject.set(x, "onColor", value.asInstanceOf[js.Any])
    
    inline def setOnColorHover(value: String): Self = StObject.set(x, "onColorHover", value.asInstanceOf[js.Any])
    
    inline def setOnImage(value: String): Self = StObject.set(x, "onImage", value.asInstanceOf[js.Any])
    
    inline def setOnImageHovered(value: String): Self = StObject.set(x, "onImageHovered", value.asInstanceOf[js.Any])
    
    inline def setOnImagePressed(value: String): Self = StObject.set(x, "onImagePressed", value.asInstanceOf[js.Any])
    
    inline def setRadioIndex(value: Double): Self = StObject.set(x, "radioIndex", value.asInstanceOf[js.Any])
    
    inline def setRadioValue(value: Double): Self = StObject.set(x, "radioValue", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextColorOff(value: String): Self = StObject.set(x, "textColorOff", value.asInstanceOf[js.Any])
    
    inline def setTextColorOffHover(value: String): Self = StObject.set(x, "textColorOffHover", value.asInstanceOf[js.Any])
    
    inline def setTextColorOn(value: String): Self = StObject.set(x, "textColorOn", value.asInstanceOf[js.Any])
    
    inline def setTextColorOnHover(value: String): Self = StObject.set(x, "textColorOnHover", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setWantsKeyboardFocus(value: Boolean): Self = StObject.set(x, "wantsKeyboardFocus", value.asInstanceOf[js.Any])
  }
}
