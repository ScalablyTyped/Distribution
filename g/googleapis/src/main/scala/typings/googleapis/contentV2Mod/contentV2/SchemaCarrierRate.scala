package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaCarrierRate extends js.Object {
  /**
    * Carrier service, such as &quot;UPS&quot; or &quot;Fedex&quot;. The list
    * of supported carriers can be retrieved via the getSupportedCarriers
    * method. Required.
    */
  var carrierName: js.UndefOr[String] = js.native
  /**
    * Carrier service, such as &quot;ground&quot; or &quot;2 days&quot;. The
    * list of supported services for a carrier can be retrieved via the
    * getSupportedCarriers method. Required.
    */
  var carrierService: js.UndefOr[String] = js.native
  /**
    * Additive shipping rate modifier. Can be negative. For example {
    * &quot;value&quot;: &quot;1&quot;, &quot;currency&quot; : &quot;USD&quot;
    * } adds $1 to the rate, { &quot;value&quot;: &quot;-3&quot;,
    * &quot;currency&quot; : &quot;USD&quot; } removes $3 from the rate.
    * Optional.
    */
  var flatAdjustment: js.UndefOr[SchemaPrice] = js.native
  /**
    * Name of the carrier rate. Must be unique per rate group. Required.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Shipping origin for this carrier rate. Required.
    */
  var originPostalCode: js.UndefOr[String] = js.native
  /**
    * Multiplicative shipping rate modifier as a number in decimal notation.
    * Can be negative. For example &quot;5.4&quot; increases the rate by 5.4%,
    * &quot;-3&quot; decreases the rate by 3%. Optional.
    */
  var percentageAdjustment: js.UndefOr[String] = js.native
}

object SchemaCarrierRate {
  @scala.inline
  def apply(
    carrierName: String = null,
    carrierService: String = null,
    flatAdjustment: SchemaPrice = null,
    name: String = null,
    originPostalCode: String = null,
    percentageAdjustment: String = null
  ): SchemaCarrierRate = {
    val __obj = js.Dynamic.literal()
    if (carrierName != null) __obj.updateDynamic("carrierName")(carrierName.asInstanceOf[js.Any])
    if (carrierService != null) __obj.updateDynamic("carrierService")(carrierService.asInstanceOf[js.Any])
    if (flatAdjustment != null) __obj.updateDynamic("flatAdjustment")(flatAdjustment.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (originPostalCode != null) __obj.updateDynamic("originPostalCode")(originPostalCode.asInstanceOf[js.Any])
    if (percentageAdjustment != null) __obj.updateDynamic("percentageAdjustment")(percentageAdjustment.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCarrierRate]
  }
}

