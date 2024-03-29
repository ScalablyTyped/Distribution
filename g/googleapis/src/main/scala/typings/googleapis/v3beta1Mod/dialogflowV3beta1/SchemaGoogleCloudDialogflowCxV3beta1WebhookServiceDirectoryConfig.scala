package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1WebhookServiceDirectoryConfig extends StObject {
  
  /**
    * Generic Service configuration of this webhook.
    */
  var genericWebService: js.UndefOr[SchemaGoogleCloudDialogflowCxV3beta1WebhookGenericWebService] = js.undefined
  
  /**
    * Required. The name of [Service Directory](https://cloud.google.com/service-directory) service. Format: `projects//locations//namespaces//services/`. `Location ID` of the service directory must be the same as the location of the agent.
    */
  var service: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1WebhookServiceDirectoryConfig {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1WebhookServiceDirectoryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1WebhookServiceDirectoryConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1WebhookServiceDirectoryConfig](x: Self) {
    
    inline def setGenericWebService(value: SchemaGoogleCloudDialogflowCxV3beta1WebhookGenericWebService): Self = StObject.set(x, "genericWebService", value.asInstanceOf[js.Any])
    
    inline def setGenericWebServiceUndefined: Self = StObject.set(x, "genericWebService", js.undefined)
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceNull: Self = StObject.set(x, "service", null)
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
