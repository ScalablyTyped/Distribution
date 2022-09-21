package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSqlServerUserDetails extends StObject {
  
  /**
    * If the user has been disabled
    */
  var disabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The server roles for this user
    */
  var serverRoles: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaSqlServerUserDetails {
  
  inline def apply(): SchemaSqlServerUserDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSqlServerUserDetails]
  }
  
  extension [Self <: SchemaSqlServerUserDetails](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledNull: Self = StObject.set(x, "disabled", null)
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setServerRoles(value: js.Array[String]): Self = StObject.set(x, "serverRoles", value.asInstanceOf[js.Any])
    
    inline def setServerRolesNull: Self = StObject.set(x, "serverRoles", null)
    
    inline def setServerRolesUndefined: Self = StObject.set(x, "serverRoles", js.undefined)
    
    inline def setServerRolesVarargs(value: String*): Self = StObject.set(x, "serverRoles", js.Array(value*))
  }
}
