package typings.heremaps.H.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents a contextual information/action.
  * @property SEPARATOR {H.util.ContextItem} - Separator for the context items
  */
@js.native
trait ContextItem_ extends EventTarget {
  
  def addOnDisposeCallback(callback: js.Function0[Unit], opt_scope: js.Object): Unit = js.native
  
  /**
    * This method returns label of the context item
    * @returns {string} - the label of the context item
    */
  def getLabel(): String = js.native
  
  /**
    * This method returns disabled state of the context item.
    * @returns {boolean} -  true if the item is disabled, false otherwise
    */
  def isDisabled(): Boolean = js.native
  
  /**
    * This method enables/disables the context item
    * @param disabled {boolean} -  true to disable and false to enabled it
    * @returns {H.util.ContextItem} - this context item instance
    */
  def setDisabled(disabled: Boolean): ContextItem = js.native
  
  /**
    * This method changes context item label to the specified one
    * @param label {string} - New label for the context item
    * @returns {H.util.ContextItem} - this context item instance
    */
  def setLabel(label: String): ContextItem = js.native
}
