package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Value extends js.Object {
  
  /** The name of a carrier rate referring to a carrier rate defined in the same rate group. Can only be set if all other fields are not set. */
  var carrierRateName: js.UndefOr[String] = js.native
  
  /** A flat rate. Can only be set if all other fields are not set. */
  var flatRate: js.UndefOr[Price] = js.native
  
  /** If true, then the product can't ship. Must be true when set, can only be set if all other fields are not set. */
  var noShipping: js.UndefOr[Boolean] = js.native
  
  /** A percentage of the price represented as a number in decimal notation (e.g., `"5.4"`). Can only be set if all other fields are not set. */
  var pricePercentage: js.UndefOr[String] = js.native
  
  /** The name of a subtable. Can only be set in table cells (i.e., not for single values), and only if all other fields are not set. */
  var subtableName: js.UndefOr[String] = js.native
}
object Value {
  
  @scala.inline
  def apply(): Value = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  implicit class ValueOps[Self <: Value] (val x: Self) extends AnyVal {
    
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
    def setCarrierRateName(value: String): Self = this.set("carrierRateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarrierRateName: Self = this.set("carrierRateName", js.undefined)
    
    @scala.inline
    def setFlatRate(value: Price): Self = this.set("flatRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlatRate: Self = this.set("flatRate", js.undefined)
    
    @scala.inline
    def setNoShipping(value: Boolean): Self = this.set("noShipping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoShipping: Self = this.set("noShipping", js.undefined)
    
    @scala.inline
    def setPricePercentage(value: String): Self = this.set("pricePercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePricePercentage: Self = this.set("pricePercentage", js.undefined)
    
    @scala.inline
    def setSubtableName(value: String): Self = this.set("subtableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtableName: Self = this.set("subtableName", js.undefined)
  }
}
