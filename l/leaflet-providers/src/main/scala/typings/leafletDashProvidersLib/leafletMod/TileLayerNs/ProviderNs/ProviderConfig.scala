package typings
package leafletDashProvidersLib.leafletMod.TileLayerNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderConfig extends js.Object {
  var options: js.UndefOr[leafletLib.leafletMod.TileLayerOptions] = js.undefined
  var url: java.lang.String
  var variants: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String | ProviderConfig]] = js.undefined
}

object ProviderConfig {
  @scala.inline
  def apply(
    url: java.lang.String,
    options: leafletLib.leafletMod.TileLayerOptions = null,
    variants: org.scalablytyped.runtime.StringDictionary[java.lang.String | ProviderConfig] = null
  ): ProviderConfig = {
    val __obj = js.Dynamic.literal(url = url)
    if (options != null) __obj.updateDynamic("options")(options)
    if (variants != null) __obj.updateDynamic("variants")(variants)
    __obj.asInstanceOf[ProviderConfig]
  }
}

