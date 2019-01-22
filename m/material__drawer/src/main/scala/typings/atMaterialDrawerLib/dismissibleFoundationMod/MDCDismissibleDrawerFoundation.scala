package typings
package atMaterialDrawerLib.dismissibleFoundationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/drawer/dismissible/foundation", "MDCDismissibleDrawerFoundation")
@js.native
class MDCDismissibleDrawerFoundation protected ()
  extends atMaterialBaseLib.foundationMod.default[atMaterialDrawerLib.adapterMod.MDCDrawerAdapter] {
  def this(adapter: atMaterialDrawerLib.adapterMod.MDCDrawerAdapter) = this()
  /**
    * Function to close the drawer.
    */
  def close(): scala.Unit = js.native
  /**
    * Keydown handler to close drawer when key is escape.
    */
  def handleKeydown(evt: stdLib.KeyboardEvent): scala.Unit = js.native
  /**
    * Handles a transition end event on the root element.
    */
  def handleTransitionEnd(evt: stdLib.Event): scala.Unit = js.native
  /**
    * Returns true if drawer is animating closed.
    */
  def isClosing(): scala.Boolean = js.native
  /**
    * Returns true if drawer is in open state.
    */
  def isOpen(): scala.Boolean = js.native
  /**
    * Returns true if drawer is animating open.
    */
  def isOpening(): scala.Boolean = js.native
  /**
    * Function to open the drawer.
    */
  def open(): scala.Unit = js.native
}

@JSImport("@material/drawer/dismissible/foundation", "MDCDismissibleDrawerFoundation")
@js.native
object MDCDismissibleDrawerFoundation extends js.Object {
  val cssClasses: atMaterialDrawerLib.constantsMod.cssClasses = js.native
  val defaultAdapter: atMaterialDrawerLib.adapterMod.MDCDrawerAdapter = js.native
  val strings: atMaterialDrawerLib.constantsMod.strings = js.native
}

