package typings.leafletDashGeosearch.leafletDashGeosearchMod

import typings.leafletDashGeosearch.leafletDashGeosearchNumbers.`0`
import typings.leafletDashGeosearch.leafletDashGeosearchNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenStreetMapProviderOptionsOther extends js.Object {
  var debug: js.UndefOr[`0` | `1`] = js.undefined
  var dedupe: js.UndefOr[`0` | `1`] = js.undefined
  var email: js.UndefOr[String] = js.undefined
}

object OpenStreetMapProviderOptionsOther {
  @scala.inline
  def apply(debug: `0` | `1` = null, dedupe: `0` | `1` = null, email: String = null): OpenStreetMapProviderOptionsOther = {
    val __obj = js.Dynamic.literal()
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (dedupe != null) __obj.updateDynamic("dedupe")(dedupe.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email)
    __obj.asInstanceOf[OpenStreetMapProviderOptionsOther]
  }
}

