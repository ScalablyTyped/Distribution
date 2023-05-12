package typings.gorillaEngine.anon

import typings.gorillaEngine.GorillaEngine.UI.Modulation
import typings.gorillaEngine.gorillaEngineStrings.IBeam
import typings.gorillaEngine.gorillaEngineStrings.`bottom edge resize`
import typings.gorillaEngine.gorillaEngineStrings.`bottom left corner resize`
import typings.gorillaEngine.gorillaEngineStrings.`bottom right corner resize`
import typings.gorillaEngine.gorillaEngineStrings.`cross hair`
import typings.gorillaEngine.gorillaEngineStrings.`dragging hand`
import typings.gorillaEngine.gorillaEngineStrings.`left edge resize`
import typings.gorillaEngine.gorillaEngineStrings.`left right resize`
import typings.gorillaEngine.gorillaEngineStrings.`pointing hand`
import typings.gorillaEngine.gorillaEngineStrings.`right edge resize`
import typings.gorillaEngine.gorillaEngineStrings.`top edge resize`
import typings.gorillaEngine.gorillaEngineStrings.`top left corner resize`
import typings.gorillaEngine.gorillaEngineStrings.`top right corner resize`
import typings.gorillaEngine.gorillaEngineStrings.`up down left right resize`
import typings.gorillaEngine.gorillaEngineStrings.`up down resize`
import typings.gorillaEngine.gorillaEngineStrings.copying
import typings.gorillaEngine.gorillaEngineStrings.none
import typings.gorillaEngine.gorillaEngineStrings.normal
import typings.gorillaEngine.gorillaEngineStrings.wait
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<gorilla-engine.GorillaEngine.UI.SliceEditorProps> */
trait PartialSliceEditorProps extends StObject {
  
  var addMarker: js.UndefOr[js.Function1[/* marker */ Any, Unit]] = js.undefined
  
  var addModulation: js.UndefOr[js.Function1[/* modulation */ PartialModulation, Modulation]] = js.undefined
  
  var addSlice: js.UndefOr[js.Function1[/* slice */ Any, Unit]] = js.undefined
  
  var allowClicksOnChildren: js.UndefOr[Boolean] = js.undefined
  
  var alpha: js.UndefOr[Double] = js.undefined
  
  var alwaysOnTop: js.UndefOr[Boolean] = js.undefined
  
  var audioLengthInBeats: js.UndefOr[Double] = js.undefined
  
  var audioLengthInSamples: js.UndefOr[Double] = js.undefined
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var backgroundImage: js.UndefOr[String] = js.undefined
  
  var border: js.UndefOr[FocusColor] = js.undefined
  
  var canAddSlices: js.UndefOr[Boolean] = js.undefined
  
  var canChangeSlices: js.UndefOr[Boolean] = js.undefined
  
  var canRemoveSlices: js.UndefOr[Boolean] = js.undefined
  
  var clearSlices: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var clickGrabsKeyboardFocus: js.UndefOr[Boolean] = js.undefined
  
  var clickMask: js.UndefOr[String] = js.undefined
  
  var cornerRadius: js.UndefOr[Double] = js.undefined
  
  var doubleClickAction: js.UndefOr[String] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var getSlicesForZoneModule: js.UndefOr[js.Function0[js.Array[Any]]] = js.undefined
  
  var grid: js.UndefOr[Partialpositionstringheig] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var interceptsMouseClicks: js.UndefOr[Boolean] = js.undefined
  
  var mappedSampleChanged: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var minSliceSpacing: js.UndefOr[Double] = js.undefined
  
  var modifiedClickAction: js.UndefOr[String] = js.undefined
  
  var modulations: js.UndefOr[js.Array[Modulation]] = js.undefined
  
  var mouseCursorType: js.UndefOr[
    none | normal | wait | IBeam | (`cross hair`) | copying | (`pointing hand`) | (`dragging hand`) | (`left right resize`) | (`up down resize`) | (`up down left right resize`) | (`top edge resize`) | (`bottom edge resize`) | (`left edge resize`) | (`right edge resize`) | (`top left corner resize`) | (`top right corner resize`) | (`bottom left corner resize`) | (`bottom right corner resize`)
  ] = js.undefined
  
  var mouseEnterAction: js.UndefOr[String] = js.undefined
  
  var mouseExitAction: js.UndefOr[String] = js.undefined
  
  var removeSlice: js.UndefOr[js.Function1[/* slice */ Any, Unit]] = js.undefined
  
  var selectionAreaStyle: js.UndefOr[PartialbackgroundColorstr] = js.undefined
  
  var setZoom: js.UndefOr[js.Function2[/* start */ Double, /* end */ Double, Unit]] = js.undefined
  
