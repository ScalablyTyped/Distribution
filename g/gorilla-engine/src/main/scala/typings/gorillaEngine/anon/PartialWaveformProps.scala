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

/* Inlined std.Partial<gorilla-engine.GorillaEngine.UI.WaveformProps> */
trait PartialWaveformProps extends StObject {
  
  var allowClicksOnChildren: js.UndefOr[Boolean] = js.undefined
  
  var alpha: js.UndefOr[Double] = js.undefined
  
  var alwaysOnTop: js.UndefOr[Boolean] = js.undefined
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var backgroundImage: js.UndefOr[String] = js.undefined
  
  var border: js.UndefOr[FocusColor] = js.undefined
  
  var clickGrabsKeyboardFocus: js.UndefOr[Boolean] = js.undefined
  
  var clickMask: js.UndefOr[String] = js.undefined
  
  var cornerRadius: js.UndefOr[Double] = js.undefined
  
  var doubleClickAction: js.UndefOr[String] = js.undefined
  
  var dragzone: js.UndefOr[PartialWaveformDragZone] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var fitHeight: js.UndefOr[Boolean] = js.undefined
  
  var font: js.UndefOr[String] = js.undefined
  
  var fontKerning: js.UndefOr[Double] = js.undefined
  
  var fontSize: js.UndefOr[Double] = js.undefined
  
  var gradientCenterColor: js.UndefOr[String] = js.undefined
  
  var gradientEndColor: js.UndefOr[String] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var horizontalAxisColor: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var initialXOffset: js.UndefOr[Double] = js.undefined
  
  var interceptsMouseClicks: js.UndefOr[Boolean] = js.undefined
  
  var markers: js.UndefOr[PartialWaveformMarker] = js.undefined
  
  var modifiedClickAction: js.UndefOr[String] = js.undefined
  
  var mouseCursorType: js.UndefOr[
    none | normal | wait | IBeam | (`cross hair`) | copying | (`pointing hand`) | (`dragging hand`) | (`left right resize`) | (`up down resize`) | (`up down left right resize`) | (`top edge resize`) | (`bottom edge resize`) | (`left edge resize`) | (`right edge resize`) | (`top left corner resize`) | (`top right corner resize`) | (`bottom left corner resize`) | (`bottom right corner resize`)
  ] = js.undefined
  
  var mouseEnterAction: js.UndefOr[String] = js.undefined
  
  var mouseExitAction: js.UndefOr[String] = js.undefined
  
  var paintCenterLine: js.UndefOr[Boolean] = js.undefined
  
  var textAlign: js.UndefOr[
    (`centered left`) | (`centered right`) | left | right | center | (`top left`) | (`top right`) | (`top center`) | (`bottom left`) | (`bottom right`) | (`bottom center`)
  ] = js.undefined
  
  var textColor: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
  
  var verticalPadding: js.UndefOr[Double] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var wantsKeyboardFocus: js.UndefOr[Boolean] = js.undefined
  
  var waveHorizontalSapcing: js.UndefOr[Double] = js.undefined
  
  var waveWidth: js.UndefOr[Double] = js.undefined
  
  var waveformColor: js.UndefOr[String] = js.undefined
  
  var waveformUnavailableText: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
}
object PartialWaveformProps {
  
