package typings.materializeCss.global.M

import typings.materializeCss.M.ChipsOptions
import typings.materializeCss.MElements
import typings.materializeCss.anon.PartialChipsOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Chips")
@js.native
class Chips ()
  extends typings.materializeCss.M.Chips {
  /**
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  override var el: Element = js.native
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  override var options: ChipsOptions = js.native
  /**
    * Destroy plugin instance and teardown
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
}

/* static members */
@JSGlobal("M.Chips")
@js.native
object Chips extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.Chips = js.native
  /**
    * Init Chipses
    */
  def init(els: MElements): js.Array[typings.materializeCss.M.Chips] = js.native
  def init(els: MElements, options: PartialChipsOptions): js.Array[typings.materializeCss.M.Chips] = js.native
  /**
    * Init Chips
    */
  def init(els: Element): typings.materializeCss.M.Chips = js.native
  def init(els: Element, options: PartialChipsOptions): typings.materializeCss.M.Chips = js.native
}

