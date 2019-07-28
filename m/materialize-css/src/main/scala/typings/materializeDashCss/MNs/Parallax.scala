package typings.materializeDashCss.MNs

import typings.materializeDashCss.MElements
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Parallax")
@js.native
class Parallax () extends Component[ParallaxOptions]

/* static members */
@JSGlobal("M.Parallax")
@js.native
object Parallax extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): Parallax = js.native
  /**
    * Init Parallaxs
    */
  def init(els: MElements): js.Array[Parallax] = js.native
  def init(els: MElements, options: Partial[ParallaxOptions]): js.Array[Parallax] = js.native
  /**
    * Init Parallax
    */
  def init(els: Element): Parallax = js.native
  def init(els: Element, options: Partial[ParallaxOptions]): Parallax = js.native
}

