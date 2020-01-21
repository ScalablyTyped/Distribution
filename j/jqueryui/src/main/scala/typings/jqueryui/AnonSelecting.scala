package typings.jqueryui

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSelecting extends js.Object {
  var selecting: js.UndefOr[Element] = js.undefined
}

object AnonSelecting {
  @scala.inline
  def apply(selecting: Element = null): AnonSelecting = {
    val __obj = js.Dynamic.literal()
    if (selecting != null) __obj.updateDynamic("selecting")(selecting.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSelecting]
  }
}

