package typings.leafletDashProviders.leafletMod.TileLayer.Provider

import org.scalablytyped.runtime.StringDictionary
import typings.leaflet.leafletMod.TileLayerOptions
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
    val __obj = js.Dynamic.literal(url = url)
    if (options != null) __obj.updateDynamic("options")(options)
    if (variants != null) __obj.updateDynamic("variants")(variants)
    __obj.asInstanceOf[ProviderConfig]
  }
}

