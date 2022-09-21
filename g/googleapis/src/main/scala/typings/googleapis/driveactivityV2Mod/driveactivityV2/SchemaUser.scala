package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUser extends StObject {
  
  /**
    * A user whose account has since been deleted.
    */
  var deletedUser: js.UndefOr[SchemaDeletedUser] = js.undefined
  
  /**
    * A known user.
    */
  var knownUser: js.UndefOr[SchemaKnownUser] = js.undefined
  
  /**
    * A user about whom nothing is currently known.
    */
  var unknownUser: js.UndefOr[SchemaUnknownUser] = js.undefined
}
object SchemaUser {
  
  inline def apply(): SchemaUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUser]
  }
  
  extension [Self <: SchemaUser](x: Self) {
    
    inline def setDeletedUser(value: SchemaDeletedUser): Self = StObject.set(x, "deletedUser", value.asInstanceOf[js.Any])
    
    inline def setDeletedUserUndefined: Self = StObject.set(x, "deletedUser", js.undefined)
    
    inline def setKnownUser(value: SchemaKnownUser): Self = StObject.set(x, "knownUser", value.asInstanceOf[js.Any])
    
    inline def setKnownUserUndefined: Self = StObject.set(x, "knownUser", js.undefined)
    
    inline def setUnknownUser(value: SchemaUnknownUser): Self = StObject.set(x, "unknownUser", value.asInstanceOf[js.Any])
    
    inline def setUnknownUserUndefined: Self = StObject.set(x, "unknownUser", js.undefined)
  }
}
