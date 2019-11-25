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
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (inst != null) __obj.updateDynamic("inst")(inst.asInstanceOf[js.Any])
    if (rlbk != null) __obj.updateDynamic("rlbk")(rlbk.asInstanceOf[js.Any])
    if (rslt != null) __obj.updateDynamic("rslt")(rslt.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSTreeBindOptions]
  }
}

