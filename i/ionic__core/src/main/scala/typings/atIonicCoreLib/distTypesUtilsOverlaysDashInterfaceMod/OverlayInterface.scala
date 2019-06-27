package typings
package atIonicCoreLib.distTypesUtilsOverlaysDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlayInterface extends js.Object {
  var animated: scala.Boolean = js.native
  var animation: js.UndefOr[stdLib.Animation] = js.native
  var didDismiss: atIonicCoreLib.distTypesStencilDotCoreMod.EventEmitter[OverlayEventDetail[_]] = js.native
  var didPresent: atIonicCoreLib.distTypesStencilDotCoreMod.EventEmitter[scala.Unit] = js.native
  var el: stdLib.HTMLElement = js.native
  var enterAnimation: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.native
  var keyboardClose: scala.Boolean = js.native
  var leaveAnimation: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.native
  var mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any = js.native
  var overlayIndex: scala.Double = js.native
  var presented: scala.Boolean = js.native
  var willDismiss: atIonicCoreLib.distTypesStencilDotCoreMod.EventEmitter[OverlayEventDetail[_]] = js.native
  var willPresent: atIonicCoreLib.distTypesStencilDotCoreMod.EventEmitter[scala.Unit] = js.native
  def dismiss(): js.Promise[scala.Boolean] = js.native
  def dismiss(data: js.Any): js.Promise[scala.Boolean] = js.native
  def dismiss(data: js.Any, role: java.lang.String): js.Promise[scala.Boolean] = js.native
  def present(): js.Promise[scala.Unit] = js.native
}

