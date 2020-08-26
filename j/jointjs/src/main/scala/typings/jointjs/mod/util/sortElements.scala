package typings.jointjs.mod.util

import typings.jquery.JQuery
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jointjs", "util.sortElements")
@js.native
object sortElements extends js.Object {
  def apply(elements: String, comparator: js.Function2[/* a */ Element, /* b */ Element, Double]): js.Array[Element] = js.native
  def apply(elements: js.Array[Element], comparator: js.Function2[/* a */ Element, /* b */ Element, Double]): js.Array[Element] = js.native
  def apply(elements: JQuery[HTMLElement], comparator: js.Function2[/* a */ Element, /* b */ Element, Double]): js.Array[Element] = js.native
}

