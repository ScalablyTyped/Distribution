package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/***** Map *****/
trait MapHandlerMap extends js.Object {
  /**
    * This event is fired when the viewport bounds have changed.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.bounds_changed Maps JavaScript API}
    * @see {@link Map#getBounds}
    * @see {@link Map#fitBounds}
    * @see {@link Map#panToBounds}
    */
  var bounds_changed: js.Array[js.Any]
  /**
    * This event is fired when the map center property changes.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.center_changed Maps JavaScript API}
    * @see {@link MapOptions#center}
    * @see {@link Map#getCenter}
    * @see {@link Map#setCenter}
    */
  var center_changed: js.Array[js.Any]
  /**
    * This event is fired when the user clicks on the map.
    * An ApiMouseEvent with properties for the clicked location is returned unless a place icon was clicked, in which case an IconMouseEvent with a placeid is returned.
    * IconMouseEvent and ApiMouseEvent are identical, except that IconMouseEvent has the placeid field.
    * The event can always be treated as an ApiMouseEvent when the placeid is not important.
    * The click event is not fired if a marker or infowindow was clicked.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.click Maps JavaScript API}
    */
  var click: js.Array[MouseEvent | IconMouseEvent]
  /**
    * This event is fired when the user double-clicks on the map. Note that the click event will also fire, right before this one.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.dblclick Maps JavaScript API}
    */
  var dblclick: js.Array[MouseEvent]
  /**
    * This event is repeatedly fired while the user drags the map.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.drag Maps JavaScript API}
    */
  var drag: js.Array[js.Any]
  /**
    * This event is fired when the user stops dragging the map.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.dragend Maps JavaScript API}
    */
  var dragend: js.Array[js.Any]
  /**
    * This event is fired when the user starts dragging the map.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.dragstart Maps JavaScript API}
    */
  var dragstart: js.Array[js.Any]
  /**
    * This event is fired when the map heading property changes.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.heading_changed Maps JavaScript API}
    * @see {@link MapOptions#heading}
    * @see {@link Map#getHeading}
    * @see {@link Map#setHeading}
    */
  var heading_changed: js.Array[js.Any]
  /**
    * This event is fired when the map becomes idle after panning or zooming.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.idle Maps JavaScript API}
    */
  var idle: js.Array[js.Any]
  /**
    * This event is fired when the mapTypeId property changes.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.maptypeid_changed Maps JavaScript API}
    * @see {@link MapOptions#mapTypeId}
    * @see {@link Map#getMapTypeId}
    * @see {@link Map#setMapTypeId}
    */
  var maptypeid_changed: js.Array[js.Any]
  /**
    * This event is fired whenever the user's mouse moves over the map container.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.mousemove Maps JavaScript API}
    */
  var mousemove: js.Array[MouseEvent]
  /**
    * This event is fired when the user's mouse exits the map container.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.mouseout Maps JavaScript API}
    */
  var mouseout: js.Array[MouseEvent]
  /**
    * This event is fired when the user's mouse enters the map container.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.mouseover Maps JavaScript API}
    */
  var mouseover: js.Array[MouseEvent]
  /**
    * This event is fired when the projection has changed.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.projection_changed Maps JavaScript API}
    * @see {@link Map#getProjection}
    */
  var projection_changed: js.Array[js.Any]
  /**
    * This event is fired when the DOM contextmenu event is fired on the map container.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.rightclick Maps JavaScript API}
    */
  var rightclick: js.Array[MouseEvent]
  /**
    * This event is fired when the visible tiles have finished loading.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.tilesloaded Maps JavaScript API}
    */
  var tilesloaded: js.Array[js.Any]
  /**
    * This event is fired when the map tilt property changes.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.tilt_changed Maps JavaScript API}
    * @see {@link MapOptions#tilt}
    * @see {@link Map#getTilt}
    * @see {@link Map#setTilt}
    */
  var tilt_changed: js.Array[js.Any]
  /**
    * This event is fired when the map zoom property changes.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.zoom_changed Maps JavaScript API}
    * @see {@link MapOptions#zoom}
    * @see {@link Map#getZoom}
    * @see {@link Map#setZoom}
    */
  var zoom_changed: js.Array[js.Any]
}

object MapHandlerMap {
  @scala.inline
  def apply(
    bounds_changed: js.Array[js.Any],
    center_changed: js.Array[js.Any],
    click: js.Array[MouseEvent | IconMouseEvent],
    dblclick: js.Array[MouseEvent],
    drag: js.Array[js.Any],
    dragend: js.Array[js.Any],
    dragstart: js.Array[js.Any],
    heading_changed: js.Array[js.Any],
    idle: js.Array[js.Any],
    maptypeid_changed: js.Array[js.Any],
    mousemove: js.Array[MouseEvent],
    mouseout: js.Array[MouseEvent],
    mouseover: js.Array[MouseEvent],
    projection_changed: js.Array[js.Any],
    rightclick: js.Array[MouseEvent],
    tilesloaded: js.Array[js.Any],
    tilt_changed: js.Array[js.Any],
    zoom_changed: js.Array[js.Any]
  ): MapHandlerMap = {
    val __obj = js.Dynamic.literal(bounds_changed = bounds_changed.asInstanceOf[js.Any], center_changed = center_changed.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], heading_changed = heading_changed.asInstanceOf[js.Any], idle = idle.asInstanceOf[js.Any], maptypeid_changed = maptypeid_changed.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], projection_changed = projection_changed.asInstanceOf[js.Any], rightclick = rightclick.asInstanceOf[js.Any], tilesloaded = tilesloaded.asInstanceOf[js.Any], tilt_changed = tilt_changed.asInstanceOf[js.Any], zoom_changed = zoom_changed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MapHandlerMap]
  }
}

