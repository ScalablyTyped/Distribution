package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentInstreamPositionAssignedTargetingOptionDetails extends js.Object {
  
  /** Output only. The content instream position for video or audio ads. */
  var contentInstreamPosition: js.UndefOr[String] = js.native
  
  /** Required. The targeting_option_id field when targeting_type is `TARGETING_TYPE_CONTENT_INSTREAM_POSITION`. */
  var targetingOptionId: js.UndefOr[String] = js.native
}
object ContentInstreamPositionAssignedTargetingOptionDetails {
  
  @scala.inline
  def apply(): ContentInstreamPositionAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentInstreamPositionAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class ContentInstreamPositionAssignedTargetingOptionDetailsOps[Self <: ContentInstreamPositionAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
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
    def setContentInstreamPosition(value: String): Self = this.set("contentInstreamPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentInstreamPosition: Self = this.set("contentInstreamPosition", js.undefined)
    
    @scala.inline
    def setTargetingOptionId(value: String): Self = this.set("targetingOptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetingOptionId: Self = this.set("targetingOptionId", js.undefined)
  }
}
