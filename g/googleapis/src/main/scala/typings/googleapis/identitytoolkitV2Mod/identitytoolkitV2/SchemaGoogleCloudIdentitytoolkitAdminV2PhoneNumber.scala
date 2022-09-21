package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitAdminV2PhoneNumber extends StObject {
  
  /**
    * Whether phone number auth is enabled for the project or not.
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * A map of that can be used for phone auth testing.
    */
  var testPhoneNumbers: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitAdminV2PhoneNumber {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitAdminV2PhoneNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitAdminV2PhoneNumber]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitAdminV2PhoneNumber](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setTestPhoneNumbers(value: StringDictionary[String]): Self = StObject.set(x, "testPhoneNumbers", value.asInstanceOf[js.Any])
    
    inline def setTestPhoneNumbersNull: Self = StObject.set(x, "testPhoneNumbers", null)
    
    inline def setTestPhoneNumbersUndefined: Self = StObject.set(x, "testPhoneNumbers", js.undefined)
  }
}
