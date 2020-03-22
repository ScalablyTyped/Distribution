package typings.materializeCss.mod

import typings.materializeCss.MElements
import typings.materializeCss.PartialParallaxOptions
import typings.std.Element
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
  def init(els: MElements, options: PartialParallaxOptions): js.Array[typings.materializeCss.M.Parallax] = js.native
  /**
    * Init Parallax
    */
  def init(els: Element): typings.materializeCss.M.Parallax = js.native
  def init(els: Element, options: PartialParallaxOptions): typings.materializeCss.M.Parallax = js.native
}

