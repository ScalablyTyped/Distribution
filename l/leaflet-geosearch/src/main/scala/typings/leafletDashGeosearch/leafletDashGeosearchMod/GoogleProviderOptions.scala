package typings.leafletDashGeosearch.leafletDashGeosearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleProviderOptions extends js.Object {
  var bounds: js.UndefOr[String] = js.undefined
  var key: String
  var language: js.UndefOr[String] = js.undefined
  var region: js.UndefOr[String] = js.undefined
}

object GoogleProviderOptions {
  @scala.inline
  def apply(key: String, bounds: String = null, language: String = null, region: String = null): GoogleProviderOptions = {
    val __obj = js.Dynamic.literal(key = key)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds)
    if (language != null) __obj.updateDynamic("language")(language)
    if (region != null) __obj.updateDynamic("region")(region)
    __obj.asInstanceOf[GoogleProviderOptions]
  }
}

