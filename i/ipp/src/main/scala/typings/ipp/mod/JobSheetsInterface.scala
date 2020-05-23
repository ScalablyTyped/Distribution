package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobSheetsInterface extends js.Object {
  var `job-sheets`: js.UndefOr[JobSheets] = js.undefined
  var media: js.UndefOr[Media] = js.undefined
  var `media-col`: js.UndefOr[MediaInterface] = js.undefined
}

object JobSheetsInterface {
  @scala.inline
  def apply(`job-sheets`: JobSheets = null, media: Media = null, `media-col`: MediaInterface = null): JobSheetsInterface = {
    val __obj = js.Dynamic.literal()
    if (`job-sheets` != null) __obj.updateDynamic("job-sheets")(`job-sheets`.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (`media-col` != null) __obj.updateDynamic("media-col")(`media-col`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobSheetsInterface]
  }
}

