package typings.instagramPrivateApi.igtvBrowseFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgtvBrowseFeedResponseImageVersions2 extends js.Object {
  var additional_candidates: IgtvBrowseFeedResponseAdditionalCandidates
  var candidates: js.Array[IgtvBrowseFeedResponseCandidatesItem]
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
}

