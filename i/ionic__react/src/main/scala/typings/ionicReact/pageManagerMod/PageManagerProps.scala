package typings.ionicReact.pageManagerMod

import typings.ionicReact.routeInfoMod.RouteInfo
import typings.react.mod.RefObject
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageManagerProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var forwardedRef: js.UndefOr[RefObject[HTMLDivElement]] = js.native
  var routeInfo: js.UndefOr[RouteInfo[_]] = js.native
}

object PageManagerProps {
  @scala.inline
  def apply(): PageManagerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageManagerProps]
  }
  @scala.inline
  implicit class PageManagerPropsOps[Self <: PageManagerProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setForwardedRef(value: RefObject[HTMLDivElement]): Self = this.set("forwardedRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForwardedRef: Self = this.set("forwardedRef", js.undefined)
    @scala.inline
    def setRouteInfo(value: RouteInfo[_]): Self = this.set("routeInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouteInfo: Self = this.set("routeInfo", js.undefined)
  }
  
}

