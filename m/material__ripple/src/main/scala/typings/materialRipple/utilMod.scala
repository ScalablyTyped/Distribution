package typings.materialRipple

import typings.materialRipple.typesMod.MDCRipplePoint
import typings.std.ClientRect
import typings.std.Event
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/ripple/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  def getNormalizedEventCoords(evt: js.UndefOr[scala.Nothing], pageOffset: MDCRipplePoint, clientRect: ClientRect): MDCRipplePoint = js.native
  def getNormalizedEventCoords(evt: Event, pageOffset: MDCRipplePoint, clientRect: ClientRect): MDCRipplePoint = js.native
  def supportsCssVariables(windowObj: Window): Boolean = js.native
  def supportsCssVariables(windowObj: Window, forceRefresh: Boolean): Boolean = js.native
}

