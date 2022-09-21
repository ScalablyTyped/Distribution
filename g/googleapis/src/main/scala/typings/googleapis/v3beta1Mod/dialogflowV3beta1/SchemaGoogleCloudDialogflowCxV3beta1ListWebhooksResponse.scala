package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1ListWebhooksResponse extends StObject {
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of webhooks. There will be a maximum number of items returned based on the page_size field in the request.
    */
  var webhooks: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3beta1Webhook]] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1ListWebhooksResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1ListWebhooksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1ListWebhooksResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1ListWebhooksResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setWebhooks(value: js.Array[SchemaGoogleCloudDialogflowCxV3beta1Webhook]): Self = StObject.set(x, "webhooks", value.asInstanceOf[js.Any])
    
    inline def setWebhooksUndefined: Self = StObject.set(x, "webhooks", js.undefined)
    
    inline def setWebhooksVarargs(value: SchemaGoogleCloudDialogflowCxV3beta1Webhook*): Self = StObject.set(x, "webhooks", js.Array(value*))
  }
}
