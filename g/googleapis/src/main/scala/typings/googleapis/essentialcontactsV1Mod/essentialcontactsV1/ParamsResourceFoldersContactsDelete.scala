package typings.googleapis.essentialcontactsV1Mod.essentialcontactsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFoldersContactsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the contact to delete. Format: organizations/{organization_id\}/contacts/{contact_id\}, folders/{folder_id\}/contacts/{contact_id\} or projects/{project_id\}/contacts/{contact_id\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceFoldersContactsDelete {
  
  inline def apply(): ParamsResourceFoldersContactsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFoldersContactsDelete]
  }
  
  extension [Self <: ParamsResourceFoldersContactsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
