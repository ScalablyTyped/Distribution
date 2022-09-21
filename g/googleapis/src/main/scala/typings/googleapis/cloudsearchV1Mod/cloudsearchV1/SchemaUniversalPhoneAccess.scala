package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUniversalPhoneAccess extends StObject {
  
  /**
    * The PIN that users must enter after dialing a universal number. The pin consists of only decimal digits and the length may vary, though it generally is longer than a PhoneAccess.pin.
    */
  var pin: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This field has the same contents as the MeetingSpace.more_join_url field, and is included for compatibility reasons. Clients should use the other field instead. This field is deprecated and will be removed.
    */
  var pstnInfoUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaUniversalPhoneAccess {
  
  inline def apply(): SchemaUniversalPhoneAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUniversalPhoneAccess]
  }
  
  extension [Self <: SchemaUniversalPhoneAccess](x: Self) {
    
    inline def setPin(value: String): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
    
    inline def setPinNull: Self = StObject.set(x, "pin", null)
    
    inline def setPinUndefined: Self = StObject.set(x, "pin", js.undefined)
    
    inline def setPstnInfoUrl(value: String): Self = StObject.set(x, "pstnInfoUrl", value.asInstanceOf[js.Any])
    
    inline def setPstnInfoUrlNull: Self = StObject.set(x, "pstnInfoUrl", null)
    
    inline def setPstnInfoUrlUndefined: Self = StObject.set(x, "pstnInfoUrl", js.undefined)
  }
}
