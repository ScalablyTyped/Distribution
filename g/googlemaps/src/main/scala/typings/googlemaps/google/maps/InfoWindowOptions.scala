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
@js.native
trait InfoWindowOptions extends js.Object {
  /**
    * Content to display in the {@link InfoWindow}. This can be an HTML element, a plain-text string, or a string
    * containing HTML. The InfoWindow will be sized according to the content. To set an explicit size for the
    * content, set content to be a HTML element with that size.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/info-window#InfoWindowOptions.content Maps JavaScript API}
    * @see {@link InfoWindow#getContent}
    * @see {@link InfoWindow#setContent}
    */
  var content: js.UndefOr[String | Node] = js.native
  /**
    * Disable auto-pan on open. By default, the {@link InfoWindow} will pan the map so that it is fully visible
    * when it opens.
    * @see {@link https://developers.google.com/maps/documetntation/javascript/reference/info-window#InfoWindowOptions.disableAutoPan Maps JavaScript API}
    */
  var disableAutoPan: js.UndefOr[Boolean] = js.native
  /**
    * Maximum width of the {@link InfoWindow}, regardless of content's width. This value is only considered if it
    * is set before a call to open. To change the maximum width when changing content, call close,
    * {@link InfoWindow#setOptions setOptions}, and then open.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/info-window#InfoWindowOptions.maxWidth Maps JavaScript API}
    */
  var maxWidth: js.UndefOr[Double] = js.native
  /**
    * The offset, in pixels, of the tip of the info window from the point on the map at whose geographical
    * coordinates the info window is anchored. If an {@link InfoWindow} is opened with an anchor, the
    * {@link pixelOffset} will be calculated from the anchor's {@link MarkerOptions#anchorPoint anchorPoint}
    * property.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/info-window#InfoWindowOptions.pixelOffset Maps JavaScript API}
    */
  var pixelOffset: js.UndefOr[Size] = js.native
  /**
    * The {@link LatLng} at which to display this {@link InfoWindow}. If the {@link InfoWindow} is opened with an
    * anchor, the anchor's position will be used instead.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/info-window#InfoWindowOptions.position Maps JavaScript API}
    * @see {@link InfoWindow#getPosition}
    * @see {@link InfoWindow#setPosition}
    */
  var position: js.UndefOr[LatLng | LatLngLiteral] = js.native
  /**
    * All {@link InfoWindow} are displayed on the map in order of their {@link zIndex}, with higher values
    * displaying in front of {@link InfoWindow} with lower values. By default, {@link InfoWindow} are displayed
    * according to their latitude, with {@link InfoWindow} of lower latitudes appearing in front of
    * {@link InfoWindow} at higher latitudes. {@link InfoWindow} are always displayed in front of markers.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/info-window#InfoWindowOptions.zIndex Maps JavaScript API}
    * @see {@link InfoWindow#getZIndex}
    * @see {@link InfoWindow#setZIndex}
    */
  var zIndex: js.UndefOr[Double] = js.native
}

object InfoWindowOptions {
  @scala.inline
  def apply(): InfoWindowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InfoWindowOptions]
  }
  @scala.inline
  implicit class InfoWindowOptionsOps[Self <: InfoWindowOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContent(value: String | Node): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setDisableAutoPan(value: Boolean): Self = this.set("disableAutoPan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableAutoPan: Self = this.set("disableAutoPan", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setPixelOffset(value: Size): Self = this.set("pixelOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePixelOffset: Self = this.set("pixelOffset", js.undefined)
    @scala.inline
    def setPosition(value: LatLng | LatLngLiteral): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

