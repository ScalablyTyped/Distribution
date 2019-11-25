package typings.atIonicCore.distTypesComponentsMod.Components

import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonLoadingElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonLoadingController extends js.Object {
  /**
    * Create a loading overlay with loading options.
    * @param options The options to use to create the loading.
    */
  def create(): js.Promise[HTMLIonLoadingElement] = js.native
  def create(
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify LoadingOptions */ js.Any
  ): js.Promise[HTMLIonLoadingElement] = js.native
  /**
    * Dismiss the open loading overlay.
    * @param data Any data to emit in the dismiss events.
    * @param role The role of the element that is dismissing the loading. This can be useful in a button handler for determining which button was clicked to dismiss the loading. Some examples include: ``"cancel"`, `"destructive"`, "selected"`, and `"backdrop"`.
    * @param id The id of the loading to dismiss. If an id is not provided, it will dismiss the most recently opened loading.
    */
  def dismiss(): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
  /**
    * Get the most recently opened loading overlay.
    */
  def getTop(): js.Promise[js.UndefOr[HTMLIonLoadingElement]] = js.native
}

