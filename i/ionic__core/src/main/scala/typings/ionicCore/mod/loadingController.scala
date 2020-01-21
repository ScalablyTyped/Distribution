package typings.ionicCore.mod

import typings.ionicCore.componentsMod._Global_.HTMLIonLoadingElement
import typings.ionicCore.loadingInterfaceMod.LoadingOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core", "loadingController")
@js.native
object loadingController extends js.Object {
  def create(options: LoadingOptions): js.Promise[HTMLIonLoadingElement] = js.native
  def dismiss(): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
  def getTop(): js.Promise[js.UndefOr[HTMLIonLoadingElement]] = js.native
}

