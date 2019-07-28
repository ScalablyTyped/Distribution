package typings.materializeDashCss.MNs

import typings.materializeDashCss.MElements
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.ScrollSpy")
@js.native
class ScrollSpy () extends Component[ScrollSpyOptions]

/* static members */
@JSGlobal("M.ScrollSpy")
@js.native
object ScrollSpy extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): ScrollSpy = js.native
  /**
    * Init ScrollSpies
    */
  def init(els: MElements): js.Array[ScrollSpy] = js.native
  def init(els: MElements, options: Partial[ScrollSpyOptions]): js.Array[ScrollSpy] = js.native
  /**
    * Init ScrollSpy
    */
  def init(els: Element): ScrollSpy = js.native
  def init(els: Element, options: Partial[ScrollSpyOptions]): ScrollSpy = js.native
}

