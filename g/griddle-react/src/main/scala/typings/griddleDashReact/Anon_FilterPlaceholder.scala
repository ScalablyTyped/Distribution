package typings.griddleDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FilterPlaceholder extends js.Object {
  var filterPlaceholder: js.UndefOr[String] = js.undefined
  var next: js.UndefOr[String] = js.undefined
  var previous: js.UndefOr[String] = js.undefined
  var settingsToggle: js.UndefOr[String] = js.undefined
}

object Anon_FilterPlaceholder {
  @scala.inline
  def apply(
    filterPlaceholder: String = null,
    next: String = null,
    previous: String = null,
    settingsToggle: String = null
  ): Anon_FilterPlaceholder = {
    val __obj = js.Dynamic.literal()
    if (filterPlaceholder != null) __obj.updateDynamic("filterPlaceholder")(filterPlaceholder)
    if (next != null) __obj.updateDynamic("next")(next)
    if (previous != null) __obj.updateDynamic("previous")(previous)
    if (settingsToggle != null) __obj.updateDynamic("settingsToggle")(settingsToggle)
    __obj.asInstanceOf[Anon_FilterPlaceholder]
  }
}