  inline def apply(): PartialWaveformProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialWaveformProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialWaveformProps] (val x: Self) extends AnyVal {
    
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
    
    inline def setClickGrabsKeyboardFocus(value: Boolean): Self = StObject.set(x, "clickGrabsKeyboardFocus", value.asInstanceOf[js.Any])
    
    inline def setClickGrabsKeyboardFocusUndefined: Self = StObject.set(x, "clickGrabsKeyboardFocus", js.undefined)
    
    inline def setClickMask(value: String): Self = StObject.set(x, "clickMask", value.asInstanceOf[js.Any])
    
    inline def setClickMaskUndefined: Self = StObject.set(x, "clickMask", js.undefined)
    
    inline def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
    
    inline def setDoubleClickAction(value: String): Self = StObject.set(x, "doubleClickAction", value.asInstanceOf[js.Any])
    
    inline def setDoubleClickActionUndefined: Self = StObject.set(x, "doubleClickAction", js.undefined)
    
    inline def setDragzone(value: PartialWaveformDragZone): Self = StObject.set(x, "dragzone", value.asInstanceOf[js.Any])
    
    inline def setDragzoneUndefined: Self = StObject.set(x, "dragzone", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFitHeight(value: Boolean): Self = StObject.set(x, "fitHeight", value.asInstanceOf[js.Any])
    
    inline def setFitHeightUndefined: Self = StObject.set(x, "fitHeight", js.undefined)
    
    inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontKerning(value: Double): Self = StObject.set(x, "fontKerning", value.asInstanceOf[js.Any])
    
    inline def setFontKerningUndefined: Self = StObject.set(x, "fontKerning", js.undefined)
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setGradientCenterColor(value: String): Self = StObject.set(x, "gradientCenterColor", value.asInstanceOf[js.Any])
    
    inline def setGradientCenterColorUndefined: Self = StObject.set(x, "gradientCenterColor", js.undefined)
    
    inline def setGradientEndColor(value: String): Self = StObject.set(x, "gradientEndColor", value.asInstanceOf[js.Any])
    
    inline def setGradientEndColorUndefined: Self = StObject.set(x, "gradientEndColor", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHorizontalAxisColor(value: String): Self = StObject.set(x, "horizontalAxisColor", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAxisColorUndefined: Self = StObject.set(x, "horizontalAxisColor", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInitialXOffset(value: Double): Self = StObject.set(x, "initialXOffset", value.asInstanceOf[js.Any])
    
    inline def setInitialXOffsetUndefined: Self = StObject.set(x, "initialXOffset", js.undefined)
    
    inline def setInterceptsMouseClicks(value: Boolean): Self = StObject.set(x, "interceptsMouseClicks", value.asInstanceOf[js.Any])
    
    inline def setInterceptsMouseClicksUndefined: Self = StObject.set(x, "interceptsMouseClicks", js.undefined)
    
    inline def setMarkers(value: PartialWaveformMarker): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
    
    inline def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
    
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
    
    inline def setPaintCenterLine(value: Boolean): Self = StObject.set(x, "paintCenterLine", value.asInstanceOf[js.Any])
    
    inline def setPaintCenterLineUndefined: Self = StObject.set(x, "paintCenterLine", js.undefined)
    
    inline def setTextAlign(
      value: (`centered left`) | (`centered right`) | left | right | center | (`top left`) | (`top right`) | (`top center`) | (`bottom left`) | (`bottom right`) | (`bottom center`)
    ): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVerticalPadding(value: Double): Self = StObject.set(x, "verticalPadding", value.asInstanceOf[js.Any])
    
    inline def setVerticalPaddingUndefined: Self = StObject.set(x, "verticalPadding", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWantsKeyboardFocus(value: Boolean): Self = StObject.set(x, "wantsKeyboardFocus", value.asInstanceOf[js.Any])
    
    inline def setWantsKeyboardFocusUndefined: Self = StObject.set(x, "wantsKeyboardFocus", js.undefined)
    
    inline def setWaveHorizontalSapcing(value: Double): Self = StObject.set(x, "waveHorizontalSapcing", value.asInstanceOf[js.Any])
    
    inline def setWaveHorizontalSapcingUndefined: Self = StObject.set(x, "waveHorizontalSapcing", js.undefined)
    
    inline def setWaveWidth(value: Double): Self = StObject.set(x, "waveWidth", value.asInstanceOf[js.Any])
    
    inline def setWaveWidthUndefined: Self = StObject.set(x, "waveWidth", js.undefined)
    
    inline def setWaveformColor(value: String): Self = StObject.set(x, "waveformColor", value.asInstanceOf[js.Any])
    
    inline def setWaveformColorUndefined: Self = StObject.set(x, "waveformColor", js.undefined)
    
    inline def setWaveformUnavailableText(value: String): Self = StObject.set(x, "waveformUnavailableText", value.asInstanceOf[js.Any])
    
    inline def setWaveformUnavailableTextUndefined: Self = StObject.set(x, "waveformUnavailableText", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
