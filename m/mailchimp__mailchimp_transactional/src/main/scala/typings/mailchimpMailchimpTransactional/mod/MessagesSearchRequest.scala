package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagesSearchRequest
  extends StObject
     with BaseRequest {
  
  /** an array of API keys to narrow the search to, will return messages sent by ANY of the keys */
  var api_keys: js.UndefOr[js.Array[String]] = js.undefined
  
  /** start date */
  var date_from: js.UndefOr[String] = js.undefined
  
  /** end date */
  var date_to: js.UndefOr[String] = js.undefined
  
  /** the maximum number of results to return, defaults to 100, 1000 is the maximum */
  var limit: js.UndefOr[Double] = js.undefined
  
  /** search terms to find matching messages */
  var query: js.UndefOr[String] = js.undefined
  
  /** an array of sender addresses to narrow the search to, will return messages sent by ANY of the senders */
  var senders: js.UndefOr[js.Array[String]] = js.undefined
  
  /** an array of tag names to narrow the search to, will return messages that contain ANY of the tags */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}
object MessagesSearchRequest {
  
  inline def apply(): MessagesSearchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessagesSearchRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessagesSearchRequest] (val x: Self) extends AnyVal {
    
    inline def setApi_keys(value: js.Array[String]): Self = StObject.set(x, "api_keys", value.asInstanceOf[js.Any])
    
    inline def setApi_keysUndefined: Self = StObject.set(x, "api_keys", js.undefined)
    
    inline def setApi_keysVarargs(value: String*): Self = StObject.set(x, "api_keys", js.Array(value*))
    
    inline def setDate_from(value: String): Self = StObject.set(x, "date_from", value.asInstanceOf[js.Any])
    
    inline def setDate_fromUndefined: Self = StObject.set(x, "date_from", js.undefined)
    
    inline def setDate_to(value: String): Self = StObject.set(x, "date_to", value.asInstanceOf[js.Any])
    
    inline def setDate_toUndefined: Self = StObject.set(x, "date_to", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
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
