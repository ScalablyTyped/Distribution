package typings.atIonicCore.distTypesUtilsOverlaysMod

import typings.atIonicCore.distTypesComponentsMod.Global.HTMLIonPopoverElement
import typings.atIonicCore.distTypesComponentsPopoverPopoverDashInterfaceMod.PopoverOptions
import typings.atIonicCore.distTypesInterfaceMod.ComponentRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/utils/overlays", "popoverController")
@js.native
object popoverController extends js.Object {
  def create(options: PopoverOptions[ComponentRef]): js.Promise[HTMLIonPopoverElement] = js.native
  def dismiss(): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
  def getTop(): js.Promise[js.UndefOr[HTMLIonPopoverElement]] = js.native
}

