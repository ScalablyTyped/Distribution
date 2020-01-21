package typings.jpegAutorotate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RotateOptions extends js.Object {
  var quality: js.UndefOr[Double] = js.undefined
}

object RotateOptions {
  @scala.inline
  def apply(quality: Int | Double = null): RotateOptions = {
    val __obj = js.Dynamic.literal()
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotateOptions]
  }
}

