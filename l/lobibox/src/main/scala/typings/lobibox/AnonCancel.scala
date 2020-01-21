package typings.lobibox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancel extends js.Object {
  var cancel: js.UndefOr[AnonClass] = js.undefined
  var no: js.UndefOr[AnonClass] = js.undefined
  var ok: js.UndefOr[AnonClass] = js.undefined
  var yes: js.UndefOr[AnonClass] = js.undefined
}

object AnonCancel {
  @scala.inline
  def apply(cancel: AnonClass = null, no: AnonClass = null, ok: AnonClass = null, yes: AnonClass = null): AnonCancel = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (no != null) __obj.updateDynamic("no")(no.asInstanceOf[js.Any])
    if (ok != null) __obj.updateDynamic("ok")(ok.asInstanceOf[js.Any])
    if (yes != null) __obj.updateDynamic("yes")(yes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCancel]
  }
}

