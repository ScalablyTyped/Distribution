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
  def apply(): SchemaCarrierRate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCarrierRate]
  }
  @scala.inline
  implicit class SchemaCarrierRateOps[Self <: SchemaCarrierRate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCarrierName(value: String): Self = this.set("carrierName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCarrierName: Self = this.set("carrierName", js.undefined)
    @scala.inline
    def setCarrierService(value: String): Self = this.set("carrierService", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCarrierService: Self = this.set("carrierService", js.undefined)
    @scala.inline
    def setFlatAdjustment(value: SchemaPrice): Self = this.set("flatAdjustment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlatAdjustment: Self = this.set("flatAdjustment", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOriginPostalCode(value: String): Self = this.set("originPostalCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginPostalCode: Self = this.set("originPostalCode", js.undefined)
    @scala.inline
    def setPercentageAdjustment(value: String): Self = this.set("percentageAdjustment", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercentageAdjustment: Self = this.set("percentageAdjustment", js.undefined)
  }
  
}

