package typings.atIonicReact.distTypesComponentsNavigationRoutingNavContextMod

import typings.atIonicCore.distTypesComponentsMod.Global.HTMLIonRouterOutletElement
import typings.atIonicReact.distTypesComponentsNavigationRoutingReactRouterViewItemMod.ViewItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewStack extends js.Object {
  var activeId: js.UndefOr[String] = js.undefined
  var routerOutlet: HTMLIonRouterOutletElement
  var views: js.Array[ViewItem[_]]
}

object ViewStack {
  @scala.inline
  def apply(routerOutlet: HTMLIonRouterOutletElement, views: js.Array[ViewItem[_]], activeId: String = null): ViewStack = {
    val __obj = js.Dynamic.literal(routerOutlet = routerOutlet, views = views)
    if (activeId != null) __obj.updateDynamic("activeId")(activeId)
    __obj.asInstanceOf[ViewStack]
  }
}

