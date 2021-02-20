package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserRef extends StObject {
  
  /** Email ID of this user. */
  var email: js.UndefOr[String] = js.native
  
  /** User ID. */
  var id: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
}
object UserRef {
  
  @scala.inline
  def apply(): UserRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserRef]
  }
  
  @scala.inline
  implicit class UserRefMutableBuilder[Self <: UserRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
