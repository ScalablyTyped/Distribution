package typings.immer

import typings.immer.mod.ImmerState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoFreeze extends js.Object {
  var autoFreeze: js.UndefOr[Boolean] = js.undefined
  var onAssign: js.UndefOr[
    js.Function3[/* state */ ImmerState[_], /* prop */ String, /* value */ js.Any, Unit]
  ] = js.undefined
  var onCopy: js.UndefOr[js.Function1[/* state */ ImmerState[_], Unit]] = js.undefined
  var onDelete: js.UndefOr[js.Function2[/* state */ ImmerState[_], /* prop */ String, Unit]] = js.undefined
  var useProxies: js.UndefOr[Boolean] = js.undefined
}

object AnonAutoFreeze {
  @scala.inline
  def apply(
    autoFreeze: js.UndefOr[Boolean] = js.undefined,
    onAssign: (/* state */ ImmerState[_], /* prop */ String, /* value */ js.Any) => Unit = null,
    onCopy: /* state */ ImmerState[_] => Unit = null,
    onDelete: (/* state */ ImmerState[_], /* prop */ String) => Unit = null,
    useProxies: js.UndefOr[Boolean] = js.undefined
  ): AnonAutoFreeze = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFreeze)) __obj.updateDynamic("autoFreeze")(autoFreeze.asInstanceOf[js.Any])
    if (onAssign != null) __obj.updateDynamic("onAssign")(js.Any.fromFunction3(onAssign))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
    if (onDelete != null) __obj.updateDynamic("onDelete")(js.Any.fromFunction2(onDelete))
    if (!js.isUndefined(useProxies)) __obj.updateDynamic("useProxies")(useProxies.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoFreeze]
  }
}

