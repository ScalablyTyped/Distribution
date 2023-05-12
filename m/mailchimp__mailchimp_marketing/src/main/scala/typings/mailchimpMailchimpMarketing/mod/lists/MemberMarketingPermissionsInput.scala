package typings.mailchimpMailchimpMarketing.mod.lists

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberMarketingPermissionsInput extends StObject {
  
  var enabled: Boolean
  
  var marketing_permission_id: String
}
object MemberMarketingPermissionsInput {
  
  inline def apply(enabled: Boolean, marketing_permission_id: String): MemberMarketingPermissionsInput = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], marketing_permission_id = marketing_permission_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberMarketingPermissionsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MemberMarketingPermissionsInput] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setMarketing_permission_id(value: String): Self = StObject.set(x, "marketing_permission_id", value.asInstanceOf[js.Any])
  }
}
