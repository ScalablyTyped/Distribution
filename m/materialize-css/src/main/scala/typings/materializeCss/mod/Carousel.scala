package typings.materializeCss.mod

import typings.materializeCss.MElements
import typings.materializeCss.PartialCarouselOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Carousel")
@js.native
class Carousel ()
  extends typings.materializeCss.M.Carousel

/* static members */
@JSImport("materialize-css", "Carousel")
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

