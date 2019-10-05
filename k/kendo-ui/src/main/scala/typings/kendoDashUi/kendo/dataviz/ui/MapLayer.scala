package typings.kendoDashUi.kendo.dataviz.ui

import typings.kendoDashUi.kendo.data.DataSource
import typings.kendoDashUi.kendo.dataviz.map.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapLayer extends js.Object {
  var attribution: js.UndefOr[String] = js.undefined
  var autoBind: js.UndefOr[Boolean] = js.undefined
  var culture: js.UndefOr[String] = js.undefined
  var dataSource: js.UndefOr[js.Any | DataSource] = js.undefined
  var extent: js.UndefOr[js.Any | Extent] = js.undefined
  var imagerySet: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var locationField: js.UndefOr[String] = js.undefined
  var maxSize: js.UndefOr[Double] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minSize: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var shape: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[MapLayerStyle] = js.undefined
  var subdomains: js.UndefOr[js.Any] = js.undefined
  var symbol: js.UndefOr[String | js.Function] = js.undefined
  var tileSize: js.UndefOr[Double] = js.undefined
  var titleField: js.UndefOr[String] = js.undefined
  var tooltip: js.UndefOr[MapLayerTooltip] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var urlTemplate: js.UndefOr[String] = js.undefined
  var valueField: js.UndefOr[String] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object MapLayer {
  @scala.inline
  def apply(
    attribution: String = null,
    autoBind: js.UndefOr[Boolean] = js.undefined,
    culture: String = null,
    dataSource: js.Any | DataSource = null,
    extent: js.Any | Extent = null,
    imagerySet: String = null,
    key: String = null,
    locationField: String = null,
    maxSize: Int | Double = null,
    maxZoom: Int | Double = null,
    minSize: Int | Double = null,
    minZoom: Int | Double = null,
    opacity: Int | Double = null,
    shape: String = null,
    style: MapLayerStyle = null,
    subdomains: js.Any = null,
    symbol: String | js.Function = null,
    tileSize: Int | Double = null,
    titleField: String = null,
    tooltip: MapLayerTooltip = null,
    `type`: String = null,
    urlTemplate: String = null,
    valueField: String = null,
    zIndex: Int | Double = null
  ): MapLayer = {
    val __obj = js.Dynamic.literal()
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind)
    if (culture != null) __obj.updateDynamic("culture")(culture)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (imagerySet != null) __obj.updateDynamic("imagerySet")(imagerySet)
    if (key != null) __obj.updateDynamic("key")(key)
    if (locationField != null) __obj.updateDynamic("locationField")(locationField)
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape)
    if (style != null) __obj.updateDynamic("style")(style)
    if (subdomains != null) __obj.updateDynamic("subdomains")(subdomains)
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (titleField != null) __obj.updateDynamic("titleField")(titleField)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (urlTemplate != null) __obj.updateDynamic("urlTemplate")(urlTemplate)
    if (valueField != null) __obj.updateDynamic("valueField")(valueField)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLayer]
  }
}

