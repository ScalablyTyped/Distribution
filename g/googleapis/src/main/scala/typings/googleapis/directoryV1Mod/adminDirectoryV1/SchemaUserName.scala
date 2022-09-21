package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUserName extends StObject {
  
  /**
    * The user's last name. Required when creating a user account.
    */
  var familyName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user's full name formed by concatenating the first and last name values.
    */
  var fullName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user's first name. Required when creating a user account.
    */
  var givenName: js.UndefOr[String | Null] = js.undefined
}
object SchemaUserName {
  
  inline def apply(): SchemaUserName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserName]
  }
  
  extension [Self <: SchemaUserName](x: Self) {
    
    inline def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
    
    inline def setFamilyNameNull: Self = StObject.set(x, "familyName", null)
    
    inline def setFamilyNameUndefined: Self = StObject.set(x, "familyName", js.undefined)
    
    inline def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    inline def setFullNameNull: Self = StObject.set(x, "fullName", null)
    
    inline def setFullNameUndefined: Self = StObject.set(x, "fullName", js.undefined)
    
    inline def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
    
    inline def setGivenNameNull: Self = StObject.set(x, "givenName", null)
    
    inline def setGivenNameUndefined: Self = StObject.set(x, "givenName", js.undefined)
  }
}
