package typings.atIonicCore.atIonicCoreMod

import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonPickerElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core", "pickerController")
@js.native
object pickerController extends js.Object {
  def create(
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PickerOptions */ js.Any
  ): js.Promise[HTMLIonPickerElement] = js.native
  def dismiss(): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
  def getTop(): js.Promise[js.UndefOr[HTMLIonPickerElement]] = js.native
}

