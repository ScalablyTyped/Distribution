package typings.instagramPrivateApi.igtvBrowseFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgtvBrowseFeedResponseImageVersions2 extends js.Object {
  
  var additional_candidates: IgtvBrowseFeedResponseAdditionalCandidates = js.native
  
  var candidates: js.Array[IgtvBrowseFeedResponseCandidatesItem] = js.native
}
object IgtvBrowseFeedResponseImageVersions2 {
  
  @scala.inline
  def apply(
    additional_candidates: IgtvBrowseFeedResponseAdditionalCandidates,
    candidates: js.Array[IgtvBrowseFeedResponseCandidatesItem]
  ): IgtvBrowseFeedResponseImageVersions2 = {
    val __obj = js.Dynamic.literal(additional_candidates = additional_candidates.asInstanceOf[js.Any], candidates = candidates.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvBrowseFeedResponseImageVersions2]
  }
  
  @scala.inline
  implicit class IgtvBrowseFeedResponseImageVersions2Ops[Self <: IgtvBrowseFeedResponseImageVersions2] (val x: Self) extends AnyVal {
    
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
    def setAdditional_candidates(value: IgtvBrowseFeedResponseAdditionalCandidates): Self = this.set("additional_candidates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCandidatesVarargs(value: IgtvBrowseFeedResponseCandidatesItem*): Self = this.set("candidates", js.Array(value :_*))
    
    @scala.inline
    def setCandidates(value: js.Array[IgtvBrowseFeedResponseCandidatesItem]): Self = this.set("candidates", value.asInstanceOf[js.Any])
  }
}
