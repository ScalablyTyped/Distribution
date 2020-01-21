package typings.jqueryui

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSelected extends js.Object {
  var selected: js.UndefOr[Element] = js.undefined
}

object AnonSelected {
  @scala.inline
  def apply(selected: Element = null): AnonSelected = {
    val __obj = js.Dynamic.literal()
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSelected]
  }
}

