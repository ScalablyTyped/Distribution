package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterMessages extends js.Object {
  var and: js.UndefOr[String] = js.undefined
  @JSName("apply")
  var apply: js.UndefOr[String] = js.undefined
  var or: js.UndefOr[String] = js.undefined
}

object FilterMessages {
  @scala.inline
  def apply(and: String = null, apply: String = null, or: String = null): FilterMessages = {
    val __obj = js.Dynamic.literal()
    if (and != null) __obj.updateDynamic("and")(and)
    if (apply != null) __obj.updateDynamic("apply")(apply)
    if (or != null) __obj.updateDynamic("or")(or)
    __obj.asInstanceOf[FilterMessages]
  }
}

