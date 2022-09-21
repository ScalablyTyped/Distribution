package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportsActivityRequest
  extends StObject
     with BaseRequest {
  
  /** an array of api keys to narrow the export to; message sent with ANY of the keys will be included */
  var api_keys: js.UndefOr[js.Array[String]] = js.undefined
  
  /** start date as a UTC string in YYYY-MM-DD HH:MM:SS format */
  var date_from: js.UndefOr[String] = js.undefined
  
  /** end date as a UTC string in YYYY-MM-DD HH:MM:SS format */
  var date_to: js.UndefOr[String] = js.undefined
  
  /** an optional email address to notify when the export job has finished */
  var notify_email: js.UndefOr[String] = js.undefined
  
  /** an array of senders to narrow the export to */
  var senders: js.UndefOr[js.Array[String]] = js.undefined
  
  /** an array of message states to narrow the export to; messages with ANY of the states will be included */
  var states: js.UndefOr[js.Array[ExportsMessageState]] = js.undefined
  
  /** an array of tag names to narrow the export to; will match messages that contain ANY of the tags */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}
object ExportsActivityRequest {
  
  inline def apply(): ExportsActivityRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportsActivityRequest]
  }
  
  extension [Self <: ExportsActivityRequest](x: Self) {
    
    inline def setApi_keys(value: js.Array[String]): Self = StObject.set(x, "api_keys", value.asInstanceOf[js.Any])
    
    inline def setApi_keysUndefined: Self = StObject.set(x, "api_keys", js.undefined)
    
    inline def setApi_keysVarargs(value: String*): Self = StObject.set(x, "api_keys", js.Array(value*))
    
    inline def setDate_from(value: String): Self = StObject.set(x, "date_from", value.asInstanceOf[js.Any])
    
    inline def setDate_fromUndefined: Self = StObject.set(x, "date_from", js.undefined)
    
    inline def setDate_to(value: String): Self = StObject.set(x, "date_to", value.asInstanceOf[js.Any])
    
    inline def setDate_toUndefined: Self = StObject.set(x, "date_to", js.undefined)
    
    inline def setNotify_email(value: String): Self = StObject.set(x, "notify_email", value.asInstanceOf[js.Any])
    
    inline def setNotify_emailUndefined: Self = StObject.set(x, "notify_email", js.undefined)
    
    inline def setSenders(value: js.Array[String]): Self = StObject.set(x, "senders", value.asInstanceOf[js.Any])
    
    inline def setSendersUndefined: Self = StObject.set(x, "senders", js.undefined)
    
    inline def setSendersVarargs(value: String*): Self = StObject.set(x, "senders", js.Array(value*))
    
    inline def setStates(value: js.Array[ExportsMessageState]): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    inline def setStatesUndefined: Self = StObject.set(x, "states", js.undefined)
    
    inline def setStatesVarargs(value: ExportsMessageState*): Self = StObject.set(x, "states", js.Array(value*))
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
