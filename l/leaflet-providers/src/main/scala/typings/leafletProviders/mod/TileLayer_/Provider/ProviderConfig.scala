package typings.leafletProviders.mod.TileLayer_.Provider

import org.scalablytyped.runtime.StringDictionary
import typings.leaflet.mod.TileLayerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderConfig extends js.Object {
  var options: js.UndefOr[TileLayerOptions] = js.undefined
  var url: String
  var variants: js.UndefOr[StringDictionary[String | ProviderConfig]] = js.undefined
}

object ProviderConfig {
  @scala.inline
  def apply(
    url: String,
    options: TileLayerOptions = null,
    variants: StringDictionary[String | ProviderConfig] = null
  ): ProviderConfig = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (variants != null) __obj.updateDynamic("variants")(variants.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderConfig]
  }
}

