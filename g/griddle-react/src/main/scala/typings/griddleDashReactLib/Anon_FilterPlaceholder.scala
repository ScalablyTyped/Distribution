package typings
package griddleDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FilterPlaceholder extends js.Object {
  var filterPlaceholder: js.UndefOr[java.lang.String] = js.undefined
  var next: js.UndefOr[java.lang.String] = js.undefined
  var previous: js.UndefOr[java.lang.String] = js.undefined
  var settingsToggle: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_FilterPlaceholder {
  @scala.inline
  def apply(
    filterPlaceholder: java.lang.String = null,
    next: java.lang.String = null,
    previous: java.lang.String = null,
    settingsToggle: java.lang.String = null
  ): Anon_FilterPlaceholder = {
    val __obj = js.Dynamic.literal()
    if (filterPlaceholder != null) __obj.updateDynamic("filterPlaceholder")(filterPlaceholder)
    if (next != null) __obj.updateDynamic("next")(next)
    if (previous != null) __obj.updateDynamic("previous")(previous)
    if (settingsToggle != null) __obj.updateDynamic("settingsToggle")(settingsToggle)
    __obj.asInstanceOf[Anon_FilterPlaceholder]
  }
}

