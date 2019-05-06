package typings
package atIonicCoreLib.distTypesComponentsMenuMenuDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuI extends js.Object {
  var _isOpen: scala.Boolean = js.native
  var backdropEl: js.UndefOr[stdLib.HTMLElement] = js.native
  var contentEl: js.UndefOr[stdLib.HTMLElement] = js.native
  var disabled: scala.Boolean = js.native
  var el: atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonMenuElement = js.native
  var isAnimating: scala.Boolean = js.native
  var isEndSide: scala.Boolean = js.native
  var menuCtrl: js.UndefOr[MenuControllerI] = js.native
  var menuId: js.UndefOr[java.lang.String] = js.native
  var menuInnerEl: js.UndefOr[stdLib.HTMLElement] = js.native
  var side: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Side */ js.Any = js.native
  var width: scala.Double = js.native
  def _setOpen(shouldOpen: scala.Boolean): js.Promise[scala.Boolean] = js.native
  def _setOpen(shouldOpen: scala.Boolean, animated: scala.Boolean): js.Promise[scala.Boolean] = js.native
  def close(): js.Promise[scala.Boolean] = js.native
  def close(animated: scala.Boolean): js.Promise[scala.Boolean] = js.native
  def isActive(): js.Promise[scala.Boolean] = js.native
  def open(): js.Promise[scala.Boolean] = js.native
  def open(animated: scala.Boolean): js.Promise[scala.Boolean] = js.native
  def setOpen(shouldOpen: scala.Boolean): js.Promise[scala.Boolean] = js.native
  def setOpen(shouldOpen: scala.Boolean, animated: scala.Boolean): js.Promise[scala.Boolean] = js.native
  def toggle(): js.Promise[scala.Boolean] = js.native
  def toggle(animated: scala.Boolean): js.Promise[scala.Boolean] = js.native
}

