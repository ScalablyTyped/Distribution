package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for the Check method.
  */
@js.native
trait SchemaCheckRequest extends StObject {
  
  /**
    * The operation to be checked.
    */
  var operation: js.UndefOr[SchemaOperation] = js.native
  
  /**
    * Requests the project settings to be returned as part of the check
    * response.
    */
  var requestProjectSettings: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies which version of service configuration should be used to
    * process the request.  If unspecified or no matching version can be found,
    * the latest one will be used.
    */
  var serviceConfigId: js.UndefOr[String] = js.native
  
  /**
    * Indicates if service activation check should be skipped for this request.
    * Default behavior is to perform the check and apply relevant quota.
    * WARNING: Setting this flag to &quot;true&quot; will disable quota
    * enforcement.
    */
  var skipActivationCheck: js.UndefOr[Boolean] = js.native
}
object SchemaCheckRequest {
  
  @scala.inline
  def apply(): SchemaCheckRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCheckRequest]
  }
  
  @scala.inline
  implicit class SchemaCheckRequestMutableBuilder[Self <: SchemaCheckRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperation(value: SchemaOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    @scala.inline
    def setRequestProjectSettings(value: Boolean): Self = StObject.set(x, "requestProjectSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestProjectSettingsUndefined: Self = StObject.set(x, "requestProjectSettings", js.undefined)
    
    @scala.inline
    def setServiceConfigId(value: String): Self = StObject.set(x, "serviceConfigId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceConfigIdUndefined: Self = StObject.set(x, "serviceConfigId", js.undefined)
    
    @scala.inline
    def setSkipActivationCheck(value: Boolean): Self = StObject.set(x, "skipActivationCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipActivationCheckUndefined: Self = StObject.set(x, "skipActivationCheck", js.undefined)
  }
}
