package typings.gulpSass.mod

import typings.nodeSass.mod.Options
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SassOptions extends Options {
  var error: js.UndefOr[js.Function1[/* err */ Error, _]] = js.native
  var imagePaths: js.UndefOr[js.Array[String]] = js.native
  var success: js.UndefOr[js.Function1[/* results */ SassResults, _]] = js.native
}

object SassOptions {
  @scala.inline
  def apply(): SassOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SassOptions]
  }
  @scala.inline
  implicit class SassOptionsOps[Self <: SassOptions] (val x: Self) extends AnyVal {
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
    def setError(value: /* err */ Error => _): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setImagePathsVarargs(value: String*): Self = this.set("imagePaths", js.Array(value :_*))
    @scala.inline
    def setImagePaths(value: js.Array[String]): Self = this.set("imagePaths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImagePaths: Self = this.set("imagePaths", js.undefined)
    @scala.inline
    def setSuccess(value: /* results */ SassResults => _): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

