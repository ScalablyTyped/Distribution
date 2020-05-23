package typings.jqueryui.anon

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Selecting extends js.Object {
  var selecting: js.UndefOr[Element] = js.undefined
}

object Selecting {
  @scala.inline
  def apply(selecting: Element = null): Selecting = {
    val __obj = js.Dynamic.literal()
    if (selecting != null) __obj.updateDynamic("selecting")(selecting.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selecting]
  }
}

