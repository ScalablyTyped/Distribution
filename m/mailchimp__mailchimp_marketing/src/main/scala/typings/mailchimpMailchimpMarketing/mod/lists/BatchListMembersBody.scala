package typings.mailchimpMailchimpMarketing.mod.lists

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchListMembersBody extends StObject {
  
  var members: js.Array[BatchListMembersBodyMembersObject]
  
  var sync_tags: js.UndefOr[Boolean] = js.undefined
  
  var update_existing: js.UndefOr[Boolean] = js.undefined
}
object BatchListMembersBody {
  
  inline def apply(members: js.Array[BatchListMembersBodyMembersObject]): BatchListMembersBody = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchListMembersBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchListMembersBody] (val x: Self) extends AnyVal {
    
    inline def setMembers(value: js.Array[BatchListMembersBodyMembersObject]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: BatchListMembersBodyMembersObject*): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setSync_tags(value: Boolean): Self = StObject.set(x, "sync_tags", value.asInstanceOf[js.Any])
    
    inline def setSync_tagsUndefined: Self = StObject.set(x, "sync_tags", js.undefined)
    
    inline def setUpdate_existing(value: Boolean): Self = StObject.set(x, "update_existing", value.asInstanceOf[js.Any])
    
    inline def setUpdate_existingUndefined: Self = StObject.set(x, "update_existing", js.undefined)
  }
}
