package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsScriptTypeUser extends StObject {
  
  /**
    * The user's domain.
    */
  var domain: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user's identifying email address.
    */
  var email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user's display name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user's photo.
    */
  var photoUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAppsScriptTypeUser {
  
  inline def apply(): SchemaGoogleAppsScriptTypeUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsScriptTypeUser]
  }
  
  extension [Self <: SchemaGoogleAppsScriptTypeUser](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainNull: Self = StObject.set(x, "domain", null)
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPhotoUrl(value: String): Self = StObject.set(x, "photoUrl", value.asInstanceOf[js.Any])
    
    inline def setPhotoUrlNull: Self = StObject.set(x, "photoUrl", null)
    
    inline def setPhotoUrlUndefined: Self = StObject.set(x, "photoUrl", js.undefined)
  }
}
