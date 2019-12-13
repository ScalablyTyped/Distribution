package typings.instagramDashPrivateDashApi.distResponsesIgtvDotBrowseDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgtvBrowseFeedResponseImage_versions2 extends js.Object {
  var additional_candidates: IgtvBrowseFeedResponseAdditional_candidates
  var candidates: js.Array[IgtvBrowseFeedResponseCandidatesItem]
}

object IgtvBrowseFeedResponseImage_versions2 {
  @scala.inline
  def apply(
    additional_candidates: IgtvBrowseFeedResponseAdditional_candidates,
    candidates: js.Array[IgtvBrowseFeedResponseCandidatesItem]
  ): IgtvBrowseFeedResponseImage_versions2 = {
    val __obj = js.Dynamic.literal(additional_candidates = additional_candidates.asInstanceOf[js.Any], candidates = candidates.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IgtvBrowseFeedResponseImage_versions2]
  }
}

