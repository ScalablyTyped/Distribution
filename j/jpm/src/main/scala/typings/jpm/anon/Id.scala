package typings.jpm.anon

import typings.jpm.sidebarMod.SidebarWorker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Id extends js.Object {
  var id: js.UndefOr[String] = js.native
  var onAttach: js.UndefOr[js.Function1[/* worker */ SidebarWorker, _]] = js.native
  var onDetach: js.UndefOr[js.Function0[_]] = js.native
  var onHide: js.UndefOr[js.Function0[_]] = js.native
  var onReady: js.UndefOr[js.Function1[/* worker */ SidebarWorker, _]] = js.native
  var onShow: js.UndefOr[js.Function0[_]] = js.native
  var title: String = js.native
  var url: String = js.native
}

object Id {
  @scala.inline
  def apply(title: String, url: String): Id = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  @scala.inline
  implicit class IdOps[Self <: Id] (val x: Self) extends AnyVal {
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
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setOnAttach(value: /* worker */ SidebarWorker => _): Self = this.set("onAttach", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAttach: Self = this.set("onAttach", js.undefined)
    @scala.inline
    def setOnDetach(value: () => _): Self = this.set("onDetach", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnDetach: Self = this.set("onDetach", js.undefined)
    @scala.inline
    def setOnHide(value: () => _): Self = this.set("onHide", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    @scala.inline
    def setOnReady(value: /* worker */ SidebarWorker => _): Self = this.set("onReady", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnReady: Self = this.set("onReady", js.undefined)
    @scala.inline
    def setOnShow(value: () => _): Self = this.set("onShow", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
  }
  
}

