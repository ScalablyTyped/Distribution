package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1ValidationMessage extends StObject {
  
  /**
    * The message detail.
    */
  var detail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource names of the resources where the message is found.
    */
  var resourceNames: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3beta1ResourceName]] = js.undefined
  
  /**
    * The type of the resources where the message is found.
    */
  var resourceType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The names of the resources where the message is found.
    */
  var resources: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Indicates the severity of the message.
    */
  var severity: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1ValidationMessage {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1ValidationMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1ValidationMessage]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1ValidationMessage](x: Self) {
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailNull: Self = StObject.set(x, "detail", null)
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setResourceNames(value: js.Array[SchemaGoogleCloudDialogflowCxV3beta1ResourceName]): Self = StObject.set(x, "resourceNames", value.asInstanceOf[js.Any])
    
    inline def setResourceNamesUndefined: Self = StObject.set(x, "resourceNames", js.undefined)
    
    inline def setResourceNamesVarargs(value: SchemaGoogleCloudDialogflowCxV3beta1ResourceName*): Self = StObject.set(x, "resourceNames", js.Array(value*))
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeNull: Self = StObject.set(x, "resourceType", null)
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesNull: Self = StObject.set(x, "resources", null)
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityNull: Self = StObject.set(x, "severity", null)
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
  }
}
