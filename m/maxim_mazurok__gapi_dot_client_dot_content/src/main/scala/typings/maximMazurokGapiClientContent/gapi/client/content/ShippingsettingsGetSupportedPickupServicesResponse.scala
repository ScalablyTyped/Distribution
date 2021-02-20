package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShippingsettingsGetSupportedPickupServicesResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#shippingsettingsGetSupportedPickupServicesResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** A list of supported pickup services. May be empty. */
  var pickupServices: js.UndefOr[js.Array[PickupServicesPickupService]] = js.native
}
object ShippingsettingsGetSupportedPickupServicesResponse {
  
  @scala.inline
  def apply(): ShippingsettingsGetSupportedPickupServicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShippingsettingsGetSupportedPickupServicesResponse]
  }
  
  @scala.inline
  implicit class ShippingsettingsGetSupportedPickupServicesResponseMutableBuilder[Self <: ShippingsettingsGetSupportedPickupServicesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPickupServices(value: js.Array[PickupServicesPickupService]): Self = StObject.set(x, "pickupServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickupServicesUndefined: Self = StObject.set(x, "pickupServices", js.undefined)
    
    @scala.inline
    def setPickupServicesVarargs(value: PickupServicesPickupService*): Self = StObject.set(x, "pickupServices", js.Array(value :_*))
  }
}
