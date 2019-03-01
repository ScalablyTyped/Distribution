package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapLayer extends js.Object {
  var attribution: js.UndefOr[java.lang.String] = js.undefined
  var autoBind: js.UndefOr[scala.Boolean] = js.undefined
  var culture: js.UndefOr[java.lang.String] = js.undefined
  var dataSource: js.UndefOr[js.Any | kendoDashUiLib.kendoNs.dataNs.DataSource] = js.undefined
  var extent: js.UndefOr[js.Any | kendoDashUiLib.kendoNs.datavizNs.mapNs.Extent] = js.undefined
  var imagerySet: js.UndefOr[java.lang.String] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var locationField: js.UndefOr[java.lang.String] = js.undefined
  var maxSize: js.UndefOr[scala.Double] = js.undefined
  var maxZoom: js.UndefOr[scala.Double] = js.undefined
  var minSize: js.UndefOr[scala.Double] = js.undefined
  var minZoom: js.UndefOr[scala.Double] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var shape: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[MapLayerStyle] = js.undefined
  var subdomains: js.UndefOr[js.Any] = js.undefined
  var symbol: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var tileSize: js.UndefOr[scala.Double] = js.undefined
  var titleField: js.UndefOr[java.lang.String] = js.undefined
  var tooltip: js.UndefOr[MapLayerTooltip] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var urlTemplate: js.UndefOr[java.lang.String] = js.undefined
  var valueField: js.UndefOr[java.lang.String] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object MapLayer {
  @scala.inline
  def apply(
    attribution: java.lang.String = null,
    autoBind: js.UndefOr[scala.Boolean] = js.undefined,
    culture: java.lang.String = null,
    dataSource: js.Any | kendoDashUiLib.kendoNs.dataNs.DataSource = null,
    extent: js.Any | kendoDashUiLib.kendoNs.datavizNs.mapNs.Extent = null,
    imagerySet: java.lang.String = null,
    key: java.lang.String = null,
    locationField: java.lang.String = null,
    maxSize: scala.Int | scala.Double = null,
    maxZoom: scala.Int | scala.Double = null,
    minSize: scala.Int | scala.Double = null,
    minZoom: scala.Int | scala.Double = null,
    opacity: scala.Int | scala.Double = null,
    shape: java.lang.String = null,
    style: MapLayerStyle = null,
    subdomains: js.Any = null,
    symbol: java.lang.String | js.Function = null,
    tileSize: scala.Int | scala.Double = null,
    titleField: java.lang.String = null,
    tooltip: MapLayerTooltip = null,
    `type`: java.lang.String = null,
    urlTemplate: java.lang.String = null,
    valueField: java.lang.String = null,
    zIndex: scala.Int | scala.Double = null
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

