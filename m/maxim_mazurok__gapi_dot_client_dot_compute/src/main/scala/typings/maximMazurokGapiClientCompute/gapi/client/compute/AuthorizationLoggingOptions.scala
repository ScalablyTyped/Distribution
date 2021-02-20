package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizationLoggingOptions extends StObject {
  
  /** The type of the permission that was checked. */
  var permissionType: js.UndefOr[String] = js.native
}
object AuthorizationLoggingOptions {
  
  @scala.inline
  def apply(): AuthorizationLoggingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizationLoggingOptions]
  }
  
  @scala.inline
  implicit class AuthorizationLoggingOptionsMutableBuilder[Self <: AuthorizationLoggingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermissionType(value: String): Self = StObject.set(x, "permissionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionTypeUndefined: Self = StObject.set(x, "permissionType", js.undefined)
  }
}
