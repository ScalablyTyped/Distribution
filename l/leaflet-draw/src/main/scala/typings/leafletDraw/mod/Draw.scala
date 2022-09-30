package typings.leafletDraw.mod

import org.scalablytyped.runtime.StringDictionary
import typings.leaflet.mod.Class
import typings.leaflet.mod.Handler
import typings.leaflet.mod.LatLng_
import typings.leaflet.mod.Map_
import typings.leafletDraw.anon.Subtext
import typings.leafletDraw.leafletDrawStrings.drawColoncreated
import typings.leafletDraw.leafletDrawStrings.drawColondeleted
import typings.leafletDraw.leafletDrawStrings.drawColondeletestart
import typings.leafletDraw.leafletDrawStrings.drawColondeletestop
import typings.leafletDraw.leafletDrawStrings.drawColondrawstart
import typings.leafletDraw.leafletDrawStrings.drawColondrawstop
import typings.leafletDraw.leafletDrawStrings.drawColondrawvertex
import typings.leafletDraw.leafletDrawStrings.drawColonedited
import typings.leafletDraw.leafletDrawStrings.drawColoneditmove
import typings.leafletDraw.leafletDrawStrings.drawColoneditresize
import typings.leafletDraw.leafletDrawStrings.drawColoneditstart
import typings.leafletDraw.leafletDrawStrings.drawColoneditstop
import typings.leafletDraw.leafletDrawStrings.drawColoneditvertex
import typings.leafletDraw.leafletDrawStrings.drawColonmarkercontext
import typings.leafletDraw.leafletDrawStrings.drawColontoolbarclosed
import typings.leafletDraw.leafletDrawStrings.drawColontoolbaropened
import typings.leafletDraw.mod.DrawOptions.CircleOptions
import typings.leafletDraw.mod.DrawOptions.EditHandlerOptions
import typings.leafletDraw.mod.DrawOptions.MarkerOptions
import typings.leafletDraw.mod.DrawOptions.PolygonOptions
import typings.leafletDraw.mod.DrawOptions.PolylineOptions
import typings.leafletDraw.mod.DrawOptions.RectangleOptions
import typings.leafletDraw.mod.DrawOptions.SimpleShapeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Draw {
  
  @JSImport("leaflet", "Draw.Circle")
  @js.native
  open class Circle protected () extends SimpleShape {
    def this(map: DrawMap) = this()
    def this(map: DrawMap, options: CircleOptions) = this()
  }
  
  @JSImport("leaflet", "Draw.CircleMarker")
  @js.native
  open class CircleMarker protected () extends Marker {
    def this(map: DrawMap) = this()
    def this(map: DrawMap, options: MarkerOptions) = this()
  }
  
  object Event {
    
    @JSImport("leaflet", "Draw.Event.CREATED")
    @js.native
    val CREATED: drawColoncreated = js.native
    
    @JSImport("leaflet", "Draw.Event.DELETED")
    @js.native
    val DELETED: drawColondeleted = js.native
    
    @JSImport("leaflet", "Draw.Event.DELETESTART")
    @js.native
    val DELETESTART: drawColondeletestart = js.native
    
    @JSImport("leaflet", "Draw.Event.DELETESTOP")
    @js.native
    val DELETESTOP: drawColondeletestop = js.native
    
    @JSImport("leaflet", "Draw.Event.DRAWSTART")
    @js.native
    val DRAWSTART: drawColondrawstart = js.native
    
    @JSImport("leaflet", "Draw.Event.DRAWSTOP")
    @js.native
    val DRAWSTOP: drawColondrawstop = js.native
    
    @JSImport("leaflet", "Draw.Event.DRAWVERTEX")
    @js.native
    val DRAWVERTEX: drawColondrawvertex = js.native
    
    @JSImport("leaflet", "Draw.Event.EDITED")
    @js.native
    val EDITED: drawColonedited = js.native
    
    @JSImport("leaflet", "Draw.Event.EDITMOVE")
    @js.native
    val EDITMOVE: drawColoneditmove = js.native
    
    @JSImport("leaflet", "Draw.Event.EDITRESIZE")
    @js.native
    val EDITRESIZE: drawColoneditresize = js.native
    
    @JSImport("leaflet", "Draw.Event.EDITSTART")
    @js.native
    val EDITSTART: drawColoneditstart = js.native
    
    @JSImport("leaflet", "Draw.Event.EDITSTOP")
    @js.native
    val EDITSTOP: drawColoneditstop = js.native
    
    @JSImport("leaflet", "Draw.Event.EDITVERTEX")
    @js.native
    val EDITVERTEX: drawColoneditvertex = js.native
    
    @JSImport("leaflet", "Draw.Event.MARKERCONTEXT")
    @js.native
    val MARKERCONTEXT: drawColonmarkercontext = js.native
    
    @JSImport("leaflet", "Draw.Event.TOOLBARCLOSED")
    @js.native
    val TOOLBARCLOSED: drawColontoolbarclosed = js.native
    
    @JSImport("leaflet", "Draw.Event.TOOLBAROPENED")
    @js.native
    val TOOLBAROPENED: drawColontoolbaropened = js.native
  }
  
  @JSImport("leaflet", "Draw.Feature")
  @js.native
  open class Feature protected () extends Handler {
    def this(map: Map_) = this()
    
    def initialize(map: DrawMap, options: EditHandlerOptions): Unit = js.native
    def initialize(map: DrawMap, options: MarkerOptions): Unit = js.native
    def initialize(map: DrawMap, options: PolygonOptions): Unit = js.native
    def initialize(map: DrawMap, options: PolylineOptions): Unit = js.native
    def initialize(map: DrawMap, options: RectangleOptions): Unit = js.native
    
    def setOptions(options: EditHandlerOptions): Unit = js.native
    def setOptions(options: MarkerOptions): Unit = js.native
    def setOptions(options: PolygonOptions): Unit = js.native
    def setOptions(options: PolylineOptions): Unit = js.native
    def setOptions(options: RectangleOptions): Unit = js.native
  }
  
  @JSImport("leaflet", "Draw.Marker")
  @js.native
  open class Marker protected () extends Feature {
    def this(map: DrawMap) = this()
    def this(map: DrawMap, options: MarkerOptions) = this()
  }
  
  @JSImport("leaflet", "Draw.Polygon")
  @js.native
  open class Polygon protected () extends Polyline {
    def this(map: DrawMap) = this()
    def this(map: DrawMap, options: PolygonOptions) = this()
  }
  
  @JSImport("leaflet", "Draw.Polyline")
  @js.native
  open class Polyline protected () extends Feature {
    def this(map: DrawMap) = this()
    def this(map: DrawMap, options: PolylineOptions) = this()
    
    def addVertex(latlng: LatLng_): Unit = js.native
    
    def completeShape(): Unit = js.native
    
    def deleteLastVertex(): Unit = js.native
  }
  
  @JSImport("leaflet", "Draw.Rectangle")
  @js.native
  open class Rectangle protected () extends SimpleShape {
    def this(map: DrawMap) = this()
    def this(map: DrawMap, options: RectangleOptions) = this()
  }
  
  @JSImport("leaflet", "Draw.SimpleShape")
  @js.native
  open class SimpleShape protected () extends Feature {
    def this(map: DrawMap) = this()
    def this(map: DrawMap, options: SimpleShapeOptions) = this()
  }
  
  @JSImport("leaflet", "Draw.Tooltip")
  @js.native
  open class Tooltip protected () extends Class {
    def this(map: DrawMap) = this()
    
    def dispose(): Unit = js.native
    
    def removeError(): Tooltip = js.native
    
    def showAsError(): Tooltip = js.native
    
    def updateContent(): Tooltip = js.native
    def updateContent(labelText: Subtext): Tooltip = js.native
    
    def updatePosition(latlng: LatLng_): Tooltip = js.native
  }
  
  /**
    * EventHandlers to be used in looping over all events
    *
    * @example
    * for (const key in eventHandlers) { map.off(eventHandlers[key], LeafletFn); }
    */
  trait EventHandlers
    extends StObject
       with // Requires an index signature of type string to be properly useful
  /* key */ StringDictionary[String] {
    
    var onCreated: drawColoncreated
    
    var onDeleteStart: drawColondeletestart
    
    var onDeleteStop: drawColondeletestop
    
    var onDeleted: drawColondeleted
    
    var onDrawStart: drawColondrawstart
    
    var onDrawStop: drawColondrawstop
    
    var onDrawVertex: drawColondrawvertex
    
    var onEditMove: drawColoneditmove
    
    var onEditResize: drawColoneditresize
    
    var onEditStart: drawColoneditstart
    
    var onEditStop: drawColoneditstop
    
    var onEditVertex: drawColoneditvertex
    
    var onEdited: drawColonedited
    
    var onMarkerContext: drawColonmarkercontext
    
    var onToolbarClosed: drawColontoolbarclosed
    
    var onToolbarOpened: drawColontoolbaropened
  }
  object EventHandlers {
    
    inline def apply(): EventHandlers = {
      val __obj = js.Dynamic.literal(onCreated = "draw:created", onDeleteStart = "draw:deletestart", onDeleteStop = "draw:deletestop", onDeleted = "draw:deleted", onDrawStart = "draw:drawstart", onDrawStop = "draw:drawstop", onDrawVertex = "draw:drawvertex", onEditMove = "draw:editmove", onEditResize = "draw:editresize", onEditStart = "draw:editstart", onEditStop = "draw:editstop", onEditVertex = "draw:editvertex", onEdited = "draw:edited", onMarkerContext = "draw:markercontext", onToolbarClosed = "draw:toolbarclosed", onToolbarOpened = "draw:toolbaropened")
      __obj.asInstanceOf[EventHandlers]
    }
    
    extension [Self <: EventHandlers](x: Self) {
      
      inline def setOnCreated(value: drawColoncreated): Self = StObject.set(x, "onCreated", value.asInstanceOf[js.Any])
      
      inline def setOnDeleteStart(value: drawColondeletestart): Self = StObject.set(x, "onDeleteStart", value.asInstanceOf[js.Any])
      
      inline def setOnDeleteStop(value: drawColondeletestop): Self = StObject.set(x, "onDeleteStop", value.asInstanceOf[js.Any])
      
      inline def setOnDeleted(value: drawColondeleted): Self = StObject.set(x, "onDeleted", value.asInstanceOf[js.Any])
      
      inline def setOnDrawStart(value: drawColondrawstart): Self = StObject.set(x, "onDrawStart", value.asInstanceOf[js.Any])
      
      inline def setOnDrawStop(value: drawColondrawstop): Self = StObject.set(x, "onDrawStop", value.asInstanceOf[js.Any])
      
      inline def setOnDrawVertex(value: drawColondrawvertex): Self = StObject.set(x, "onDrawVertex", value.asInstanceOf[js.Any])
      
      inline def setOnEditMove(value: drawColoneditmove): Self = StObject.set(x, "onEditMove", value.asInstanceOf[js.Any])
      
      inline def setOnEditResize(value: drawColoneditresize): Self = StObject.set(x, "onEditResize", value.asInstanceOf[js.Any])
      
      inline def setOnEditStart(value: drawColoneditstart): Self = StObject.set(x, "onEditStart", value.asInstanceOf[js.Any])
      
      inline def setOnEditStop(value: drawColoneditstop): Self = StObject.set(x, "onEditStop", value.asInstanceOf[js.Any])
      
      inline def setOnEditVertex(value: drawColoneditvertex): Self = StObject.set(x, "onEditVertex", value.asInstanceOf[js.Any])
      
      inline def setOnEdited(value: drawColonedited): Self = StObject.set(x, "onEdited", value.asInstanceOf[js.Any])
      
      inline def setOnMarkerContext(value: drawColonmarkercontext): Self = StObject.set(x, "onMarkerContext", value.asInstanceOf[js.Any])
      
      inline def setOnToolbarClosed(value: drawColontoolbarclosed): Self = StObject.set(x, "onToolbarClosed", value.asInstanceOf[js.Any])
      
      inline def setOnToolbarOpened(value: drawColontoolbaropened): Self = StObject.set(x, "onToolbarOpened", value.asInstanceOf[js.Any])
    }
  }
}
