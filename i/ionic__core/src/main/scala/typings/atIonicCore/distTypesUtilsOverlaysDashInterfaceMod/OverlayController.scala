package typings.atIonicCore.distTypesUtilsOverlaysDashInterfaceMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlayController extends js.Object {
  def create(): js.Promise[HTMLElement] = js.native
  def create(opts: js.Any): js.Promise[HTMLElement] = js.native
  def dismiss(): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
  def getTop(): js.Promise[js.UndefOr[HTMLIonOverlayElement]] = js.native
}

