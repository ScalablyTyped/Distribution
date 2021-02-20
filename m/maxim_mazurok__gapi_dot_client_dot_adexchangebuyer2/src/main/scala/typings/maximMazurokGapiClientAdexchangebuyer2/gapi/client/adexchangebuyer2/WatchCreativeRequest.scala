package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WatchCreativeRequest extends StObject {
  
  /**
    * The Pub/Sub topic to publish notifications to. This topic must already exist and must give permission to ad-exchange-buyside-reports@google.com to write to the topic. This should be
    * the full resource name in "projects/{project_id}/topics/{topic_id}" format.
    */
  var topic: js.UndefOr[String] = js.native
}
object WatchCreativeRequest {
  
  @scala.inline
  def apply(): WatchCreativeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatchCreativeRequest]
  }
  
  @scala.inline
  implicit class WatchCreativeRequestMutableBuilder[Self <: WatchCreativeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
