package typings.materialRipple

import typings.std.ClientRect
import typings.std.Event_
import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/ripple/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  def applyPassive(): Boolean | AnonPassive = js.native
  def applyPassive(globalObj: Window_): Boolean | AnonPassive = js.native
  def applyPassive(globalObj: Window_, forceRefresh: Boolean): Boolean | AnonPassive = js.native
  def getMatchesProperty(HTMLElementPrototype: js.Object): js.Array[String] = js.native
  def getNormalizedEventCoords(ev: Event_, pageOffset: AnonX, clientRect: ClientRect): AnonX = js.native
  def supportsCssVariables(windowObj: Window_): js.UndefOr[Boolean] = js.native
  def supportsCssVariables(windowObj: Window_, forceRefresh: Boolean): js.UndefOr[Boolean] = js.native
}

