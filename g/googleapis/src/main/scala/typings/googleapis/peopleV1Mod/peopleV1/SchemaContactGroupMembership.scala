package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Google contact group membership.
  */
trait SchemaContactGroupMembership extends StObject {
  
  /**
    * The contact group ID for the contact group membership. The contact group
    * ID can be custom or one of these predefined values:  *  `myContacts` *
    * `starred` *  A numerical ID for user-created groups.
    */
  var contactGroupId: js.UndefOr[String] = js.undefined
}
object SchemaContactGroupMembership {
  
  inline def apply(): SchemaContactGroupMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContactGroupMembership]
  }
  
  extension [Self <: SchemaContactGroupMembership](x: Self) {
    
    inline def setContactGroupId(value: String): Self = StObject.set(x, "contactGroupId", value.asInstanceOf[js.Any])
    
    inline def setContactGroupIdUndefined: Self = StObject.set(x, "contactGroupId", js.undefined)
  }
}
