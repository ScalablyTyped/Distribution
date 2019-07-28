package typings.atIonicCore.distTypesInterfaceMod

import typings.atIonicCore.distTypesComponentsAlertAlertDashInterfaceMod.AlertOptions
import typings.atIonicCore.distTypesComponentsMod.Global.HTMLIonAlertElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/interface", "alertController")
@js.native
object alertController extends js.Object {
  def create(options: AlertOptions): js.Promise[HTMLIonAlertElement] = js.native
  def dismiss(): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
  def getTop(): js.Promise[js.UndefOr[HTMLIonAlertElement]] = js.native
}

