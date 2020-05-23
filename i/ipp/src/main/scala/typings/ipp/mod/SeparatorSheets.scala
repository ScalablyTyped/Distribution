package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeparatorSheets extends js.Object {
  var media: js.UndefOr[Media] = js.undefined
  var `media-col`: js.UndefOr[MediaInterface] = js.undefined
  var `separator-sheets-type`: js.UndefOr[js.Array[SeparatorSheetsType]] = js.undefined
}

object SeparatorSheets {
  @scala.inline
  def apply(
    media: Media = null,
    `media-col`: MediaInterface = null,
    `separator-sheets-type`: js.Array[SeparatorSheetsType] = null
  ): SeparatorSheets = {
    val __obj = js.Dynamic.literal()
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (`media-col` != null) __obj.updateDynamic("media-col")(`media-col`.asInstanceOf[js.Any])
    if (`separator-sheets-type` != null) __obj.updateDynamic("separator-sheets-type")(`separator-sheets-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeparatorSheets]
  }
}

