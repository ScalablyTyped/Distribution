package typings.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined utility-types.utility-types.Diff<instagram-private-api.instagram-private-api/dist/sticker-builder/stickers.SliderSticker, instagram-private-api.instagram-private-api/dist/sticker-builder/stickers.InstaSticker> */
trait DiffSliderStickerInstaSti extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var emoji: String
  var question: String
  var sliderVoteAverage: js.UndefOr[Double] = js.undefined
  var sliderVoteCount: js.UndefOr[Double] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
  var viewerCanVote: js.UndefOr[Boolean] = js.undefined
  var viewerVote: js.UndefOr[Double] = js.undefined
}

object DiffSliderStickerInstaSti {
  @scala.inline
  def apply(
    emoji: String,
    question: String,
    backgroundColor: String = null,
    sliderVoteAverage: Int | Double = null,
    sliderVoteCount: Int | Double = null,
    textColor: String = null,
    viewerCanVote: js.UndefOr[Boolean] = js.undefined,
    viewerVote: Int | Double = null
  ): DiffSliderStickerInstaSti = {
    val __obj = js.Dynamic.literal(emoji = emoji.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (sliderVoteAverage != null) __obj.updateDynamic("sliderVoteAverage")(sliderVoteAverage.asInstanceOf[js.Any])
    if (sliderVoteCount != null) __obj.updateDynamic("sliderVoteCount")(sliderVoteCount.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    if (!js.isUndefined(viewerCanVote)) __obj.updateDynamic("viewerCanVote")(viewerCanVote.asInstanceOf[js.Any])
    if (viewerVote != null) __obj.updateDynamic("viewerVote")(viewerVote.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffSliderStickerInstaSti]
  }
}

