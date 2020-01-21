package typings.jqueryEditableSelect

import typings.jqueryEditableSelect.JQueryEditableSelect.EditableSelectOptions
import typings.jqueryEditableSelect.jqueryEditableSelectStrings.add
import typings.jqueryEditableSelect.jqueryEditableSelectStrings.clear
import typings.jqueryEditableSelect.jqueryEditableSelectStrings.destroy
import typings.jqueryEditableSelect.jqueryEditableSelectStrings.filter
import typings.jqueryEditableSelect.jqueryEditableSelectStrings.hide
import typings.jqueryEditableSelect.jqueryEditableSelectStrings.remove
import typings.jqueryEditableSelect.jqueryEditableSelectStrings.select
import typings.jqueryEditableSelect.jqueryEditableSelectStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
    * Transforms the <select> into a typeahead field. Accepts an optional options object.
    *
    * @param options Options setting the editable select behavior
    */
  def editableSelect(): JQuery = js.native
  def editableSelect(options: EditableSelectOptions): JQuery = js.native
  /**
    * Adds a new option in the dropdown list
    *
    * @param action Action to apply, must be 'add'
    * @param text Test to be displayed
    * @param index position to insert the element at.
    * @param attrs optional attributes to add to the element
    * @param data optional data to add to the element
    */
  @JSName("editableSelect")
  def editableSelect_add(action: add, text: String): Unit = js.native
  @JSName("editableSelect")
  def editableSelect_add(action: add, text: String, index: Double): Unit = js.native
  @JSName("editableSelect")
  def editableSelect_add(action: add, text: String, index: Double, attrs: js.Array[AnonName]): Unit = js.native
  @JSName("editableSelect")
  def editableSelect_add(action: add, text: String, index: Double, attrs: js.Array[AnonName], data: String): Unit = js.native
  @JSName("editableSelect")
  def editableSelect_clear(action: clear): Unit = js.native
  @JSName("editableSelect")
  def editableSelect_destroy(action: destroy): Unit = js.native
  @JSName("editableSelect")
  def editableSelect_filter(action: filter): Unit = js.native
  @JSName("editableSelect")
  def editableSelect_hide(action: hide): Unit = js.native
  /**
    * Removes an option in the dropdown list at the given index.
    *
    * @param action Action to apply, must be 'remove'
    * @param index position of the element to remove.
    */
  @JSName("editableSelect")
  def editableSelect_remove(action: remove, index: Double): Unit = js.native
  /**
    * Manually sets the value of the text field to the value of the $element passed as parameter.
    *
    * @param action Action to apply, must be 'select'
    * @param element element to select (it must be one of the elements in the dropdown list)
    */
  @JSName("editableSelect")
  def editableSelect_select(action: select, element: JQuery): Unit = js.native
  /**
    * Manually shows/hide/filters/clears/destorys the dropdown list.
    *
    * @param action Action to apply
    */
  @JSName("editableSelect")
  def editableSelect_show(action: show): Unit = js.native
}

