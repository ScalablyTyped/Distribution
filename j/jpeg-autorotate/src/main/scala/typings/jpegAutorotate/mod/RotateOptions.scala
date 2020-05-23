package typings.jpegAutorotate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RotateOptions extends js.Object {
  var quality: js.UndefOr[Double] = js.undefined
}

object RotateOptions {
  @scala.inline
  def apply(quality: js.UndefOr[Double] = js.undefined): RotateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(quality)) __obj.updateDynamic("quality")(quality.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotateOptions]
  }
}

