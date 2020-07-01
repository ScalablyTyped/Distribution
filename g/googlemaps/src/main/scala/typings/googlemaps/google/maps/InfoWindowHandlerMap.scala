package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfoWindowHandlerMap extends js.Object {
  /**
    * This event is fired when the close button was clicked.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/info-window#InfoWindow.closeclick Maps JavaScript API}
    * @see {@link InfoWindow#close}
    */
  var closeclick: js.Array[js.Any]
  /**
    * This event is fired when the content property changes.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/info-window#InfoWindow.content_changed Maps JavaScript API}
    * @see {@link InfoWindowOptions#content}
    * @see {@link InfoWindow#getContent}
    * @see {@link InfoWindow#setContent}
    */
  var content_changed: js.Array[js.Any]
  /**
    * This event is fired when the `<div>` containing the {@link InfoWindow}'s content is attached to the DOM. You
    * may wish to monitor this event if you are building out your info window content dynamically.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/info-window#InfoWindow.domready Maps JavaScript API}
    */
  var domready: js.Array[js.Any]
  /**
    * This event is fired when the position property changes.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/info-window#InfoWindow.position_changed Maps JavaScript API}
    * @see {@link InfoWindowOptions#position}
    * @see {@link InfoWindow#getPosition}
    * @see {@link InfoWindow#setPosition}
    */
  var position_changed: js.Array[js.Any]
  /**
    * This event is fired when the InfoWindow's zIndex changes.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/info-window#InfoWindow.zindex_changed Maps JavaScript API}
    * @see {@link InfoWindowOptions#zIndex}
    * @see {@link InfoWindow#getZIndex}
    * @see {@link InfoWindow#setZIndex}
    */
  var zindex_changed: js.Array[js.Any]
}

object InfoWindowHandlerMap {
  @scala.inline
  def apply(
    closeclick: js.Array[js.Any],
    content_changed: js.Array[js.Any],
    domready: js.Array[js.Any],
    position_changed: js.Array[js.Any],
    zindex_changed: js.Array[js.Any]
  ): InfoWindowHandlerMap = {
    val __obj = js.Dynamic.literal(closeclick = closeclick.asInstanceOf[js.Any], content_changed = content_changed.asInstanceOf[js.Any], domready = domready.asInstanceOf[js.Any], position_changed = position_changed.asInstanceOf[js.Any], zindex_changed = zindex_changed.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfoWindowHandlerMap]
  }
}

