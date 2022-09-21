package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaActingUser extends StObject {
  
  /**
    * The email address of the user when the user performed the action.
    */
  var email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A profile image URL for the user. May not be present if the user has changed their email address or deleted their account.
    */
  var imageUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaActingUser {
  
  inline def apply(): SchemaActingUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActingUser]
  }
  
  extension [Self <: SchemaActingUser](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlNull: Self = StObject.set(x, "imageUrl", null)
    
    inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
  }
}
