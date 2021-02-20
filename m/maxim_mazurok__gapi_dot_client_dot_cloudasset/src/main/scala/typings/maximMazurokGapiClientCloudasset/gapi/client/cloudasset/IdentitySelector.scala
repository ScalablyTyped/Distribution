package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentitySelector extends StObject {
  
  /**
    * Required. The identity appear in the form of members in [IAM policy binding](https://cloud.google.com/iam/reference/rest/v1/Binding). The examples of supported forms are:
    * "user:mike@example.com", "group:admins@example.com", "domain:google.com", "serviceAccount:my-project-id@appspot.gserviceaccount.com". Notice that wildcard characters (such as * and
    * ?) are not supported. You must give a specific identity.
    */
  var identity: js.UndefOr[String] = js.native
}
object IdentitySelector {
  
  @scala.inline
  def apply(): IdentitySelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentitySelector]
  }
  
  @scala.inline
  implicit class IdentitySelectorMutableBuilder[Self <: IdentitySelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
  }
}
