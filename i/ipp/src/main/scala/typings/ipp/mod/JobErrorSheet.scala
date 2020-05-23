package typings.ipp.mod

import typings.ipp.ippStrings.`on-error`
import typings.ipp.ippStrings.always
import typings.ipp.ippStrings.none
import typings.ipp.ippStrings.standard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobErrorSheet extends js.Object {
  var `job-error-sheet-type`: js.UndefOr[none | standard] = js.undefined
  var `job-error-sheet-when`: js.UndefOr[always | `on-error`] = js.undefined
  var media: js.UndefOr[Media] = js.undefined
  var `media-col`: js.UndefOr[MediaInterface] = js.undefined
}

object JobErrorSheet {
  @scala.inline
  def apply(
    `job-error-sheet-type`: none | standard = null,
    `job-error-sheet-when`: always | `on-error` = null,
    media: Media = null,
    `media-col`: MediaInterface = null
  ): JobErrorSheet = {
    val __obj = js.Dynamic.literal()
    if (`job-error-sheet-type` != null) __obj.updateDynamic("job-error-sheet-type")(`job-error-sheet-type`.asInstanceOf[js.Any])
    if (`job-error-sheet-when` != null) __obj.updateDynamic("job-error-sheet-when")(`job-error-sheet-when`.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (`media-col` != null) __obj.updateDynamic("media-col")(`media-col`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobErrorSheet]
  }
}

