package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceContactgroupsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. Set to true to also delete the contacts in the specified group.
    */
  var deleteContacts: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required. The resource name of the contact group to delete.
    */
  var resourceName: js.UndefOr[String] = js.undefined
}
object ParamsResourceContactgroupsDelete {
  
  inline def apply(): ParamsResourceContactgroupsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceContactgroupsDelete]
  }
  
  extension [Self <: ParamsResourceContactgroupsDelete](x: Self) {
    
    inline def setDeleteContacts(value: Boolean): Self = StObject.set(x, "deleteContacts", value.asInstanceOf[js.Any])
    
    inline def setDeleteContactsUndefined: Self = StObject.set(x, "deleteContacts", js.undefined)
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
