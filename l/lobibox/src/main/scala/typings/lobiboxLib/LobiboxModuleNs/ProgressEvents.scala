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
    progressComplete: js.Function1[/* lobibox */ LobiboxStatic, scala.Unit] = null,
    progressUpdated: js.Function1[/* lobibox */ LobiboxStatic, scala.Unit] = null
  ): ProgressEvents = {
    val __obj = js.Dynamic.literal()
    if (progressComplete != null) __obj.updateDynamic("progressComplete")(progressComplete)
    if (progressUpdated != null) __obj.updateDynamic("progressUpdated")(progressUpdated)
    __obj.asInstanceOf[ProgressEvents]
  }
}

