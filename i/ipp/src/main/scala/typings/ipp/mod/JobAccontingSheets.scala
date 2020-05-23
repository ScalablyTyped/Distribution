package typings.ipp.mod

import typings.ipp.ippStrings.none
import typings.ipp.ippStrings.standard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobAccontingSheets extends js.Object {
  var `job-accounting-output-bin`: js.UndefOr[OutputBin] = js.undefined
  var `job-accounting-sheets-type`: js.UndefOr[none | standard] = js.undefined
  var media: js.UndefOr[Media] = js.undefined
  var `media-col`: js.UndefOr[MediaInterface] = js.undefined
}

object JobAccontingSheets {
  @scala.inline
  def apply(
    `job-accounting-output-bin`: OutputBin = null,
    `job-accounting-sheets-type`: none | standard = null,
    media: Media = null,
    `media-col`: MediaInterface = null
  ): JobAccontingSheets = {
    val __obj = js.Dynamic.literal()
    if (`job-accounting-output-bin` != null) __obj.updateDynamic("job-accounting-output-bin")(`job-accounting-output-bin`.asInstanceOf[js.Any])
    if (`job-accounting-sheets-type` != null) __obj.updateDynamic("job-accounting-sheets-type")(`job-accounting-sheets-type`.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (`media-col` != null) __obj.updateDynamic("media-col")(`media-col`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobAccontingSheets]
  }
}

