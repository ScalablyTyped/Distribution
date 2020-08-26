package typings.ionicCore.interfaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.ionicCore.routeInterfaceMod.NavigationHookCallback
import typings.ionicCore.routeInterfaceMod.NavigationHookResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteEntry extends js.Object {
  var beforeEnter: js.UndefOr[NavigationHookCallback] = js.native
  var beforeLeave: js.UndefOr[NavigationHookCallback] = js.native
  var id: String = js.native
  var params: js.UndefOr[StringDictionary[js.Any]] = js.native
  var path: js.Array[String] = js.native
}

object RouteEntry {
  @scala.inline
  def apply(id: String, path: js.Array[String]): RouteEntry = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteEntry]
  }
  @scala.inline
  implicit class RouteEntryOps[Self <: RouteEntry] (val x: Self) extends AnyVal {
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
    def setPathVarargs(value: String*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: js.Array[String]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeforeEnter(value: () => NavigationHookResult | js.Promise[NavigationHookResult]): Self = this.set("beforeEnter", js.Any.fromFunction0(value))
    @scala.inline
    def deleteBeforeEnter: Self = this.set("beforeEnter", js.undefined)
    @scala.inline
    def setBeforeLeave(value: () => NavigationHookResult | js.Promise[NavigationHookResult]): Self = this.set("beforeLeave", js.Any.fromFunction0(value))
    @scala.inline
    def deleteBeforeLeave: Self = this.set("beforeLeave", js.undefined)
    @scala.inline
    def setParams(value: StringDictionary[js.Any]): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
  }
  
}

