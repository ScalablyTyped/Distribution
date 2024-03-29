package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaKnownUser extends StObject {
  
  /**
    * True if this is the user making the request.
    */
  var isCurrentUser: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The identifier for this user that can be used with the People API to get more information. The format is `people/ACCOUNT_ID`. See https://developers.google.com/people/.
    */
  var personName: js.UndefOr[String | Null] = js.undefined
}
object SchemaKnownUser {
  
  inline def apply(): SchemaKnownUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKnownUser]
  }
  
  extension [Self <: SchemaKnownUser](x: Self) {
    
    inline def setIsCurrentUser(value: Boolean): Self = StObject.set(x, "isCurrentUser", value.asInstanceOf[js.Any])
    
    inline def setIsCurrentUserNull: Self = StObject.set(x, "isCurrentUser", null)
    
    inline def setIsCurrentUserUndefined: Self = StObject.set(x, "isCurrentUser", js.undefined)
    
    inline def setPersonName(value: String): Self = StObject.set(x, "personName", value.asInstanceOf[js.Any])
    
    inline def setPersonNameNull: Self = StObject.set(x, "personName", null)
    
    inline def setPersonNameUndefined: Self = StObject.set(x, "personName", js.undefined)
  }
}
