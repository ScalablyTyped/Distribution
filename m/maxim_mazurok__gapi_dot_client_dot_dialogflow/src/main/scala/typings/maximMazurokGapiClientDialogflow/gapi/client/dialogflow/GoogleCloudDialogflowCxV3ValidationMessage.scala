package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3ValidationMessage extends StObject {
  
  /** The message detail. */
  var detail: js.UndefOr[String] = js.undefined
  
  /** The resource names of the resources where the message is found. */
  var resourceNames: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3ResourceName]] = js.undefined
  
  /** The type of the resources where the message is found. */
  var resourceType: js.UndefOr[String] = js.undefined
  
  /** The names of the resources where the message is found. */
  var resources: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Indicates the severity of the message. */
  var severity: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3ValidationMessage {
  
  inline def apply(): GoogleCloudDialogflowCxV3ValidationMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3ValidationMessage]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3ValidationMessage](x: Self) {
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setResourceNames(value: js.Array[GoogleCloudDialogflowCxV3ResourceName]): Self = StObject.set(x, "resourceNames", value.asInstanceOf[js.Any])
    
    inline def setResourceNamesUndefined: Self = StObject.set(x, "resourceNames", js.undefined)
    
    inline def setResourceNamesVarargs(value: GoogleCloudDialogflowCxV3ResourceName*): Self = StObject.set(x, "resourceNames", js.Array(value*))
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
  }
}
