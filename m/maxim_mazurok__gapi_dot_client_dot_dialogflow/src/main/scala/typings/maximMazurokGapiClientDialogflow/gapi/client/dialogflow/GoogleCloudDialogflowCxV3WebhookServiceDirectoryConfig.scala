package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfig extends StObject {
  
  /** Generic Service configuration of this webhook. */
  var genericWebService: js.UndefOr[GoogleCloudDialogflowCxV3WebhookGenericWebService] = js.undefined
  
  /**
    * Required. The name of [Service Directory](https://cloud.google.com/service-directory) service. Format: `projects//locations//namespaces//services/`. `Location ID` of the service
    * directory must be the same as the location of the agent.
    */
  var service: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfig {
  
  inline def apply(): GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfig] (val x: Self) extends AnyVal {
    
    inline def setGenericWebService(value: GoogleCloudDialogflowCxV3WebhookGenericWebService): Self = StObject.set(x, "genericWebService", value.asInstanceOf[js.Any])
    
    inline def setGenericWebServiceUndefined: Self = StObject.set(x, "genericWebService", js.undefined)
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
