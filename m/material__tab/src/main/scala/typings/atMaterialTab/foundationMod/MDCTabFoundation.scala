package typings.atMaterialTab.foundationMod

import typings.atMaterialTab.adapterMod.MDCTabAdapter
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCTabFoundation
  extends typings.atMaterialBase.foundationMod.default[MDCTabAdapter] {
  /**
    * Activates the Tab
    */
  def activate(): Unit = js.native
  /**
    * Deactivates the Tab
    */
  def deactivate(): Unit = js.native
  def handleTransitionEnd(evt: Event): Unit = js.native
  /**
    * Returns the Tab's active state
    */
  def isActive(): Boolean = js.native
}

