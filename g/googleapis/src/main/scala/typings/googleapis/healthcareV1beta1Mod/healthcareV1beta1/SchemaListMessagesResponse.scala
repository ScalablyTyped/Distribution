package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListMessagesResponse extends StObject {
  
  /**
    * The returned Messages. Won't be more Messages than the value of page_size in the request. See view for populated fields.
    */
  var hl7V2Messages: js.UndefOr[js.Array[SchemaMessage]] = js.undefined
  
  /**
    * Token to retrieve the next page of results or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListMessagesResponse {
  
  inline def apply(): SchemaListMessagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListMessagesResponse]
  }
  
  extension [Self <: SchemaListMessagesResponse](x: Self) {
    
    inline def setHl7V2Messages(value: js.Array[SchemaMessage]): Self = StObject.set(x, "hl7V2Messages", value.asInstanceOf[js.Any])
    
    inline def setHl7V2MessagesUndefined: Self = StObject.set(x, "hl7V2Messages", js.undefined)
    
    inline def setHl7V2MessagesVarargs(value: SchemaMessage*): Self = StObject.set(x, "hl7V2Messages", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
