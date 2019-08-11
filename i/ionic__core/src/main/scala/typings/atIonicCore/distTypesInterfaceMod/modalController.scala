package typings.atIonicCore.distTypesInterfaceMod

import typings.atIonicCore.distTypesComponentsMod.Global.HTMLIonModalElement
import typings.atIonicCore.distTypesComponentsModalModalDashInterfaceMod.ModalOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/interface", "modalController")
@js.native
object modalController extends js.Object {
  def create(options: ModalOptions[ComponentRef]): js.Promise[HTMLIonModalElement] = js.native
  def dismiss(): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
  def getTop(): js.Promise[js.UndefOr[HTMLIonModalElement]] = js.native
}

