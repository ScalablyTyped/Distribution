package typings.logkitty.apiMod

import typings.logkitty.typesMod.IFilter
import typings.logkitty.typesMod.Platform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogkittyOptions extends js.Object {
  var adbPath: js.UndefOr[String] = js.native
  var filter: js.UndefOr[FilterCreator] = js.native
  var platform: Platform = js.native
  var priority: js.UndefOr[Double] = js.native
}

object LogkittyOptions {
  @scala.inline
  def apply(platform: Platform): LogkittyOptions = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogkittyOptions]
  }
  @scala.inline
  implicit class LogkittyOptionsOps[Self <: LogkittyOptions] (val x: Self) extends AnyVal {
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
    def setPlatform(value: Platform): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdbPath(value: String): Self = this.set("adbPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdbPath: Self = this.set("adbPath", js.undefined)
    @scala.inline
    def setFilter(
      value: (/* platform */ Platform, /* minPriority */ js.UndefOr[Double], /* adbPath */ js.UndefOr[String]) => IFilter
    ): Self = this.set("filter", js.Any.fromFunction3(value))
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
  }
  
}

