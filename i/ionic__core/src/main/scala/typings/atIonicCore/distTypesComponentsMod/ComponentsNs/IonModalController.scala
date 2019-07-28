package typings.atIonicCore.distTypesComponentsMod.ComponentsNs

import typings.atIonicCore.distTypesComponentsMod.Global.HTMLIonModalElement
import typings.atIonicCore.distTypesComponentsModalModalDashInterfaceMod.ModalOptions
import typings.atIonicCore.distTypesInterfaceMod.ComponentRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonModalController extends js.Object {
  /**
    * Create a modal overlay with modal options.
    * @param options The options to use to create the modal.
    */
  def create[T /* <: ComponentRef */](options: ModalOptions[T]): js.Promise[HTMLIonModalElement] = js.native
  /**
    * Dismiss the open modal overlay.
    * @param data Any data to emit in the dismiss events.
    * @param role The role of the element that is dismissing the modal. This can be useful in a button handler for determining which button was clicked to dismiss the modal. Some examples include: ``"cancel"`, `"destructive"`, "selected"`, and `"backdrop"`.
    * @param id The id of the modal to dismiss. If an id is not provided, it will dismiss the most recently opened modal.
    */
  def dismiss(): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
  /**
    * Get the most recently opened modal overlay.
    */
  def getTop(): js.Promise[js.UndefOr[HTMLIonModalElement]] = js.native
}

