package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizationLoggingOptions extends StObject {
  
  /** This is deprecated and has no effect. Do not use. */
  var permissionType: js.UndefOr[String] = js.undefined
}
object AuthorizationLoggingOptions {
  
  inline def apply(): AuthorizationLoggingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizationLoggingOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthorizationLoggingOptions] (val x: Self) extends AnyVal {
    
    inline def setPermissionType(value: String): Self = StObject.set(x, "permissionType", value.asInstanceOf[js.Any])
    
    inline def setPermissionTypeUndefined: Self = StObject.set(x, "permissionType", js.undefined)
  }
}
