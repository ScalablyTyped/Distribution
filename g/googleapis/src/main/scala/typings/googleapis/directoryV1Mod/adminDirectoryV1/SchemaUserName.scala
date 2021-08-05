package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for name of a user in Directory API.
  */
trait SchemaUserName extends StObject {
  
  /**
    * Last Name
    */
  var familyName: js.UndefOr[String] = js.undefined
  
  /**
    * Full Name
    */
  var fullName: js.UndefOr[String] = js.undefined
  
  /**
    * First Name
    */
  var givenName: js.UndefOr[String] = js.undefined
}
object SchemaUserName {
  
  inline def apply(): SchemaUserName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserName]
  }
  
  extension [Self <: SchemaUserName](x: Self) {
    
    inline def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
    
    inline def setFamilyNameUndefined: Self = StObject.set(x, "familyName", js.undefined)
    
    inline def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    inline def setFullNameUndefined: Self = StObject.set(x, "fullName", js.undefined)
    
    inline def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
    
    inline def setGivenNameUndefined: Self = StObject.set(x, "givenName", js.undefined)
  }
}
