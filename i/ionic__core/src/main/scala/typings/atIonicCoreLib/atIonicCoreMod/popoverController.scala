package typings
package atIonicCoreLib.atIonicCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core", "popoverController")
@js.native
object popoverController extends js.Object {
  def create(
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PopoverOptions<imported_@ionic/core/dist/types/interface.ComponentRef> */ js.Any
  ): js.Promise[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonPopoverElement] = js.native
  def dismiss(): js.Promise[scala.Boolean] = js.native
  def dismiss(data: js.Any): js.Promise[scala.Boolean] = js.native
  def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: java.lang.String): js.Promise[scala.Boolean] = js.native
  def dismiss(data: js.Any, role: java.lang.String): js.Promise[scala.Boolean] = js.native
  def dismiss(data: js.Any, role: java.lang.String, id: java.lang.String): js.Promise[scala.Boolean] = js.native
  def getTop(): js.Promise[js.UndefOr[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonPopoverElement]] = js.native
}

