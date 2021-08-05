package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A known user.
  */
trait SchemaKnownUser extends StObject {
  
  /**
    * True if this is the user making the request.
    */
  var isCurrentUser: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The identifier for this user that can be used with the People API to get
    * more information. The format is &quot;people/ACCOUNT_ID&quot;. See
    * https://developers.google.com/people/.
    */
  var personName: js.UndefOr[String] = js.undefined
}
object SchemaKnownUser {
  
  inline def apply(): SchemaKnownUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKnownUser]
  }
  
  extension [Self <: SchemaKnownUser](x: Self) {
    
    inline def setIsCurrentUser(value: Boolean): Self = StObject.set(x, "isCurrentUser", value.asInstanceOf[js.Any])
    
    inline def setIsCurrentUserUndefined: Self = StObject.set(x, "isCurrentUser", js.undefined)
    
    inline def setPersonName(value: String): Self = StObject.set(x, "personName", value.asInstanceOf[js.Any])
    
    inline def setPersonNameUndefined: Self = StObject.set(x, "personName", js.undefined)
  }
}
