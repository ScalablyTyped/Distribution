package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Principal extends StObject {
  
  /** This principal is a group identified using an external identity. The name field must specify the group resource name with this format: identitysources/{source_id}/groups/{ID} */
  var groupResourceName: js.UndefOr[String] = js.native
  
  /** This principal is a GSuite user, group or domain. */
  var gsuitePrincipal: js.UndefOr[GSuitePrincipal] = js.native
  
  /** This principal is a user identified using an external identity. The name field must specify the user resource name with this format: identitysources/{source_id}/users/{ID} */
  var userResourceName: js.UndefOr[String] = js.native
}
object Principal {
  
  @scala.inline
  def apply(): Principal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Principal]
  }
  
  @scala.inline
  implicit class PrincipalMutableBuilder[Self <: Principal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupResourceName(value: String): Self = StObject.set(x, "groupResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupResourceNameUndefined: Self = StObject.set(x, "groupResourceName", js.undefined)
    
    @scala.inline
    def setGsuitePrincipal(value: GSuitePrincipal): Self = StObject.set(x, "gsuitePrincipal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGsuitePrincipalUndefined: Self = StObject.set(x, "gsuitePrincipal", js.undefined)
    
    @scala.inline
    def setUserResourceName(value: String): Self = StObject.set(x, "userResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserResourceNameUndefined: Self = StObject.set(x, "userResourceName", js.undefined)
  }
}
