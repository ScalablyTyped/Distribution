package typings.instagramDashPrivateDashApi.distResponsesSavedDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavedFeedResponseCandidatesItem extends js.Object {
  var estimated_scans_sizes: js.UndefOr[js.Array[Double]] = js.undefined
  var height: Double
  var url: String
  var width: Double
}

object SavedFeedResponseCandidatesItem {
  @scala.inline
  def apply(height: Double, url: String, width: Double, estimated_scans_sizes: js.Array[Double] = null): SavedFeedResponseCandidatesItem = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (estimated_scans_sizes != null) __obj.updateDynamic("estimated_scans_sizes")(estimated_scans_sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedFeedResponseCandidatesItem]
  }
}

