package typings.ionic.updatesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateConfig extends js.Object {
  var lastNotify: js.UndefOr[String] = js.native
  var lastUpdate: js.UndefOr[String] = js.native
  var packages: js.Array[PersistedPackage] = js.native
}

object UpdateConfig {
  @scala.inline
  def apply(packages: js.Array[PersistedPackage]): UpdateConfig = {
    val __obj = js.Dynamic.literal(packages = packages.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConfig]
  }
  @scala.inline
  implicit class UpdateConfigOps[Self <: UpdateConfig] (val x: Self) extends AnyVal {
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
    def setPackagesVarargs(value: PersistedPackage*): Self = this.set("packages", js.Array(value :_*))
    @scala.inline
    def setPackages(value: js.Array[PersistedPackage]): Self = this.set("packages", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastNotify(value: String): Self = this.set("lastNotify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastNotify: Self = this.set("lastNotify", js.undefined)
    @scala.inline
    def setLastUpdate(value: String): Self = this.set("lastUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdate: Self = this.set("lastUpdate", js.undefined)
  }
  
}

