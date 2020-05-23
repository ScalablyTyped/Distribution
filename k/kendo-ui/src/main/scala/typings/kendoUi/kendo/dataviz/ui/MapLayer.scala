package typings.kendoUi.kendo.dataviz.ui

import typings.kendoUi.kendo.data.DataSource
import typings.kendoUi.kendo.dataviz.map.Extent
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
    maxSize: js.UndefOr[Double] = js.undefined,
    maxZoom: js.UndefOr[Double] = js.undefined,
    minSize: js.UndefOr[Double] = js.undefined,
    minZoom: js.UndefOr[Double] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    shape: String = null,
    style: MapLayerStyle = null,
    subdomains: js.Any = null,
    symbol: String | js.Function = null,
    tileSize: js.UndefOr[Double] = js.undefined,
    titleField: String = null,
    tooltip: MapLayerTooltip = null,
    `type`: String = null,
    urlTemplate: String = null,
    valueField: String = null,
    zIndex: js.UndefOr[Double] = js.undefined
  ): MapLayer = {
    val __obj = js.Dynamic.literal()
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind.get.asInstanceOf[js.Any])
    if (culture != null) __obj.updateDynamic("culture")(culture.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (imagerySet != null) __obj.updateDynamic("imagerySet")(imagerySet.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (locationField != null) __obj.updateDynamic("locationField")(locationField.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSize)) __obj.updateDynamic("maxSize")(maxSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxZoom)) __obj.updateDynamic("maxZoom")(maxZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minSize)) __obj.updateDynamic("minSize")(minSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minZoom)) __obj.updateDynamic("minZoom")(minZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subdomains != null) __obj.updateDynamic("subdomains")(subdomains.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (!js.isUndefined(tileSize)) __obj.updateDynamic("tileSize")(tileSize.get.asInstanceOf[js.Any])
    if (titleField != null) __obj.updateDynamic("titleField")(titleField.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (urlTemplate != null) __obj.updateDynamic("urlTemplate")(urlTemplate.asInstanceOf[js.Any])
    if (valueField != null) __obj.updateDynamic("valueField")(valueField.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLayer]
  }
}

