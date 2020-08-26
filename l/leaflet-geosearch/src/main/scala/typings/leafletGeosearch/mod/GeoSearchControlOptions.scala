package typings.leafletGeosearch.mod

import typings.leaflet.mod.MarkerOptions
import typings.leafletGeosearch.anon.Button
import typings.leafletGeosearch.anon.Query
import typings.leafletGeosearch.leafletGeosearchStrings.bar
import typings.leafletGeosearch.leafletGeosearchStrings.button
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GeoSearchControl
  */
@js.native
trait GeoSearchControlOptions extends js.Object {
  /** @default true */
  var animateZoom: js.UndefOr[Boolean] = js.native
  /** @default false */
  var autoClose: js.UndefOr[Boolean] = js.native
  /** @default true */
  var autoComplete: js.UndefOr[Boolean] = js.native
  /** @default 250 */
  var autoCompleteDelay: js.UndefOr[Double] = js.native
  /**
    * @default {
    *      container: 'leaflet-bar leaflet-control leaflet-control-geosearch';
    *      button: 'leaflet-bar-part leaflet-bar-part-single';
    *      resetButton: 'reset';
    *      msgbox: 'leaflet-bar message';
    *      form: '';
    *      input: '';
    * }
    */
  var classNames: js.UndefOr[Button] = js.native
  /** @default false */
  var keepResult: js.UndefOr[Boolean] = js.native
  /**
    *  @default {
    *      icon: new L.Icon.Default(),
    *      draggable: false,
    *  }
    */
  var marker: js.UndefOr[MarkerOptions] = js.native
  /** @default false */
  var maxMarkers: js.UndefOr[Double] = js.native
  /** @default 3000 */
  var messageHideDelay: js.UndefOr[Double] = js.native
  /** @default 'Sorry; that address could not be found.' */
  var notFoundMessage: js.UndefOr[String] = js.native
  /** @default ({ result }) => `${result.label}` */
  var popupFormat: js.UndefOr[js.Function1[/* hasQueryResult */ Query, String]] = js.native
  /** @default 'topleft' */
  var position: js.UndefOr[String] = js.native
  var provider: BaseProvider[js.Object, js.Object] = js.native
  /** @default false */
  var retainZoomLevel: js.UndefOr[Boolean] = js.native
  /** @default 'Enter address' */
  var searchLabel: js.UndefOr[String] = js.native
  /** @default true */
  var showMarker: js.UndefOr[Boolean] = js.native
  /** @default false */
  var showPopup: js.UndefOr[Boolean] = js.native
  /** @default 'button' */
  var style: js.UndefOr[button | bar] = js.native
  /** @default 18 */
  var zoomLevel: js.UndefOr[Double] = js.native
}

object GeoSearchControlOptions {
  @scala.inline
  def apply(provider: BaseProvider[js.Object, js.Object]): GeoSearchControlOptions = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoSearchControlOptions]
  }
  @scala.inline
  implicit class GeoSearchControlOptionsOps[Self <: GeoSearchControlOptions] (val x: Self) extends AnyVal {
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
    def setProvider(value: BaseProvider[js.Object, js.Object]): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimateZoom(value: Boolean): Self = this.set("animateZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimateZoom: Self = this.set("animateZoom", js.undefined)
    @scala.inline
    def setAutoClose(value: Boolean): Self = this.set("autoClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoClose: Self = this.set("autoClose", js.undefined)
    @scala.inline
    def setAutoComplete(value: Boolean): Self = this.set("autoComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoComplete: Self = this.set("autoComplete", js.undefined)
    @scala.inline
    def setAutoCompleteDelay(value: Double): Self = this.set("autoCompleteDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCompleteDelay: Self = this.set("autoCompleteDelay", js.undefined)
    @scala.inline
    def setClassNames(value: Button): Self = this.set("classNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassNames: Self = this.set("classNames", js.undefined)
    @scala.inline
    def setKeepResult(value: Boolean): Self = this.set("keepResult", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepResult: Self = this.set("keepResult", js.undefined)
    @scala.inline
    def setMarker(value: MarkerOptions): Self = this.set("marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    @scala.inline
    def setMaxMarkers(value: Double): Self = this.set("maxMarkers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxMarkers: Self = this.set("maxMarkers", js.undefined)
    @scala.inline
    def setMessageHideDelay(value: Double): Self = this.set("messageHideDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageHideDelay: Self = this.set("messageHideDelay", js.undefined)
    @scala.inline
    def setNotFoundMessage(value: String): Self = this.set("notFoundMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotFoundMessage: Self = this.set("notFoundMessage", js.undefined)
    @scala.inline
    def setPopupFormat(value: /* hasQueryResult */ Query => String): Self = this.set("popupFormat", js.Any.fromFunction1(value))
    @scala.inline
    def deletePopupFormat: Self = this.set("popupFormat", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setRetainZoomLevel(value: Boolean): Self = this.set("retainZoomLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetainZoomLevel: Self = this.set("retainZoomLevel", js.undefined)
    @scala.inline
    def setSearchLabel(value: String): Self = this.set("searchLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchLabel: Self = this.set("searchLabel", js.undefined)
    @scala.inline
    def setShowMarker(value: Boolean): Self = this.set("showMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowMarker: Self = this.set("showMarker", js.undefined)
    @scala.inline
    def setShowPopup(value: Boolean): Self = this.set("showPopup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowPopup: Self = this.set("showPopup", js.undefined)
    @scala.inline
    def setStyle(value: button | bar): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setZoomLevel(value: Double): Self = this.set("zoomLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomLevel: Self = this.set("zoomLevel", js.undefined)
  }
  
}

