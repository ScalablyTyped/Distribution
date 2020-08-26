package typings.gulpSass.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GulpSassOptions extends SassOptions {
  var errLogToConsole: js.UndefOr[Boolean] = js.native
  var onError: js.UndefOr[js.Function1[/* err */ Error, _]] = js.native
  var onSuccess: js.UndefOr[js.Function1[/* css */ String, _]] = js.native
  var sync: js.UndefOr[Boolean] = js.native
}

object GulpSassOptions {
  @scala.inline
  def apply(): GulpSassOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GulpSassOptions]
  }
  @scala.inline
  implicit class GulpSassOptionsOps[Self <: GulpSassOptions] (val x: Self) extends AnyVal {
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
    def setErrLogToConsole(value: Boolean): Self = this.set("errLogToConsole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrLogToConsole: Self = this.set("errLogToConsole", js.undefined)
    @scala.inline
    def setOnError(value: /* err */ Error => _): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnSuccess(value: /* css */ String => _): Self = this.set("onSuccess", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSuccess: Self = this.set("onSuccess", js.undefined)
    @scala.inline
    def setSync(value: Boolean): Self = this.set("sync", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSync: Self = this.set("sync", js.undefined)
  }
  
}

