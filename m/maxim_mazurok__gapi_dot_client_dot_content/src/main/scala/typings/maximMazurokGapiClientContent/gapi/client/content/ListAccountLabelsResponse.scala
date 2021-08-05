package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAccountLabelsResponse extends StObject {
  
  /** The labels from the specified account. */
  var accountLabels: js.UndefOr[js.Array[AccountLabel]] = js.undefined
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListAccountLabelsResponse {
  
  inline def apply(): ListAccountLabelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccountLabelsResponse]
  }
  
  extension [Self <: ListAccountLabelsResponse](x: Self) {
    
    inline def setAccountLabels(value: js.Array[AccountLabel]): Self = StObject.set(x, "accountLabels", value.asInstanceOf[js.Any])
    
    inline def setAccountLabelsUndefined: Self = StObject.set(x, "accountLabels", js.undefined)
    
    inline def setAccountLabelsVarargs(value: AccountLabel*): Self = StObject.set(x, "accountLabels", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
