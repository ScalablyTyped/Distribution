package typings.materializeDashCss.materializeDashCssMod

import typings.materializeDashCss.M.PushpinOptions
import typings.materializeDashCss.MElements
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Pushpin")
@js.native
class Pushpin ()
  extends typings.materializeDashCss.M.Pushpin

/* static members */
@JSImport("materialize-css", "Pushpin")
@js.native
object Pushpin extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeDashCss.M.Pushpin = js.native
  /**
    * Init Pushpins
    */
  def init(els: MElements): js.Array[typings.materializeDashCss.M.Pushpin] = js.native
  def init(els: MElements, options: Partial[PushpinOptions]): js.Array[typings.materializeDashCss.M.Pushpin] = js.native
  /**
    * Init Pushpin
    */
  def init(els: Element): typings.materializeDashCss.M.Pushpin = js.native
  def init(els: Element, options: Partial[PushpinOptions]): typings.materializeDashCss.M.Pushpin = js.native
}

