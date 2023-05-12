package typings.mailchimpMailchimpMarketing.mod.lists

import typings.mailchimpMailchimpMarketing.anon.Emailaddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchListMembersResponse extends StObject {
  
  var errors: js.UndefOr[js.Array[Emailaddress]] = js.undefined
  
  var new_members: js.UndefOr[js.Array[MembersSuccessResponse]] = js.undefined
  
  var updated_members: js.UndefOr[js.Array[MembersSuccessResponse]] = js.undefined
}
object BatchListMembersResponse {
  
  inline def apply(): BatchListMembersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchListMembersResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchListMembersResponse] (val x: Self) extends AnyVal {
    
    inline def setErrors(value: js.Array[Emailaddress]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: Emailaddress*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setNew_members(value: js.Array[MembersSuccessResponse]): Self = StObject.set(x, "new_members", value.asInstanceOf[js.Any])
    
    inline def setNew_membersUndefined: Self = StObject.set(x, "new_members", js.undefined)
    
    inline def setNew_membersVarargs(value: MembersSuccessResponse*): Self = StObject.set(x, "new_members", js.Array(value*))
    
    inline def setUpdated_members(value: js.Array[MembersSuccessResponse]): Self = StObject.set(x, "updated_members", value.asInstanceOf[js.Any])
    
    inline def setUpdated_membersUndefined: Self = StObject.set(x, "updated_members", js.undefined)
    
    inline def setUpdated_membersVarargs(value: MembersSuccessResponse*): Self = StObject.set(x, "updated_members", js.Array(value*))
  }
}
