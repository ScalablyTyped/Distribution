package typings.materializeCss.mod

import typings.materializeCss.MElements
import typings.materializeCss.PartialDropdownOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Dropdown")
@js.native
class Dropdown ()
  extends typings.materializeCss.M.Dropdown

/* static members */
@JSImport("materialize-css", "Dropdown")
@js.native
object Dropdown extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.Dropdown = js.native
  /**
    * Init Dropdowns
    */
  def init(els: MElements): js.Array[typings.materializeCss.M.Dropdown] = js.native
  def init(els: MElements, options: PartialDropdownOptions): js.Array[typings.materializeCss.M.Dropdown] = js.native
  /**
    * Init Dropdown
    */
  def init(els: Element): typings.materializeCss.M.Dropdown = js.native
  def init(els: Element, options: PartialDropdownOptions): typings.materializeCss.M.Dropdown = js.native
}

