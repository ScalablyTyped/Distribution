package typings
package jsplumbLib.jsplumbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrowOverlayOptions extends OverlayOptions {
   // 0.5
  var direction: js.UndefOr[scala.Double] = js.undefined
   // 1
  var foldback: js.UndefOr[scala.Double] = js.undefined
   // 20
  var length: js.UndefOr[scala.Double] = js.undefined
   // 20
  var location: js.UndefOr[scala.Double] = js.undefined
   // 0.623
  var paintStyle: js.UndefOr[PaintStyle] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ArrowOverlayOptions {
  @scala.inline
  def apply(
    direction: scala.Int | scala.Double = null,
    foldback: scala.Int | scala.Double = null,
    length: scala.Int | scala.Double = null,
    location: scala.Int | scala.Double = null,
    paintStyle: PaintStyle = null,
    width: scala.Int | scala.Double = null
  ): ArrowOverlayOptions = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (foldback != null) __obj.updateDynamic("foldback")(foldback.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (paintStyle != null) __obj.updateDynamic("paintStyle")(paintStyle)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowOverlayOptions]
  }
}

