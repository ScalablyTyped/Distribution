package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3WebhookServiceDirectoryConfig extends StObject {
  
  /**
    * Generic Service configuration of this webhook.
    */
  var genericWebService: js.UndefOr[SchemaGoogleCloudDialogflowCxV3WebhookGenericWebService] = js.undefined
  
  /**
    * Required. The name of [Service Directory](https://cloud.google.com/service-directory) service. Format: `projects//locations//namespaces//services/`. `Location ID` of the service directory must be the same as the location of the agent.
    */
  var service: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3WebhookServiceDirectoryConfig {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3WebhookServiceDirectoryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3WebhookServiceDirectoryConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3WebhookServiceDirectoryConfig](x: Self) {
    
    inline def setGenericWebService(value: SchemaGoogleCloudDialogflowCxV3WebhookGenericWebService): Self = StObject.set(x, "genericWebService", value.asInstanceOf[js.Any])
    
    inline def setGenericWebServiceUndefined: Self = StObject.set(x, "genericWebService", js.undefined)
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceNull: Self = StObject.set(x, "service", null)
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
