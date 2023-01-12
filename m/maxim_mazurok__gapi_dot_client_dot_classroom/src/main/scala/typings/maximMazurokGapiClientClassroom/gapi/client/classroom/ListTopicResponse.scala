package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTopicResponse extends StObject {
  
  /** Token identifying the next page of results to return. If empty, no further results are available. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Topic items that match the request. */
  var topic: js.UndefOr[js.Array[Topic]] = js.undefined
}
object ListTopicResponse {
  
  inline def apply(): ListTopicResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTopicResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTopicResponse] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTopic(value: js.Array[Topic]): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    
    inline def setTopicVarargs(value: Topic*): Self = StObject.set(x, "topic", js.Array(value*))
  }
}
