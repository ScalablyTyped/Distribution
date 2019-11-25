package typings.jqueryui

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Selecting extends js.Object {
  var selecting: js.UndefOr[Element] = js.undefined
}

object Anon_Selecting {
  @scala.inline
  def apply(selecting: Element = null): Anon_Selecting = {
    val __obj = js.Dynamic.literal()
    if (selecting != null) __obj.updateDynamic("selecting")(selecting.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Selecting]
  }
}

