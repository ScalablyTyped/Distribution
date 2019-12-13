package typings.instagramDashPrivateDashApi.distResponsesIgtvDotChannelDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgtvChannelFeedResponseImage_versions2 extends js.Object {
  var additional_candidates: IgtvChannelFeedResponseAdditional_candidates
  var candidates: js.Array[IgtvChannelFeedResponseCandidatesItem]
}

object IgtvChannelFeedResponseImage_versions2 {
  @scala.inline
  def apply(
    additional_candidates: IgtvChannelFeedResponseAdditional_candidates,
    candidates: js.Array[IgtvChannelFeedResponseCandidatesItem]
  ): IgtvChannelFeedResponseImage_versions2 = {
    val __obj = js.Dynamic.literal(additional_candidates = additional_candidates.asInstanceOf[js.Any], candidates = candidates.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IgtvChannelFeedResponseImage_versions2]
  }
}

