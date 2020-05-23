package typings.materializeCss.global.M

import typings.materializeCss.M.ScrollSpyOptions
import typings.materializeCss.MElements
import typings.materializeCss.anon.PartialScrollSpyOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.ScrollSpy")
@js.native
class ScrollSpy ()
  extends typings.materializeCss.M.Component[ScrollSpyOptions] {
  /**
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  override var el: Element = js.native
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  override var options: ScrollSpyOptions = js.native
  /**
    * Destroy plugin instance and teardown
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
}

/* static members */
@JSGlobal("M.ScrollSpy")
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
  def init(els: MElements, options: PartialScrollSpyOptions): js.Array[typings.materializeCss.M.ScrollSpy] = js.native
  /**
    * Init ScrollSpy
    */
  def init(els: Element): typings.materializeCss.M.ScrollSpy = js.native
  def init(els: Element, options: PartialScrollSpyOptions): typings.materializeCss.M.ScrollSpy = js.native
}

