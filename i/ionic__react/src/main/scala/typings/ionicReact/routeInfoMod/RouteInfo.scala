package typings.ionicReact.routeInfoMod

import org.scalablytyped.runtime.StringDictionary
import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicReact.routeActionMod.RouteAction
import typings.ionicReact.routerDirectionMod.RouterDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteInfo[TOptions] extends js.Object {
  var id: String = js.native
  var lastPathname: js.UndefOr[String] = js.native
  var params: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.native
  var pathname: String = js.native
  var pushedByRoute: js.UndefOr[String] = js.native
  var routeAction: js.UndefOr[RouteAction] = js.native
  var routeAnimation: js.UndefOr[AnimationBuilder] = js.native
  var routeDirection: js.UndefOr[RouterDirection] = js.native
  var routeOptions: js.UndefOr[TOptions] = js.native
  var search: String = js.native
  var tab: js.UndefOr[String] = js.native
}

object RouteInfo {
  @scala.inline
  def apply[TOptions](id: String, pathname: String, search: String): RouteInfo[TOptions] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteInfo[TOptions]]
  }
  @scala.inline
  implicit class RouteInfoOps[Self <: RouteInfo[_], TOptions] (val x: Self with RouteInfo[TOptions]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathname(value: String): Self = this.set("pathname", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearch(value: String): Self = this.set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastPathname(value: String): Self = this.set("lastPathname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastPathname: Self = this.set("lastPathname", js.undefined)
    @scala.inline
    def setParams(value: StringDictionary[String | js.Array[String]]): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setPushedByRoute(value: String): Self = this.set("pushedByRoute", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePushedByRoute: Self = this.set("pushedByRoute", js.undefined)
    @scala.inline
    def setRouteAction(value: RouteAction): Self = this.set("routeAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouteAction: Self = this.set("routeAction", js.undefined)
    @scala.inline
    def setRouteAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = this.set("routeAnimation", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRouteAnimation: Self = this.set("routeAnimation", js.undefined)
    @scala.inline
    def setRouteDirection(value: RouterDirection): Self = this.set("routeDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouteDirection: Self = this.set("routeDirection", js.undefined)
    @scala.inline
    def setRouteOptions(value: TOptions): Self = this.set("routeOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouteOptions: Self = this.set("routeOptions", js.undefined)
    @scala.inline
    def setTab(value: String): Self = this.set("tab", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTab: Self = this.set("tab", js.undefined)
  }
  
}

