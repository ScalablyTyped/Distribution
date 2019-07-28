package typings.materializeDashCss.materializeDashCssMod

import typings.materializeDashCss.MElements
import typings.materializeDashCss.MNs.ChipsOptions
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Chips")
@js.native
class Chips ()
  extends typings.materializeDashCss.MNs.Chips

/* static members */
@JSImport("materialize-css", "Chips")
@js.native
object Chips extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeDashCss.MNs.Chips = js.native
  /**
    * Init Chipses
    */
  def init(els: MElements): js.Array[typings.materializeDashCss.MNs.Chips] = js.native
  def init(els: MElements, options: Partial[ChipsOptions]): js.Array[typings.materializeDashCss.MNs.Chips] = js.native
  /**
    * Init Chips
    */
  def init(els: Element): typings.materializeDashCss.MNs.Chips = js.native
  def init(els: Element, options: Partial[ChipsOptions]): typings.materializeDashCss.MNs.Chips = js.native
}

