package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeliveryControl extends js.Object {
  
  var creativeBlockingLevel: js.UndefOr[String] = js.native
  
  var deliveryRateType: js.UndefOr[String] = js.native
  
  var frequencyCaps: js.UndefOr[js.Array[DeliveryControlFrequencyCap]] = js.native
}
object DeliveryControl {
  
  @scala.inline
  def apply(): DeliveryControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeliveryControl]
  }
  
  @scala.inline
  implicit class DeliveryControlOps[Self <: DeliveryControl] (val x: Self) extends AnyVal {
    
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
    def setFrequencyCapsVarargs(value: DeliveryControlFrequencyCap*): Self = this.set("frequencyCaps", js.Array(value :_*))
    
    @scala.inline
    def setFrequencyCaps(value: js.Array[DeliveryControlFrequencyCap]): Self = this.set("frequencyCaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrequencyCaps: Self = this.set("frequencyCaps", js.undefined)
  }
}
