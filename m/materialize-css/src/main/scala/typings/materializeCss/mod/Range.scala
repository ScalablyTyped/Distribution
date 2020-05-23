package typings.materializeCss.mod

import typings.materializeCss.MElements
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Range")
@js.native
class Range ()
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
@JSImport("materialize-css", "Range")
@js.native
object Range extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.Range = js.native
  /**
    * Init Ranges
    */
  def init(els: MElements): js.Array[typings.materializeCss.M.Range] = js.native
  def init(els: MElements, options: Partial[js.UndefOr[scala.Nothing]]): js.Array[typings.materializeCss.M.Range] = js.native
  /**
    * Init Range
    */
  def init(els: Element): typings.materializeCss.M.Range = js.native
  def init(els: Element, options: Partial[js.UndefOr[scala.Nothing]]): typings.materializeCss.M.Range = js.native
}

