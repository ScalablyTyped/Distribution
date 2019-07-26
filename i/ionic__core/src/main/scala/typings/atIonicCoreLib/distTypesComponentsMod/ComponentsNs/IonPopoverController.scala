package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonPopoverController extends js.Object {
  /**
    * Create a popover overlay with popover options.
    * @param options The options to use to create the popover.
    */
  def create[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentRef */ js.Any */](
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PopoverOptions<T> */ js.Any
  ): js.Promise[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonPopoverElement] = js.native
  /**
    * Dismiss the open popover overlay.
    * @param data Any data to emit in the dismiss events.
    * @param role The role of the element that is dismissing the popover. This can be useful in a button handler for determining which button was clicked to dismiss the popover. Some examples include: ``"cancel"`, `"destructive"`, "selected"`, and `"backdrop"`.
    * @param id The id of the popover to dismiss. If an id is not provided, it will dismiss the most recently opened popover.
    */
  def dismiss(): js.Promise[scala.Boolean] = js.native
  def dismiss(data: js.Any): js.Promise[scala.Boolean] = js.native
  def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: java.lang.String): js.Promise[scala.Boolean] = js.native
  def dismiss(data: js.Any, role: java.lang.String): js.Promise[scala.Boolean] = js.native
  def dismiss(data: js.Any, role: java.lang.String, id: java.lang.String): js.Promise[scala.Boolean] = js.native
  /**
    * Get the most recently opened popover overlay.
    */
  def getTop(): js.Promise[js.UndefOr[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonPopoverElement]] = js.native
}

