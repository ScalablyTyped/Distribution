package typings.gorillaEngine.GorillaEngine.UI

import typings.gorillaEngine.anon.End
import typings.gorillaEngine.anon.FocusColor
import typings.gorillaEngine.anon.PartialModulation
import typings.gorillaEngine.anon.PartialbackgroundColorstr
import typings.gorillaEngine.anon.PartialnormalPartialSlice
import typings.gorillaEngine.anon.Partialpositionstringheig
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

trait SliceEditorProps
  extends StObject
     with Common
     with Bounds
     with Background
     with Clickable {
  
  def addMarker(marker: Any): Unit
  
  def addModulation(modulation: PartialModulation): Modulation
  
  def addSlice(slice: Any): Unit
  
  var audioLengthInBeats: Double
  
  var audioLengthInSamples: Double
  
  var canAddSlices: Boolean
  
  var canChangeSlices: Boolean
  
  var canRemoveSlices: Boolean
  
  def clearSlices(): Unit
  
  def getSlicesForZoneModule(): js.Array[Any]
  
  var grid: Partialpositionstringheig
  
  def mappedSampleChanged(): Unit
  
  var minSliceSpacing: Double
  
  var modulations: js.Array[Modulation]
  
  def removeSlice(slice: Any): Unit
  
  var selectionAreaStyle: PartialbackgroundColorstr
  
  def setZoom(start: Double, end: Double): Unit
  
  var sliceStyles: PartialnormalPartialSlice
  
  var slices: Any
  
  var snapSlicesToGrid: Boolean
  
  var zoom: End
}
object SliceEditorProps {
  
