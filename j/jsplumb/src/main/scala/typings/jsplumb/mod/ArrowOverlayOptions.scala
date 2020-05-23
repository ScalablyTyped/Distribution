package typings.jsplumb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrowOverlayOptions extends OverlayOptions {
   // 0.5
  var direction: js.UndefOr[Double] = js.undefined
   // 1
  var foldback: js.UndefOr[Double] = js.undefined
   // 20
  var length: js.UndefOr[Double] = js.undefined
   // 20
  var location: js.UndefOr[Double] = js.undefined
   // 0.623
  var paintStyle: js.UndefOr[PaintStyle] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object ArrowOverlayOptions {
  @scala.inline
  def apply(
    direction: js.UndefOr[Double] = js.undefined,
    foldback: js.UndefOr[Double] = js.undefined,
    length: js.UndefOr[Double] = js.undefined,
    location: js.UndefOr[Double] = js.undefined,
    paintStyle: PaintStyle = null,
    width: js.UndefOr[Double] = js.undefined
  ): ArrowOverlayOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(direction)) __obj.updateDynamic("direction")(direction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(foldback)) __obj.updateDynamic("foldback")(foldback.get.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(location)) __obj.updateDynamic("location")(location.get.asInstanceOf[js.Any])
    if (paintStyle != null) __obj.updateDynamic("paintStyle")(paintStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowOverlayOptions]
  }
}

