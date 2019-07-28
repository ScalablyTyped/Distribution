package typings.ionicons.distTypesStencilDotCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueApi extends js.Object {
  var clear: js.UndefOr[js.Function0[Unit]] = js.undefined
  var flush: js.UndefOr[js.Function1[/* cb */ js.UndefOr[js.Function0[Unit]], Unit]] = js.undefined
  def read(cb: RafCallback): Unit
  def tick(cb: RafCallback): Unit
  def write(cb: RafCallback): Unit
}

object QueueApi {
  @scala.inline
  def apply(
    read: RafCallback => Unit,
    tick: RafCallback => Unit,
    write: RafCallback => Unit,
    clear: () => Unit = null,
    flush: /* cb */ js.UndefOr[js.Function0[Unit]] => Unit = null
  ): QueueApi = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction1(read), tick = js.Any.fromFunction1(tick), write = js.Any.fromFunction1(write))
    if (clear != null) __obj.updateDynamic("clear")(js.Any.fromFunction0(clear))
    if (flush != null) __obj.updateDynamic("flush")(js.Any.fromFunction1(flush))
    __obj.asInstanceOf[QueueApi]
  }
}

