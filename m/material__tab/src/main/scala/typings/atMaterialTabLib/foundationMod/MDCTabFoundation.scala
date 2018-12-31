package typings
package atMaterialTabLib.foundationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCTabFoundation
  extends atMaterialBaseLib.foundationMod.default[atMaterialTabLib.adapterMod.MDCTabAdapter] {
  /**
    * Activates the Tab
    */
  def activate(): scala.Unit = js.native
  /**
    * Deactivates the Tab
    */
  def deactivate(): scala.Unit = js.native
  def handleTransitionEnd(evt: stdLib.Event): scala.Unit = js.native
  /**
    * Returns the Tab's active state
    */
  def isActive(): scala.Boolean = js.native
}

