package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The ListNotificationChannelDescriptors response.
  */
@js.native
trait SchemaListNotificationChannelDescriptorsResponse extends StObject {
  
  /**
    * The monitored resource descriptors supported for the specified project,
    * optionally filtered.
    */
  var channelDescriptors: js.UndefOr[js.Array[SchemaNotificationChannelDescriptor]] = js.native
  
  /**
    * If not empty, indicates that there may be more results that match the
    * request. Use the value in the page_token field in a subsequent request to
    * fetch the next set of results. If empty, all results have been returned.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaListNotificationChannelDescriptorsResponse {
  
  @scala.inline
  def apply(): SchemaListNotificationChannelDescriptorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListNotificationChannelDescriptorsResponse]
  }
  
  @scala.inline
  implicit class SchemaListNotificationChannelDescriptorsResponseMutableBuilder[Self <: SchemaListNotificationChannelDescriptorsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelDescriptors(value: js.Array[SchemaNotificationChannelDescriptor]): Self = StObject.set(x, "channelDescriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelDescriptorsUndefined: Self = StObject.set(x, "channelDescriptors", js.undefined)
    
    @scala.inline
    def setChannelDescriptorsVarargs(value: SchemaNotificationChannelDescriptor*): Self = StObject.set(x, "channelDescriptors", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
