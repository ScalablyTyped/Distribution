package typings.materializeCss.mod

import typings.materializeCss.M.ScrollSpyOptions
import typings.materializeCss.MElements
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "ScrollSpy")
@js.native
class ScrollSpy ()
  extends typings.materializeCss.M.ScrollSpy

/* static members */
@JSImport("materialize-css", "ScrollSpy")
@js.native
object ScrollSpy extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.ScrollSpy = js.native
  /**
    * Init ScrollSpies
    */
  def init(els: MElements): js.Array[typings.materializeCss.M.ScrollSpy] = js.native
  def init(els: MElements, options: Partial[ScrollSpyOptions]): js.Array[typings.materializeCss.M.ScrollSpy] = js.native
  /**
    * Init ScrollSpy
    */
  def init(els: Element): typings.materializeCss.M.ScrollSpy = js.native
  def init(els: Element, options: Partial[ScrollSpyOptions]): typings.materializeCss.M.ScrollSpy = js.native
}

