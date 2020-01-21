package typings.materializeCss.mod

import typings.materializeCss.M.ParallaxOptions
import typings.materializeCss.MElements
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Parallax")
@js.native
class Parallax ()
  extends typings.materializeCss.M.Parallax

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
  def init(els: MElements, options: Partial[ParallaxOptions]): js.Array[typings.materializeCss.M.Parallax] = js.native
  /**
    * Init Parallax
    */
  def init(els: Element): typings.materializeCss.M.Parallax = js.native
  def init(els: Element, options: Partial[ParallaxOptions]): typings.materializeCss.M.Parallax = js.native
}

