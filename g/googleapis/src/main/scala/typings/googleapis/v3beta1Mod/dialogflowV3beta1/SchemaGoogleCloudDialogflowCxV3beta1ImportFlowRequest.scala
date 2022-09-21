package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1ImportFlowRequest extends StObject {
  
  /**
    * Uncompressed raw byte content for flow.
    */
  var flowContent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The [Google Cloud Storage](https://cloud.google.com/storage/docs/) URI to import flow from. The format of this URI must be `gs:///`. Dialogflow performs a read operation for the Cloud Storage object on the caller's behalf, so your request authentication must have read permissions for the object. For more information, see [Dialogflow access control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
    */
  var flowUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Flow import mode. If not specified, `KEEP` is assumed.
    */
  var importOption: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1ImportFlowRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1ImportFlowRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1ImportFlowRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1ImportFlowRequest](x: Self) {
    
    inline def setFlowContent(value: String): Self = StObject.set(x, "flowContent", value.asInstanceOf[js.Any])
    
    inline def setFlowContentNull: Self = StObject.set(x, "flowContent", null)
    
    inline def setFlowContentUndefined: Self = StObject.set(x, "flowContent", js.undefined)
    
    inline def setFlowUri(value: String): Self = StObject.set(x, "flowUri", value.asInstanceOf[js.Any])
    
    inline def setFlowUriNull: Self = StObject.set(x, "flowUri", null)
    
    inline def setFlowUriUndefined: Self = StObject.set(x, "flowUri", js.undefined)
    
    inline def setImportOption(value: String): Self = StObject.set(x, "importOption", value.asInstanceOf[js.Any])
    
    inline def setImportOptionNull: Self = StObject.set(x, "importOption", null)
    
    inline def setImportOptionUndefined: Self = StObject.set(x, "importOption", js.undefined)
  }
}
