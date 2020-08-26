package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message contains details about how the deals will be paced.
  */
@js.native
trait SchemaDeliveryControl extends js.Object {
  /**
    * Specified the creative blocking levels to be applied. @OutputOnly
    */
  var creativeBlockingLevel: js.UndefOr[String] = js.native
  /**
    * Specifies how the impression delivery will be paced. @OutputOnly
    */
  var deliveryRateType: js.UndefOr[String] = js.native
  /**
    * Specifies any frequency caps. @OutputOnly
    */
  var frequencyCaps: js.UndefOr[js.Array[SchemaFrequencyCap]] = js.native
}

object SchemaDeliveryControl {
  @scala.inline
  def apply(): SchemaDeliveryControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeliveryControl]
  }
  @scala.inline
  implicit class SchemaDeliveryControlOps[Self <: SchemaDeliveryControl] (val x: Self) extends AnyVal {
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
    def setCreativeBlockingLevel(value: String): Self = this.set("creativeBlockingLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreativeBlockingLevel: Self = this.set("creativeBlockingLevel", js.undefined)
    @scala.inline
    def setDeliveryRateType(value: String): Self = this.set("deliveryRateType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeliveryRateType: Self = this.set("deliveryRateType", js.undefined)
    @scala.inline
    def setFrequencyCapsVarargs(value: SchemaFrequencyCap*): Self = this.set("frequencyCaps", js.Array(value :_*))
    @scala.inline
    def setFrequencyCaps(value: js.Array[SchemaFrequencyCap]): Self = this.set("frequencyCaps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrequencyCaps: Self = this.set("frequencyCaps", js.undefined)
  }
  
}

