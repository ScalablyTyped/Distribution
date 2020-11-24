package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicalExploreFeedResponseImageVersions2 extends js.Object {
  
  var additional_candidates: js.UndefOr[TopicalExploreFeedResponseAdditionalCandidates] = js.native
  
  var candidates: js.Array[TopicalExploreFeedResponseCandidatesItem] = js.native
}
object TopicalExploreFeedResponseImageVersions2 {
  
  @scala.inline
  def apply(candidates: js.Array[TopicalExploreFeedResponseCandidatesItem]): TopicalExploreFeedResponseImageVersions2 = {
    val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseImageVersions2]
  }
  
  @scala.inline
  implicit class TopicalExploreFeedResponseImageVersions2Ops[Self <: TopicalExploreFeedResponseImageVersions2] (val x: Self) extends AnyVal {
    
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
    def setCandidatesVarargs(value: TopicalExploreFeedResponseCandidatesItem*): Self = this.set("candidates", js.Array(value :_*))
    
    @scala.inline
    def setCandidates(value: js.Array[TopicalExploreFeedResponseCandidatesItem]): Self = this.set("candidates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditional_candidates(value: TopicalExploreFeedResponseAdditionalCandidates): Self = this.set("additional_candidates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditional_candidates: Self = this.set("additional_candidates", js.undefined)
  }
}
