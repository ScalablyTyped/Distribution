package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitAdminV2Anonymous extends StObject {
  
  /**
    * Whether anonymous user auth is enabled for the project or not.
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitAdminV2Anonymous {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitAdminV2Anonymous = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitAdminV2Anonymous]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitAdminV2Anonymous](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
