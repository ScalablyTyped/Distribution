package typings.leafletDashGeosearch.leafletDashGeosearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Bing Maps
  */
trait BingProviderCultureOptions extends js.Object {
  var c: js.UndefOr[String] = js.undefined
  var culture: js.UndefOr[String] = js.undefined
}

object BingProviderCultureOptions {
  @scala.inline
  def apply(c: String = null, culture: String = null): BingProviderCultureOptions = {
    val __obj = js.Dynamic.literal()
    if (c != null) __obj.updateDynamic("c")(c)
    if (culture != null) __obj.updateDynamic("culture")(culture)
    __obj.asInstanceOf[BingProviderCultureOptions]
  }
}

