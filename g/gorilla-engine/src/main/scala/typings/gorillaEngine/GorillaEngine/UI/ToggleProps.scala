package typings.gorillaEngine.GorillaEngine.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToggleProps
  extends StObject
     with Common
     with Bounds {
  
  var animation: LottieAnimation
  
  var disabledImage: String
  
  var drawTick: Boolean
  
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
}
object ToggleProps {
  
  inline def apply(
    alpha: Double,
    alwaysOnTop: Boolean,
    animation: LottieAnimation,
    clickGrabsKeyboardFocus: Boolean,
    disabledImage: String,
    drawTick: Boolean,
    enabled: Boolean,
    fitToText: Boolean,
    height: Double,
    id: String,
    offColor: String,
    offColorHover: String,
    offImage: String,
    offImageHovered: String,
    offImagePressed: String,
    onColor: String,
    onColorHover: String,
    onImage: String,
    onImageHovered: String,
    onImagePressed: String,
    radioIndex: Double,
    radioValue: Double,
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
  ): ToggleProps = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], alwaysOnTop = alwaysOnTop.asInstanceOf[js.Any], animation = animation.asInstanceOf[js.Any], clickGrabsKeyboardFocus = clickGrabsKeyboardFocus.asInstanceOf[js.Any], disabledImage = disabledImage.asInstanceOf[js.Any], drawTick = drawTick.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], fitToText = fitToText.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], offColor = offColor.asInstanceOf[js.Any], offColorHover = offColorHover.asInstanceOf[js.Any], offImage = offImage.asInstanceOf[js.Any], offImageHovered = offImageHovered.asInstanceOf[js.Any], offImagePressed = offImagePressed.asInstanceOf[js.Any], onColor = onColor.asInstanceOf[js.Any], onColorHover = onColorHover.asInstanceOf[js.Any], onImage = onImage.asInstanceOf[js.Any], onImageHovered = onImageHovered.asInstanceOf[js.Any], onImagePressed = onImagePressed.asInstanceOf[js.Any], radioIndex = radioIndex.asInstanceOf[js.Any], radioValue = radioValue.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textColorOff = textColorOff.asInstanceOf[js.Any], textColorOffHover = textColorOffHover.asInstanceOf[js.Any], textColorOn = textColorOn.asInstanceOf[js.Any], textColorOnHover = textColorOnHover.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], wantsKeyboardFocus = wantsKeyboardFocus.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToggleProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToggleProps] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: LottieAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setDisabledImage(value: String): Self = StObject.set(x, "disabledImage", value.asInstanceOf[js.Any])
    
    inline def setDrawTick(value: Boolean): Self = StObject.set(x, "drawTick", value.asInstanceOf[js.Any])
    
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
  }
}
