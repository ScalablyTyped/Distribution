package typings.ionicCore.overlaysInterfaceMod

import typings.ionicCore.stencilCoreMod.HTMLStencilElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLIonOverlayElement extends HTMLStencilElement {
  var backdropDismiss: js.UndefOr[Boolean] = js.native
  var overlayIndex: Double = js.native
  def dismiss(): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
}

