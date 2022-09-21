package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPhoneNumber extends StObject {
  
  /**
    * The phone number of the person.
    */
  var phoneNumber: js.UndefOr[String | Null] = js.undefined
  
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaPhoneNumber {
  
  inline def apply(): SchemaPhoneNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPhoneNumber]
  }
  
  extension [Self <: SchemaPhoneNumber](x: Self) {
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberNull: Self = StObject.set(x, "phoneNumber", null)
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
