package typings.gorillaEngine.GorillaEngine.UI

import typings.gorillaEngine.anon.Direction
import typings.gorillaEngine.anon.FocusColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LevelMeterProps
  extends StObject
     with Common
     with Bounds
     with Background
     with Skinnable {
  
  var direction: String
  
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
  
  var visibleSectionEnd: Double
  
  var visibleSectionStart: Double
}
object LevelMeterProps {
  
  inline def apply(
    alpha: Double,
    alwaysOnTop: Boolean,
    animation: LottieAnimation,
    backgroundColor: String,
    backgroundImage: String,
    border: FocusColor,
    clickGrabsKeyboardFocus: Boolean,
    cornerRadius: Double,
    direction: String,
    enabled: Boolean,
    fillArea: Boolean,
    filmstrip: Direction,
    height: Double,
    id: String,
    indicatorThickness: Double,
    inverted: Boolean,
    levelColor: String,
    logScale: Boolean,
    max: Double,
    maxRampDownSpeed: Double,
    min: Double,
    peakColor: String,
    peakHold: Boolean,
    positionIndicator: Boolean,
    rampDownFactor: Double,
    rampUpFactor: Double,
    stereo: Boolean,
    value: Any,
    visible: Boolean,
    visibleSectionEnd: Double,
    visibleSectionStart: Double,
    wantsKeyboardFocus: Boolean,
    width: Double,
    x: Double,
    y: Double
  ): LevelMeterProps = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], alwaysOnTop = alwaysOnTop.asInstanceOf[js.Any], animation = animation.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], backgroundImage = backgroundImage.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], clickGrabsKeyboardFocus = clickGrabsKeyboardFocus.asInstanceOf[js.Any], cornerRadius = cornerRadius.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], fillArea = fillArea.asInstanceOf[js.Any], filmstrip = filmstrip.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], indicatorThickness = indicatorThickness.asInstanceOf[js.Any], inverted = inverted.asInstanceOf[js.Any], levelColor = levelColor.asInstanceOf[js.Any], logScale = logScale.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], maxRampDownSpeed = maxRampDownSpeed.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], peakColor = peakColor.asInstanceOf[js.Any], peakHold = peakHold.asInstanceOf[js.Any], positionIndicator = positionIndicator.asInstanceOf[js.Any], rampDownFactor = rampDownFactor.asInstanceOf[js.Any], rampUpFactor = rampUpFactor.asInstanceOf[js.Any], stereo = stereo.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], visibleSectionEnd = visibleSectionEnd.asInstanceOf[js.Any], visibleSectionStart = visibleSectionStart.asInstanceOf[js.Any], wantsKeyboardFocus = wantsKeyboardFocus.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelMeterProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LevelMeterProps] (val x: Self) extends AnyVal {
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
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
    
    inline def setVisibleSectionEnd(value: Double): Self = StObject.set(x, "visibleSectionEnd", value.asInstanceOf[js.Any])
    
    inline def setVisibleSectionStart(value: Double): Self = StObject.set(x, "visibleSectionStart", value.asInstanceOf[js.Any])
  }
}
