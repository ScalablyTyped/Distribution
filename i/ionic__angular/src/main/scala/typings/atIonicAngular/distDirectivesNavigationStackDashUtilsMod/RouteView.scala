package typings.atIonicAngular.distDirectivesNavigationStackDashUtilsMod

import typings.atAngularCore.atAngularCoreMod.ComponentRef
import typings.atAngularRouter.atAngularRouterMod.NavigationExtras
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteView extends js.Object {
  var element: HTMLElement
  var id: Double
  var ref: ComponentRef[_]
  var savedData: js.UndefOr[js.Any] = js.undefined
  var savedExtras: js.UndefOr[NavigationExtras] = js.undefined
  var stackId: js.UndefOr[String] = js.undefined
  var url: String
  def unlistenEvents(): Unit
}

object RouteView {
  @scala.inline
  def apply(
    element: HTMLElement,
    id: Double,
    ref: ComponentRef[_],
    unlistenEvents: () => Unit,
    url: String,
    savedData: js.Any = null,
    savedExtras: NavigationExtras = null,
    stackId: String = null
  ): RouteView = {
    val __obj = js.Dynamic.literal(element = element, id = id, ref = ref, unlistenEvents = js.Any.fromFunction0(unlistenEvents), url = url)
    if (savedData != null) __obj.updateDynamic("savedData")(savedData)
    if (savedExtras != null) __obj.updateDynamic("savedExtras")(savedExtras)
    if (stackId != null) __obj.updateDynamic("stackId")(stackId)
    __obj.asInstanceOf[RouteView]
  }
}

