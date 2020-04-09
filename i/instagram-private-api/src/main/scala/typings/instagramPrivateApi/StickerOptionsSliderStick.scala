package typings.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined instagram-private-api.instagram-private-api/dist/sticker-builder/sticker-builder.StickerOptions<instagram-private-api.instagram-private-api/dist/sticker-builder/stickers.SliderSticker> */
trait StickerOptionsSliderStick extends js.Object {
  var additionalConfigureProperties: js.UndefOr[js.Function0[_]] = js.undefined
  var backgroundColor: js.UndefOr[String] = js.undefined
  var bottom: js.UndefOr[js.Function0[this.type]] = js.undefined
  var center: js.UndefOr[js.Function0[this.type]] = js.undefined
  var emoji: String
  var height: js.UndefOr[Double] = js.undefined
  var id: js.UndefOr[js.Function0[String]] = js.undefined
  var isSticker: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[js.Function0[String]] = js.undefined
  var left: js.UndefOr[js.Function0[this.type]] = js.undefined
  var moveBackwards: js.UndefOr[js.Function1[/* layers */ js.UndefOr[Double], this.type]] = js.undefined
  var moveForward: js.UndefOr[js.Function1[/* layers */ js.UndefOr[Double], this.type]] = js.undefined
  var question: String
  var right: js.UndefOr[js.Function0[this.type]] = js.undefined
  var rotateDeg: js.UndefOr[js.Function1[/* deg */ Double, this.type]] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var scale: js.UndefOr[js.Function1[/* factor */ Double, this.type]] = js.undefined
  var sliderVoteAverage: js.UndefOr[Double] = js.undefined
  var sliderVoteCount: js.UndefOr[Double] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
  var toJSON: js.UndefOr[js.Function0[_]] = js.undefined
  var top: js.UndefOr[js.Function0[this.type]] = js.undefined
  var viewerCanVote: js.UndefOr[Boolean] = js.undefined
  var viewerVote: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
  var z: js.UndefOr[Double] = js.undefined
}

object StickerOptionsSliderStick {
  @scala.inline
  def apply(
    emoji: String,
    question: String,
    additionalConfigureProperties: () => _ = null,
    backgroundColor: String = null,
    bottom: () => StickerOptionsSliderStick = null,
    center: () => StickerOptionsSliderStick = null,
    height: Int | Double = null,
    id: () => String = null,
    isSticker: js.UndefOr[Boolean] = js.undefined,
    key: () => String = null,
    left: () => StickerOptionsSliderStick = null,
    moveBackwards: /* layers */ js.UndefOr[Double] => StickerOptionsSliderStick = null,
    moveForward: /* layers */ js.UndefOr[Double] => StickerOptionsSliderStick = null,
    right: () => StickerOptionsSliderStick = null,
    rotateDeg: /* deg */ Double => StickerOptionsSliderStick = null,
    rotation: Int | Double = null,
    scale: /* factor */ Double => StickerOptionsSliderStick = null,
    sliderVoteAverage: Int | Double = null,
    sliderVoteCount: Int | Double = null,
    textColor: String = null,
    toJSON: () => _ = null,
    top: () => StickerOptionsSliderStick = null,
    viewerCanVote: js.UndefOr[Boolean] = js.undefined,
    viewerVote: Int | Double = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null,
    z: Int | Double = null
  ): StickerOptionsSliderStick = {
    val __obj = js.Dynamic.literal(emoji = emoji.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any])
    if (additionalConfigureProperties != null) __obj.updateDynamic("additionalConfigureProperties")(js.Any.fromFunction0(additionalConfigureProperties))
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(js.Any.fromFunction0(bottom))
    if (center != null) __obj.updateDynamic("center")(js.Any.fromFunction0(center))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(js.Any.fromFunction0(id))
    if (!js.isUndefined(isSticker)) __obj.updateDynamic("isSticker")(isSticker.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(js.Any.fromFunction0(key))
    if (left != null) __obj.updateDynamic("left")(js.Any.fromFunction0(left))
    if (moveBackwards != null) __obj.updateDynamic("moveBackwards")(js.Any.fromFunction1(moveBackwards))
    if (moveForward != null) __obj.updateDynamic("moveForward")(js.Any.fromFunction1(moveForward))
    if (right != null) __obj.updateDynamic("right")(js.Any.fromFunction0(right))
    if (rotateDeg != null) __obj.updateDynamic("rotateDeg")(js.Any.fromFunction1(rotateDeg))
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(js.Any.fromFunction1(scale))
    if (sliderVoteAverage != null) __obj.updateDynamic("sliderVoteAverage")(sliderVoteAverage.asInstanceOf[js.Any])
    if (sliderVoteCount != null) __obj.updateDynamic("sliderVoteCount")(sliderVoteCount.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    if (toJSON != null) __obj.updateDynamic("toJSON")(js.Any.fromFunction0(toJSON))
    if (top != null) __obj.updateDynamic("top")(js.Any.fromFunction0(top))
    if (!js.isUndefined(viewerCanVote)) __obj.updateDynamic("viewerCanVote")(viewerCanVote.asInstanceOf[js.Any])
    if (viewerVote != null) __obj.updateDynamic("viewerVote")(viewerVote.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[StickerOptionsSliderStick]
  }
}

