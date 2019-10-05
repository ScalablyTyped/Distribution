package typings.magicsuggest.MagicSuggest

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
  def addToSelection(objs: js.Array[_]): Unit = js.native
  def addToSelection(objs: js.Array[_], isSilent: Boolean): Unit = js.native
  /**
    * Clears the current selection
    * @param isSilent - (optional) set to true to suppress 'selectionchange' event from being triggered
    */
  def clear(): Unit = js.native
  def clear(isSilent: Boolean): Unit = js.native
  /**
    * Collapse the drop down part of the combo
    */
  def collapse(): Unit = js.native
  /**
    * Set the component in a disabled state.
    */
  def disable(): Unit = js.native
  /**
    * Empties out the combo user text
    */
  def empty(): Unit = js.native
  /**
    * Set the component in a enable state.
    */
  def enable(): Unit = js.native
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
  def getName(): String = js.native
  /**
    * Retrieve the current text entered by the user
    */
  def getRawValue(): String = js.native
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
  def isDisabled(): Boolean = js.native
  /**
    * Checks whether the field is valid or not
    * @return {boolean}
    */
  def isValid(): Boolean = js.native
  /**
    * Remove one or multiples json items from the current selection
    * @param items - json object or array of json objects
    * @param isSilent - (optional) set to true to suppress 'selectionchange' event from being triggered
    */
  def removeFromSelection(items: js.Any, isSilent: Boolean): Unit = js.native
  /**
    * Set up some combo data after it has been rendered
    * @param data
    */
  def setData(data: js.Any): Unit = js.native
  /**
    * Sets data params for subsequent ajax requests
    * @param params
    */
  def setDataUrlParams(params: js.Any): Unit = js.native
  /**
    * Sets the name for the input field so it can be fetched in the form
    * @param name
    */
  def setName(name: String): Unit = js.native
  /**
    * Sets the current selection with the JSON items provided
    * @param items
    * @param isSilent - (optional)
    */
  def setSelection(items: js.Array[_]): Unit = js.native
  def setSelection(items: js.Array[_], isSilet: Boolean): Unit = js.native
  /**
    * Sets a value for the combo box. Value must be an array of values with data type matching valueField one.
    * @param data
    */
  def setValue(values: js.Array[_]): Unit = js.native
}

