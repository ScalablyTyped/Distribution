package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBindingDelta extends StObject {
  
  /**
    * The action that was performed on a Binding. Required
    */
  var action: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The condition that is associated with this binding.
    */
  var condition: js.UndefOr[SchemaExpr] = js.undefined
  
  /**
    * A single identity requesting access for a Google Cloud resource. Follows the same format of Binding.members. Required
    */
  var member: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Role that is assigned to `members`. For example, `roles/viewer`, `roles/editor`, or `roles/owner`. Required
    */
  var role: js.UndefOr[String | Null] = js.undefined
}
object SchemaBindingDelta {
  
  inline def apply(): SchemaBindingDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBindingDelta]
  }
  
  extension [Self <: SchemaBindingDelta](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setCondition(value: SchemaExpr): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setMember(value: String): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
    
    inline def setMemberNull: Self = StObject.set(x, "member", null)
    
    inline def setMemberUndefined: Self = StObject.set(x, "member", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleNull: Self = StObject.set(x, "role", null)
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
