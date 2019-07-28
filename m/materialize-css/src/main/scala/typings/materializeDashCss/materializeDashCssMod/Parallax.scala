package typings.materializeDashCss.materializeDashCssMod

import typings.materializeDashCss.MElements
import typings.materializeDashCss.MNs.ParallaxOptions
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Parallax")
@js.native
class Parallax ()
  extends typings.materializeDashCss.MNs.Parallax

/* static members */
@JSImport("materialize-css", "Parallax")
@js.native
object Parallax extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeDashCss.MNs.Parallax = js.native
  /**
    * Init Parallaxs
    */
  def init(els: MElements): js.Array[typings.materializeDashCss.MNs.Parallax] = js.native
  def init(els: MElements, options: Partial[ParallaxOptions]): js.Array[typings.materializeDashCss.MNs.Parallax] = js.native
  /**
    * Init Parallax
    */
  def init(els: Element): typings.materializeDashCss.MNs.Parallax = js.native
  def init(els: Element, options: Partial[ParallaxOptions]): typings.materializeDashCss.MNs.Parallax = js.native
}

