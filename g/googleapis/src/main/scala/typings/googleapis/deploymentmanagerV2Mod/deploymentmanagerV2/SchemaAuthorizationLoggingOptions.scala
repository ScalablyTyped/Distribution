package typings.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Authorization-related information used by Cloud Audit Logging.
  */
trait SchemaAuthorizationLoggingOptions extends StObject {
  
  /**
    * The type of the permission that was checked.
    */
  var permissionType: js.UndefOr[String] = js.undefined
}
object SchemaAuthorizationLoggingOptions {
  
  @scala.inline
  def apply(): SchemaAuthorizationLoggingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthorizationLoggingOptions]
  }
  
  @scala.inline
  implicit class SchemaAuthorizationLoggingOptionsMutableBuilder[Self <: SchemaAuthorizationLoggingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermissionType(value: String): Self = StObject.set(x, "permissionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionTypeUndefined: Self = StObject.set(x, "permissionType", js.undefined)
  }
}
