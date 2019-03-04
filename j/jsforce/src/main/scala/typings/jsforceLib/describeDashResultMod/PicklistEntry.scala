package typings
package jsforceLib.describeDashResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PicklistEntry extends js.Object {
  var active: scala.Boolean
  var defaultValue: scala.Boolean
  var label: js.UndefOr[maybe[java.lang.String]] = js.undefined
  var validFor: js.UndefOr[maybe[java.lang.String]] = js.undefined
  var value: java.lang.String
}

object PicklistEntry {
  @scala.inline
  def apply(
    active: scala.Boolean,
    defaultValue: scala.Boolean,
    value: java.lang.String,
    label: maybe[java.lang.String] = null,
    validFor: maybe[java.lang.String] = null
  ): PicklistEntry = {
    val __obj = js.Dynamic.literal(active = active, defaultValue = defaultValue, value = value)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (validFor != null) __obj.updateDynamic("validFor")(validFor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PicklistEntry]
  }
}

