package typings.atIonicCore.distTypesUtilsOverlaysDashInterfaceMod

import typings.atIonicCore.distTypesStencilDotCoreMod.HTMLStencilElement
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

