package typings
package materializeDashCssLib.materializeDashCssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Carousel")
@js.native
class Carousel ()
  extends materializeDashCssLib.MNs.Carousel

@JSImport("materialize-css", "Carousel")
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
  /**
           * Init carousels
           */
  def init(
    els: materializeDashCssLib.MElements,
    options: stdLib.Partial[materializeDashCssLib.MNs.CarouselOptions]
  ): js.Array[materializeDashCssLib.MNs.Carousel] = js.native
  /**
           * Init carousel
           */
  def init(els: stdLib.Element): materializeDashCssLib.MNs.Carousel = js.native
  /**
           * Init carousel
           */
  def init(els: stdLib.Element, options: stdLib.Partial[materializeDashCssLib.MNs.CarouselOptions]): materializeDashCssLib.MNs.Carousel = js.native
}

