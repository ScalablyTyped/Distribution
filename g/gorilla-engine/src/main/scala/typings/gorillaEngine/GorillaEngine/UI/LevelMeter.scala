package typings.gorillaEngine.GorillaEngine.UI

import typings.gorillaEngine.anon.Direction
import typings.gorillaEngine.anon.FocusColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.gorillaEngine.GorillaEngine.UI.Common because var conflicts: id. Inlined visible, enabled, wantsKeyboardFocus, clickGrabsKeyboardFocus, alpha, alwaysOnTop
- typings.gorillaEngine.GorillaEngine.UI.LevelMeterProps because var conflicts: id. Inlined peakHold, logScale, fillArea, inverted, stereo, positionIndicator, rampUpFactor, rampDownFactor, maxRampDownSpeed, min, max, levelColor, peakColor, indicatorThickness, visibleSectionStart, visibleSectionEnd, direction, value */ trait LevelMeter
  extends StObject
     with Component
     with Bounds
     with Background
     with Skinnable {
  
  var alpha: Double
  
  var alwaysOnTop: Boolean
  
  var clickGrabsKeyboardFocus: Boolean
  
  var direction: String
  
  var enabled: Boolean
  
  var fillArea: Boolean
  
  var indicatorThickness: Double
  
  var inverted: Boolean
  
  var levelColor: String
  
  var logScale: Boolean
  
  var max: Double
  
  var maxRampDownSpeed: Double
  
  var min: Double
  
  var peakColor: String
  
  var peakHold: Boolean
  
  var positionIndicator: Boolean
  
  var rampDownFactor: Double
  
  var rampUpFactor: Double
  
  var stereo: Boolean
  
  var value: Any
  
  var visible: Boolean
  
  var visibleSectionEnd: Double
  
  var visibleSectionStart: Double
  
  var wantsKeyboardFocus: Boolean
}
object LevelMeter {
  
  inline def apply(
    alpha: Double,
    alwaysOnTop: Boolean,
    animation: LottieAnimation,
    appendChild: Component => Unit,
    backgroundColor: String,
    backgroundImage: String,
    border: FocusColor,
    children: js.Array[Component],
    clickGrabsKeyboardFocus: Boolean,
    cornerRadius: Double,
    direction: String,
    enabled: Boolean,
    fillArea: Boolean,
    filmstrip: Direction,
    height: Double,
    id: String,
    indicatorThickness: Double,
    insertBefore: (Component, Component) => Unit,
    inverted: Boolean,
    levelColor: String,
    logScale: Boolean,
    max: Double,
    maxRampDownSpeed: Double,
    min: Double,
    on: (String, Any) => Unit,
    parent: Component,
    peakColor: String,
    peakHold: Boolean,
    positionIndicator: Boolean,
    rampDownFactor: Double,
    rampUpFactor: Double,
    removeChild: Component => Unit,
    stereo: Boolean,
    value: Any,
    visible: Boolean,
    visibleSectionEnd: Double,
    visibleSectionStart: Double,
    wantsKeyboardFocus: Boolean,
    width: Double,
    x: Double,
    y: Double
  ): LevelMeter = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], alwaysOnTop = alwaysOnTop.asInstanceOf[js.Any], animation = animation.asInstanceOf[js.Any], appendChild = js.Any.fromFunction1(appendChild), backgroundColor = backgroundColor.asInstanceOf[js.Any], backgroundImage = backgroundImage.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], clickGrabsKeyboardFocus = clickGrabsKeyboardFocus.asInstanceOf[js.Any], cornerRadius = cornerRadius.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], fillArea = fillArea.asInstanceOf[js.Any], filmstrip = filmstrip.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], indicatorThickness = indicatorThickness.asInstanceOf[js.Any], insertBefore = js.Any.fromFunction2(insertBefore), inverted = inverted.asInstanceOf[js.Any], levelColor = levelColor.asInstanceOf[js.Any], logScale = logScale.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], maxRampDownSpeed = maxRampDownSpeed.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], on = js.Any.fromFunction2(on), parent = parent.asInstanceOf[js.Any], peakColor = peakColor.asInstanceOf[js.Any], peakHold = peakHold.asInstanceOf[js.Any], positionIndicator = positionIndicator.asInstanceOf[js.Any], rampDownFactor = rampDownFactor.asInstanceOf[js.Any], rampUpFactor = rampUpFactor.asInstanceOf[js.Any], removeChild = js.Any.fromFunction1(removeChild), stereo = stereo.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], visibleSectionEnd = visibleSectionEnd.asInstanceOf[js.Any], visibleSectionStart = visibleSectionStart.asInstanceOf[js.Any], wantsKeyboardFocus = wantsKeyboardFocus.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelMeter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LevelMeter] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlwaysOnTop(value: Boolean): Self = StObject.set(x, "alwaysOnTop", value.asInstanceOf[js.Any])
    
    inline def setClickGrabsKeyboardFocus(value: Boolean): Self = StObject.set(x, "clickGrabsKeyboardFocus", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setFillArea(value: Boolean): Self = StObject.set(x, "fillArea", value.asInstanceOf[js.Any])
    
    inline def setIndicatorThickness(value: Double): Self = StObject.set(x, "indicatorThickness", value.asInstanceOf[js.Any])
    
    inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
    
    inline def setLevelColor(value: String): Self = StObject.set(x, "levelColor", value.asInstanceOf[js.Any])
    
    inline def setLogScale(value: Boolean): Self = StObject.set(x, "logScale", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxRampDownSpeed(value: Double): Self = StObject.set(x, "maxRampDownSpeed", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setPeakColor(value: String): Self = StObject.set(x, "peakColor", value.asInstanceOf[js.Any])
    
    inline def setPeakHold(value: Boolean): Self = StObject.set(x, "peakHold", value.asInstanceOf[js.Any])
    
    inline def setPositionIndicator(value: Boolean): Self = StObject.set(x, "positionIndicator", value.asInstanceOf[js.Any])
    
    inline def setRampDownFactor(value: Double): Self = StObject.set(x, "rampDownFactor", value.asInstanceOf[js.Any])
    
    inline def setRampUpFactor(value: Double): Self = StObject.set(x, "rampUpFactor", value.asInstanceOf[js.Any])
    
    inline def setStereo(value: Boolean): Self = StObject.set(x, "stereo", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleSectionEnd(value: Double): Self = StObject.set(x, "visibleSectionEnd", value.asInstanceOf[js.Any])
    
    inline def setVisibleSectionStart(value: Double): Self = StObject.set(x, "visibleSectionStart", value.asInstanceOf[js.Any])
    
    inline def setWantsKeyboardFocus(value: Boolean): Self = StObject.set(x, "wantsKeyboardFocus", value.asInstanceOf[js.Any])
  }
}