  inline def apply(
    addMarker: Any => Unit,
    addModulation: PartialModulation => Modulation,
    addSlice: Any => Unit,
    allowClicksOnChildren: Boolean,
    alpha: Double,
    alwaysOnTop: Boolean,
    audioLengthInBeats: Double,
    audioLengthInSamples: Double,
    backgroundColor: String,
    backgroundImage: String,
    border: FocusColor,
    canAddSlices: Boolean,
    canChangeSlices: Boolean,
    canRemoveSlices: Boolean,
    clearSlices: () => Unit,
    clickGrabsKeyboardFocus: Boolean,
    clickMask: String,
    cornerRadius: Double,
    doubleClickAction: String,
    enabled: Boolean,
    getSlicesForZoneModule: () => js.Array[Any],
    grid: Partialpositionstringheig,
    height: Double,
    id: String,
    interceptsMouseClicks: Boolean,
    mappedSampleChanged: () => Unit,
    minSliceSpacing: Double,
    modifiedClickAction: String,
    modulations: js.Array[Modulation],
    mouseCursorType: none | normal | wait | IBeam | (`cross hair`) | copying | (`pointing hand`) | (`dragging hand`) | (`left right resize`) | (`up down resize`) | (`up down left right resize`) | (`top edge resize`) | (`bottom edge resize`) | (`left edge resize`) | (`right edge resize`) | (`top left corner resize`) | (`top right corner resize`) | (`bottom left corner resize`) | (`bottom right corner resize`),
    mouseEnterAction: String,
    mouseExitAction: String,
    removeSlice: Any => Unit,
    selectionAreaStyle: PartialbackgroundColorstr,
    setZoom: (Double, Double) => Unit,
    sliceStyles: PartialnormalPartialSlice,
    slices: Any,
    snapSlicesToGrid: Boolean,
    visible: Boolean,
    wantsKeyboardFocus: Boolean,
    width: Double,
    x: Double,
    y: Double,
    zoom: End
  ): SliceEditorProps = {
    val __obj = js.Dynamic.literal(addMarker = js.Any.fromFunction1(addMarker), addModulation = js.Any.fromFunction1(addModulation), addSlice = js.Any.fromFunction1(addSlice), allowClicksOnChildren = allowClicksOnChildren.asInstanceOf[js.Any], alpha = alpha.asInstanceOf[js.Any], alwaysOnTop = alwaysOnTop.asInstanceOf[js.Any], audioLengthInBeats = audioLengthInBeats.asInstanceOf[js.Any], audioLengthInSamples = audioLengthInSamples.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], backgroundImage = backgroundImage.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], canAddSlices = canAddSlices.asInstanceOf[js.Any], canChangeSlices = canChangeSlices.asInstanceOf[js.Any], canRemoveSlices = canRemoveSlices.asInstanceOf[js.Any], clearSlices = js.Any.fromFunction0(clearSlices), clickGrabsKeyboardFocus = clickGrabsKeyboardFocus.asInstanceOf[js.Any], clickMask = clickMask.asInstanceOf[js.Any], cornerRadius = cornerRadius.asInstanceOf[js.Any], doubleClickAction = doubleClickAction.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], getSlicesForZoneModule = js.Any.fromFunction0(getSlicesForZoneModule), grid = grid.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], interceptsMouseClicks = interceptsMouseClicks.asInstanceOf[js.Any], mappedSampleChanged = js.Any.fromFunction0(mappedSampleChanged), minSliceSpacing = minSliceSpacing.asInstanceOf[js.Any], modifiedClickAction = modifiedClickAction.asInstanceOf[js.Any], modulations = modulations.asInstanceOf[js.Any], mouseCursorType = mouseCursorType.asInstanceOf[js.Any], mouseEnterAction = mouseEnterAction.asInstanceOf[js.Any], mouseExitAction = mouseExitAction.asInstanceOf[js.Any], removeSlice = js.Any.fromFunction1(removeSlice), selectionAreaStyle = selectionAreaStyle.asInstanceOf[js.Any], setZoom = js.Any.fromFunction2(setZoom), sliceStyles = sliceStyles.asInstanceOf[js.Any], slices = slices.asInstanceOf[js.Any], snapSlicesToGrid = snapSlicesToGrid.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], wantsKeyboardFocus = wantsKeyboardFocus.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliceEditorProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SliceEditorProps] (val x: Self) extends AnyVal {
    
    inline def setAddMarker(value: Any => Unit): Self = StObject.set(x, "addMarker", js.Any.fromFunction1(value))
    
    inline def setAddModulation(value: PartialModulation => Modulation): Self = StObject.set(x, "addModulation", js.Any.fromFunction1(value))
    
    inline def setAddSlice(value: Any => Unit): Self = StObject.set(x, "addSlice", js.Any.fromFunction1(value))
    
    inline def setAudioLengthInBeats(value: Double): Self = StObject.set(x, "audioLengthInBeats", value.asInstanceOf[js.Any])
    
    inline def setAudioLengthInSamples(value: Double): Self = StObject.set(x, "audioLengthInSamples", value.asInstanceOf[js.Any])
    
    inline def setCanAddSlices(value: Boolean): Self = StObject.set(x, "canAddSlices", value.asInstanceOf[js.Any])
    
    inline def setCanChangeSlices(value: Boolean): Self = StObject.set(x, "canChangeSlices", value.asInstanceOf[js.Any])
    
    inline def setCanRemoveSlices(value: Boolean): Self = StObject.set(x, "canRemoveSlices", value.asInstanceOf[js.Any])
    
    inline def setClearSlices(value: () => Unit): Self = StObject.set(x, "clearSlices", js.Any.fromFunction0(value))
    
    inline def setGetSlicesForZoneModule(value: () => js.Array[Any]): Self = StObject.set(x, "getSlicesForZoneModule", js.Any.fromFunction0(value))
    
    inline def setGrid(value: Partialpositionstringheig): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setMappedSampleChanged(value: () => Unit): Self = StObject.set(x, "mappedSampleChanged", js.Any.fromFunction0(value))
    
    inline def setMinSliceSpacing(value: Double): Self = StObject.set(x, "minSliceSpacing", value.asInstanceOf[js.Any])
    
    inline def setModulations(value: js.Array[Modulation]): Self = StObject.set(x, "modulations", value.asInstanceOf[js.Any])
    
    inline def setModulationsVarargs(value: Modulation*): Self = StObject.set(x, "modulations", js.Array(value*))
    
    inline def setRemoveSlice(value: Any => Unit): Self = StObject.set(x, "removeSlice", js.Any.fromFunction1(value))
    
    inline def setSelectionAreaStyle(value: PartialbackgroundColorstr): Self = StObject.set(x, "selectionAreaStyle", value.asInstanceOf[js.Any])
    
    inline def setSetZoom(value: (Double, Double) => Unit): Self = StObject.set(x, "setZoom", js.Any.fromFunction2(value))
    
    inline def setSliceStyles(value: PartialnormalPartialSlice): Self = StObject.set(x, "sliceStyles", value.asInstanceOf[js.Any])
    
    inline def setSlices(value: Any): Self = StObject.set(x, "slices", value.asInstanceOf[js.Any])
    
    inline def setSnapSlicesToGrid(value: Boolean): Self = StObject.set(x, "snapSlicesToGrid", value.asInstanceOf[js.Any])
    
    inline def setZoom(value: End): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
