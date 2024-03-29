package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPolicyBinding extends StObject {
  
  /**
    * Uses the same format as in IAM policy. `member` must include both a prefix and ID. For example, `user:{emailId\}`, `serviceAccount:{emailId\}`, `group:{emailId\}`.
    */
  var members: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Role. (https://cloud.google.com/iam/docs/understanding-roles) For example, `roles/viewer`, `roles/editor`, or `roles/owner`.
    */
  var role: js.UndefOr[String | Null] = js.undefined
}
object SchemaPolicyBinding {
  
  inline def apply(): SchemaPolicyBinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPolicyBinding]
  }
  
  extension [Self <: SchemaPolicyBinding](x: Self) {
    
    inline def setMembers(value: js.Array[String]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersNull: Self = StObject.set(x, "members", null)
    
    inline def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    inline def setMembersVarargs(value: String*): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleNull: Self = StObject.set(x, "role", null)
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
