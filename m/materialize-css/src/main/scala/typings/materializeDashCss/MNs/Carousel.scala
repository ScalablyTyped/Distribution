package typings.materializeDashCss.MNs

import typings.materializeDashCss.MElements
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Carousel")
@js.native
class Carousel () extends Component[CarouselOptions] {
  /**
    * The index of the center carousel item
    */
  var center: Double = js.native
  /**
    * If the carousel is currently being dragged
    */
  var dragged: Double = js.native
  /**
    * If the carousel is being clicked or tapped
    */
  var pressed: Boolean = js.native
  /**
    * Move carousel to next slide or go forward a given amount of slides
    * @param n How many times the carousel slides
    */
  def next(): Unit = js.native
  def next(n: Double): Unit = js.native
  /**
    * Move carousel to previous slide or go back a given amount of slides
    * @param n How many times the carousel slides
    */
  def prev(): Unit = js.native
  def prev(n: Double): Unit = js.native
  /**
    * Move carousel to nth slide
    * @param n Index of slide
    */
  def set(): Unit = js.native
  def set(n: Double): Unit = js.native
}

/* static members */
@JSGlobal("M.Carousel")
@js.native
object Carousel extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): Carousel = js.native
  /**
    * Init carousels
    */
  def init(els: MElements): js.Array[Carousel] = js.native
  def init(els: MElements, options: Partial[CarouselOptions]): js.Array[Carousel] = js.native
  /**
    * Init carousel
    */
  def init(els: Element): Carousel = js.native
  def init(els: Element, options: Partial[CarouselOptions]): Carousel = js.native
}

