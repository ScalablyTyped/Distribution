package typings.googleapis.mybusinessqandaV1Mod.mybusinessqandaV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAuthor extends StObject {
  
  /**
    * The display name of the user
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The profile photo URI of the user.
    */
  var profilePhotoUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of user the author is.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaAuthor {
  
  inline def apply(): SchemaAuthor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthor]
  }
  
  extension [Self <: SchemaAuthor](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setProfilePhotoUri(value: String): Self = StObject.set(x, "profilePhotoUri", value.asInstanceOf[js.Any])
    
    inline def setProfilePhotoUriNull: Self = StObject.set(x, "profilePhotoUri", null)
    
    inline def setProfilePhotoUriUndefined: Self = StObject.set(x, "profilePhotoUri", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
