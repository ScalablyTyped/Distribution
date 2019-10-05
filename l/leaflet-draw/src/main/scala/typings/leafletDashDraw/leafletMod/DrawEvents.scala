package typings.leafletDashDraw.leafletMod

import typings.geojson.geojsonMod.LineString
import typings.geojson.geojsonMod.MultiLineString
import typings.leaflet.leafletMod.Circle
import typings.leaflet.leafletMod.CircleMarker
import typings.leaflet.leafletMod.Layer
import typings.leaflet.leafletMod.LayerGroup
import typings.leaflet.leafletMod.Marker
import typings.leaflet.leafletMod.Polygon
import typings.leaflet.leafletMod.Polyline
import typings.leaflet.leafletMod.Rectangle
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "DrawEvents")
@js.native
object DrawEvents extends js.Object {
  @js.native
  trait Created extends Event {
    /**
      * Layer that was just created.
      */
    var layer: Circle[_] | CircleMarker[_] | Marker[_] | Polygon[_] | (Polyline[LineString | MultiLineString, _]) | Rectangle[_] = js.native
    /**
      * The type of layer this is. One of: polyline, polygon, rectangle, circle, marker.
      */
    var layerType: String = js.native
  }
  
  @js.native
  trait DeleteStart extends Event {
    /**
      * The type of edit this is. One of: remove
      */
    var handler: String = js.native
  }
  
  @js.native
  trait DeleteStop extends Event {
    /**
      * The type of edit this is. One of: remove
      */
    var handler: String = js.native
  }
  
  /**
    * Triggered when layers have been removed (and saved) from the FeatureGroup.
    */
  @js.native
  trait Deleted extends Event {
    /**
      * List of all layers just removed from the map.
      */
    var layers: LayerGroup[_] = js.native
  }
  
  @js.native
  trait DrawStart extends Event {
    /**
      * The type of layer this is. One of: polyline, polygon, rectangle, circle, marker
      */
    var layerType: String = js.native
  }
  
  @js.native
  trait DrawStop extends Event {
    /**
      * The type of layer this is. One of: polyline, polygon, rectangle, circle, marker
      */
    var layerType: String = js.native
  }
  
  @js.native
  trait DrawVertex extends Event {
    /**
      * List of all layers just being added from the map.
      */
    var layers: LayerGroup[_] = js.native
  }
  
  @js.native
  trait EditMove extends Event {
    /**
      * Layer that was just moved.
      */
    var layer: Layer = js.native
  }
  
  @js.native
  trait EditResize extends Event {
    /**
      * Layer that was just resized.
      */
    var layer: Layer = js.native
  }
  
  @js.native
  trait EditStart extends Event {
    /**
      * The type of edit this is. One of: edit
      */
    var handler: String = js.native
  }
  
  @js.native
  trait EditStop extends Event {
    /**
      * The type of edit this is. One of: edit
      */
    var handler: String = js.native
  }
  
  @js.native
  trait EditVertex extends Event {
    /**
      * List of all layers just being edited from the map.
      */
    var layers: LayerGroup[_] = js.native
    var poly: (Polyline[LineString | MultiLineString, _]) | Polygon[_] = js.native
  }
  
  @js.native
  trait Edited extends Event {
    /**
      * List of all layers just edited on the map.
      */
    var layers: LayerGroup[_] = js.native
  }
  
  type MarkerContext = Event
  type ToolbarClosed = Event
  type ToolbarOpened = Event
}

