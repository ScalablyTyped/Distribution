package typings.kendoUi.kendo.dataviz.map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileLayerOptions extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var subdomains: js.UndefOr[js.Any] = js.undefined
  var tileSize: js.UndefOr[Double] = js.undefined
  var urlTemplate: js.UndefOr[String] = js.undefined
}

object TileLayerOptions {
  @scala.inline
  def apply(
    name: String = null,
    subdomains: js.Any = null,
    tileSize: js.UndefOr[Double] = js.undefined,
    urlTemplate: String = null
  ): TileLayerOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (subdomains != null) __obj.updateDynamic("subdomains")(subdomains.asInstanceOf[js.Any])
    if (!js.isUndefined(tileSize)) __obj.updateDynamic("tileSize")(tileSize.get.asInstanceOf[js.Any])
    if (urlTemplate != null) __obj.updateDynamic("urlTemplate")(urlTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileLayerOptions]
  }
}

