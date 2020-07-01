package typings.googlemaps.google.maps

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link InfoWindowOptions} object used to define the properties that can be set on a {@link InfoWindow}.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/info-window#InfoWindowOptions Maps JavaScript API}
  * @see {@link InfoWindow#setOptions}
  */
trait InfoWindowOptions extends js.Object {
  /**
    * Content to display in the {@link InfoWindow}. This can be an HTML element, a plain-text string, or a string
    * containing HTML. The InfoWindow will be sized according to the content. To set an explicit size for the
    * content, set content to be a HTML element with that size.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/info-window#InfoWindowOptions.content Maps JavaScript API}
    * @see {@link InfoWindow#getContent}
    * @see {@link InfoWindow#setContent}
    */
  var content: js.UndefOr[String | Node] = js.undefined
  /**
    * Disable auto-pan on open. By default, the {@link InfoWindow} will pan the map so that it is fully visible
    * when it opens.
    * @see {@link https://developers.google.com/maps/documetntation/javascript/reference/info-window#InfoWindowOptions.disableAutoPan Maps JavaScript API}
    */
  var disableAutoPan: js.UndefOr[Boolean] = js.undefined
  /**
    * Maximum width of the {@link InfoWindow}, regardless of content's width. This value is only considered if it
    * is set before a call to open. To change the maximum width when changing content, call close,
    * {@link InfoWindow#setOptions setOptions}, and then open.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/info-window#InfoWindowOptions.maxWidth Maps JavaScript API}
    */
  var maxWidth: js.UndefOr[Double] = js.undefined
  /**
    * The offset, in pixels, of the tip of the info window from the point on the map at whose geographical
    * coordinates the info window is anchored. If an {@link InfoWindow} is opened with an anchor, the
    * {@link pixelOffset} will be calculated from the anchor's {@link MarkerOptions#anchorPoint anchorPoint}
    * property.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/info-window#InfoWindowOptions.pixelOffset Maps JavaScript API}
    */
  var pixelOffset: js.UndefOr[Size] = js.undefined
  /**
    * The {@link LatLng} at which to display this {@link InfoWindow}. If the {@link InfoWindow} is opened with an
    * anchor, the anchor's position will be used instead.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/info-window#InfoWindowOptions.position Maps JavaScript API}
    * @see {@link InfoWindow#getPosition}
    * @see {@link InfoWindow#setPosition}
    */
  var position: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
  /**
    * All {@link InfoWindow} are displayed on the map in order of their {@link zIndex}, with higher values
    * displaying in front of {@link InfoWindow} with lower values. By default, {@link InfoWindow} are displayed
    * according to their latitude, with {@link InfoWindow} of lower latitudes appearing in front of
    * {@link InfoWindow} at higher latitudes. {@link InfoWindow} are always displayed in front of markers.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/info-window#InfoWindowOptions.zIndex Maps JavaScript API}
    * @see {@link InfoWindow#getZIndex}
    * @see {@link InfoWindow#setZIndex}
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object InfoWindowOptions {
  @scala.inline
  def apply(
    content: String | Node = null,
    disableAutoPan: js.UndefOr[Boolean] = js.undefined,
    maxWidth: js.UndefOr[Double] = js.undefined,
    pixelOffset: Size = null,
    position: LatLng | LatLngLiteral = null,
    zIndex: js.UndefOr[Double] = js.undefined
  ): InfoWindowOptions = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAutoPan)) __obj.updateDynamic("disableAutoPan")(disableAutoPan.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (pixelOffset != null) __obj.updateDynamic("pixelOffset")(pixelOffset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfoWindowOptions]
  }
}

