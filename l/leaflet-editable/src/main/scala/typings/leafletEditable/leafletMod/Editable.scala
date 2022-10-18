package typings.leafletEditable.leafletMod

import typings.leaflet.mod.CircleMarkerOptions
import typings.leaflet.mod.LatLng_
import typings.leaflet.mod.LeafletMouseEvent
import typings.leaflet.mod.MarkerOptions
import typings.leaflet.mod.PolylineOptions
import typings.leafletEditable.leafletMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Make geometries editable in Leaflet.
  *
  * This is not a plug and play UI, and will not. This is a minimal, lightweight, and fully extendable API to
  * control editing of geometries. So you can easily build your own UI with your own needs and choices.
  */
@js.native
trait Editable
  extends StObject
     with Evented {
  
  /**
    * When you need to commit any ongoing drawing, without needing to know which editor is active.
    */
  def commitDrawing(event: LeafletMouseEvent): Unit = js.native
  
  /**
    * Return true if any drawing action is ongoing.
    */
  def drawing(): Boolean = js.native
  
  /**
    * Options to pass to L.Editable when instanciating.
    */
  var options: EditableOptions = js.native
  
  /**
    * Start drawing a Circle. If `latlng` is given, the Circle anchor will be added. In any case, continuing
    * on user drag. If `options` is given, it will be passed to the Circle class constructor.
    */
  def startCircle(): Circle = js.native
  def startCircle(latLng: Unit, options: CircleMarkerOptions): Circle = js.native
  def startCircle(latLng: LatLng_): Circle = js.native
  def startCircle(latLng: LatLng_, options: CircleMarkerOptions): Circle = js.native
  
  /**
    * Start adding a marker. If latlng is given, the marker will be shown first at this point. In any case, it
    * will follow the user mouse, and will have a final latlng on next click (or touch). If options is given,
    * it will be passed to the marker class constructor.
    */
  def startMarker(): Marker = js.native
  def startMarker(latLng: Unit, options: MarkerOptions): Marker = js.native
  def startMarker(latLng: LatLng_): Marker = js.native
  def startMarker(latLng: LatLng_, options: MarkerOptions): Marker = js.native
  
  /**
    * Start drawing a polygon. If latlng is given, a first point will be added. In any case, continuing on user
    * click. If options is given, it will be passed to the polygon class constructor.
    */
  def startPolygon(): Polygon = js.native
  def startPolygon(latLng: Unit, options: PolylineOptions): Polygon = js.native
  def startPolygon(latLng: LatLng_): Polygon = js.native
  def startPolygon(latLng: LatLng_, options: PolylineOptions): Polygon = js.native
  
  /**
    * Start drawing a polyline. If latlng is given, a first point will be added. In any case, continuing on user
    * click. If options is given, it will be passed to the polyline class constructor.
    */
  def startPolyline(): Polyline = js.native
  def startPolyline(latLng: Unit, options: PolylineOptions): Polyline = js.native
  def startPolyline(latLng: LatLng_): Polyline = js.native
  def startPolyline(latLng: LatLng_, options: PolylineOptions): Polyline = js.native
  
  /**
    * Start drawing a Rectangle. If `latlng` is given, the Rectangle anchor will be added. In any case,
    * continuing on user drag. If `options` is given, it will be passed to the Rectangle class constructor.
    */
  def startRectangle(): Rectangle = js.native
  def startRectangle(latLng: Unit, options: PolylineOptions): Rectangle = js.native
  def startRectangle(latLng: LatLng_): Rectangle = js.native
  def startRectangle(latLng: LatLng_, options: PolylineOptions): Rectangle = js.native
  
  /**
    * When you need to stop any ongoing drawing, without needing to know which editor is active.
    */
  def stopDrawing(): Unit = js.native
}
object Editable {
  
  inline def apply: EditableStatic = ^.asInstanceOf[js.Dynamic].selectDynamic("Editable").asInstanceOf[EditableStatic]
}
