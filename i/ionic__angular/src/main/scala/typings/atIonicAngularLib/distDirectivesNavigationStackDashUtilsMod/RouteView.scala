package typings
package atIonicAngularLib.distDirectivesNavigationStackDashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteView extends js.Object {
  var element: stdLib.HTMLElement
  var id: scala.Double
  var ref: atAngularCoreLib.atAngularCoreMod.ComponentRef[_]
  var savedData: js.UndefOr[js.Any] = js.undefined
  var savedExtras: js.UndefOr[atAngularRouterLib.srcRouterMod.NavigationExtras] = js.undefined
  var stackId: js.UndefOr[java.lang.String] = js.undefined
  var url: java.lang.String
  def unlistenEvents(): scala.Unit
}

object RouteView {
  @scala.inline
  def apply(
    element: stdLib.HTMLElement,
    id: scala.Double,
    ref: atAngularCoreLib.atAngularCoreMod.ComponentRef[_],
    unlistenEvents: () => scala.Unit,
    url: java.lang.String,
    savedData: js.Any = null,
    savedExtras: atAngularRouterLib.srcRouterMod.NavigationExtras = null,
    stackId: java.lang.String = null
  ): RouteView = {
    val __obj = js.Dynamic.literal(element = element, id = id, ref = ref, unlistenEvents = js.Any.fromFunction0(unlistenEvents), url = url)
    if (savedData != null) __obj.updateDynamic("savedData")(savedData)
    if (savedExtras != null) __obj.updateDynamic("savedExtras")(savedExtras)
    if (stackId != null) __obj.updateDynamic("stackId")(stackId)
    __obj.asInstanceOf[RouteView]
  }
}

