package typings.karmaBrowserify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigOptions extends js.Object {
  /**
    * Config entry to configure how the bundle gets created
    * see {@link https://github.com/nikku/karma-browserify#usage}
    */
  var browserify: js.UndefOr[BrowserifyOptions] = js.native
  /**
    * You can configure the underlying watchify instance
    * see {@link https://github.com/nikku/karma-browserify#watchify-config}
    */
  var watchify: js.UndefOr[WatchifyOptions] = js.native
}

object ConfigOptions {
  @scala.inline
  def apply(): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigOptions]
  }
  @scala.inline
  implicit class ConfigOptionsOps[Self <: ConfigOptions] (val x: Self) extends AnyVal {
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
    def setBrowserify(value: BrowserifyOptions): Self = this.set("browserify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowserify: Self = this.set("browserify", js.undefined)
    @scala.inline
    def setWatchify(value: WatchifyOptions): Self = this.set("watchify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWatchify: Self = this.set("watchify", js.undefined)
  }
  
}

