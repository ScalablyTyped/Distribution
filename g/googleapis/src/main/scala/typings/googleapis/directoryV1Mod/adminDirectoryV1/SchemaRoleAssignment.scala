package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for roleAssignment resource in Directory API.
  */
trait SchemaRoleAssignment extends StObject {
  
  /**
    * The unique ID of the user this role is assigned to.
    */
  var assignedTo: js.UndefOr[String] = js.undefined
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the API resource. This is always
    * admin#directory#roleAssignment.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * If the role is restricted to an organization unit, this contains the ID
    * for the organization unit the exercise of this role is restricted to.
    */
  var orgUnitId: js.UndefOr[String] = js.undefined
  
  /**
    * ID of this roleAssignment.
    */
  var roleAssignmentId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the role that is assigned.
    */
  var roleId: js.UndefOr[String] = js.undefined
  
  /**
    * The scope in which this role is assigned. Possible values are:  -
    * CUSTOMER - ORG_UNIT
    */
  var scopeType: js.UndefOr[String] = js.undefined
}
object SchemaRoleAssignment {
  
  inline def apply(): SchemaRoleAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoleAssignment]
  }
  
  extension [Self <: SchemaRoleAssignment](x: Self) {
    
    inline def setAssignedTo(value: String): Self = StObject.set(x, "assignedTo", value.asInstanceOf[js.Any])
    
    inline def setAssignedToUndefined: Self = StObject.set(x, "assignedTo", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setOrgUnitId(value: String): Self = StObject.set(x, "orgUnitId", value.asInstanceOf[js.Any])
    
    inline def setOrgUnitIdUndefined: Self = StObject.set(x, "orgUnitId", js.undefined)
    
    inline def setRoleAssignmentId(value: String): Self = StObject.set(x, "roleAssignmentId", value.asInstanceOf[js.Any])
    
    inline def setRoleAssignmentIdUndefined: Self = StObject.set(x, "roleAssignmentId", js.undefined)
    
    inline def setRoleId(value: String): Self = StObject.set(x, "roleId", value.asInstanceOf[js.Any])
    
    inline def setRoleIdUndefined: Self = StObject.set(x, "roleId", js.undefined)
    
    inline def setScopeType(value: String): Self = StObject.set(x, "scopeType", value.asInstanceOf[js.Any])
    
    inline def setScopeTypeUndefined: Self = StObject.set(x, "scopeType", js.undefined)
  }
}
