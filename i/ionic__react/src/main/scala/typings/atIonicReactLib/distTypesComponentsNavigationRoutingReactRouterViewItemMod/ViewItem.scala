package typings
package atIonicReactLib.distTypesComponentsNavigationRoutingReactRouterViewItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewItem[RouteData] extends js.Object {
  var element: reactLib.reactMod.ReactElement
  var id: java.lang.String
  var key: java.lang.String
  var mount: scala.Boolean
  var prevId: js.UndefOr[java.lang.String] = js.undefined
  var ref: js.UndefOr[reactLib.reactMod.RefObject[stdLib.HTMLElement]] = js.undefined
  var routeData: RouteData
  var show: scala.Boolean
}

object ViewItem {
  @scala.inline
  def apply[RouteData](
    element: reactLib.reactMod.ReactElement,
    id: java.lang.String,
    key: java.lang.String,
    mount: scala.Boolean,
    routeData: RouteData,
    show: scala.Boolean,
    prevId: java.lang.String = null,
    ref: reactLib.reactMod.RefObject[stdLib.HTMLElement] = null
  ): ViewItem[RouteData] = {
    val __obj = js.Dynamic.literal(element = element, id = id, key = key, mount = mount, routeData = routeData.asInstanceOf[js.Any], show = show)
    if (prevId != null) __obj.updateDynamic("prevId")(prevId)
    if (ref != null) __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[ViewItem[RouteData]]
  }
}

