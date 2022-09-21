package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContactGroupMembership extends StObject {
  
  /**
    * Output only. The contact group ID for the contact group membership.
    */
  var contactGroupId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name for the contact group, assigned by the server. An ASCII string, in the form of `contactGroups/{contact_group_id\}`. Only contact_group_resource_name can be used for modifying memberships. Any contact group membership can be removed, but only user group or "myContacts" or "starred" system groups memberships can be added. A contact must always have at least one contact group membership.
    */
  var contactGroupResourceName: js.UndefOr[String | Null] = js.undefined
}
object SchemaContactGroupMembership {
  
  inline def apply(): SchemaContactGroupMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContactGroupMembership]
  }
  
  extension [Self <: SchemaContactGroupMembership](x: Self) {
    
    inline def setContactGroupId(value: String): Self = StObject.set(x, "contactGroupId", value.asInstanceOf[js.Any])
    
    inline def setContactGroupIdNull: Self = StObject.set(x, "contactGroupId", null)
    
    inline def setContactGroupIdUndefined: Self = StObject.set(x, "contactGroupId", js.undefined)
    
    inline def setContactGroupResourceName(value: String): Self = StObject.set(x, "contactGroupResourceName", value.asInstanceOf[js.Any])
    
    inline def setContactGroupResourceNameNull: Self = StObject.set(x, "contactGroupResourceName", null)
    
    inline def setContactGroupResourceNameUndefined: Self = StObject.set(x, "contactGroupResourceName", js.undefined)
  }
}
