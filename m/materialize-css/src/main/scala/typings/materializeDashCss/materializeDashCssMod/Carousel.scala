package typings.materializeDashCss.materializeDashCssMod

import typings.materializeDashCss.M.CarouselOptions
import typings.materializeDashCss.MElements
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Carousel")
@js.native
class Carousel ()
  extends typings.materializeDashCss.M.Carousel

/* static members */
@JSImport("materialize-css", "Carousel")
@js.native
object Carousel extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeDashCss.M.Carousel = js.native
  /**
    * Init carousels
    */
  def init(els: MElements): js.Array[typings.materializeDashCss.M.Carousel] = js.native
  def init(els: MElements, options: Partial[CarouselOptions]): js.Array[typings.materializeDashCss.M.Carousel] = js.native
  /**
    * Init carousel
    */
  def init(els: Element): typings.materializeDashCss.M.Carousel = js.native
  def init(els: Element, options: Partial[CarouselOptions]): typings.materializeDashCss.M.Carousel = js.native
}

