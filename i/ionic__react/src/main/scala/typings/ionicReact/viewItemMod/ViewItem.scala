package typings.ionicReact.viewItemMod

import typings.react.mod.ReactElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewItem[T] extends js.Object {
  var disableIonPageManagement: js.UndefOr[Boolean] = js.native
  var id: String = js.native
  var ionPageElement: js.UndefOr[HTMLElement] = js.native
  var ionRoute: js.UndefOr[Boolean] = js.native
  var mount: Boolean = js.native
  var outletId: String = js.native
  var reactElement: ReactElement = js.native
  var routeData: js.UndefOr[T] = js.native
  var transitionHtml: js.UndefOr[String] = js.native
}

object ViewItem {
  @scala.inline
  def apply[T](id: String, mount: Boolean, outletId: String, reactElement: ReactElement): ViewItem[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mount = mount.asInstanceOf[js.Any], outletId = outletId.asInstanceOf[js.Any], reactElement = reactElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewItem[T]]
  }
  @scala.inline
  implicit class ViewItemOps[Self <: ViewItem[_], T] (val x: Self with ViewItem[T]) extends AnyVal {
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
    def setMount(value: Boolean): Self = this.set("mount", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutletId(value: String): Self = this.set("outletId", value.asInstanceOf[js.Any])
    @scala.inline
    def setReactElement(value: ReactElement): Self = this.set("reactElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableIonPageManagement(value: Boolean): Self = this.set("disableIonPageManagement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableIonPageManagement: Self = this.set("disableIonPageManagement", js.undefined)
    @scala.inline
    def setIonPageElement(value: HTMLElement): Self = this.set("ionPageElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIonPageElement: Self = this.set("ionPageElement", js.undefined)
    @scala.inline
    def setIonRoute(value: Boolean): Self = this.set("ionRoute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIonRoute: Self = this.set("ionRoute", js.undefined)
    @scala.inline
    def setRouteData(value: T): Self = this.set("routeData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouteData: Self = this.set("routeData", js.undefined)
    @scala.inline
    def setTransitionHtml(value: String): Self = this.set("transitionHtml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionHtml: Self = this.set("transitionHtml", js.undefined)
  }
  
}

