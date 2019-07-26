package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonToastController extends js.Object {
  /**
    * Create a toast overlay with toast options.
    * @param options The options to use to create the toast.
    */
  def create(): js.Promise[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonToastElement] = js.native
  def create(
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ToastOptions */ js.Any
  ): js.Promise[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonToastElement] = js.native
  /**
    * Dismiss the open toast overlay.
    * @param data Any data to emit in the dismiss events.
    * @param role The role of the element that is dismissing the toast. For example, 'cancel' or 'backdrop'.
    * @param id The id of the toast to dismiss. If an id is not provided, it will dismiss the most recently opened toast.
    */
  def dismiss(): js.Promise[scala.Boolean] = js.native
  def dismiss(data: js.Any): js.Promise[scala.Boolean] = js.native
  def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: java.lang.String): js.Promise[scala.Boolean] = js.native
  def dismiss(data: js.Any, role: java.lang.String): js.Promise[scala.Boolean] = js.native
  def dismiss(data: js.Any, role: java.lang.String, id: java.lang.String): js.Promise[scala.Boolean] = js.native
  /**
    * Get the most recently opened toast overlay.
    */
  def getTop(): js.Promise[js.UndefOr[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonToastElement]] = js.native
}

