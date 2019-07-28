package typings.jqueryui

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Selected extends js.Object {
  var selected: js.UndefOr[Element] = js.undefined
}

object Anon_Selected {
  @scala.inline
  def apply(selected: Element = null): Anon_Selected = {
    val __obj = js.Dynamic.literal()
    if (selected != null) __obj.updateDynamic("selected")(selected)
    __obj.asInstanceOf[Anon_Selected]
  }
}

