package typings.materializeDashCss.M

import typings.materializeDashCss.MElements
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Collapsible")
@js.native
class Collapsible () extends Component[CollapsibleOptions] {
  /**
    * Close collapsible section
    * @param n Nth section to close
    */
  def close(n: Double): Unit = js.native
  /**
    * Open collapsible section
    * @param n Nth section to open
    */
  def open(n: Double): Unit = js.native
}

/* static members */
@JSGlobal("M.Collapsible")
@js.native
object Collapsible extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): Collapsible = js.native
  /**
    * Init Collapsibles
    */
  def init(els: MElements): js.Array[Collapsible] = js.native
  def init(els: MElements, options: Partial[CollapsibleOptions]): js.Array[Collapsible] = js.native
  /**
    * Init Collapsible
    */
  def init(els: Element): Collapsible = js.native
  def init(els: Element, options: Partial[CollapsibleOptions]): Collapsible = js.native
}

