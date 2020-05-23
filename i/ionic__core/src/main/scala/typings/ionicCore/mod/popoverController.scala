package typings.ionicCore.mod

import typings.ionicCore.componentsMod.global.HTMLIonPopoverElement
import typings.ionicCore.popoverInterfaceMod.PopoverOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core", "popoverController")
@js.native
object popoverController extends js.Object {
  def create(options: PopoverOptions[ComponentRef]): js.Promise[HTMLIonPopoverElement] = js.native
  def dismiss(): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
  def getTop(): js.Promise[js.UndefOr[HTMLIonPopoverElement]] = js.native
}

