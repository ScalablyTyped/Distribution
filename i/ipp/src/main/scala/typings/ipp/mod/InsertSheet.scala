package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertSheet extends js.Object {
  var `insert-after-page-number`: js.UndefOr[Double] = js.undefined
  var `insert-count`: js.UndefOr[Double] = js.undefined
  var media: js.UndefOr[Media] = js.undefined
  var `media-col`: js.UndefOr[MediaInterface] = js.undefined
}

object InsertSheet {
  @scala.inline
  def apply(
    `insert-after-page-number`: js.UndefOr[Double] = js.undefined,
    `insert-count`: js.UndefOr[Double] = js.undefined,
    media: Media = null,
    `media-col`: MediaInterface = null
  ): InsertSheet = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`insert-after-page-number`)) __obj.updateDynamic("insert-after-page-number")(`insert-after-page-number`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`insert-count`)) __obj.updateDynamic("insert-count")(`insert-count`.get.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (`media-col` != null) __obj.updateDynamic("media-col")(`media-col`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertSheet]
  }
}

