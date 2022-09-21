package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTestOrderPickupDetailsPickupPerson extends StObject {
  
  /**
    * Required. Full name of the pickup person.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The phone number of the person picking up the items.
    */
  var phoneNumber: js.UndefOr[String | Null] = js.undefined
}
object SchemaTestOrderPickupDetailsPickupPerson {
  
  inline def apply(): SchemaTestOrderPickupDetailsPickupPerson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestOrderPickupDetailsPickupPerson]
  }
  
  extension [Self <: SchemaTestOrderPickupDetailsPickupPerson](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberNull: Self = StObject.set(x, "phoneNumber", null)
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
  }
}
