package typings.jstree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSTreeBindOptions extends js.Object {
  var args: js.UndefOr[js.Any] = js.undefined
  var inst: js.UndefOr[js.Any] = js.undefined
  var rlbk: js.UndefOr[js.Any] = js.undefined
  var rslt: js.UndefOr[js.Any] = js.undefined
}

object JSTreeBindOptions {
  @scala.inline
  def apply(args: js.Any = null, inst: js.Any = null, rlbk: js.Any = null, rslt: js.Any = null): JSTreeBindOptions = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    if (inst != null) __obj.updateDynamic("inst")(inst)
    if (rlbk != null) __obj.updateDynamic("rlbk")(rlbk)
    if (rslt != null) __obj.updateDynamic("rslt")(rslt)
    __obj.asInstanceOf[JSTreeBindOptions]
  }
}

