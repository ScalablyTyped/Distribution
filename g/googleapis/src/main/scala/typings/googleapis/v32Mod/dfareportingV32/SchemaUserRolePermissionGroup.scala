package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a grouping of related user role permissions.
  */
@js.native
trait SchemaUserRolePermissionGroup extends StObject {
  
  /**
    * ID of this user role permission.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#userRolePermissionGroup&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Name of this user role permission group.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaUserRolePermissionGroup {
  
  @scala.inline
  def apply(): SchemaUserRolePermissionGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserRolePermissionGroup]
  }
  
  @scala.inline
  implicit class SchemaUserRolePermissionGroupMutableBuilder[Self <: SchemaUserRolePermissionGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
