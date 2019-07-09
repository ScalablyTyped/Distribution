package typings
package atIonicReactLib.distTypesComponentsNavigationRoutingNavContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewStack extends js.Object {
  var activeId: js.UndefOr[java.lang.String] = js.undefined
  var routerOutlet: atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonRouterOutletElement
  var views: js.Array[
    atIonicReactLib.distTypesComponentsNavigationRoutingReactRouterViewItemMod.ViewItem[_]
  ]
}

object ViewStack {
  @scala.inline
  def apply(
    routerOutlet: atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonRouterOutletElement,
    views: js.Array[
      atIonicReactLib.distTypesComponentsNavigationRoutingReactRouterViewItemMod.ViewItem[_]
    ],
    activeId: java.lang.String = null
  ): ViewStack = {
    val __obj = js.Dynamic.literal(routerOutlet = routerOutlet, views = views)
    if (activeId != null) __obj.updateDynamic("activeId")(activeId)
    __obj.asInstanceOf[ViewStack]
  }
}

