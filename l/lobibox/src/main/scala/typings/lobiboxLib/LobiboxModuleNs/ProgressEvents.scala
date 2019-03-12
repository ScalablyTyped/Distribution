package typings
package lobiboxLib.LobiboxModuleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressEvents extends js.Object {
  var progressComplete: js.UndefOr[js.Function1[/* lobibox */ LobiboxStatic, scala.Unit]] = js.undefined
  var progressUpdated: js.UndefOr[js.Function1[/* lobibox */ LobiboxStatic, scala.Unit]] = js.undefined
}

object ProgressEvents {
  @scala.inline
  def apply(
    progressComplete: /* lobibox */ LobiboxStatic => scala.Unit = null,
    progressUpdated: /* lobibox */ LobiboxStatic => scala.Unit = null
  ): ProgressEvents = {
    val __obj = js.Dynamic.literal()
    if (progressComplete != null) __obj.updateDynamic("progressComplete")(js.Any.fromFunction1(progressComplete))
    if (progressUpdated != null) __obj.updateDynamic("progressUpdated")(js.Any.fromFunction1(progressUpdated))
    __obj.asInstanceOf[ProgressEvents]
  }
}

