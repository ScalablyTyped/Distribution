package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentInstreamPositionTargetingOptionDetails extends js.Object {
  
  /** Output only. The content instream position. */
  var contentInstreamPosition: js.UndefOr[String] = js.native
}
object ContentInstreamPositionTargetingOptionDetails {
  
  @scala.inline
  def apply(): ContentInstreamPositionTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentInstreamPositionTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class ContentInstreamPositionTargetingOptionDetailsOps[Self <: ContentInstreamPositionTargetingOptionDetails] (val x: Self) extends AnyVal {
    
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
  }
}
