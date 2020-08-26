package typings.jestRuntime.mod

import typings.std.Console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HasteMapOptions extends js.Object {
  var console: js.UndefOr[Console] = js.native
  var maxWorkers: Double = js.native
  var resetCache: Boolean = js.native
  var watch: js.UndefOr[Boolean] = js.native
  var watchman: Boolean = js.native
}

object HasteMapOptions {
  @scala.inline
  def apply(maxWorkers: Double, resetCache: Boolean, watchman: Boolean): HasteMapOptions = {
    val __obj = js.Dynamic.literal(maxWorkers = maxWorkers.asInstanceOf[js.Any], resetCache = resetCache.asInstanceOf[js.Any], watchman = watchman.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasteMapOptions]
  }
  @scala.inline
  implicit class HasteMapOptionsOps[Self <: HasteMapOptions] (val x: Self) extends AnyVal {
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
    def setMaxWorkers(value: Double): Self = this.set("maxWorkers", value.asInstanceOf[js.Any])
    @scala.inline
    def setResetCache(value: Boolean): Self = this.set("resetCache", value.asInstanceOf[js.Any])
    @scala.inline
    def setWatchman(value: Boolean): Self = this.set("watchman", value.asInstanceOf[js.Any])
    @scala.inline
    def setConsole(value: Console): Self = this.set("console", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsole: Self = this.set("console", js.undefined)
    @scala.inline
    def setWatch(value: Boolean): Self = this.set("watch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWatch: Self = this.set("watch", js.undefined)
  }
  
}

