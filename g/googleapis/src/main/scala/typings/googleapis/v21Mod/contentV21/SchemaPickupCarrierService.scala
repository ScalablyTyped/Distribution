package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPickupCarrierService extends StObject {
  
  /**
    * The name of the pickup carrier (for example, `"UPS"`). Required.
    */
  var carrierName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the pickup service (for example, `"Access point"`). Required.
    */
  var serviceName: js.UndefOr[String | Null] = js.undefined
}
object SchemaPickupCarrierService {
  
  inline def apply(): SchemaPickupCarrierService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPickupCarrierService]
  }
  
  extension [Self <: SchemaPickupCarrierService](x: Self) {
    
    inline def setCarrierName(value: String): Self = StObject.set(x, "carrierName", value.asInstanceOf[js.Any])
    
    inline def setCarrierNameNull: Self = StObject.set(x, "carrierName", null)
    
    inline def setCarrierNameUndefined: Self = StObject.set(x, "carrierName", js.undefined)
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameNull: Self = StObject.set(x, "serviceName", null)
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
  }
}
