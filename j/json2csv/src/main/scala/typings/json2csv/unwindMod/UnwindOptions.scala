package typings.json2csv.unwindMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnwindOptions extends js.Object {
  var blankOut: js.UndefOr[Boolean] = js.undefined
  var paths: js.UndefOr[js.Array[String]] = js.undefined
}

object UnwindOptions {
  @scala.inline
  def apply(blankOut: js.UndefOr[Boolean] = js.undefined, paths: js.Array[String] = null): UnwindOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blankOut)) __obj.updateDynamic("blankOut")(blankOut.get.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnwindOptions]
  }
}

