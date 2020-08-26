package typings.ionicCore.overlaysInterfaceMod

import typings.ionicCore.interfaceMod.HTMLStencilElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLIonOverlayElement extends HTMLStencilElement {
  var backdropDismiss: js.UndefOr[Boolean] = js.native
  var lastFocus: js.UndefOr[HTMLElement] = js.native
  var overlayIndex: Double = js.native
  def dismiss(): js.Promise[Boolean] = js.native
  def dismiss(data: js.UndefOr[scala.Nothing], role: String): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
}

