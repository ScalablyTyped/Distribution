package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitiveMembershipRole extends StObject {
  
  /** TransitiveMembershipRole in string format. Currently supported TransitiveMembershipRoles: `"MEMBER"`, `"OWNER"`, and `"MANAGER"`. */
  var role: js.UndefOr[String] = js.undefined
}
object TransitiveMembershipRole {
  
  inline def apply(): TransitiveMembershipRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitiveMembershipRole]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransitiveMembershipRole] (val x: Self) extends AnyVal {
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
