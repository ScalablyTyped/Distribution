package typings.leafletGeosearch.mod

import typings.leaflet.mod.MarkerOptions
import typings.leafletGeosearch.AnonButton
import typings.leafletGeosearch.AnonQuery
import typings.leafletGeosearch.leafletGeosearchStrings.bar
import typings.leafletGeosearch.leafletGeosearchStrings.button
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GeoSearchControl
  */
trait GeoSearchControlOptions extends js.Object {
  /** @default true */
  var animateZoom: js.UndefOr[Boolean] = js.undefined
  /** @default false */
  var autoClose: js.UndefOr[Boolean] = js.undefined
  /** @default true */
  var autoComplete: js.UndefOr[Boolean] = js.undefined
  /** @default 250 */
  var autoCompleteDelay: js.UndefOr[Double] = js.undefined
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
  var classNames: js.UndefOr[AnonButton] = js.undefined
  /** @default false */
  var keepResult: js.UndefOr[Boolean] = js.undefined
  /**
    *  @default {
    *      icon: new L.Icon.Default(),
    *      draggable: false,
    *  }
    */
  var marker: js.UndefOr[MarkerOptions] = js.undefined
  /** @default false */
  var maxMarkers: js.UndefOr[Double] = js.undefined
  /** @default 3000 */
  var messageHideDelay: js.UndefOr[Double] = js.undefined
  /** @default 'Sorry; that address could not be found.' */
  var notFoundMessage: js.UndefOr[String] = js.undefined
  /** @default ({ result }) => `${result.label}` */
  var popupFormat: js.UndefOr[js.Function1[/* hasQueryResult */ AnonQuery, String]] = js.undefined
  /** @default 'topleft' */
  var position: js.UndefOr[String] = js.undefined
  var provider: BaseProvider[js.Object, js.Object]
  /** @default false */
  var retainZoomLevel: js.UndefOr[Boolean] = js.undefined
  /** @default 'Enter address' */
  var searchLabel: js.UndefOr[String] = js.undefined
  /** @default true */
  var showMarker: js.UndefOr[Boolean] = js.undefined
  /** @default false */
  var showPopup: js.UndefOr[Boolean] = js.undefined
  /** @default 'button' */
  var style: js.UndefOr[button | bar] = js.undefined
  /** @default 18 */
  var zoomLevel: js.UndefOr[Double] = js.undefined
}

object GeoSearchControlOptions {
  @scala.inline
  def apply(
    provider: BaseProvider[js.Object, js.Object],
    animateZoom: js.UndefOr[Boolean] = js.undefined,
    autoClose: js.UndefOr[Boolean] = js.undefined,
    autoComplete: js.UndefOr[Boolean] = js.undefined,
    autoCompleteDelay: Int | Double = null,
    classNames: AnonButton = null,
    keepResult: js.UndefOr[Boolean] = js.undefined,
    marker: MarkerOptions = null,
    maxMarkers: Int | Double = null,
    messageHideDelay: Int | Double = null,
    notFoundMessage: String = null,
    popupFormat: /* hasQueryResult */ AnonQuery => String = null,
    position: String = null,
    retainZoomLevel: js.UndefOr[Boolean] = js.undefined,
    searchLabel: String = null,
    showMarker: js.UndefOr[Boolean] = js.undefined,
    showPopup: js.UndefOr[Boolean] = js.undefined,
    style: button | bar = null,
    zoomLevel: Int | Double = null
  ): GeoSearchControlOptions = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    if (!js.isUndefined(animateZoom)) __obj.updateDynamic("animateZoom")(animateZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose.asInstanceOf[js.Any])
    if (!js.isUndefined(autoComplete)) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (autoCompleteDelay != null) __obj.updateDynamic("autoCompleteDelay")(autoCompleteDelay.asInstanceOf[js.Any])
    if (classNames != null) __obj.updateDynamic("classNames")(classNames.asInstanceOf[js.Any])
    if (!js.isUndefined(keepResult)) __obj.updateDynamic("keepResult")(keepResult.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (maxMarkers != null) __obj.updateDynamic("maxMarkers")(maxMarkers.asInstanceOf[js.Any])
    if (messageHideDelay != null) __obj.updateDynamic("messageHideDelay")(messageHideDelay.asInstanceOf[js.Any])
    if (notFoundMessage != null) __obj.updateDynamic("notFoundMessage")(notFoundMessage.asInstanceOf[js.Any])
    if (popupFormat != null) __obj.updateDynamic("popupFormat")(js.Any.fromFunction1(popupFormat))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(retainZoomLevel)) __obj.updateDynamic("retainZoomLevel")(retainZoomLevel.asInstanceOf[js.Any])
    if (searchLabel != null) __obj.updateDynamic("searchLabel")(searchLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(showMarker)) __obj.updateDynamic("showMarker")(showMarker.asInstanceOf[js.Any])
    if (!js.isUndefined(showPopup)) __obj.updateDynamic("showPopup")(showPopup.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (zoomLevel != null) __obj.updateDynamic("zoomLevel")(zoomLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoSearchControlOptions]
  }
}

