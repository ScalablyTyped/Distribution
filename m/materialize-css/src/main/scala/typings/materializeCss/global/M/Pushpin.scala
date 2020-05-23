package typings.materializeCss.global.M

import typings.materializeCss.M.PushpinOptions
import typings.materializeCss.MElements
import typings.materializeCss.anon.PartialPushpinOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Pushpin")
@js.native
class Pushpin ()
  extends typings.materializeCss.M.Pushpin {
  /**
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  override var el: Element = js.native
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  override var options: PushpinOptions = js.native
  /**
    * Original offsetTop of element
    */
  /* CompleteClass */
  override var originalOffset: Double = js.native
  /**
    * Destroy plugin instance and teardown
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
}

/* static members */
@JSGlobal("M.Pushpin")
@js.native
object Pushpin extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.Pushpin = js.native
  /**
    * Init Pushpins
    */
  def init(els: MElements): js.Array[typings.materializeCss.M.Pushpin] = js.native
  def init(els: MElements, options: PartialPushpinOptions): js.Array[typings.materializeCss.M.Pushpin] = js.native
  /**
    * Init Pushpin
    */
  def init(els: Element): typings.materializeCss.M.Pushpin = js.native
  def init(els: Element, options: PartialPushpinOptions): typings.materializeCss.M.Pushpin = js.native
}

