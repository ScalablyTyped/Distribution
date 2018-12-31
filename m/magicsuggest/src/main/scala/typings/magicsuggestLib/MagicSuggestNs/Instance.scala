package typings
package magicsuggestLib.MagicSuggestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends js.Object {
  /**
    * Add one or multiple json items to the current selection
    * @param items - json object or array of json objects
    * @param isSilent - (optional) set to true to suppress 'selectionchange' event from being triggered
    */
  def addToSelection(objs: js.Array[_]): scala.Unit = js.native
  def addToSelection(objs: js.Array[_], isSilent: scala.Boolean): scala.Unit = js.native
  /**
    * Clears the current selection
    * @param isSilent - (optional) set to true to suppress 'selectionchange' event from being triggered
    */
  def clear(): scala.Unit = js.native
  def clear(isSilent: scala.Boolean): scala.Unit = js.native
  /**
    * Collapse the drop down part of the combo
    */
  def collapse(): scala.Unit = js.native
  /**
    * Set the component in a disabled state.
    */
  def disable(): scala.Unit = js.native
  /**
    * Empties out the combo user text
    */
  def empty(): scala.Unit = js.native
  /**
    * Set the component in a enable state.
    */
  def enable(): scala.Unit = js.native
  /**
    * Get current data
    */
  def getData(): js.Any = js.native
  /**
    * Gets the data params for current ajax request
    */
  def getDataUrlParams(): js.Object = js.native
  /**
    * Gets the name given to the form input
    */
  def getName(): java.lang.String = js.native
  /**
    * Retrieve the current text entered by the user
    */
  def getRawValue(): java.lang.String = js.native
  /**
    * Retrieve an array of selected json objects
    * @return {Array}
    */
  def getSelection(): js.Array[_] = js.native
  /**
    * Retrieve an array of selected values
    */
  def getValue(): js.Array[_] = js.native
  /**
    * Retrieve component enabled status
    * @return {boolean}
    */
  def isDisabled(): scala.Boolean = js.native
  /**
    * Checks whether the field is valid or not
    * @return {boolean}
    */
  def isValid(): scala.Boolean = js.native
  /**
    * Remove one or multiples json items from the current selection
    * @param items - json object or array of json objects
    * @param isSilent - (optional) set to true to suppress 'selectionchange' event from being triggered
    */
  def removeFromSelection(items: js.Any, isSilent: scala.Boolean): scala.Unit = js.native
  /**
    * Set up some combo data after it has been rendered
    * @param data
    */
  def setData(data: js.Any): scala.Unit = js.native
  /**
    * Sets data params for subsequent ajax requests
    * @param params
    */
  def setDataUrlParams(params: js.Any): scala.Unit = js.native
  /**
    * Sets the name for the input field so it can be fetched in the form
    * @param name
    */
  def setName(name: java.lang.String): scala.Unit = js.native
  /**
    * Sets the current selection with the JSON items provided
    * @param items
    * @param isSilent - (optional)
    */
  def setSelection(items: js.Array[_]): scala.Unit = js.native
  def setSelection(items: js.Array[_], isSilet: scala.Boolean): scala.Unit = js.native
  /**
    * Sets a value for the combo box. Value must be an array of values with data type matching valueField one.
    * @param data
    */
  def setValue(values: js.Array[_]): scala.Unit = js.native
}

