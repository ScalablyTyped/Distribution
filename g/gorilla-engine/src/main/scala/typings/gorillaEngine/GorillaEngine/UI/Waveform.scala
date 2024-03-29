package typings.gorillaEngine.GorillaEngine.UI

import typings.gorillaEngine.anon.FocusColor
import typings.gorillaEngine.anon.PartialWaveformDragZone
import typings.gorillaEngine.anon.PartialWaveformMarker
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
- typings.gorillaEngine.GorillaEngine.UI.WaveformProps because var conflicts: id. Inlined waveformColor, gradientCenterColor, gradientEndColor, horizontalAxisColor, waveformUnavailableText, waveWidth, initialXOffset, waveHorizontalSapcing, verticalPadding, fitHeight, paintCenterLine, value, dragzone, markers */ trait Waveform
  extends StObject
     with Component
     with Bounds
     with Background
     with Font
     with Clickable {
  
  var alpha: Double
  
  var alwaysOnTop: Boolean
  
  var clickGrabsKeyboardFocus: Boolean
  
  var dragzone: PartialWaveformDragZone
  
  var enabled: Boolean
  
  var fitHeight: Boolean
  
  var gradientCenterColor: String
  
  var gradientEndColor: String
  
  var horizontalAxisColor: String
  
  var initialXOffset: Double
  
  var markers: PartialWaveformMarker
  
  var paintCenterLine: Boolean
  
  var value: Double
  
  var verticalPadding: Double
  
  var visible: Boolean
  
  var wantsKeyboardFocus: Boolean
  
  var waveHorizontalSapcing: Double
  
  var waveWidth: Double
  
  var waveformColor: String
  
  var waveformUnavailableText: String
}
object Waveform {
  
