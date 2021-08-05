package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reference to a user, group, or domain.
  */
trait SchemaPrincipal extends StObject {
  
  /**
    * This principal is a group identified using an external identity. The name
    * field must specify the group resource name with this format:
    * identitysources/{source_id}/groups/{ID}
    */
  var groupResourceName: js.UndefOr[String] = js.undefined
  
  /**
    * This principal is a GSuite user, group or domain.
    */
  var gsuitePrincipal: js.UndefOr[SchemaGSuitePrincipal] = js.undefined
  
  /**
    * This principal is a user identified using an external identity. The name
    * field must specify the user resource name with this format:
    * identitysources/{source_id}/users/{ID}
    */
  var userResourceName: js.UndefOr[String] = js.undefined
}
object SchemaPrincipal {
  
  inline def apply(): SchemaPrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrincipal]
  }
  
  extension [Self <: SchemaPrincipal](x: Self) {
    
    inline def setGroupResourceName(value: String): Self = StObject.set(x, "groupResourceName", value.asInstanceOf[js.Any])
    
    inline def setGroupResourceNameUndefined: Self = StObject.set(x, "groupResourceName", js.undefined)
    
    inline def setGsuitePrincipal(value: SchemaGSuitePrincipal): Self = StObject.set(x, "gsuitePrincipal", value.asInstanceOf[js.Any])
    
    inline def setGsuitePrincipalUndefined: Self = StObject.set(x, "gsuitePrincipal", js.undefined)
    
    inline def setUserResourceName(value: String): Self = StObject.set(x, "userResourceName", value.asInstanceOf[js.Any])
    
    inline def setUserResourceNameUndefined: Self = StObject.set(x, "userResourceName", js.undefined)
  }
}
