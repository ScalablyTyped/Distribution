package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderPickupDetailsCollector extends StObject {
  
  /**
    * Name of the person picking up the shipment.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Phone number of the person picking up the shipment.
    */
  var phoneNumber: js.UndefOr[String | Null] = js.undefined
}
object SchemaOrderPickupDetailsCollector {
  
  inline def apply(): SchemaOrderPickupDetailsCollector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderPickupDetailsCollector]
  }
  
  extension [Self <: SchemaOrderPickupDetailsCollector](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberNull: Self = StObject.set(x, "phoneNumber", null)
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
  }
}
