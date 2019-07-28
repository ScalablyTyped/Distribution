package typings.atIonicCore.distTypesComponentsNavViewDashControllerMod

import typings.atIonicCore.atIonicCoreNumbers.`1`
import typings.atIonicCore.atIonicCoreNumbers.`2`
import typings.atIonicCore.atIonicCoreNumbers.`3`
import typings.atIonicCore.distTypesInterfaceMod.ComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/nav/view-controller", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val VIEW_STATE_ATTACHED: `2` = js.native
  val VIEW_STATE_DESTROYED: `3` = js.native
  val VIEW_STATE_NEW: `1` = js.native
  def convertToView(page: js.Any): ViewController | Null = js.native
  def convertToView(page: js.Any, params: ComponentProps[Null]): ViewController | Null = js.native
  def convertToViews(pages: js.Array[_]): js.Array[ViewController] = js.native
  def matches(view: js.UndefOr[scala.Nothing], id: String): /* is @ionic/core.@ionic/core/dist/types/components/nav/view-controller.ViewController */ Boolean = js.native
  def matches(view: js.UndefOr[scala.Nothing], id: String, params: ComponentProps[Null]): /* is @ionic/core.@ionic/core/dist/types/components/nav/view-controller.ViewController */ Boolean = js.native
  def matches(view: ViewController, id: String): /* is @ionic/core.@ionic/core/dist/types/components/nav/view-controller.ViewController */ Boolean = js.native
  def matches(view: ViewController, id: String, params: ComponentProps[Null]): /* is @ionic/core.@ionic/core/dist/types/components/nav/view-controller.ViewController */ Boolean = js.native
}

