package typings.leafletGeosearch.mod

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
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleProviderOptions]
  }
}

