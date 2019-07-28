package typings.atIonicCore.distTypesInterfaceMod

import typings.atIonicCore.distTypesComponentsActionDashSheetActionDashSheetDashInterfaceMod.ActionSheetOptions
import typings.atIonicCore.distTypesComponentsMod.Global.HTMLIonActionSheetElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/interface", "actionSheetController")
@js.native
object actionSheetController extends js.Object {
  def create(options: ActionSheetOptions): js.Promise[HTMLIonActionSheetElement] = js.native
  def dismiss(): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
  def getTop(): js.Promise[js.UndefOr[HTMLIonActionSheetElement]] = js.native
}