  inline def apply(
    allowClicksOnChildren: Boolean,
    alpha: Double,
    alwaysOnTop: Boolean,
    appendChild: Component => Unit,
    backgroundColor: String,
    backgroundImage: String,
    border: FocusColor,
    children: js.Array[Component],
    clickGrabsKeyboardFocus: Boolean,
    clickMask: String,
    cornerRadius: Double,
    doubleClickAction: String,
    dragzone: PartialWaveformDragZone,
    enabled: Boolean,
    fitHeight: Boolean,
    font: String,
    fontKerning: Double,
    fontSize: Double,
    gradientCenterColor: String,
    gradientEndColor: String,
    height: Double,
    horizontalAxisColor: String,
    id: String,
    initialXOffset: Double,
    insertBefore: (Component, Component) => Unit,
    interceptsMouseClicks: Boolean,
    markers: PartialWaveformMarker,
    modifiedClickAction: String,
    mouseCursorType: none | normal | wait | IBeam | (`cross hair`) | copying | (`pointing hand`) | (`dragging hand`) | (`left right resize`) | (`up down resize`) | (`up down left right resize`) | (`top edge resize`) | (`bottom edge resize`) | (`left edge resize`) | (`right edge resize`) | (`top left corner resize`) | (`top right corner resize`) | (`bottom left corner resize`) | (`bottom right corner resize`),
    mouseEnterAction: String,
    mouseExitAction: String,
    on: (String, Any) => Unit,
    paintCenterLine: Boolean,
    parent: Component,
    removeChild: Component => Unit,
    textAlign: (`centered left`) | (`centered right`) | left | right | center | (`top left`) | (`top right`) | (`top center`) | (`bottom left`) | (`bottom right`) | (`bottom center`),
    textColor: String,
    value: Double,
    verticalPadding: Double,
    visible: Boolean,
    wantsKeyboardFocus: Boolean,
    waveHorizontalSapcing: Double,
    waveWidth: Double,
    waveformColor: String,
    waveformUnavailableText: String,
    width: Double,
    x: Double,
    y: Double
  ): Waveform = {
    val __obj = js.Dynamic.literal(allowClicksOnChildren = allowClicksOnChildren.asInstanceOf[js.Any], alpha = alpha.asInstanceOf[js.Any], alwaysOnTop = alwaysOnTop.asInstanceOf[js.Any], appendChild = js.Any.fromFunction1(appendChild), backgroundColor = backgroundColor.asInstanceOf[js.Any], backgroundImage = backgroundImage.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], clickGrabsKeyboardFocus = clickGrabsKeyboardFocus.asInstanceOf[js.Any], clickMask = clickMask.asInstanceOf[js.Any], cornerRadius = cornerRadius.asInstanceOf[js.Any], doubleClickAction = doubleClickAction.asInstanceOf[js.Any], dragzone = dragzone.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], fitHeight = fitHeight.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], fontKerning = fontKerning.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], gradientCenterColor = gradientCenterColor.asInstanceOf[js.Any], gradientEndColor = gradientEndColor.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], horizontalAxisColor = horizontalAxisColor.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], initialXOffset = initialXOffset.asInstanceOf[js.Any], insertBefore = js.Any.fromFunction2(insertBefore), interceptsMouseClicks = interceptsMouseClicks.asInstanceOf[js.Any], markers = markers.asInstanceOf[js.Any], modifiedClickAction = modifiedClickAction.asInstanceOf[js.Any], mouseCursorType = mouseCursorType.asInstanceOf[js.Any], mouseEnterAction = mouseEnterAction.asInstanceOf[js.Any], mouseExitAction = mouseExitAction.asInstanceOf[js.Any], on = js.Any.fromFunction2(on), paintCenterLine = paintCenterLine.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], removeChild = js.Any.fromFunction1(removeChild), textAlign = textAlign.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], verticalPadding = verticalPadding.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], wantsKeyboardFocus = wantsKeyboardFocus.asInstanceOf[js.Any], waveHorizontalSapcing = waveHorizontalSapcing.asInstanceOf[js.Any], waveWidth = waveWidth.asInstanceOf[js.Any], waveformColor = waveformColor.asInstanceOf[js.Any], waveformUnavailableText = waveformUnavailableText.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Waveform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Waveform] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlwaysOnTop(value: Boolean): Self = StObject.set(x, "alwaysOnTop", value.asInstanceOf[js.Any])
    
    inline def setClickGrabsKeyboardFocus(value: Boolean): Self = StObject.set(x, "clickGrabsKeyboardFocus", value.asInstanceOf[js.Any])
    
    inline def setDragzone(value: PartialWaveformDragZone): Self = StObject.set(x, "dragzone", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setFitHeight(value: Boolean): Self = StObject.set(x, "fitHeight", value.asInstanceOf[js.Any])
    
    inline def setGradientCenterColor(value: String): Self = StObject.set(x, "gradientCenterColor", value.asInstanceOf[js.Any])
    
    inline def setGradientEndColor(value: String): Self = StObject.set(x, "gradientEndColor", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAxisColor(value: String): Self = StObject.set(x, "horizontalAxisColor", value.asInstanceOf[js.Any])
    
    inline def setInitialXOffset(value: Double): Self = StObject.set(x, "initialXOffset", value.asInstanceOf[js.Any])
    
    inline def setMarkers(value: PartialWaveformMarker): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
    
    inline def setPaintCenterLine(value: Boolean): Self = StObject.set(x, "paintCenterLine", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setVerticalPadding(value: Double): Self = StObject.set(x, "verticalPadding", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setWantsKeyboardFocus(value: Boolean): Self = StObject.set(x, "wantsKeyboardFocus", value.asInstanceOf[js.Any])
    
    inline def setWaveHorizontalSapcing(value: Double): Self = StObject.set(x, "waveHorizontalSapcing", value.asInstanceOf[js.Any])
    
    inline def setWaveWidth(value: Double): Self = StObject.set(x, "waveWidth", value.asInstanceOf[js.Any])
    
    inline def setWaveformColor(value: String): Self = StObject.set(x, "waveformColor", value.asInstanceOf[js.Any])
    
    inline def setWaveformUnavailableText(value: String): Self = StObject.set(x, "waveformUnavailableText", value.asInstanceOf[js.Any])
  }
}
