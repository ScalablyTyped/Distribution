package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPostalCodeGroup extends js.Object {
  /**
    * The CLDR territory code of the country the postal code group applies to.
    * Required.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * The name of the postal code group, referred to in headers. Required.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A range of postal codes. Required.
    */
  var postalCodeRanges: js.UndefOr[js.Array[SchemaPostalCodeRange]] = js.native
}

object SchemaPostalCodeGroup {
  @scala.inline
  def apply(
    country: String = null,
    name: String = null,
    postalCodeRanges: js.Array[SchemaPostalCodeRange] = null
  ): SchemaPostalCodeGroup = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (postalCodeRanges != null) __obj.updateDynamic("postalCodeRanges")(postalCodeRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPostalCodeGroup]
  }
}

