package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3ListWebhooksResponse extends StObject {
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The list of webhooks. There will be a maximum number of items returned based on the page_size field in the request. */
  var webhooks: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3Webhook]] = js.undefined
}
object GoogleCloudDialogflowCxV3ListWebhooksResponse {
  
  inline def apply(): GoogleCloudDialogflowCxV3ListWebhooksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3ListWebhooksResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3ListWebhooksResponse] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setWebhooks(value: js.Array[GoogleCloudDialogflowCxV3Webhook]): Self = StObject.set(x, "webhooks", value.asInstanceOf[js.Any])
    
    inline def setWebhooksUndefined: Self = StObject.set(x, "webhooks", js.undefined)
    
    inline def setWebhooksVarargs(value: GoogleCloudDialogflowCxV3Webhook*): Self = StObject.set(x, "webhooks", js.Array(value*))
  }
}
