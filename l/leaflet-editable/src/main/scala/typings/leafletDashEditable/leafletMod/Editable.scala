package typings.leafletDashEditable.leafletMod

import typings.geojson.geojsonMod.LineString
import typings.geojson.geojsonMod.MultiLineString
import typings.leaflet.leafletMod.LatLng
import typings.leaflet.leafletMod.MarkerOptions
import typings.leaflet.leafletMod.PolylineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Make geometries editable in Leaflet.
  *
  * This is not a plug and play UI, and will not. This is a minimal, lightweight, and fully extendable API to
  * control editing of geometries. So you can easily build your own UI with your own needs and choices.
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @js.native
trait Editable extends js.Object {
  var currentPolygon: (typings.leaflet.leafletMod.Polyline[LineString | MultiLineString, _]) | typings.leaflet.leafletMod.Polygon[_] | typings.leaflet.leafletMod.Marker[_] = js.native
  /**
    * Options to pass to L.Editable when instanciating.
    */
  var options: EditOptions = js.native
  /**
    * When you need to commit any ongoing drawing, without needing to know which editor is active.
    */
  def commitDrawing(): Unit = js.native
  /**
    * Start adding a marker. If latlng is given, the marker will be shown first at this point. In any case, it
    * will follow the user mouse, and will have a final latlng on next click (or touch). If options is given,
    * it will be passed to the marker class constructor.
    */
  def startMarker(): typings.leaflet.leafletMod.Marker[_] = js.native
  def startMarker(latLng: LatLng): typings.leaflet.leafletMod.Marker[_] = js.native
  def startMarker(latLng: LatLng, options: MarkerOptions): typings.leaflet.leafletMod.Marker[_] = js.native
  /**
    * Start drawing a polygon. If latlng is given, a first point will be added. In any case, continuing on user
    * click. If options is given, it will be passed to the polygon class constructor.
    */
  def startPolygon(): typings.leaflet.leafletMod.Polygon[_] = js.native
  def startPolygon(latLng: LatLng): typings.leaflet.leafletMod.Polygon[_] = js.native
  def startPolygon(latLng: LatLng, options: PolylineOptions): typings.leaflet.leafletMod.Polygon[_] = js.native
  /**
    * Start drawing a polyline. If latlng is given, a first point will be added. In any case, continuing on user
    * click. If options is given, it will be passed to the polyline class constructor.
    */
  def startPolyline(): typings.leaflet.leafletMod.Polyline[LineString | MultiLineString, _] = js.native
  def startPolyline(latLng: LatLng): typings.leaflet.leafletMod.Polyline[LineString | MultiLineString, _] = js.native
  def startPolyline(latLng: LatLng, options: PolylineOptions): typings.leaflet.leafletMod.Polyline[LineString | MultiLineString, _] = js.native
  /**
    * When you need to stop any ongoing drawing, without needing to know which editor is active.
    */
  def stopDrawing(): Unit = js.native
}

