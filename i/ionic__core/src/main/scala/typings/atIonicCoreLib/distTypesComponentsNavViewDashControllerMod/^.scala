package typings
package atIonicCoreLib.distTypesComponentsNavViewDashControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/nav/view-controller", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val VIEW_STATE_ATTACHED: atIonicCoreLib.atIonicCoreLibNumbers.`2` = js.native
  val VIEW_STATE_DESTROYED: atIonicCoreLib.atIonicCoreLibNumbers.`3` = js.native
  val VIEW_STATE_NEW: atIonicCoreLib.atIonicCoreLibNumbers.`1` = js.native
  def convertToView(page: js.Any): ViewController | scala.Null = js.native
  def convertToView(
    page: js.Any,
    params: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentProps */ js.Any
  ): ViewController | scala.Null = js.native
  def convertToViews(pages: js.Array[_]): js.Array[ViewController] = js.native
  def matches(view: ViewController, id: java.lang.String): /* is @ionic/core.@ionic/core/dist/types/components/nav/view-controller.ViewController */ scala.Boolean = js.native
  def matches(
    view: ViewController,
    id: java.lang.String,
    params: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentProps */ js.Any
  ): /* is @ionic/core.@ionic/core/dist/types/components/nav/view-controller.ViewController */ scala.Boolean = js.native
  def matches(view: js.UndefOr[scala.Nothing], id: java.lang.String): /* is @ionic/core.@ionic/core/dist/types/components/nav/view-controller.ViewController */ scala.Boolean = js.native
  def matches(
    view: js.UndefOr[scala.Nothing],
    id: java.lang.String,
    params: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentProps */ js.Any
  ): /* is @ionic/core.@ionic/core/dist/types/components/nav/view-controller.ViewController */ scala.Boolean = js.native
}

