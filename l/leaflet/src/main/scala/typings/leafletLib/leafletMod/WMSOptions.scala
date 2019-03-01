package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WMSOptions extends TileLayerOptions {
  var crs: js.UndefOr[CRS] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var layers: js.UndefOr[java.lang.String] = js.undefined
  var styles: js.UndefOr[java.lang.String] = js.undefined
  var transparent: js.UndefOr[scala.Boolean] = js.undefined
  var uppercase: js.UndefOr[scala.Boolean] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object WMSOptions {
  @scala.inline
  def apply(
    attribution: java.lang.String = null,
    bounds: LatLngBoundsExpression = null,
    className: java.lang.String = null,
    crossOrigin: CrossOrigin = null,
    crs: CRS = null,
    detectRetina: js.UndefOr[scala.Boolean] = js.undefined,
    errorTileUrl: java.lang.String = null,
    format: java.lang.String = null,
    keepBuffer: scala.Int | scala.Double = null,
    layers: java.lang.String = null,
    maxNativeZoom: scala.Int | scala.Double = null,
    maxZoom: scala.Int | scala.Double = null,
    minNativeZoom: scala.Int | scala.Double = null,
    minZoom: scala.Int | scala.Double = null,
    noWrap: js.UndefOr[scala.Boolean] = js.undefined,
    opacity: scala.Int | scala.Double = null,
    pane: java.lang.String = null,
    styles: java.lang.String = null,
    subdomains: java.lang.String | js.Array[java.lang.String] = null,
    tileSize: scala.Double | Point = null,
    tms: js.UndefOr[scala.Boolean] = js.undefined,
    transparent: js.UndefOr[scala.Boolean] = js.undefined,
    updateInterval: scala.Int | scala.Double = null,
    updateWhenIdle: js.UndefOr[scala.Boolean] = js.undefined,
    updateWhenZooming: js.UndefOr[scala.Boolean] = js.undefined,
    uppercase: js.UndefOr[scala.Boolean] = js.undefined,
    version: java.lang.String = null,
    zIndex: scala.Int | scala.Double = null,
    zoomOffset: scala.Int | scala.Double = null,
    zoomReverse: js.UndefOr[scala.Boolean] = js.undefined
  ): WMSOptions = {
    val __obj = js.Dynamic.literal()
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (crs != null) __obj.updateDynamic("crs")(crs)
    if (!js.isUndefined(detectRetina)) __obj.updateDynamic("detectRetina")(detectRetina)
    if (errorTileUrl != null) __obj.updateDynamic("errorTileUrl")(errorTileUrl)
    if (format != null) __obj.updateDynamic("format")(format)
    if (keepBuffer != null) __obj.updateDynamic("keepBuffer")(keepBuffer.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers)
    if (maxNativeZoom != null) __obj.updateDynamic("maxNativeZoom")(maxNativeZoom.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minNativeZoom != null) __obj.updateDynamic("minNativeZoom")(minNativeZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(noWrap)) __obj.updateDynamic("noWrap")(noWrap)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (subdomains != null) __obj.updateDynamic("subdomains")(subdomains.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (!js.isUndefined(tms)) __obj.updateDynamic("tms")(tms)
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent)
    if (updateInterval != null) __obj.updateDynamic("updateInterval")(updateInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(updateWhenIdle)) __obj.updateDynamic("updateWhenIdle")(updateWhenIdle)
    if (!js.isUndefined(updateWhenZooming)) __obj.updateDynamic("updateWhenZooming")(updateWhenZooming)
    if (!js.isUndefined(uppercase)) __obj.updateDynamic("uppercase")(uppercase)
    if (version != null) __obj.updateDynamic("version")(version)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    if (zoomOffset != null) __obj.updateDynamic("zoomOffset")(zoomOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomReverse)) __obj.updateDynamic("zoomReverse")(zoomReverse)
    __obj.asInstanceOf[WMSOptions]
  }
}

