package typings.itPushable

import typings.itPushable.itPushableBooleans.`true`
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined it-pushable.it-pushable.Options & {  writev  :true} */
trait Optionswritevtrue extends js.Object {
  var onEnd: js.UndefOr[js.Function1[/* err */ js.UndefOr[Error], _]] = js.undefined
  var writev: js.UndefOr[Boolean with `true`] = js.undefined
}

object Optionswritevtrue {
  @scala.inline
  def apply(
    onEnd: /* err */ js.UndefOr[Error] => _ = null,
    writev: js.UndefOr[Boolean with `true`] = js.undefined
  ): Optionswritevtrue = {
    val __obj = js.Dynamic.literal()
    if (onEnd != null) __obj.updateDynamic("onEnd")(js.Any.fromFunction1(onEnd))
    if (!js.isUndefined(writev)) __obj.updateDynamic("writev")(writev.asInstanceOf[js.Any])
    __obj.asInstanceOf[Optionswritevtrue]
  }
}

