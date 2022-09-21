package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAssignedUserRole extends StObject {
  
  /**
    * The ID of the advertiser that the assigend user role applies to.
    */
  var advertiserId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The ID of the assigned user role.
    */
  var assignedUserRoleId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the partner that the assigned user role applies to.
    */
  var partnerId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The user role to assign to a user for the entity.
    */
  var userRole: js.UndefOr[String | Null] = js.undefined
}
object SchemaAssignedUserRole {
  
  inline def apply(): SchemaAssignedUserRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAssignedUserRole]
  }
  
  extension [Self <: SchemaAssignedUserRole](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdNull: Self = StObject.set(x, "advertiserId", null)
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setAssignedUserRoleId(value: String): Self = StObject.set(x, "assignedUserRoleId", value.asInstanceOf[js.Any])
    
    inline def setAssignedUserRoleIdNull: Self = StObject.set(x, "assignedUserRoleId", null)
    
    inline def setAssignedUserRoleIdUndefined: Self = StObject.set(x, "assignedUserRoleId", js.undefined)
    
    inline def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    inline def setPartnerIdNull: Self = StObject.set(x, "partnerId", null)
    
    inline def setPartnerIdUndefined: Self = StObject.set(x, "partnerId", js.undefined)
    
    inline def setUserRole(value: String): Self = StObject.set(x, "userRole", value.asInstanceOf[js.Any])
    
    inline def setUserRoleNull: Self = StObject.set(x, "userRole", null)
    
    inline def setUserRoleUndefined: Self = StObject.set(x, "userRole", js.undefined)
  }
}
