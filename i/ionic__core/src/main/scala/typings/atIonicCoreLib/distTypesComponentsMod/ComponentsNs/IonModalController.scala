package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonModalController extends js.Object {
  /**
    * Create a modal overlay with modal options.
    */
  def create[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentRef */ js.Any */](
    opts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ModalOptions<T> */ js.Any
  ): js.Promise[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonModalElement] = js.native
  /**
    * Dismiss the open modal overlay.
    */
  def dismiss(): js.Promise[scala.Boolean] = js.native
  def dismiss(data: js.Any): js.Promise[scala.Boolean] = js.native
  def dismiss(data: js.Any, role: java.lang.String): js.Promise[scala.Boolean] = js.native
  def dismiss(data: js.Any, role: java.lang.String, id: java.lang.String): js.Promise[scala.Boolean] = js.native
  def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: java.lang.String): js.Promise[scala.Boolean] = js.native
  /**
    * Get the most recently opened modal overlay.
    */
  def getTop(): js.Promise[js.UndefOr[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonModalElement]] = js.native
}

