package typings.jsforce.apiMetadataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfileObjectPermissions extends StObject {
  
  var allowCreate: js.UndefOr[Boolean] = js.undefined
  
  var allowDelete: js.UndefOr[Boolean] = js.undefined
  
  var allowEdit: js.UndefOr[Boolean] = js.undefined
  
  var allowRead: js.UndefOr[Boolean] = js.undefined
  
  var modifyAllRecords: js.UndefOr[Boolean] = js.undefined
  
  var `object`: String
  
  var viewAllRecords: js.UndefOr[Boolean] = js.undefined
}
object ProfileObjectPermissions {
  
  inline def apply(`object`: String): ProfileObjectPermissions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileObjectPermissions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProfileObjectPermissions] (val x: Self) extends AnyVal {
    
    inline def setAllowCreate(value: Boolean): Self = StObject.set(x, "allowCreate", value.asInstanceOf[js.Any])
    
    inline def setAllowCreateUndefined: Self = StObject.set(x, "allowCreate", js.undefined)
    
    inline def setAllowDelete(value: Boolean): Self = StObject.set(x, "allowDelete", value.asInstanceOf[js.Any])
    
    inline def setAllowDeleteUndefined: Self = StObject.set(x, "allowDelete", js.undefined)
    
    inline def setAllowEdit(value: Boolean): Self = StObject.set(x, "allowEdit", value.asInstanceOf[js.Any])
    
    inline def setAllowEditUndefined: Self = StObject.set(x, "allowEdit", js.undefined)
    
    inline def setAllowRead(value: Boolean): Self = StObject.set(x, "allowRead", value.asInstanceOf[js.Any])
    
    inline def setAllowReadUndefined: Self = StObject.set(x, "allowRead", js.undefined)
    
    inline def setModifyAllRecords(value: Boolean): Self = StObject.set(x, "modifyAllRecords", value.asInstanceOf[js.Any])
    
    inline def setModifyAllRecordsUndefined: Self = StObject.set(x, "modifyAllRecords", js.undefined)
    
    inline def setObject(value: String): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setViewAllRecords(value: Boolean): Self = StObject.set(x, "viewAllRecords", value.asInstanceOf[js.Any])
    
    inline def setViewAllRecordsUndefined: Self = StObject.set(x, "viewAllRecords", js.undefined)
  }
}
