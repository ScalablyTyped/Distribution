package typings.atIonicCore.distTypesUtilsOverlaysMod

import typings.atIonicCore.distTypesComponentsMod.Global.HTMLIonToastElement
import typings.atIonicCore.distTypesComponentsToastToastDashInterfaceMod.ToastOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/utils/overlays", "toastController")
@js.native
object toastController extends js.Object {
  def create(options: ToastOptions): js.Promise[HTMLIonToastElement] = js.native
  def dismiss(): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
  def getTop(): js.Promise[js.UndefOr[HTMLIonToastElement]] = js.native
}

