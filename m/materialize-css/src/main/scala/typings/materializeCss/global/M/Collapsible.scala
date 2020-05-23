package typings.materializeCss.global.M

import typings.materializeCss.M.CollapsibleOptions
import typings.materializeCss.MElements
import typings.materializeCss.anon.PartialCollapsibleOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Collapsible")
@js.native
class Collapsible ()
  extends typings.materializeCss.M.Collapsible {
  /**
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  override var el: Element = js.native
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  override var options: CollapsibleOptions = js.native
  /**
    * Close collapsible section
    * @param n Nth section to close
    */
  /* CompleteClass */
  override def close(n: Double): Unit = js.native
  /**
    * Destroy plugin instance and teardown
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /**
    * Open collapsible section
    * @param n Nth section to open
    */
  /* CompleteClass */
  override def open(n: Double): Unit = js.native
}

/* static members */
@JSGlobal("M.Collapsible")
@js.native
object Collapsible extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.Collapsible = js.native
  /**
    * Init Collapsibles
    */
  def init(els: MElements): js.Array[typings.materializeCss.M.Collapsible] = js.native
  def init(els: MElements, options: PartialCollapsibleOptions): js.Array[typings.materializeCss.M.Collapsible] = js.native
  /**
    * Init Collapsible
    */
  def init(els: Element): typings.materializeCss.M.Collapsible = js.native
  def init(els: Element, options: PartialCollapsibleOptions): typings.materializeCss.M.Collapsible = js.native
}

