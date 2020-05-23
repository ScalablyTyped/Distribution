package typings.jsdeferred.mod.global

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
  def apply(
    target: js.Any,
    args: js.Array[_] = null,
    ng: js.UndefOr[Double] = js.undefined,
    ok: js.UndefOr[Double] = js.undefined
  ): ConnectOption = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (!js.isUndefined(ng)) __obj.updateDynamic("ng")(ng.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ok)) __obj.updateDynamic("ok")(ok.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectOption]
  }
}

