package typings
package heremapsLib.HNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class represents a contextual information/action.
  * @property SEPARATOR {H.util.ContextItem} - Separator for the context items
  */
@JSGlobal("H.util.ContextItem")
@js.native
/**
  * Constructor
  * @param opt_options {H.util.ContextItem.Options=} - The values to initialize this context item
  */
class ContextItem () extends EventTarget {
  def this(opt_options: heremapsLib.HNs.utilNs.ContextItemNs.Options) = this()
  def addOnDisposeCallback(callback: js.Function0[scala.Unit], opt_scope: js.Object): scala.Unit = js.native
  /**
    * This method returns label of the context item
    * @returns {string} - the label of the context item
    */
  def getLabel(): java.lang.String = js.native
  /**
    * This method returns disabled state of the context item.
    * @returns {boolean} -  true if the item is disabled, false otherwise
    */
  def isDisabled(): scala.Boolean = js.native
  /**
    * This method enables/disables the context item
    * @param disabled {boolean} -  true to disable and false to enabled it
    * @returns {H.util.ContextItem} - this context item instance
    */
  def setDisabled(disabled: scala.Boolean): ContextItem = js.native
  /**
    * This method changes context item label to the specified one
    * @param label {string} - New label for the context item
    * @returns {H.util.ContextItem} - this context item instance
    */
  def setLabel(label: java.lang.String): ContextItem = js.native
}

/**
  * This class represents a contextual information/action.
  * @property SEPARATOR {H.util.ContextItem} - Separator for the context items
  */
@JSGlobal("H.util.ContextItem")
@js.native
object ContextItem extends js.Object {
  var SEPARATOR: heremapsLib.HNs.utilNs.ContextItem = js.native
}

