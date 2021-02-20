package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Remove an account as a matter collaborator.
  */
@js.native
trait SchemaRemoveMatterPermissionsRequest extends StObject {
  
  /**
    * The account ID.
    */
  var accountId: js.UndefOr[String] = js.native
}
object SchemaRemoveMatterPermissionsRequest {
  
  @scala.inline
  def apply(): SchemaRemoveMatterPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRemoveMatterPermissionsRequest]
  }
  
  @scala.inline
  implicit class SchemaRemoveMatterPermissionsRequestMutableBuilder[Self <: SchemaRemoveMatterPermissionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
  }
}
