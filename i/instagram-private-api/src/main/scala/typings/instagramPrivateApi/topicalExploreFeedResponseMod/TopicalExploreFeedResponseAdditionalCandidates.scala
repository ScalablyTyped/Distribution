package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicalExploreFeedResponseAdditionalCandidates extends js.Object {
  
  var first_frame: TopicalExploreFeedResponseFirstFrame = js.native
  
  var igtv_first_frame: TopicalExploreFeedResponseIgtvFirstFrame = js.native
}
object TopicalExploreFeedResponseAdditionalCandidates {
  
  @scala.inline
  def apply(
    first_frame: TopicalExploreFeedResponseFirstFrame,
    igtv_first_frame: TopicalExploreFeedResponseIgtvFirstFrame
  ): TopicalExploreFeedResponseAdditionalCandidates = {
    val __obj = js.Dynamic.literal(first_frame = first_frame.asInstanceOf[js.Any], igtv_first_frame = igtv_first_frame.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseAdditionalCandidates]
  }
  
  @scala.inline
  implicit class TopicalExploreFeedResponseAdditionalCandidatesOps[Self <: TopicalExploreFeedResponseAdditionalCandidates] (val x: Self) extends AnyVal {
    
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
    def setFirst_frame(value: TopicalExploreFeedResponseFirstFrame): Self = this.set("first_frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgtv_first_frame(value: TopicalExploreFeedResponseIgtvFirstFrame): Self = this.set("igtv_first_frame", value.asInstanceOf[js.Any])
  }
}
