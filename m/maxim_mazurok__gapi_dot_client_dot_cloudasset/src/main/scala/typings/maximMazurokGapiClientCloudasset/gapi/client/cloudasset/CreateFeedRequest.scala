package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFeedRequest extends StObject {
  
  /**
    * Required. The feed details. The field `name` must be empty and it will be generated in the format of: projects/project_number/feeds/feed_id folders/folder_number/feeds/feed_id
    * organizations/organization_number/feeds/feed_id
    */
  var feed: js.UndefOr[Feed] = js.undefined
  
  /** Required. This is the client-assigned asset feed identifier and it needs to be unique under a specific parent project/folder/organization. */
  var feedId: js.UndefOr[String] = js.undefined
}
object CreateFeedRequest {
  
  @scala.inline
  def apply(): CreateFeedRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFeedRequest]
  }
  
  @scala.inline
  implicit class CreateFeedRequestMutableBuilder[Self <: CreateFeedRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeed(value: Feed): Self = StObject.set(x, "feed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedId(value: String): Self = StObject.set(x, "feedId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedIdUndefined: Self = StObject.set(x, "feedId", js.undefined)
    
    @scala.inline
    def setFeedUndefined: Self = StObject.set(x, "feed", js.undefined)
  }
}
