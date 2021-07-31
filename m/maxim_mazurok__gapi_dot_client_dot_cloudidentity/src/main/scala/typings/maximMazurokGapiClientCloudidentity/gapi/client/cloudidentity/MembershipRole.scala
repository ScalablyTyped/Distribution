package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MembershipRole extends StObject {
  
  /** The name of the `MembershipRole`. Must be one of `OWNER`, `MANAGER`, `MEMBER`. */
  var name: js.UndefOr[String] = js.undefined
}
object MembershipRole {
  
  @scala.inline
  def apply(): MembershipRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MembershipRole]
  }
  
  @scala.inline
  implicit class MembershipRoleMutableBuilder[Self <: MembershipRole] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
