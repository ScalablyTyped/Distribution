package typings.atIonicCore.distTypesComponentsMod.Components

import typings.atIonicCore.distTypesComponentsMod.Global.HTMLIonPickerElement
import typings.atIonicCore.distTypesComponentsPickerPickerDashInterfaceMod.PickerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonPickerController extends js.Object {
  /**
    * Create a picker overlay with picker options.
    * @param options The options to use to create the picker.
    */
  def create(options: PickerOptions): js.Promise[HTMLIonPickerElement] = js.native
  /**
    * Dismiss the open picker overlay.
    * @param data Any data to emit in the dismiss events.
    * @param role The role of the element that is dismissing the picker. This can be useful in a button handler for determining which button was clicked to dismiss the picker. Some examples include: ``"cancel"`, `"destructive"`, "selected"`, and `"backdrop"`.
    * @param id The id of the picker to dismiss. If an id is not provided, it will dismiss the most recently opened picker.
    */
  def dismiss(): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
  /**
    * Get the most recently opened picker overlay.
    */
  def getTop(): js.Promise[js.UndefOr[HTMLIonPickerElement]] = js.native
}

