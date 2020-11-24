package typings.instagramPrivateApi.igtvChannelFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgtvChannelFeedResponseImageVersions2 extends js.Object {
  
  var additional_candidates: IgtvChannelFeedResponseAdditionalCandidates = js.native
  
  var candidates: js.Array[IgtvChannelFeedResponseCandidatesItem] = js.native
}
object IgtvChannelFeedResponseImageVersions2 {
  
  @scala.inline
  def apply(
    additional_candidates: IgtvChannelFeedResponseAdditionalCandidates,
    candidates: js.Array[IgtvChannelFeedResponseCandidatesItem]
  ): IgtvChannelFeedResponseImageVersions2 = {
    val __obj = js.Dynamic.literal(additional_candidates = additional_candidates.asInstanceOf[js.Any], candidates = candidates.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvChannelFeedResponseImageVersions2]
  }
  
  @scala.inline
  implicit class IgtvChannelFeedResponseImageVersions2Ops[Self <: IgtvChannelFeedResponseImageVersions2] (val x: Self) extends AnyVal {
    
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
    def setAdditional_candidates(value: IgtvChannelFeedResponseAdditionalCandidates): Self = this.set("additional_candidates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCandidatesVarargs(value: IgtvChannelFeedResponseCandidatesItem*): Self = this.set("candidates", js.Array(value :_*))
    
    @scala.inline
    def setCandidates(value: js.Array[IgtvChannelFeedResponseCandidatesItem]): Self = this.set("candidates", value.asInstanceOf[js.Any])
  }
}
