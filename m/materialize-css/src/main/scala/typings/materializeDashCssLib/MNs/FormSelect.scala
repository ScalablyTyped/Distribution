package typings
package materializeDashCssLib.MNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.FormSelect")
@js.native
class FormSelect () extends Component[FormSelectOptions] {
  /**
    * Instance of the dropdown plugin for this select
    */
  var dropdown: Dropdown = js.native
  /**
    * Dropdown UL element
    */
  var dropdownOptions: stdLib.HTMLUListElement = js.native
  /**
    * Text input that shows current selected option
    */
  var input: stdLib.HTMLInputElement = js.native
  /**
    * If this is a multiple select
    */
  var isMultiple: scala.Boolean = js.native
  /**
    * The select wrapper element
    */
  var wrapper: stdLib.Element = js.native
  /**
    * Get selected values in an array
    */
  def getSelectedValues(): js.Array[java.lang.String] = js.native
}

@JSGlobal("M.FormSelect")
@js.native
object FormSelect extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: stdLib.Element): materializeDashCssLib.MNs.FormSelect = js.native
  /**
    * Init FormSelects
    */
  def init(els: materializeDashCssLib.MElements): js.Array[materializeDashCssLib.MNs.FormSelect] = js.native
  def init(
    els: materializeDashCssLib.MElements,
    options: stdLib.Partial[materializeDashCssLib.MNs.FormSelectOptions]
  ): js.Array[materializeDashCssLib.MNs.FormSelect] = js.native
  /**
    * Init FormSelect
    */
  def init(els: stdLib.Element): materializeDashCssLib.MNs.FormSelect = js.native
  def init(els: stdLib.Element, options: stdLib.Partial[materializeDashCssLib.MNs.FormSelectOptions]): materializeDashCssLib.MNs.FormSelect = js.native
}

