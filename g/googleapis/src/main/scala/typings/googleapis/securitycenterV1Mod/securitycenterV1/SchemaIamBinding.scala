package typings.googleapis.securitycenterV1Mod.securitycenterV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIamBinding extends StObject {
  
  /**
    * The action that was performed on a Binding.
    */
  var action: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A single identity requesting access for a Cloud Platform resource, e.g. "foo@google.com".
    */
  var member: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Role that is assigned to "members". For example, "roles/viewer", "roles/editor", or "roles/owner".
    */
  var role: js.UndefOr[String | Null] = js.undefined
}
object SchemaIamBinding {
  
  inline def apply(): SchemaIamBinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIamBinding]
  }
  
  extension [Self <: SchemaIamBinding](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setMember(value: String): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
    
    inline def setMemberNull: Self = StObject.set(x, "member", null)
    
    inline def setMemberUndefined: Self = StObject.set(x, "member", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleNull: Self = StObject.set(x, "role", null)
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
