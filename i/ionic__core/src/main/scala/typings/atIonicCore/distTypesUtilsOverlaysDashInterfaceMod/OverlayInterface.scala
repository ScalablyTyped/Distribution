package typings.atIonicCore.distTypesUtilsOverlaysDashInterfaceMod

import typings.atIonicCore.distTypesInterfaceMod.Mode
import typings.atIonicCore.distTypesStencilDotCoreMod.EventEmitter
import typings.atIonicCore.distTypesUtilsAnimationAnimationDashInterfaceMod.Animation
import typings.atIonicCore.distTypesUtilsAnimationAnimationDashInterfaceMod.AnimationBuilder
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlayInterface extends js.Object {
  var animated: Boolean = js.native
  var animation: js.UndefOr[Animation] = js.native
  var didDismiss: EventEmitter[OverlayEventDetail[_]] = js.native
  var didPresent: EventEmitter[Unit] = js.native
  var el: HTMLElement = js.native
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.native
  var keyboardClose: Boolean = js.native
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.native
  var mode: Mode = js.native
  var overlayIndex: Double = js.native
  var presented: Boolean = js.native
  var willDismiss: EventEmitter[OverlayEventDetail[_]] = js.native
  var willPresent: EventEmitter[Unit] = js.native
  def dismiss(): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
  def present(): js.Promise[Unit] = js.native
}

