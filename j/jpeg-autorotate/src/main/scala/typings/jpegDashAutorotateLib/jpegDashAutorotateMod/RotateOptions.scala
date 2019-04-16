package typings
package jpegDashAutorotateLib.jpegDashAutorotateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RotateOptions extends js.Object {
  var quality: js.UndefOr[scala.Double] = js.undefined
}

object RotateOptions {
  @scala.inline
  def apply(quality: scala.Int | scala.Double = null): RotateOptions = {
    val __obj = js.Dynamic.literal()
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotateOptions]
  }
}

