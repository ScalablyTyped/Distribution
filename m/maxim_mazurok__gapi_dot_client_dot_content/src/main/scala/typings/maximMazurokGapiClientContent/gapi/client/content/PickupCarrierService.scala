package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PickupCarrierService extends StObject {
  
  /** The name of the pickup carrier (for example, `"UPS"`). Required. */
  var carrierName: js.UndefOr[String] = js.undefined
  
  /** The name of the pickup service (for example, `"Access point"`). Required. */
  var serviceName: js.UndefOr[String] = js.undefined
}
object PickupCarrierService {
  
  inline def apply(): PickupCarrierService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickupCarrierService]
  }
  
  extension [Self <: PickupCarrierService](x: Self) {
    
    inline def setCarrierName(value: String): Self = StObject.set(x, "carrierName", value.asInstanceOf[js.Any])
    
    inline def setCarrierNameUndefined: Self = StObject.set(x, "carrierName", js.undefined)
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
  }
}
