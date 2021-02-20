package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaInventoryPickup extends StObject {
  
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
  implicit class SchemaInventoryPickupMutableBuilder[Self <: SchemaInventoryPickup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPickupMethod(value: String): Self = StObject.set(x, "pickupMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickupMethodUndefined: Self = StObject.set(x, "pickupMethod", js.undefined)
    
    @scala.inline
    def setPickupSla(value: String): Self = StObject.set(x, "pickupSla", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickupSlaUndefined: Self = StObject.set(x, "pickupSla", js.undefined)
  }
}
