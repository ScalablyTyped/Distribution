package typings.googlemaps.google.maps

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapHandlerMap[T /* <: Map[Element] */] extends StObject {
  
  /**
    * This event is fired when the viewport bounds have changed.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.bounds_changed Maps JavaScript API}
    * @see {@link Map#getBounds}
    * @see {@link Map#fitBounds}
    * @see {@link Map#panToBounds}
    */
  def bounds_changed(): Unit = js.native
  
  /**
    * This event is fired when the map center property changes.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.center_changed Maps JavaScript API}
    * @see {@link MapOptions#center}
    * @see {@link Map#getCenter}
    * @see {@link Map#setCenter}
    */
  def center_changed(): Unit = js.native
  
  def click(event: IconMouseEvent): Unit = js.native
  /**
    * This event is fired when the user clicks on the map.
    * An ApiMouseEvent with properties for the clicked location is returned unless a place icon was clicked, in which case an IconMouseEvent with a placeid is returned.
    * IconMouseEvent and ApiMouseEvent are identical, except that IconMouseEvent has the placeid field.
    * The event can always be treated as an ApiMouseEvent when the placeid is not important.
    * The click event is not fired if a marker or infowindow was clicked.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.click Maps JavaScript API}
    */
  def click(event: MouseEvent): Unit = js.native
  
  /**
    * This event is fired when the user double-clicks on the map. Note that the click event will also fire, right before this one.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.dblclick Maps JavaScript API}
    */
  def dblclick(event: MouseEvent): Unit = js.native
  
  /**
    * This event is repeatedly fired while the user drags the map.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.drag Maps JavaScript API}
    */
  def drag(): Unit = js.native
  
  /**
    * This event is fired when the user stops dragging the map.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.dragend Maps JavaScript API}
    */
  def dragend(): Unit = js.native
  
  /**
    * This event is fired when the user starts dragging the map.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.dragstart Maps JavaScript API}
    */
  def dragstart(): Unit = js.native
  
  /**
    * This event is fired when the map heading property changes.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.heading_changed Maps JavaScript API}
    * @see {@link MapOptions#heading}
    * @see {@link Map#getHeading}
    * @see {@link Map#setHeading}
    */
  def heading_changed(): Unit = js.native
  
  /**
    * This event is fired when the map becomes idle after panning or zooming.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.idle Maps JavaScript API}
    */
  def idle(): Unit = js.native
  
  /**
    * This event is fired when the mapTypeId property changes.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.maptypeid_changed Maps JavaScript API}
    * @see {@link MapOptions#mapTypeId}
    * @see {@link Map#getMapTypeId}
    * @see {@link Map#setMapTypeId}
    */
  def maptypeid_changed(): Unit = js.native
  
  /**
    * This event is fired whenever the user's mouse moves over the map container.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.mousemove Maps JavaScript API}
    */
  def mousemove(event: MouseEvent): Unit = js.native
  
  /**
    * This event is fired when the user's mouse exits the map container.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.mouseout Maps JavaScript API}
    */
  def mouseout(event: MouseEvent): Unit = js.native
  
  /**
    * This event is fired when the user's mouse enters the map container.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.mouseover Maps JavaScript API}
    */
  def mouseover(event: MouseEvent): Unit = js.native
  
  /**
    * This event is fired when the projection has changed.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.projection_changed Maps JavaScript API}
    * @see {@link Map#getProjection}
    */
  def projection_changed(): Unit = js.native
  
  /**
    * This event is fired when the DOM contextmenu event is fired on the map container.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.rightclick Maps JavaScript API}
    */
  def rightclick(event: MouseEvent): Unit = js.native
  
  /**
    * This event is fired when the visible tiles have finished loading.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.tilesloaded Maps JavaScript API}
    */
  def tilesloaded(): Unit = js.native
  
  /**
    * This event is fired when the map tilt property changes.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.tilt_changed Maps JavaScript API}
    * @see {@link MapOptions#tilt}
    * @see {@link Map#getTilt}
    * @see {@link Map#setTilt}
    */
  def tilt_changed(): Unit = js.native
  
  /**
    * This event is fired when the map zoom property changes.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.zoom_changed Maps JavaScript API}
    * @see {@link MapOptions#zoom}
    * @see {@link Map#getZoom}
    * @see {@link Map#setZoom}
    */
  def zoom_changed(): Unit = js.native
}
