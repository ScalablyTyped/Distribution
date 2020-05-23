package typings.materializeCss.global.M

import typings.materializeCss.MElements
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.CharacterCounter")
@js.native
class CharacterCounter ()
  extends typings.materializeCss.M.Component[js.UndefOr[scala.Nothing]] {
  /**
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  override var el: Element = js.native
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  override var options: js.UndefOr[scala.Nothing] = js.native
  /**
    * Destroy plugin instance and teardown
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
}

/* static members */
@JSGlobal("M.CharacterCounter")
@js.native
object CharacterCounter extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.CharacterCounter = js.native
  /**
    * Init CharacterCounters
    */
  def init(els: MElements): js.Array[typings.materializeCss.M.CharacterCounter] = js.native
  def init(els: MElements, options: Partial[js.UndefOr[scala.Nothing]]): js.Array[typings.materializeCss.M.CharacterCounter] = js.native
  /**
    * Init CharacterCounter
    */
  def init(els: Element): typings.materializeCss.M.CharacterCounter = js.native
  def init(els: Element, options: Partial[js.UndefOr[scala.Nothing]]): typings.materializeCss.M.CharacterCounter = js.native
}

