package typings.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined instagram-private-api.instagram-private-api/dist/sticker-builder/sticker-builder.StickerOptions<instagram-private-api.instagram-private-api/dist/sticker-builder/stickers.ChatSticker> */
trait StickerOptionsChatSticker extends js.Object {
  var additionalConfigureProperties: js.UndefOr[js.Function0[_]] = js.undefined
  var bottom: js.UndefOr[js.Function0[this.type]] = js.undefined
  var center: js.UndefOr[js.Function0[this.type]] = js.undefined
  var endBackgroundColor: js.UndefOr[String] = js.undefined
  var hasStartedChat: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var id: js.UndefOr[js.Function0[String]] = js.undefined
  var isSticker: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[js.Function0[String]] = js.undefined
  var left: js.UndefOr[js.Function0[this.type]] = js.undefined
  var moveBackwards: js.UndefOr[js.Function1[/* layers */ js.UndefOr[Double], this.type]] = js.undefined
  var moveForward: js.UndefOr[js.Function1[/* layers */ js.UndefOr[Double], this.type]] = js.undefined
  var right: js.UndefOr[js.Function0[this.type]] = js.undefined
  var rotateDeg: js.UndefOr[js.Function1[/* deg */ Double, this.type]] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var scale: js.UndefOr[js.Function1[/* factor */ Double, this.type]] = js.undefined
  var startBackgroundColor: js.UndefOr[String] = js.undefined
  var text: String
  var toJSON: js.UndefOr[js.Function0[_]] = js.undefined
  var top: js.UndefOr[js.Function0[this.type]] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
  var z: js.UndefOr[Double] = js.undefined
}

object StickerOptionsChatSticker {
  @scala.inline
  def apply(
    text: String,
    additionalConfigureProperties: () => _ = null,
    bottom: () => StickerOptionsChatSticker = null,
    center: () => StickerOptionsChatSticker = null,
    endBackgroundColor: String = null,
    hasStartedChat: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    id: () => String = null,
    isSticker: js.UndefOr[Boolean] = js.undefined,
    key: () => String = null,
    left: () => StickerOptionsChatSticker = null,
    moveBackwards: /* layers */ js.UndefOr[Double] => StickerOptionsChatSticker = null,
    moveForward: /* layers */ js.UndefOr[Double] => StickerOptionsChatSticker = null,
    right: () => StickerOptionsChatSticker = null,
    rotateDeg: /* deg */ Double => StickerOptionsChatSticker = null,
    rotation: js.UndefOr[Double] = js.undefined,
    scale: /* factor */ Double => StickerOptionsChatSticker = null,
    startBackgroundColor: String = null,
    toJSON: () => _ = null,
    top: () => StickerOptionsChatSticker = null,
    width: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined,
    z: js.UndefOr[Double] = js.undefined
  ): StickerOptionsChatSticker = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (additionalConfigureProperties != null) __obj.updateDynamic("additionalConfigureProperties")(js.Any.fromFunction0(additionalConfigureProperties))
    if (bottom != null) __obj.updateDynamic("bottom")(js.Any.fromFunction0(bottom))
    if (center != null) __obj.updateDynamic("center")(js.Any.fromFunction0(center))
    if (endBackgroundColor != null) __obj.updateDynamic("endBackgroundColor")(endBackgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(hasStartedChat)) __obj.updateDynamic("hasStartedChat")(hasStartedChat.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(js.Any.fromFunction0(id))
    if (!js.isUndefined(isSticker)) __obj.updateDynamic("isSticker")(isSticker.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(js.Any.fromFunction0(key))
    if (left != null) __obj.updateDynamic("left")(js.Any.fromFunction0(left))
    if (moveBackwards != null) __obj.updateDynamic("moveBackwards")(js.Any.fromFunction1(moveBackwards))
    if (moveForward != null) __obj.updateDynamic("moveForward")(js.Any.fromFunction1(moveForward))
    if (right != null) __obj.updateDynamic("right")(js.Any.fromFunction0(right))
    if (rotateDeg != null) __obj.updateDynamic("rotateDeg")(js.Any.fromFunction1(rotateDeg))
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation.get.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(js.Any.fromFunction1(scale))
    if (startBackgroundColor != null) __obj.updateDynamic("startBackgroundColor")(startBackgroundColor.asInstanceOf[js.Any])
    if (toJSON != null) __obj.updateDynamic("toJSON")(js.Any.fromFunction0(toJSON))
    if (top != null) __obj.updateDynamic("top")(js.Any.fromFunction0(top))
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    if (!js.isUndefined(z)) __obj.updateDynamic("z")(z.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StickerOptionsChatSticker]
  }
}

