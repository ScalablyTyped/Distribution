package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Warehouse extends StObject {
  
  /** Business days of the warehouse. If not set, will be Monday to Friday by default. */
  var businessDayConfig: js.UndefOr[BusinessDayConfig] = js.undefined
  
  /** Required. The latest time of day that an order can be accepted and begin processing. Later orders will be processed in the next day. The time is based on the warehouse postal code. */
  var cutoffTime: js.UndefOr[WarehouseCutoffTime] = js.undefined
  
  /**
    * Required. The number of days it takes for this warehouse to pack up and ship an item. This is on the warehouse level, but can be overridden on the offer level based on the
    * attributes of an item.
    */
  var handlingDays: js.UndefOr[String] = js.undefined
  
  /** Required. The name of the warehouse. Must be unique within account. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Required. Shipping address of the warehouse. */
  var shippingAddress: js.UndefOr[Address] = js.undefined
}
object Warehouse {
  
  inline def apply(): Warehouse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Warehouse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Warehouse] (val x: Self) extends AnyVal {
    
    inline def setBusinessDayConfig(value: BusinessDayConfig): Self = StObject.set(x, "businessDayConfig", value.asInstanceOf[js.Any])
    
    inline def setBusinessDayConfigUndefined: Self = StObject.set(x, "businessDayConfig", js.undefined)
    
    inline def setCutoffTime(value: WarehouseCutoffTime): Self = StObject.set(x, "cutoffTime", value.asInstanceOf[js.Any])
    
    inline def setCutoffTimeUndefined: Self = StObject.set(x, "cutoffTime", js.undefined)
    
    inline def setHandlingDays(value: String): Self = StObject.set(x, "handlingDays", value.asInstanceOf[js.Any])
    
    inline def setHandlingDaysUndefined: Self = StObject.set(x, "handlingDays", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setShippingAddress(value: Address): Self = StObject.set(x, "shippingAddress", value.asInstanceOf[js.Any])
    
    inline def setShippingAddressUndefined: Self = StObject.set(x, "shippingAddress", js.undefined)
  }
}
