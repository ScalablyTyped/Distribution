package typings.materializeCss.global.M

import typings.materializeCss.M.FloatingActionButtonOptions
import typings.materializeCss.MElements
import typings.materializeCss.anon.PartialFloatingActionButt
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.FloatingActionButton")
@js.native
class FloatingActionButton ()
  extends typings.materializeCss.M.FloatingActionButton {
  /**
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  override var el: Element = js.native
  /* CompleteClass */
  override var isOpen: Boolean = js.native
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  override var options: FloatingActionButtonOptions = js.native
  /* CompleteClass */
  override def close(): Unit = js.native
  /**
    * Destroy plugin instance and teardown
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /* CompleteClass */
  override def open(): Unit = js.native
}

/* static members */
@JSGlobal("M.FloatingActionButton")
@js.native
object FloatingActionButton extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.FloatingActionButton = js.native
  /**
    * Init FloatingActionButtons
    */
  def init(els: MElements): js.Array[typings.materializeCss.M.FloatingActionButton] = js.native
  def init(els: MElements, options: PartialFloatingActionButt): js.Array[typings.materializeCss.M.FloatingActionButton] = js.native
  /**
    * Init FloatingActionButton
    */
  def init(els: Element): typings.materializeCss.M.FloatingActionButton = js.native
  def init(els: Element, options: PartialFloatingActionButt): typings.materializeCss.M.FloatingActionButton = js.native
}

