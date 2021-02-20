package typings.maximMazurokGapiClientCloudtasks.gapi.client.cloudtasks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListQueuesResponse extends StObject {
  
  /**
    * A token to retrieve next page of results. To return the next page of results, call ListQueues with this value as the page_token. If the next_page_token is empty, there are no more
    * results. The page token is valid for only 2 hours.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The list of queues. */
  var queues: js.UndefOr[js.Array[Queue]] = js.native
}
object ListQueuesResponse {
  
  @scala.inline
  def apply(): ListQueuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQueuesResponse]
  }
  
  @scala.inline
  implicit class ListQueuesResponseMutableBuilder[Self <: ListQueuesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setQueues(value: js.Array[Queue]): Self = StObject.set(x, "queues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueuesUndefined: Self = StObject.set(x, "queues", js.undefined)
    
    @scala.inline
    def setQueuesVarargs(value: Queue*): Self = StObject.set(x, "queues", js.Array(value :_*))
  }
}
