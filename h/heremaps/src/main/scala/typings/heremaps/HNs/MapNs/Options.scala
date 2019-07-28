package typings.heremaps.HNs.MapNs

import typings.heremaps.HNs.geoNs.IPoint
import typings.heremaps.HNs.geoNs.Rect
import typings.heremaps.HNs.mapNs.ViewPortNs.Padding
import typings.heremaps.HNs.mapNs.layerNs.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This type defines options which can be used to initialize the map.
  * @property center {H.geo.IPoint=} - The initial center of the map, default is {lat:0, lng: 0}
  * @property zoom {number=} - The initial zoom level of the map, default is 0 respectively the minimal zoom level of the base map
  * @property bounds {H.geo.Rect=} - The view bounds to be displayed on the map. If provided, it takes precedence over center and zoom. and zoom if provided)
  * @property layers {Array<H.map.layer.Layer>=} - A list of layers to render on top of the base map
  * @property engineType: {H.Map.EngineType=} - The initial engine type to use, default is P2D
  * @property pixelRatio {number} - The pixelRatio to use for over-sampling in cases of high-resolution displays, default is 1
  * @property imprint {H.map.Imprint.Options=} - The imprint options or null to suppress the imprint
  * @property renderBaseBackground {H.Map.BackgroundRange=} - Object describes how many cached zoom levels should be used as a base map background while base map tiles are loading.
  * Example: {lower: 3, higher: 2}
  * @property autoColor {boolean=} - Indicates whether the UI's colors should automatically adjusted to the base layer, default is true. Up to now only the copyright style will be adjusted.
  * See H.map.layer.Layer.Options#dark
  * @property margin {number=} - The size in pixel of the supplemental area to render for each side of the map
  * @property padding {H.map.ViewPort.Padding=} - The padding in pixels for each side of the map
  * @property fixedCenter {boolean=} - Indicates whether the center of the map should remain unchanged if the viewport's size or padding has been changed, default is true
  * @property noWrap {boolean=} - Indicates whether to wrap the world on longitude axes. When set to true, only one world will be rendered. Default is false, multiple worlds are rendered.
  */
trait Options extends js.Object {
  var autoColor: js.UndefOr[Boolean] = js.undefined
  var bounds: js.UndefOr[Rect] = js.undefined
  var center: js.UndefOr[IPoint] = js.undefined
  var engineType: js.UndefOr[EngineType] = js.undefined
  var fixedCenter: js.UndefOr[Boolean] = js.undefined
  var imprint: js.UndefOr[typings.heremaps.HNs.mapNs.ImprintNs.Options] = js.undefined
  var layers: js.UndefOr[js.Array[Layer]] = js.undefined
  var margin: js.UndefOr[Double] = js.undefined
  var noWrap: js.UndefOr[Boolean] = js.undefined
  var padding: js.UndefOr[Padding] = js.undefined
  var pixelRatio: js.UndefOr[Double] = js.undefined
  var renderBaseBackground: js.UndefOr[BackgroundRange] = js.undefined
  var zoom: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    autoColor: js.UndefOr[Boolean] = js.undefined,
    bounds: Rect = null,
    center: IPoint = null,
    engineType: EngineType = null,
    fixedCenter: js.UndefOr[Boolean] = js.undefined,
    imprint: typings.heremaps.HNs.mapNs.ImprintNs.Options = null,
    layers: js.Array[Layer] = null,
    margin: Int | Double = null,
    noWrap: js.UndefOr[Boolean] = js.undefined,
    padding: Padding = null,
    pixelRatio: Int | Double = null,
    renderBaseBackground: BackgroundRange = null,
    zoom: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoColor)) __obj.updateDynamic("autoColor")(autoColor)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds)
    if (center != null) __obj.updateDynamic("center")(center)
    if (engineType != null) __obj.updateDynamic("engineType")(engineType)
    if (!js.isUndefined(fixedCenter)) __obj.updateDynamic("fixedCenter")(fixedCenter)
    if (imprint != null) __obj.updateDynamic("imprint")(imprint)
    if (layers != null) __obj.updateDynamic("layers")(layers)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(noWrap)) __obj.updateDynamic("noWrap")(noWrap)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (renderBaseBackground != null) __obj.updateDynamic("renderBaseBackground")(renderBaseBackground)
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

