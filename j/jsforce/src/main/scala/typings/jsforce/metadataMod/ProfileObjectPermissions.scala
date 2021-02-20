package typings.jsforce.metadataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProfileObjectPermissions extends StObject {
  
  var allowCreate: js.UndefOr[Boolean] = js.native
  
  var allowDelete: js.UndefOr[Boolean] = js.native
  
  var allowEdit: js.UndefOr[Boolean] = js.native
  
  var allowRead: js.UndefOr[Boolean] = js.native
  
  var modifyAllRecords: js.UndefOr[Boolean] = js.native
  
  var `object`: String = js.native
  
  var viewAllRecords: js.UndefOr[Boolean] = js.native
}
object ProfileObjectPermissions {
  
  @scala.inline
  def apply(`object`: String): ProfileObjectPermissions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileObjectPermissions]
  }
  
  @scala.inline
  implicit class ProfileObjectPermissionsMutableBuilder[Self <: ProfileObjectPermissions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowCreate(value: Boolean): Self = StObject.set(x, "allowCreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowCreateUndefined: Self = StObject.set(x, "allowCreate", js.undefined)
    
    @scala.inline
    def setAllowDelete(value: Boolean): Self = StObject.set(x, "allowDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowDeleteUndefined: Self = StObject.set(x, "allowDelete", js.undefined)
    
    @scala.inline
    def setAllowEdit(value: Boolean): Self = StObject.set(x, "allowEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowEditUndefined: Self = StObject.set(x, "allowEdit", js.undefined)
    
    @scala.inline
    def setAllowRead(value: Boolean): Self = StObject.set(x, "allowRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowReadUndefined: Self = StObject.set(x, "allowRead", js.undefined)
    
    @scala.inline
    def setModifyAllRecords(value: Boolean): Self = StObject.set(x, "modifyAllRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifyAllRecordsUndefined: Self = StObject.set(x, "modifyAllRecords", js.undefined)
    
    @scala.inline
    def setObject(value: String): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewAllRecords(value: Boolean): Self = StObject.set(x, "viewAllRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewAllRecordsUndefined: Self = StObject.set(x, "viewAllRecords", js.undefined)
  }
}
