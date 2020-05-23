package typings.lobibox.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cancel extends js.Object {
  var cancel: js.UndefOr[Class] = js.undefined
  var no: js.UndefOr[Class] = js.undefined
  var ok: js.UndefOr[Class] = js.undefined
  var yes: js.UndefOr[Class] = js.undefined
}

object Cancel {
  @scala.inline
  def apply(cancel: Class = null, no: Class = null, ok: Class = null, yes: Class = null): Cancel = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (no != null) __obj.updateDynamic("no")(no.asInstanceOf[js.Any])
    if (ok != null) __obj.updateDynamic("ok")(ok.asInstanceOf[js.Any])
    if (yes != null) __obj.updateDynamic("yes")(yes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancel]
  }
}

