package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentOutstreamPositionTargetingOptionDetails extends js.Object {
  
  /** Output only. The content outstream position. */
  var contentOutstreamPosition: js.UndefOr[String] = js.native
}
object ContentOutstreamPositionTargetingOptionDetails {
  
  @scala.inline
  def apply(): ContentOutstreamPositionTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentOutstreamPositionTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class ContentOutstreamPositionTargetingOptionDetailsOps[Self <: ContentOutstreamPositionTargetingOptionDetails] (val x: Self) extends AnyVal {
    
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
    def setContentOutstreamPosition(value: String): Self = this.set("contentOutstreamPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentOutstreamPosition: Self = this.set("contentOutstreamPosition", js.undefined)
  }
}
