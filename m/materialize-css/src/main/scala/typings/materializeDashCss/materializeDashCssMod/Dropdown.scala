package typings.materializeDashCss.materializeDashCssMod

import typings.materializeDashCss.MElements
import typings.materializeDashCss.MNs.DropdownOptions
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Dropdown")
@js.native
class Dropdown ()
  extends typings.materializeDashCss.MNs.Dropdown

/* static members */
@JSImport("materialize-css", "Dropdown")
@js.native
object Dropdown extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeDashCss.MNs.Dropdown = js.native
  /**
    * Init Dropdowns
    */
  def init(els: MElements): js.Array[typings.materializeDashCss.MNs.Dropdown] = js.native
  def init(els: MElements, options: Partial[DropdownOptions]): js.Array[typings.materializeDashCss.MNs.Dropdown] = js.native
  /**
    * Init Dropdown
    */
  def init(els: Element): typings.materializeDashCss.MNs.Dropdown = js.native
  def init(els: Element, options: Partial[DropdownOptions]): typings.materializeDashCss.MNs.Dropdown = js.native
}

