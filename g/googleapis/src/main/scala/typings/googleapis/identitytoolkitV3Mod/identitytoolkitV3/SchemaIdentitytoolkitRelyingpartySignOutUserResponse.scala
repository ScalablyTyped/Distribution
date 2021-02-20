package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response of signing out user.
  */
@js.native
trait SchemaIdentitytoolkitRelyingpartySignOutUserResponse extends StObject {
  
  /**
    * The local ID of the user.
    */
  var localId: js.UndefOr[String] = js.native
}
object SchemaIdentitytoolkitRelyingpartySignOutUserResponse {
  
  @scala.inline
  def apply(): SchemaIdentitytoolkitRelyingpartySignOutUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartySignOutUserResponse]
  }
  
  @scala.inline
  implicit class SchemaIdentitytoolkitRelyingpartySignOutUserResponseMutableBuilder[Self <: SchemaIdentitytoolkitRelyingpartySignOutUserResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalIdUndefined: Self = StObject.set(x, "localId", js.undefined)
  }
}
