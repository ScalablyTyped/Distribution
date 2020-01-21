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
    direction: Int | Double = null,
    foldback: Int | Double = null,
    length: Int | Double = null,
    location: Int | Double = null,
    paintStyle: PaintStyle = null,
    width: Int | Double = null
  ): ArrowOverlayOptions = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (foldback != null) __obj.updateDynamic("foldback")(foldback.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (paintStyle != null) __obj.updateDynamic("paintStyle")(paintStyle.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowOverlayOptions]
  }
}

