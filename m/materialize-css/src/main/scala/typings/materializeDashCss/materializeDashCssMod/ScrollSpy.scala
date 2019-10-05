package typings.materializeDashCss.materializeDashCssMod

import typings.materializeDashCss.M.ScrollSpyOptions
import typings.materializeDashCss.MElements
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "ScrollSpy")
@js.native
class ScrollSpy ()
  extends typings.materializeDashCss.M.ScrollSpy

/* static members */
@JSImport("materialize-css", "ScrollSpy")
@js.native
object ScrollSpy extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeDashCss.M.ScrollSpy = js.native
  /**
    * Init ScrollSpies
    */
  def init(els: MElements): js.Array[typings.materializeDashCss.M.ScrollSpy] = js.native
  def init(els: MElements, options: Partial[ScrollSpyOptions]): js.Array[typings.materializeDashCss.M.ScrollSpy] = js.native
  /**
    * Init ScrollSpy
    */
  def init(els: Element): typings.materializeDashCss.M.ScrollSpy = js.native
  def init(els: Element, options: Partial[ScrollSpyOptions]): typings.materializeDashCss.M.ScrollSpy = js.native
}

