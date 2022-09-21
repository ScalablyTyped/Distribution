package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListAccountLabelsResponse extends StObject {
  
  /**
    * The labels from the specified account.
    */
  var accountLabels: js.UndefOr[js.Array[SchemaAccountLabel]] = js.undefined
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListAccountLabelsResponse {
  
  inline def apply(): SchemaListAccountLabelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAccountLabelsResponse]
  }
  
  extension [Self <: SchemaListAccountLabelsResponse](x: Self) {
    
    inline def setAccountLabels(value: js.Array[SchemaAccountLabel]): Self = StObject.set(x, "accountLabels", value.asInstanceOf[js.Any])
    
    inline def setAccountLabelsUndefined: Self = StObject.set(x, "accountLabels", js.undefined)
    
    inline def setAccountLabelsVarargs(value: SchemaAccountLabel*): Self = StObject.set(x, "accountLabels", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
