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
    val __obj = js.Dynamic.literal(height = height, url = url, width = width)
    if (estimated_scans_sizes != null) __obj.updateDynamic("estimated_scans_sizes")(estimated_scans_sizes)
    __obj.asInstanceOf[SavedFeedResponseCandidatesItem]
  }
}

