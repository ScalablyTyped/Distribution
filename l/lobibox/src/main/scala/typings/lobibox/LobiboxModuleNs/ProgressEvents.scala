package typings.lobibox.LobiboxModuleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressEvents extends js.Object {
  var progressComplete: js.UndefOr[js.Function1[/* lobibox */ LobiboxStatic, Unit]] = js.undefined
  var progressUpdated: js.UndefOr[js.Function1[/* lobibox */ LobiboxStatic, Unit]] = js.undefined
}

object ProgressEvents {
  @scala.inline
  def apply(
    progressComplete: /* lobibox */ LobiboxStatic => Unit = null,
    progressUpdated: /* lobibox */ LobiboxStatic => Unit = null
  ): ProgressEvents = {
    val __obj = js.Dynamic.literal()
    if (progressComplete != null) __obj.updateDynamic("progressComplete")(js.Any.fromFunction1(progressComplete))
    if (progressUpdated != null) __obj.updateDynamic("progressUpdated")(js.Any.fromFunction1(progressUpdated))
    __obj.asInstanceOf[ProgressEvents]
  }
}

