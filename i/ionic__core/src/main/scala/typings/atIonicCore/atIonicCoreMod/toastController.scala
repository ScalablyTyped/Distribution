package typings.atIonicCore.atIonicCoreMod

import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonToastElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core", "toastController")
@js.native
object toastController extends js.Object {
  def create(
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ToastOptions */ js.Any
  ): js.Promise[HTMLIonToastElement] = js.native
  def dismiss(): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
  def getTop(): js.Promise[js.UndefOr[HTMLIonToastElement]] = js.native
}

