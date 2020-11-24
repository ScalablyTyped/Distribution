package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The ListNotificationChannelDescriptors response.
  */
@js.native
trait SchemaListNotificationChannelDescriptorsResponse extends js.Object {
  
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
  implicit class SchemaListNotificationChannelDescriptorsResponseOps[Self <: SchemaListNotificationChannelDescriptorsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChannelDescriptorsVarargs(value: SchemaNotificationChannelDescriptor*): Self = this.set("channelDescriptors", js.Array(value :_*))
    
    @scala.inline
    def setChannelDescriptors(value: js.Array[SchemaNotificationChannelDescriptor]): Self = this.set("channelDescriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelDescriptors: Self = this.set("channelDescriptors", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
