package typings.atMaterialRipple

import typings.std.ClientRect
import typings.std.Event
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/ripple/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  def applyPassive(): Boolean | Anon_Passive = js.native
  def applyPassive(globalObj: Window): Boolean | Anon_Passive = js.native
  def applyPassive(globalObj: Window, forceRefresh: Boolean): Boolean | Anon_Passive = js.native
  def getMatchesProperty(HTMLElementPrototype: js.Object): js.Array[String] = js.native
  def getNormalizedEventCoords(ev: Event, pageOffset: Anon_X, clientRect: ClientRect): Anon_X = js.native
  def supportsCssVariables(windowObj: Window): js.UndefOr[Boolean] = js.native
  def supportsCssVariables(windowObj: Window, forceRefresh: Boolean): js.UndefOr[Boolean] = js.native
}

