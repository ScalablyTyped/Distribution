package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaInventoryPickup extends js.Object {
  
  /**
    * Whether store pickup is available for this offer and whether the pickup
    * option should be shown as buy, reserve, or not supported. Only supported
    * for local inventory. Unless the value is &quot;not supported&quot;, must
    * be submitted together with pickupSla.
    */
  var pickupMethod: js.UndefOr[String] = js.native
  
  /**
    * The expected date that an order will be ready for pickup, relative to
    * when the order is placed. Only supported for local inventory. Must be
    * submitted together with pickupMethod.
    */
  var pickupSla: js.UndefOr[String] = js.native
}
object SchemaInventoryPickup {
  
  @scala.inline
  def apply(): SchemaInventoryPickup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInventoryPickup]
  }
  
  @scala.inline
  implicit class SchemaInventoryPickupOps[Self <: SchemaInventoryPickup] (val x: Self) extends AnyVal {
    
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
    def setPickupMethod(value: String): Self = this.set("pickupMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickupMethod: Self = this.set("pickupMethod", js.undefined)
    
    @scala.inline
    def setPickupSla(value: String): Self = this.set("pickupSla", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickupSla: Self = this.set("pickupSla", js.undefined)
  }
}
