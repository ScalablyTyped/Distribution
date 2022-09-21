package typings.googleapis.connectorsV1Mod.connectorsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRoleGrant extends StObject {
  
  /**
    * Template that UI can use to provide helper text to customers.
    */
  var helperTextTemplate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Prinicipal/Identity for whom the role need to assigned.
    */
  var principal: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource on which the roles needs to be granted for the principal.
    */
  var resource: js.UndefOr[SchemaResource] = js.undefined
  
  /**
    * List of roles that need to be granted.
    */
  var roles: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaRoleGrant {
  
  inline def apply(): SchemaRoleGrant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoleGrant]
  }
  
  extension [Self <: SchemaRoleGrant](x: Self) {
    
    inline def setHelperTextTemplate(value: String): Self = StObject.set(x, "helperTextTemplate", value.asInstanceOf[js.Any])
    
    inline def setHelperTextTemplateNull: Self = StObject.set(x, "helperTextTemplate", null)
    
    inline def setHelperTextTemplateUndefined: Self = StObject.set(x, "helperTextTemplate", js.undefined)
    
    inline def setPrincipal(value: String): Self = StObject.set(x, "principal", value.asInstanceOf[js.Any])
    
    inline def setPrincipalNull: Self = StObject.set(x, "principal", null)
    
    inline def setPrincipalUndefined: Self = StObject.set(x, "principal", js.undefined)
    
    inline def setResource(value: SchemaResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesNull: Self = StObject.set(x, "roles", null)
    
    inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    inline def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value*))
  }
}
