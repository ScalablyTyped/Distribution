package typings
package leafletDotGridlayerDotGooglemutantLib.leafletMod.gridLayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleMutantOptions
  extends leafletLib.leafletMod.TileLayerOptions {
  var continuousWorld: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Google's map styles.
    */
  var styles: js.UndefOr[js.Array[GoogleMutantStyle]] = js.undefined
  /**
    * Google's map type. 'hybrid' is not really supported.
    */
  var `type`: js.UndefOr[GoogleMutantType] = js.undefined
}

object GoogleMutantOptions {
  @scala.inline
  def apply(
    attribution: java.lang.String = null,
    bounds: leafletLib.leafletMod.LatLngBoundsExpression = null,
    className: java.lang.String = null,
    continuousWorld: js.UndefOr[scala.Boolean] = js.undefined,
    crossOrigin: leafletLib.leafletMod.CrossOrigin = null,
    detectRetina: js.UndefOr[scala.Boolean] = js.undefined,
    errorTileUrl: java.lang.String = null,
    keepBuffer: scala.Int | scala.Double = null,
    maxNativeZoom: scala.Int | scala.Double = null,
    maxZoom: scala.Int | scala.Double = null,
    minNativeZoom: scala.Int | scala.Double = null,
    minZoom: scala.Int | scala.Double = null,
    noWrap: js.UndefOr[scala.Boolean] = js.undefined,
    opacity: scala.Int | scala.Double = null,
    pane: java.lang.String = null,
    styles: js.Array[GoogleMutantStyle] = null,
    subdomains: java.lang.String | js.Array[java.lang.String] = null,
    tileSize: scala.Double | leafletLib.leafletMod.Point = null,
    tms: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: GoogleMutantType = null,
    updateInterval: scala.Int | scala.Double = null,
    updateWhenIdle: js.UndefOr[scala.Boolean] = js.undefined,
    updateWhenZooming: js.UndefOr[scala.Boolean] = js.undefined,
    zIndex: scala.Int | scala.Double = null,
    zoomOffset: scala.Int | scala.Double = null,
    zoomReverse: js.UndefOr[scala.Boolean] = js.undefined
  ): GoogleMutantOptions = {
    val __obj = js.Dynamic.literal()
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(continuousWorld)) __obj.updateDynamic("continuousWorld")(continuousWorld)
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (!js.isUndefined(detectRetina)) __obj.updateDynamic("detectRetina")(detectRetina)
    if (errorTileUrl != null) __obj.updateDynamic("errorTileUrl")(errorTileUrl)
    if (keepBuffer != null) __obj.updateDynamic("keepBuffer")(keepBuffer.asInstanceOf[js.Any])
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
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (updateInterval != null) __obj.updateDynamic("updateInterval")(updateInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(updateWhenIdle)) __obj.updateDynamic("updateWhenIdle")(updateWhenIdle)
    if (!js.isUndefined(updateWhenZooming)) __obj.updateDynamic("updateWhenZooming")(updateWhenZooming)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    if (zoomOffset != null) __obj.updateDynamic("zoomOffset")(zoomOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomReverse)) __obj.updateDynamic("zoomReverse")(zoomReverse)
    __obj.asInstanceOf[GoogleMutantOptions]
  }
}

