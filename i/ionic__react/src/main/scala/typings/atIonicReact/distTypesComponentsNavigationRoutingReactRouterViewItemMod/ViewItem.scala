package typings.atIonicReact.distTypesComponentsNavigationRoutingReactRouterViewItemMod

import typings.react.reactMod.ReactElement
import typings.react.reactMod.RefObject
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewItem[RouteData] extends js.Object {
  var element: ReactElement
  var id: String
  var key: String
  var mount: Boolean
  var prevId: js.UndefOr[String] = js.undefined
  var ref: js.UndefOr[RefObject[HTMLElement]] = js.undefined
  var routeData: RouteData
  var show: Boolean
}

object ViewItem {
  @scala.inline
  def apply[RouteData](
    element: ReactElement,
    id: String,
    key: String,
    mount: Boolean,
    routeData: RouteData,
    show: Boolean,
    prevId: String = null,
    ref: RefObject[HTMLElement] = null
  ): ViewItem[RouteData] = {
    val __obj = js.Dynamic.literal(element = element, id = id, key = key, mount = mount, routeData = routeData.asInstanceOf[js.Any], show = show)
    if (prevId != null) __obj.updateDynamic("prevId")(prevId)
    if (ref != null) __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[ViewItem[RouteData]]
  }
}

