package typings.materializeCss.mod

import typings.materializeCss.M.TapTargetOptions
import typings.materializeCss.MElements
import typings.materializeCss.anon.PartialTapTargetOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "TapTarget")
@js.native
class TapTarget ()
  extends typings.materializeCss.M.TapTarget {
  /**
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  override var el: Element = js.native
  /**
    * If the tap target is open
    */
  /* CompleteClass */
  override var isOpen: Boolean = js.native
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  override var options: TapTargetOptions = js.native
  /**
    * Close Tap Target
    */
  /* CompleteClass */
  override def close(): Unit = js.native
  /**
    * Destroy plugin instance and teardown
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /**
    * Open Tap Target
    */
  /* CompleteClass */
  override def open(): Unit = js.native
}

/* static members */
@JSImport("materialize-css", "TapTarget")
@js.native
object TapTarget extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.TapTarget = js.native
  /**
    * Init TapTargets
    */
  def init(els: MElements): js.Array[typings.materializeCss.M.TapTarget] = js.native
  def init(els: MElements, options: PartialTapTargetOptions): js.Array[typings.materializeCss.M.TapTarget] = js.native
  /**
    * Init TapTarget
    */
  def init(els: Element): typings.materializeCss.M.TapTarget = js.native
  def init(els: Element, options: PartialTapTargetOptions): typings.materializeCss.M.TapTarget = js.native
}

