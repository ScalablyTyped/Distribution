package typings.atIonicCore.distTypesComponentsMod.Components

import typings.atIonicCore.distTypesComponentsAlertAlertDashInterfaceMod.AlertOptions
import typings.atIonicCore.distTypesComponentsMod.Global.HTMLIonAlertElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonAlertController extends js.Object {
  /**
    * Create an alert overlay with alert options.
    * @param options The options to use to create the alert.
    */
  def create(options: AlertOptions): js.Promise[HTMLIonAlertElement] = js.native
  /**
    * Dismiss the open alert overlay.
    * @param data Any data to emit in the dismiss events.
    * @param role The role of the element that is dismissing the alert. This can be useful in a button handler for determining which button was clicked to dismiss the alert. Some examples include: ``"cancel"`, `"destructive"`, "selected"`, and `"backdrop"`.
    * @param id The id of the alert to dismiss. If an id is not provided, it will dismiss the most recently opened alert.
    */
  def dismiss(): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
  /**
    * Get the most recently opened alert overlay.
    */
  def getTop(): js.Promise[js.UndefOr[HTMLIonAlertElement]] = js.native
}

