package typings.jqueryui.anon

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Selected extends js.Object {
  var selected: js.UndefOr[Element] = js.undefined
}

object Selected {
  @scala.inline
  def apply(selected: Element = null): Selected = {
    val __obj = js.Dynamic.literal()
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selected]
  }
}

