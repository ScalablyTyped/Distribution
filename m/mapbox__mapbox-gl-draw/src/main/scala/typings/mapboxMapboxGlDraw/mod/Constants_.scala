package typings.mapboxMapboxGlDraw.mod

import typings.mapboxMapboxGlDraw.anon.ACTIONABLE
import typings.mapboxMapboxGlDraw.anon.ACTIVE
import typings.mapboxMapboxGlDraw.anon.ACTIVEBUTTON
import typings.mapboxMapboxGlDraw.anon.ADD
import typings.mapboxMapboxGlDraw.anon.CHANGECOORDINATES
import typings.mapboxMapboxGlDraw.anon.COLD
import typings.mapboxMapboxGlDraw.anon.DIRECTSELECT
import typings.mapboxMapboxGlDraw.anon.FEATURE
import typings.mapboxMapboxGlDraw.anon.LINE
import typings.mapboxMapboxGlDraw.anon.MIDPOINT
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawInts.`-270`
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawInts.`-85`
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawInts.`-90`
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawInts.`270`
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawInts.`85`
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawInts.`90`
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.boxZoom
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.doubleClickZoom
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.dragPan
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.dragRotate
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.keyboard
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.scrollZoom
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.touchZoomRotate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Constants_ extends StObject {
  
  val LAT_MAX: `90`
  
  val LAT_MIN: `-90`
  
  val LAT_RENDERED_MAX: `85`
  
  val LAT_RENDERED_MIN: `-85`
  
  val LNG_MAX: `270`
  
  val LNG_MIN: `-270`
  
  val activeStates: ACTIVE
  
  val classes: ACTIVEBUTTON
  
  val cursors: ADD
  
  val events: ACTIONABLE
  
  val geojsonTypes: FEATURE
  
  val interactions: js.Tuple7[scrollZoom, boxZoom, dragRotate, dragPan, keyboard, doubleClickZoom, touchZoomRotate]
  
  val meta: MIDPOINT
  
  val modes: DIRECTSELECT
  
  val sources: COLD
  
  val types: LINE
  
  val updateActions: CHANGECOORDINATES
}
object Constants_ {
  
  inline def apply(
    activeStates: ACTIVE,
    classes: ACTIVEBUTTON,
    cursors: ADD,
    events: ACTIONABLE,
    geojsonTypes: FEATURE,
    interactions: js.Tuple7[scrollZoom, boxZoom, dragRotate, dragPan, keyboard, doubleClickZoom, touchZoomRotate],
    meta: MIDPOINT,
    modes: DIRECTSELECT,
    sources: COLD,
    types: LINE,
    updateActions: CHANGECOORDINATES
  ): Constants_ = {
    val __obj = js.Dynamic.literal(LAT_MAX = 90, LAT_MIN = -90, LAT_RENDERED_MAX = 85, LAT_RENDERED_MIN = -85, LNG_MAX = 270, LNG_MIN = -270, activeStates = activeStates.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], cursors = cursors.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], geojsonTypes = geojsonTypes.asInstanceOf[js.Any], interactions = interactions.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], modes = modes.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any], updateActions = updateActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Constants_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Constants_] (val x: Self) extends AnyVal {
    
    inline def setActiveStates(value: ACTIVE): Self = StObject.set(x, "activeStates", value.asInstanceOf[js.Any])
    
    inline def setClasses(value: ACTIVEBUTTON): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setCursors(value: ADD): Self = StObject.set(x, "cursors", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: ACTIONABLE): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setGeojsonTypes(value: FEATURE): Self = StObject.set(x, "geojsonTypes", value.asInstanceOf[js.Any])
    
    inline def setInteractions(
      value: js.Tuple7[scrollZoom, boxZoom, dragRotate, dragPan, keyboard, doubleClickZoom, touchZoomRotate]
    ): Self = StObject.set(x, "interactions", value.asInstanceOf[js.Any])
    
    inline def setLAT_MAX(value: `90`): Self = StObject.set(x, "LAT_MAX", value.asInstanceOf[js.Any])
    
    inline def setLAT_MIN(value: `-90`): Self = StObject.set(x, "LAT_MIN", value.asInstanceOf[js.Any])
    
    inline def setLAT_RENDERED_MAX(value: `85`): Self = StObject.set(x, "LAT_RENDERED_MAX", value.asInstanceOf[js.Any])
    
    inline def setLAT_RENDERED_MIN(value: `-85`): Self = StObject.set(x, "LAT_RENDERED_MIN", value.asInstanceOf[js.Any])
    
    inline def setLNG_MAX(value: `270`): Self = StObject.set(x, "LNG_MAX", value.asInstanceOf[js.Any])
    
    inline def setLNG_MIN(value: `-270`): Self = StObject.set(x, "LNG_MIN", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: MIDPOINT): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setModes(value: DIRECTSELECT): Self = StObject.set(x, "modes", value.asInstanceOf[js.Any])
    
    inline def setSources(value: COLD): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: LINE): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setUpdateActions(value: CHANGECOORDINATES): Self = StObject.set(x, "updateActions", value.asInstanceOf[js.Any])
  }
}
