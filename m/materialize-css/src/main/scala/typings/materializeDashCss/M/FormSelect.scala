package typings.materializeDashCss.M

import typings.materializeDashCss.MElements
import typings.std.Element
import typings.std.HTMLInputElement
import typings.std.HTMLUListElement
import typings.std.Partial
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
  var dropdownOptions: HTMLUListElement = js.native
  /**
    * Text input that shows current selected option
    */
  var input: HTMLInputElement = js.native
  /**
    * If this is a multiple select
    */
  var isMultiple: Boolean = js.native
  /**
    * The select wrapper element
    */
  var wrapper: Element = js.native
  /**
    * Get selected values in an array
    */
  def getSelectedValues(): js.Array[String] = js.native
}

/* static members */
@JSGlobal("M.FormSelect")
@js.native
object FormSelect extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): FormSelect = js.native
  /**
    * Init FormSelects
    */
  def init(els: MElements): js.Array[FormSelect] = js.native
  def init(els: MElements, options: Partial[FormSelectOptions]): js.Array[FormSelect] = js.native
  /**
    * Init FormSelect
    */
  def init(els: Element): FormSelect = js.native
  def init(els: Element, options: Partial[FormSelectOptions]): FormSelect = js.native
}

