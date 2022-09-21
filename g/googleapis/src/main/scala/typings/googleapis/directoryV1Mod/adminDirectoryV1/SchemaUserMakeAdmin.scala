package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUserMakeAdmin extends StObject {
  
  /**
    * Indicates the administrator status of the user.
    */
  var status: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaUserMakeAdmin {
  
  inline def apply(): SchemaUserMakeAdmin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserMakeAdmin]
  }
  
  extension [Self <: SchemaUserMakeAdmin](x: Self) {
    
    inline def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
