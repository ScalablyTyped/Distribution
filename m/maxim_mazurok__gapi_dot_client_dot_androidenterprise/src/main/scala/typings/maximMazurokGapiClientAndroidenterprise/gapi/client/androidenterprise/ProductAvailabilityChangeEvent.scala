package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductAvailabilityChangeEvent extends StObject {
  
  /** The new state of the product. This field will always be present. */
  var availabilityStatus: js.UndefOr[String] = js.native
  
  /** The id of the product (e.g. "app:com.google.android.gm") for which the product availability changed. This field will always be present. */
  var productId: js.UndefOr[String] = js.native
}
object ProductAvailabilityChangeEvent {
  
  @scala.inline
  def apply(): ProductAvailabilityChangeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductAvailabilityChangeEvent]
  }
  
  @scala.inline
  implicit class ProductAvailabilityChangeEventMutableBuilder[Self <: ProductAvailabilityChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityStatus(value: String): Self = StObject.set(x, "availabilityStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityStatusUndefined: Self = StObject.set(x, "availabilityStatus", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}
