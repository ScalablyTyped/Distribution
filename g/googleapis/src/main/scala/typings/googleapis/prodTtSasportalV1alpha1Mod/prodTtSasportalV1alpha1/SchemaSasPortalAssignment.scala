package typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSasPortalAssignment extends StObject {
  
  /**
    * The identities the role is assigned to. It can have the following values: * `{user_email\}`: An email address that represents a specific Google account. For example: `alice@gmail.com`. * `{group_email\}`: An email address that represents a Google group. For example, `viewers@gmail.com`.
    */
  var members: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Required. Role that is assigned to `members`.
    */
  var role: js.UndefOr[String | Null] = js.undefined
}
object SchemaSasPortalAssignment {
  
  inline def apply(): SchemaSasPortalAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSasPortalAssignment]
  }
  
  extension [Self <: SchemaSasPortalAssignment](x: Self) {
    
    inline def setMembers(value: js.Array[String]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersNull: Self = StObject.set(x, "members", null)
    
    inline def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    inline def setMembersVarargs(value: String*): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleNull: Self = StObject.set(x, "role", null)
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
