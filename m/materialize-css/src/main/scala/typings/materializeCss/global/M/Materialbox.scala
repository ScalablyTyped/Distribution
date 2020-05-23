package typings.materializeCss.global.M

import typings.materializeCss.M.MaterialboxOptions
import typings.materializeCss.MElements
import typings.materializeCss.anon.PartialMaterialboxOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Materialbox")
@js.native
class Materialbox ()
  extends typings.materializeCss.M.Materialbox {
  /**
    * Caption if specified
    */
  /* CompleteClass */
  override var caption: String = js.native
  /**
    * If the materialbox is no longer being animated
    */
  /* CompleteClass */
  override var doneAnimating: Boolean = js.native
  /**
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  override var el: Element = js.native
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  override var options: MaterialboxOptions = js.native
  /**
    * Original height of image
    */
  /* CompleteClass */
  override var originalHeight: Double = js.native
  /**
    * Original width of image
    */
  /* CompleteClass */
  override var originalWidth: Double = js.native
  /**
    * If the materialbox overlay is showing
    */
  /* CompleteClass */
  override var overlayActive: Boolean = js.native
  /**
    * Close materialbox
    */
  /* CompleteClass */
  override def close(): Unit = js.native
  /**
    * Destroy plugin instance and teardown
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /**
    * Open materialbox
    */
  /* CompleteClass */
  override def open(): Unit = js.native
}

/* static members */
@JSGlobal("M.Materialbox")
@js.native
object Materialbox extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.Materialbox = js.native
  /**
    * Init Materialboxes
    */
  def init(els: MElements): js.Array[typings.materializeCss.M.Materialbox] = js.native
  def init(els: MElements, options: PartialMaterialboxOptions): js.Array[typings.materializeCss.M.Materialbox] = js.native
  /**
    * Init Materialbox
    */
  def init(els: Element): typings.materializeCss.M.Materialbox = js.native
  def init(els: Element, options: PartialMaterialboxOptions): typings.materializeCss.M.Materialbox = js.native
}

