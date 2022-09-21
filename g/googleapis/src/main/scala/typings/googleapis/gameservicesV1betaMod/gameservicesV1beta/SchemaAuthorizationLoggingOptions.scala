package typings.googleapis.gameservicesV1betaMod.gameservicesV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAuthorizationLoggingOptions extends StObject {
  
  /**
    * The type of the permission that was checked.
    */
  var permissionType: js.UndefOr[String | Null] = js.undefined
}
object SchemaAuthorizationLoggingOptions {
  
  inline def apply(): SchemaAuthorizationLoggingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthorizationLoggingOptions]
  }
  
  extension [Self <: SchemaAuthorizationLoggingOptions](x: Self) {
    
    inline def setPermissionType(value: String): Self = StObject.set(x, "permissionType", value.asInstanceOf[js.Any])
    
    inline def setPermissionTypeNull: Self = StObject.set(x, "permissionType", null)
    
    inline def setPermissionTypeUndefined: Self = StObject.set(x, "permissionType", js.undefined)
  }
}
