package typings.ionicCore.mod

import typings.ionicCore.componentsMod._Global_.HTMLIonPickerElement
import typings.ionicCore.pickerInterfaceMod.PickerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core", "pickerController")
@js.native
object pickerController extends js.Object {
  def create(options: PickerOptions): js.Promise[HTMLIonPickerElement] = js.native
  def dismiss(): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
  def getTop(): js.Promise[js.UndefOr[HTMLIonPickerElement]] = js.native
}

