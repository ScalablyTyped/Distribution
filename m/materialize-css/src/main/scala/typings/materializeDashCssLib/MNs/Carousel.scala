package typings
package materializeDashCssLib.MNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Carousel")
@js.native
class Carousel () extends Component[CarouselOptions] {
  /**
    * The index of the center carousel item
    */
  var center: scala.Double = js.native
  /**
    * If the carousel is currently being dragged
    */
  var dragged: scala.Double = js.native
  /**
    * If the carousel is being clicked or tapped
    */
  var pressed: scala.Boolean = js.native
  /**
    * Move carousel to next slide or go forward a given amount of slides
    * @param n How many times the carousel slides
    */
  def next(): scala.Unit = js.native
  def next(n: scala.Double): scala.Unit = js.native
  /**
    * Move carousel to previous slide or go back a given amount of slides
    * @param n How many times the carousel slides
    */
  def prev(): scala.Unit = js.native
  def prev(n: scala.Double): scala.Unit = js.native
  /**
    * Move carousel to nth slide
    * @param n Index of slide
    */
  def set(): scala.Unit = js.native
  def set(n: scala.Double): scala.Unit = js.native
}

@JSGlobal("M.Carousel")
@js.native
object Carousel extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: stdLib.Element): materializeDashCssLib.MNs.Carousel = js.native
  /**
    * Init carousels
    */
  def init(els: materializeDashCssLib.MElements): js.Array[materializeDashCssLib.MNs.Carousel] = js.native
  def init(
    els: materializeDashCssLib.MElements,
    options: stdLib.Partial[materializeDashCssLib.MNs.CarouselOptions]
  ): js.Array[materializeDashCssLib.MNs.Carousel] = js.native
  /**
    * Init carousel
    */
  def init(els: stdLib.Element): materializeDashCssLib.MNs.Carousel = js.native
  def init(els: stdLib.Element, options: stdLib.Partial[materializeDashCssLib.MNs.CarouselOptions]): materializeDashCssLib.MNs.Carousel = js.native
}

