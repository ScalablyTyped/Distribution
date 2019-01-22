package typings
package atMaterialDrawerLib.modalFoundationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/drawer/modal/foundation", "MDCModalDrawerFoundation")
@js.native
class MDCModalDrawerFoundation ()
  extends atMaterialDrawerLib.dismissibleFoundationMod.MDCDismissibleDrawerFoundation {
  /**
    * Called when drawer finishes close animation.
    */
  def closed(): scala.Unit = js.native
  /**
    * Handles click event on scrim.
    */
  def handleScrimClick(): scala.Unit = js.native
  /**
    * Called when drawer finishes open animation.
    */
  def opened(): scala.Unit = js.native
}

