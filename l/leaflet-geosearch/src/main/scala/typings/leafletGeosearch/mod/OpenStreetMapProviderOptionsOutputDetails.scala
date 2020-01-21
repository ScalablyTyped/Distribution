package typings.leafletGeosearch.mod

import typings.leafletGeosearch.leafletGeosearchNumbers.`0`
import typings.leafletGeosearch.leafletGeosearchNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenStreetMapProviderOptionsOutputDetails extends js.Object {
  var addressdetails: js.UndefOr[`0` | `1`] = js.undefined
  var extratags: js.UndefOr[`0` | `1`] = js.undefined
  var namedetails: js.UndefOr[`0` | `1`] = js.undefined
}

object OpenStreetMapProviderOptionsOutputDetails {
  @scala.inline
  def apply(addressdetails: `0` | `1` = null, extratags: `0` | `1` = null, namedetails: `0` | `1` = null): OpenStreetMapProviderOptionsOutputDetails = {
    val __obj = js.Dynamic.literal()
    if (addressdetails != null) __obj.updateDynamic("addressdetails")(addressdetails.asInstanceOf[js.Any])
    if (extratags != null) __obj.updateDynamic("extratags")(extratags.asInstanceOf[js.Any])
    if (namedetails != null) __obj.updateDynamic("namedetails")(namedetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenStreetMapProviderOptionsOutputDetails]
  }
}

