package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonPopoverController extends js.Object {
  /**
    * Create a popover overlay with popover options.
    */
  def create[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentRef */ js.Any */](
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PopoverOptions<T> */ js.Any
  ): js.Promise[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonPopoverElement] = js.native
  /**
    * Dismiss the open popover overlay.
    */
  def dismiss(): js.Promise[scala.Boolean] = js.native
  def dismiss(data: js.Any): js.Promise[scala.Boolean] = js.native
  def dismiss(data: js.Any, role: java.lang.String): js.Promise[scala.Boolean] = js.native
  def dismiss(data: js.Any, role: java.lang.String, id: java.lang.String): js.Promise[scala.Boolean] = js.native
  def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: java.lang.String): js.Promise[scala.Boolean] = js.native
  /**
    * Get the most recently opened popover overlay.
    */
  def getTop(): js.Promise[js.UndefOr[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonPopoverElement]] = js.native
}

