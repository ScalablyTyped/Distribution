package typings.materialUi.withWidthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var largeWidth: js.UndefOr[Double] = js.undefined
  var mediumWidth: js.UndefOr[Double] = js.undefined
  var resizeInterval: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    largeWidth: Int | Double = null,
    mediumWidth: Int | Double = null,
    resizeInterval: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (largeWidth != null) __obj.updateDynamic("largeWidth")(largeWidth.asInstanceOf[js.Any])
    if (mediumWidth != null) __obj.updateDynamic("mediumWidth")(mediumWidth.asInstanceOf[js.Any])
    if (resizeInterval != null) __obj.updateDynamic("resizeInterval")(resizeInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

