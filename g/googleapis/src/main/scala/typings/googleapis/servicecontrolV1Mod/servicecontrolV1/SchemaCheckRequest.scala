package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for the Check method.
  */
trait SchemaCheckRequest extends StObject {
  
  /**
    * The operation to be checked.
    */
  var operation: js.UndefOr[SchemaOperation] = js.undefined
  
  /**
    * Requests the project settings to be returned as part of the check
    * response.
    */
  var requestProjectSettings: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies which version of service configuration should be used to
    * process the request.  If unspecified or no matching version can be found,
    * the latest one will be used.
    */
  var serviceConfigId: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates if service activation check should be skipped for this request.
    * Default behavior is to perform the check and apply relevant quota.
    * WARNING: Setting this flag to &quot;true&quot; will disable quota
    * enforcement.
    */
  var skipActivationCheck: js.UndefOr[Boolean] = js.undefined
}
object SchemaCheckRequest {
  
  inline def apply(): SchemaCheckRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCheckRequest]
  }
  
  extension [Self <: SchemaCheckRequest](x: Self) {
    
    inline def setOperation(value: SchemaOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setRequestProjectSettings(value: Boolean): Self = StObject.set(x, "requestProjectSettings", value.asInstanceOf[js.Any])
    
    inline def setRequestProjectSettingsUndefined: Self = StObject.set(x, "requestProjectSettings", js.undefined)
    
    inline def setServiceConfigId(value: String): Self = StObject.set(x, "serviceConfigId", value.asInstanceOf[js.Any])
    
    inline def setServiceConfigIdUndefined: Self = StObject.set(x, "serviceConfigId", js.undefined)
    
    inline def setSkipActivationCheck(value: Boolean): Self = StObject.set(x, "skipActivationCheck", value.asInstanceOf[js.Any])
    
    inline def setSkipActivationCheckUndefined: Self = StObject.set(x, "skipActivationCheck", js.undefined)
  }
}
