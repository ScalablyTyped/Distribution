package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * One delta entry for Binding. Each individual change (only one member in
  * each entry) to a binding will be a separate entry.
  */
trait SchemaBindingDelta extends StObject {
  
  /**
    * The action that was performed on a Binding. Required
    */
  var action: js.UndefOr[String] = js.undefined
  
  /**
    * Unimplemented. The condition that is associated with this binding. This
    * field is logged only for Cloud Audit Logging.
    */
  var condition: js.UndefOr[SchemaExpr] = js.undefined
  
  /**
    * A single identity requesting access for a Cloud Platform resource.
    * Follows the same format of Binding.members. Required
    */
  var member: js.UndefOr[String] = js.undefined
  
  /**
    * Role that is assigned to `members`. For example, `roles/viewer`,
    * `roles/editor`, or `roles/owner`. Required
    */
  var role: js.UndefOr[String] = js.undefined
}
object SchemaBindingDelta {
  
  inline def apply(): SchemaBindingDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBindingDelta]
  }
  
  extension [Self <: SchemaBindingDelta](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setCondition(value: SchemaExpr): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setMember(value: String): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
    
    inline def setMemberUndefined: Self = StObject.set(x, "member", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
