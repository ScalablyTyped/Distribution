package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductAvailabilityChangeEvent extends StObject {
  
  /** The new state of the product. This field will always be present. */
  var availabilityStatus: js.UndefOr[String] = js.undefined
  
  /** The id of the product (e.g. "app:com.google.android.gm") for which the product availability changed. This field will always be present. */
  var productId: js.UndefOr[String] = js.undefined
}
object ProductAvailabilityChangeEvent {
  
  inline def apply(): ProductAvailabilityChangeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductAvailabilityChangeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProductAvailabilityChangeEvent] (val x: Self) extends AnyVal {
    
    inline def setAvailabilityStatus(value: String): Self = StObject.set(x, "availabilityStatus", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityStatusUndefined: Self = StObject.set(x, "availabilityStatus", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}
