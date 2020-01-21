package typings.jsforce.describeResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PicklistEntry extends js.Object {
  var active: Boolean
  var defaultValue: Boolean
  var label: js.UndefOr[maybe[String]] = js.undefined
  var validFor: js.UndefOr[maybe[String]] = js.undefined
  var value: String
}

object PicklistEntry {
  @scala.inline
  def apply(
    active: Boolean,
    defaultValue: Boolean,
    value: String,
    label: maybe[String] = null,
    validFor: maybe[String] = null
  ): PicklistEntry = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (validFor != null) __obj.updateDynamic("validFor")(validFor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PicklistEntry]
  }
}

