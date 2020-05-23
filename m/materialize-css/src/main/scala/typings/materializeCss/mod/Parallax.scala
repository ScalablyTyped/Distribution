package typings.materializeCss.mod

import typings.materializeCss.M.ParallaxOptions
import typings.materializeCss.MElements
import typings.materializeCss.anon.PartialParallaxOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Parallax")
@js.native
class Parallax ()
  extends typings.materializeCss.M.Component[ParallaxOptions] {
  /**
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  override var el: Element = js.native
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  override var options: ParallaxOptions = js.native
  /**
    * Destroy plugin instance and teardown
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
}

/* static members */
@JSImport("materialize-css", "Parallax")
@js.native
object Parallax extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.Parallax = js.native
  /**
    * Init Parallaxs
    */
  def init(els: MElements): js.Array[typings.materializeCss.M.Parallax] = js.native
  def init(els: MElements, options: PartialParallaxOptions): js.Array[typings.materializeCss.M.Parallax] = js.native
  /**
    * Init Parallax
    */
  def init(els: Element): typings.materializeCss.M.Parallax = js.native
  def init(els: Element, options: PartialParallaxOptions): typings.materializeCss.M.Parallax = js.native
}

