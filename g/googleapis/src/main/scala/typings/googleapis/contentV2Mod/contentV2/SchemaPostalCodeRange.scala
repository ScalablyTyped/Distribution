package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPostalCodeRange extends js.Object {
  /**
    * A postal code or a pattern of the form prefix* denoting the inclusive
    * lower bound of the range defining the area. Examples values:
    * &quot;94108&quot;, &quot;9410*&quot;, &quot;9*&quot;. Required.
    */
  var postalCodeRangeBegin: js.UndefOr[String] = js.native
  /**
    * A postal code or a pattern of the form prefix* denoting the inclusive
    * upper bound of the range defining the area. It must have the same length
    * as postalCodeRangeBegin: if postalCodeRangeBegin is a postal code then
    * postalCodeRangeEnd must be a postal code too; if postalCodeRangeBegin is
    * a pattern then postalCodeRangeEnd must be a pattern with the same prefix
    * length. Optional: if not set, then the area is defined as being all the
    * postal codes matching postalCodeRangeBegin.
    */
  var postalCodeRangeEnd: js.UndefOr[String] = js.native
}

object SchemaPostalCodeRange {
  @scala.inline
  def apply(postalCodeRangeBegin: String = null, postalCodeRangeEnd: String = null): SchemaPostalCodeRange = {
    val __obj = js.Dynamic.literal()
    if (postalCodeRangeBegin != null) __obj.updateDynamic("postalCodeRangeBegin")(postalCodeRangeBegin.asInstanceOf[js.Any])
    if (postalCodeRangeEnd != null) __obj.updateDynamic("postalCodeRangeEnd")(postalCodeRangeEnd.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPostalCodeRange]
  }
}

