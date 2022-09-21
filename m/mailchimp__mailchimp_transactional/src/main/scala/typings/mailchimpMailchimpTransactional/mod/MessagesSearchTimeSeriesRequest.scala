package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagesSearchTimeSeriesRequest
  extends StObject
     with BaseRequest {
  
  /** start date */
  var date_from: js.UndefOr[String] = js.undefined
  
  /** end date */
  var date_to: js.UndefOr[String] = js.undefined
  
  /** the search terms to find matching messages for */
  var query: js.UndefOr[String] = js.undefined
  
  /** an array of sender addresses to narrow the search to, will return messages sent by ANY of the senders */
  var senders: js.UndefOr[js.Array[String]] = js.undefined
  
  /** an array of tag names to narrow the search to, will return messages that contain ANY of the tags */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}
object MessagesSearchTimeSeriesRequest {
  
  inline def apply(): MessagesSearchTimeSeriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessagesSearchTimeSeriesRequest]
  }
  
  extension [Self <: MessagesSearchTimeSeriesRequest](x: Self) {
    
    inline def setDate_from(value: String): Self = StObject.set(x, "date_from", value.asInstanceOf[js.Any])
    
    inline def setDate_fromUndefined: Self = StObject.set(x, "date_from", js.undefined)
    
    inline def setDate_to(value: String): Self = StObject.set(x, "date_to", value.asInstanceOf[js.Any])
    
    inline def setDate_toUndefined: Self = StObject.set(x, "date_to", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setSenders(value: js.Array[String]): Self = StObject.set(x, "senders", value.asInstanceOf[js.Any])
    
    inline def setSendersUndefined: Self = StObject.set(x, "senders", js.undefined)
    
    inline def setSendersVarargs(value: String*): Self = StObject.set(x, "senders", js.Array(value*))
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
