package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to sign out user.
  */
@js.native
trait SchemaIdentitytoolkitRelyingpartySignOutUserRequest extends StObject {
  
  /**
    * Instance id token of the app.
    */
  var instanceId: js.UndefOr[String] = js.native
  
  /**
    * The local ID of the user.
    */
  var localId: js.UndefOr[String] = js.native
}
object SchemaIdentitytoolkitRelyingpartySignOutUserRequest {
  
  @scala.inline
  def apply(): SchemaIdentitytoolkitRelyingpartySignOutUserRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartySignOutUserRequest]
  }
  
  @scala.inline
  implicit class SchemaIdentitytoolkitRelyingpartySignOutUserRequestMutableBuilder[Self <: SchemaIdentitytoolkitRelyingpartySignOutUserRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    @scala.inline
    def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalIdUndefined: Self = StObject.set(x, "localId", js.undefined)
  }
}
