package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUserGender extends StObject {
  
  /**
    * AddressMeAs. A human-readable string containing the proper way to refer to the profile owner by humans for example he/him/his or they/them/their.
    */
  var addressMeAs: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Custom gender.
    */
  var customGender: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Gender.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaUserGender {
  
  inline def apply(): SchemaUserGender = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserGender]
  }
  
  extension [Self <: SchemaUserGender](x: Self) {
    
    inline def setAddressMeAs(value: String): Self = StObject.set(x, "addressMeAs", value.asInstanceOf[js.Any])
    
    inline def setAddressMeAsNull: Self = StObject.set(x, "addressMeAs", null)
    
    inline def setAddressMeAsUndefined: Self = StObject.set(x, "addressMeAs", js.undefined)
    
    inline def setCustomGender(value: String): Self = StObject.set(x, "customGender", value.asInstanceOf[js.Any])
    
    inline def setCustomGenderNull: Self = StObject.set(x, "customGender", null)
    
    inline def setCustomGenderUndefined: Self = StObject.set(x, "customGender", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
