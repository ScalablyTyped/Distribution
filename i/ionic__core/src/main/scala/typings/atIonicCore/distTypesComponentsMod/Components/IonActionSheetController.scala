package typings.atIonicCore.distTypesComponentsMod.Components

import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonActionSheetElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonActionSheetController extends js.Object {
  /**
    * Create an action sheet overlay with action sheet options.
    * @param options The options to use to create the action sheet.
    */
  def create(
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionSheetOptions */ js.Any
  ): js.Promise[HTMLIonActionSheetElement] = js.native
  /**
    * Dismiss the open action sheet overlay.
    * @param data Any data to emit in the dismiss events.
    * @param role The role of the element that is dismissing the action sheet. This can be useful in a button handler for determining which button was clicked to dismiss the action sheet. Some examples include: ``"cancel"`, `"destructive"`, "selected"`, and `"backdrop"`.
    * @param id The id of the action sheet to dismiss. If an id is not provided, it will dismiss the most recently opened action sheet.
    */
  def dismiss(): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
  /**
    * Get the most recently opened action sheet overlay.
    */
  def getTop(): js.Promise[js.UndefOr[HTMLIonActionSheetElement]] = js.native
}

