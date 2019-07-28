package typings.k6.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/html", "LegendElement")
@js.native
abstract class LegendElement () extends Element {
  /** Owning <form> element. */
  def form(): js.UndefOr[FormElement] = js.native
}

