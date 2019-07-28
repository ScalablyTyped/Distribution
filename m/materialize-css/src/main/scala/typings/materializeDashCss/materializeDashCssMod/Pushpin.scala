package typings.materializeDashCss.materializeDashCssMod

import typings.materializeDashCss.MElements
import typings.materializeDashCss.MNs.PushpinOptions
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Pushpin")
@js.native
class Pushpin ()
  extends typings.materializeDashCss.MNs.Pushpin

/* static members */
@JSImport("materialize-css", "Pushpin")
@js.native
object Pushpin extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeDashCss.MNs.Pushpin = js.native
  /**
    * Init Pushpins
    */
  def init(els: MElements): js.Array[typings.materializeDashCss.MNs.Pushpin] = js.native
  def init(els: MElements, options: Partial[PushpinOptions]): js.Array[typings.materializeDashCss.MNs.Pushpin] = js.native
  /**
    * Init Pushpin
    */
  def init(els: Element): typings.materializeDashCss.MNs.Pushpin = js.native
  def init(els: Element, options: Partial[PushpinOptions]): typings.materializeDashCss.MNs.Pushpin = js.native
}