  var sliceStyles: js.UndefOr[PartialnormalPartialSlice] = js.undefined
  
  var slices: js.UndefOr[Any] = js.undefined
  
  var snapSlicesToGrid: js.UndefOr[Boolean] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var wantsKeyboardFocus: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
  
  var zoom: js.UndefOr[End] = js.undefined
}
object PartialSliceEditorProps {
  
  inline def apply(): PartialSliceEditorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSliceEditorProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialSliceEditorProps] (val x: Self) extends AnyVal {
    
    inline def setAddMarker(value: /* marker */ Any => Unit): Self = StObject.set(x, "addMarker", js.Any.fromFunction1(value))
    
    inline def setAddMarkerUndefined: Self = StObject.set(x, "addMarker", js.undefined)
    
    inline def setAddModulation(value: /* modulation */ PartialModulation => Modulation): Self = StObject.set(x, "addModulation", js.Any.fromFunction1(value))
    
    inline def setAddModulationUndefined: Self = StObject.set(x, "addModulation", js.undefined)
    
    inline def setAddSlice(value: /* slice */ Any => Unit): Self = StObject.set(x, "addSlice", js.Any.fromFunction1(value))
    
    inline def setAddSliceUndefined: Self = StObject.set(x, "addSlice", js.undefined)
    
    inline def setAllowClicksOnChildren(value: Boolean): Self = StObject.set(x, "allowClicksOnChildren", value.asInstanceOf[js.Any])
    
    inline def setAllowClicksOnChildrenUndefined: Self = StObject.set(x, "allowClicksOnChildren", js.undefined)
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setAlwaysOnTop(value: Boolean): Self = StObject.set(x, "alwaysOnTop", value.asInstanceOf[js.Any])
    
    inline def setAlwaysOnTopUndefined: Self = StObject.set(x, "alwaysOnTop", js.undefined)
    
    inline def setAudioLengthInBeats(value: Double): Self = StObject.set(x, "audioLengthInBeats", value.asInstanceOf[js.Any])
    
    inline def setAudioLengthInBeatsUndefined: Self = StObject.set(x, "audioLengthInBeats", js.undefined)
    
    inline def setAudioLengthInSamples(value: Double): Self = StObject.set(x, "audioLengthInSamples", value.asInstanceOf[js.Any])
    
    inline def setAudioLengthInSamplesUndefined: Self = StObject.set(x, "audioLengthInSamples", js.undefined)
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBackgroundImage(value: String): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
    
    inline def setBackgroundImageUndefined: Self = StObject.set(x, "backgroundImage", js.undefined)
    
    inline def setBorder(value: FocusColor): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setCanAddSlices(value: Boolean): Self = StObject.set(x, "canAddSlices", value.asInstanceOf[js.Any])
    
    inline def setCanAddSlicesUndefined: Self = StObject.set(x, "canAddSlices", js.undefined)
    
    inline def setCanChangeSlices(value: Boolean): Self = StObject.set(x, "canChangeSlices", value.asInstanceOf[js.Any])
    
    inline def setCanChangeSlicesUndefined: Self = StObject.set(x, "canChangeSlices", js.undefined)
    
    inline def setCanRemoveSlices(value: Boolean): Self = StObject.set(x, "canRemoveSlices", value.asInstanceOf[js.Any])
    
    inline def setCanRemoveSlicesUndefined: Self = StObject.set(x, "canRemoveSlices", js.undefined)
    
    inline def setClearSlices(value: () => Unit): Self = StObject.set(x, "clearSlices", js.Any.fromFunction0(value))
    
    inline def setClearSlicesUndefined: Self = StObject.set(x, "clearSlices", js.undefined)
    
    inline def setClickGrabsKeyboardFocus(value: Boolean): Self = StObject.set(x, "clickGrabsKeyboardFocus", value.asInstanceOf[js.Any])
    
    inline def setClickGrabsKeyboardFocusUndefined: Self = StObject.set(x, "clickGrabsKeyboardFocus", js.undefined)
    
    inline def setClickMask(value: String): Self = StObject.set(x, "clickMask", value.asInstanceOf[js.Any])
    
    inline def setClickMaskUndefined: Self = StObject.set(x, "clickMask", js.undefined)
    
    inline def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
    
    inline def setDoubleClickAction(value: String): Self = StObject.set(x, "doubleClickAction", value.asInstanceOf[js.Any])
    
    inline def setDoubleClickActionUndefined: Self = StObject.set(x, "doubleClickAction", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setGetSlicesForZoneModule(value: () => js.Array[Any]): Self = StObject.set(x, "getSlicesForZoneModule", js.Any.fromFunction0(value))
    
    inline def setGetSlicesForZoneModuleUndefined: Self = StObject.set(x, "getSlicesForZoneModule", js.undefined)
    
    inline def setGrid(value: Partialpositionstringheig): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInterceptsMouseClicks(value: Boolean): Self = StObject.set(x, "interceptsMouseClicks", value.asInstanceOf[js.Any])
    
    inline def setInterceptsMouseClicksUndefined: Self = StObject.set(x, "interceptsMouseClicks", js.undefined)
    
    inline def setMappedSampleChanged(value: () => Unit): Self = StObject.set(x, "mappedSampleChanged", js.Any.fromFunction0(value))
    
    inline def setMappedSampleChangedUndefined: Self = StObject.set(x, "mappedSampleChanged", js.undefined)
    
    inline def setMinSliceSpacing(value: Double): Self = StObject.set(x, "minSliceSpacing", value.asInstanceOf[js.Any])
    
    inline def setMinSliceSpacingUndefined: Self = StObject.set(x, "minSliceSpacing", js.undefined)
    
    inline def setModifiedClickAction(value: String): Self = StObject.set(x, "modifiedClickAction", value.asInstanceOf[js.Any])
    
    inline def setModifiedClickActionUndefined: Self = StObject.set(x, "modifiedClickAction", js.undefined)
    
    inline def setModulations(value: js.Array[Modulation]): Self = StObject.set(x, "modulations", value.asInstanceOf[js.Any])
    
    inline def setModulationsUndefined: Self = StObject.set(x, "modulations", js.undefined)
    
    inline def setModulationsVarargs(value: Modulation*): Self = StObject.set(x, "modulations", js.Array(value*))
    
    inline def setMouseCursorType(
      value: none | normal | wait | IBeam | (`cross hair`) | copying | (`pointing hand`) | (`dragging hand`) | (`left right resize`) | (`up down resize`) | (`up down left right resize`) | (`top edge resize`) | (`bottom edge resize`) | (`left edge resize`) | (`right edge resize`) | (`top left corner resize`) | (`top right corner resize`) | (`bottom left corner resize`) | (`bottom right corner resize`)
    ): Self = StObject.set(x, "mouseCursorType", value.asInstanceOf[js.Any])
    
    inline def setMouseCursorTypeUndefined: Self = StObject.set(x, "mouseCursorType", js.undefined)
    
    inline def setMouseEnterAction(value: String): Self = StObject.set(x, "mouseEnterAction", value.asInstanceOf[js.Any])
    
    inline def setMouseEnterActionUndefined: Self = StObject.set(x, "mouseEnterAction", js.undefined)
    
    inline def setMouseExitAction(value: String): Self = StObject.set(x, "mouseExitAction", value.asInstanceOf[js.Any])
    
    inline def setMouseExitActionUndefined: Self = StObject.set(x, "mouseExitAction", js.undefined)
    
    inline def setRemoveSlice(value: /* slice */ Any => Unit): Self = StObject.set(x, "removeSlice", js.Any.fromFunction1(value))
    
    inline def setRemoveSliceUndefined: Self = StObject.set(x, "removeSlice", js.undefined)
    
    inline def setSelectionAreaStyle(value: PartialbackgroundColorstr): Self = StObject.set(x, "selectionAreaStyle", value.asInstanceOf[js.Any])
    
    inline def setSelectionAreaStyleUndefined: Self = StObject.set(x, "selectionAreaStyle", js.undefined)
    
    inline def setSetZoom(value: (/* start */ Double, /* end */ Double) => Unit): Self = StObject.set(x, "setZoom", js.Any.fromFunction2(value))
    
    inline def setSetZoomUndefined: Self = StObject.set(x, "setZoom", js.undefined)
    
    inline def setSliceStyles(value: PartialnormalPartialSlice): Self = StObject.set(x, "sliceStyles", value.asInstanceOf[js.Any])
    
    inline def setSliceStylesUndefined: Self = StObject.set(x, "sliceStyles", js.undefined)
    
    inline def setSlices(value: Any): Self = StObject.set(x, "slices", value.asInstanceOf[js.Any])
    
    inline def setSlicesUndefined: Self = StObject.set(x, "slices", js.undefined)
    
    inline def setSnapSlicesToGrid(value: Boolean): Self = StObject.set(x, "snapSlicesToGrid", value.asInstanceOf[js.Any])
    
    inline def setSnapSlicesToGridUndefined: Self = StObject.set(x, "snapSlicesToGrid", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWantsKeyboardFocus(value: Boolean): Self = StObject.set(x, "wantsKeyboardFocus", value.asInstanceOf[js.Any])
    
    inline def setWantsKeyboardFocusUndefined: Self = StObject.set(x, "wantsKeyboardFocus", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    inline def setZoom(value: End): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
