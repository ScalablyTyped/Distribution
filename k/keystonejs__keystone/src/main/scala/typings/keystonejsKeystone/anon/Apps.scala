package typings.keystonejsKeystone.anon

import typings.keystonejsKeystone.mod.BaseApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Apps extends js.Object {
  var apps: js.UndefOr[js.Array[BaseApp]] = js.native
  var dev: js.UndefOr[Boolean] = js.native
}

object Apps {
  @scala.inline
  def apply(): Apps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Apps]
  }
  @scala.inline
  implicit class AppsOps[Self <: Apps] (val x: Self) extends AnyVal {
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
    def setAppsVarargs(value: BaseApp*): Self = this.set("apps", js.Array(value :_*))
    @scala.inline
    def setApps(value: js.Array[BaseApp]): Self = this.set("apps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApps: Self = this.set("apps", js.undefined)
    @scala.inline
    def setDev(value: Boolean): Self = this.set("dev", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDev: Self = this.set("dev", js.undefined)
  }
  
}

