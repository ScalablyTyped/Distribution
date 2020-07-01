package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The single value of a rate group or the value of a rate group table&#39;s
  * cell. Exactly one of noShipping, flatRate, pricePercentage,
  * carrierRateName, subtableName must be set.
  */
@js.native
trait SchemaValue extends js.Object {
  /**
    * The name of a carrier rate referring to a carrier rate defined in the
    * same rate group. Can only be set if all other fields are not set.
    */
  var carrierRateName: js.UndefOr[String] = js.native
  /**
    * A flat rate. Can only be set if all other fields are not set.
    */
  var flatRate: js.UndefOr[SchemaPrice] = js.native
  /**
    * If true, then the product can&#39;t ship. Must be true when set, can only
    * be set if all other fields are not set.
    */
  var noShipping: js.UndefOr[Boolean] = js.native
  /**
    * A percentage of the price represented as a number in decimal notation
    * (e.g., &quot;5.4&quot;). Can only be set if all other fields are not set.
    */
  var pricePercentage: js.UndefOr[String] = js.native
  /**
    * The name of a subtable. Can only be set in table cells (i.e., not for
    * single values), and only if all other fields are not set.
    */
  var subtableName: js.UndefOr[String] = js.native
}

object SchemaValue {
  @scala.inline
  def apply(
    carrierRateName: String = null,
    flatRate: SchemaPrice = null,
    noShipping: js.UndefOr[Boolean] = js.undefined,
    pricePercentage: String = null,
    subtableName: String = null
  ): SchemaValue = {
    val __obj = js.Dynamic.literal()
    if (carrierRateName != null) __obj.updateDynamic("carrierRateName")(carrierRateName.asInstanceOf[js.Any])
    if (flatRate != null) __obj.updateDynamic("flatRate")(flatRate.asInstanceOf[js.Any])
    if (!js.isUndefined(noShipping)) __obj.updateDynamic("noShipping")(noShipping.get.asInstanceOf[js.Any])
    if (pricePercentage != null) __obj.updateDynamic("pricePercentage")(pricePercentage.asInstanceOf[js.Any])
    if (subtableName != null) __obj.updateDynamic("subtableName")(subtableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaValue]
  }
}

