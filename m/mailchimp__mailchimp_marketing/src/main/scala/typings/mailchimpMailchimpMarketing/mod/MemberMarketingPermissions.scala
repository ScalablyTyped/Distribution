package typings.mailchimpMailchimpMarketing.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberMarketingPermissions
  extends StObject
     with MemberMarketingPermissionsInput {
  
  var text: String
}
object MemberMarketingPermissions {
  
  inline def apply(enabled: Boolean, marketing_permission_id: String, text: String): MemberMarketingPermissions = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], marketing_permission_id = marketing_permission_id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberMarketingPermissions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MemberMarketingPermissions] (val x: Self) extends AnyVal {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
