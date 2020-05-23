package typings.materializeCss.global.M

import typings.materializeCss.M.CarouselOptions
import typings.materializeCss.MElements
import typings.materializeCss.anon.PartialCarouselOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Carousel")
@js.native
class Carousel ()
  extends typings.materializeCss.M.Carousel {
  /**
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  override var el: Element = js.native
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  override var options: CarouselOptions = js.native
  /**
    * Destroy plugin instance and teardown
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
}

/* static members */
@JSGlobal("M.Carousel")
@js.native
object Carousel extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.Carousel = js.native
  /**
    * Init carousels
    */
  def init(els: MElements): js.Array[typings.materializeCss.M.Carousel] = js.native
  def init(els: MElements, options: PartialCarouselOptions): js.Array[typings.materializeCss.M.Carousel] = js.native
  /**
    * Init carousel
    */
  def init(els: Element): typings.materializeCss.M.Carousel = js.native
  def init(els: Element, options: PartialCarouselOptions): typings.materializeCss.M.Carousel = js.native
}

