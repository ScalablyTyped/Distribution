package typings
package jqueryDashEditableDashSelectLib

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
  /**
       * Transforms the <select> into a typeahead field. Accepts an optional options object.
       *
       * @param options Options setting the editable select behavior
       */
  def editableSelect(options: jqueryDashEditableDashSelectLib.JQueryEditableSelectNs.EditableSelectOptions): JQuery = js.native
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
  def editableSelect_add(
    action: jqueryDashEditableDashSelectLib.jqueryDashEditableDashSelectLibStrings.add,
    text: java.lang.String
  ): scala.Unit = js.native
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
  def editableSelect_add(
    action: jqueryDashEditableDashSelectLib.jqueryDashEditableDashSelectLibStrings.add,
    text: java.lang.String,
    index: scala.Double
  ): scala.Unit = js.native
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
  def editableSelect_add(
    action: jqueryDashEditableDashSelectLib.jqueryDashEditableDashSelectLibStrings.add,
    text: java.lang.String,
    index: scala.Double,
    attrs: js.Array[Anon_Value]
  ): scala.Unit = js.native
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
  def editableSelect_add(
    action: jqueryDashEditableDashSelectLib.jqueryDashEditableDashSelectLibStrings.add,
    text: java.lang.String,
    index: scala.Double,
    attrs: js.Array[Anon_Value],
    data: java.lang.String
  ): scala.Unit = js.native
  /**
       * Manually shows/hide/filters/clears/destorys the dropdown list.
       *
       * @param action Action to apply
       */
  @JSName("editableSelect")
  def editableSelect_clear(action: jqueryDashEditableDashSelectLib.jqueryDashEditableDashSelectLibStrings.clear): scala.Unit = js.native
  /**
       * Manually shows/hide/filters/clears/destorys the dropdown list.
       *
       * @param action Action to apply
       */
  @JSName("editableSelect")
  def editableSelect_destroy(action: jqueryDashEditableDashSelectLib.jqueryDashEditableDashSelectLibStrings.destroy): scala.Unit = js.native
  /**
       * Manually shows/hide/filters/clears/destorys the dropdown list.
       *
       * @param action Action to apply
       */
  @JSName("editableSelect")
  def editableSelect_filter(action: jqueryDashEditableDashSelectLib.jqueryDashEditableDashSelectLibStrings.filter): scala.Unit = js.native
  /**
       * Manually shows/hide/filters/clears/destorys the dropdown list.
       *
       * @param action Action to apply
       */
  @JSName("editableSelect")
  def editableSelect_hide(action: jqueryDashEditableDashSelectLib.jqueryDashEditableDashSelectLibStrings.hide): scala.Unit = js.native
  /**
       * Removes an option in the dropdown list at the given index.
       *
       * @param action Action to apply, must be 'remove'
       * @param index position of the element to remove.
       */
  @JSName("editableSelect")
  def editableSelect_remove(
    action: jqueryDashEditableDashSelectLib.jqueryDashEditableDashSelectLibStrings.remove,
    index: scala.Double
  ): scala.Unit = js.native
  /**
       * Manually sets the value of the text field to the value of the $element passed as parameter.
       *
       * @param action Action to apply, must be 'select'
       * @param element element to select (it must be one of the elements in the dropdown list)
       */
  @JSName("editableSelect")
  def editableSelect_select(
    action: jqueryDashEditableDashSelectLib.jqueryDashEditableDashSelectLibStrings.select,
    element: JQuery
  ): scala.Unit = js.native
  /**
       * Manually shows/hide/filters/clears/destorys the dropdown list.
       *
       * @param action Action to apply
       */
  @JSName("editableSelect")
  def editableSelect_show(action: jqueryDashEditableDashSelectLib.jqueryDashEditableDashSelectLibStrings.show): scala.Unit = js.native
}

