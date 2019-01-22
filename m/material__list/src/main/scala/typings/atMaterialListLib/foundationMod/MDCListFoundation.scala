package typings
package atMaterialListLib.foundationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/list/foundation", "MDCListFoundation")
@js.native
class MDCListFoundation protected ()
  extends atMaterialBaseLib.foundationMod.default[MDCListFoundation] {
  def this(adapter: atMaterialListLib.adapterMod.MDCListAdapter) = this()
  def focusFirstElement(): scala.Double = js.native
  def focusLastElement(): scala.Double = js.native
  /**
    * Focuses the next element on the list.
    */
  def focusNextElement(index: scala.Double): scala.Double = js.native
  /**
    * Focuses the previous element on the list.
    */
  def focusPrevElement(index: scala.Double): scala.Double = js.native
  def getSelectedIndex(): atMaterialListLib.constantsMod.Index = js.native
  /**
    * Click handler for the list.
    */
  def handleClick(index: scala.Double, toggleCheckbox: scala.Boolean): scala.Unit = js.native
  /**
    * Focus in handler for the list items.
    */
  def handleFocusIn(evt: stdLib.Event, listItemIndex: scala.Double): scala.Unit = js.native
  /**
    * Focus out handler for the list items.
    */
  def handleFocusOut(evt: stdLib.Event, listItemIndex: scala.Double): scala.Unit = js.native
  /**
    * Key handler for the list.
    */
  def handleKeydown(evt: stdLib.Event, isRootListItem: scala.Boolean, listItemIndex: scala.Double): scala.Unit = js.native
  def layout(): scala.Unit = js.native
  def setSelectedIndex(index: atMaterialListLib.constantsMod.Index): scala.Unit = js.native
  /**
    * Sets the isSingleSelectionList_ private variable.
    */
  def setSingleSelection(value: scala.Boolean): scala.Unit = js.native
  /**
    * Sets the useActivatedClass_ private variable.
    */
  def setUseActivatedClass(useActivated: scala.Boolean): scala.Unit = js.native
  /**
    * Sets the isVertical_ private variable.
    */
  def setVerticalOrientation(value: scala.Boolean): scala.Unit = js.native
  /**
    * Sets the private wrapFocus_ variable.
    */
  def setWrapFocus(value: scala.Boolean): scala.Unit = js.native
}

@JSImport("@material/list/foundation", "MDCListFoundation")
@js.native
object MDCListFoundation extends js.Object {
  val cssClasses: atMaterialListLib.constantsMod.cssClasses = js.native
  val defaultAdapter: atMaterialListLib.adapterMod.MDCListAdapter = js.native
  val strings: atMaterialListLib.constantsMod.strings = js.native
}

