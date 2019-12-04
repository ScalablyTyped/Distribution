package typings.atIonicCore.distTypesComponentsMod.Components

import typings.atIonicCore.atIonicCoreMod.ComponentRef
import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonPopoverElement
import typings.atIonicCore.distTypesComponentsPopoverPopoverDashInterfaceMod.PopoverOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonPopoverController extends js.Object {
  /**
    * Create a popover overlay with popover options.
    * @param options The options to use to create the popover.
    */
  def create[T /* <: ComponentRef */](options: PopoverOptions[T]): js.Promise[HTMLIonPopoverElement] = js.native
  /**
    * Dismiss the open popover overlay.
    * @param data Any data to emit in the dismiss events.
    * @param role The role of the element that is dismissing the popover. This can be useful in a button handler for determining which button was clicked to dismiss the popover. Some examples include: ``"cancel"`, `"destructive"`, "selected"`, and `"backdrop"`.
    * @param id The id of the popover to dismiss. If an id is not provided, it will dismiss the most recently opened popover.
    */
  def dismiss(): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
  /**
    * Get the most recently opened popover overlay.
    */
  def getTop(): js.Promise[js.UndefOr[HTMLIonPopoverElement]] = js.native
}

