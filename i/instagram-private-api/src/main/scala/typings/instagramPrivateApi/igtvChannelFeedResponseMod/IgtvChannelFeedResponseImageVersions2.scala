package typings.instagramPrivateApi.igtvChannelFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgtvChannelFeedResponseImageVersions2 extends js.Object {
  var additional_candidates: IgtvChannelFeedResponseAdditionalCandidates
  var candidates: js.Array[IgtvChannelFeedResponseCandidatesItem]
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
}

