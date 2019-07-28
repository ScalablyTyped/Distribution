package typings.jsdeferred.jsdeferredMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectOption extends js.Object {
  var args: js.UndefOr[js.Array[_]] = js.undefined
  var ng: js.UndefOr[Double] = js.undefined
  var ok: js.UndefOr[Double] = js.undefined
  var target: js.Any
}

object ConnectOption {
  @scala.inline
  def apply(target: js.Any, args: js.Array[_] = null, ng: Int | Double = null, ok: Int | Double = null): ConnectOption = {
    val __obj = js.Dynamic.literal(target = target)
    if (args != null) __obj.updateDynamic("args")(args)
    if (ng != null) __obj.updateDynamic("ng")(ng.asInstanceOf[js.Any])
    if (ok != null) __obj.updateDynamic("ok")(ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectOption]
  }
}

