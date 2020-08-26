package typings.karmaBrowserify.mod

import typings.browserify.mod.BrowserifyObject
import typings.browserify.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserifyOptions extends Options {
  /**
    * You may perform additional configuration in a function passed as the configure option
    * and that receives the browserify instance as an argument.
    * See {@link https://github.com/nikku/karma-browserify#additional-bundle-configuration}
    */
  var configure: js.UndefOr[js.Function1[/* bundle */ BrowserifyObject, Unit]] = js.native
}

object BrowserifyOptions {
  @scala.inline
  def apply(): BrowserifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserifyOptions]
  }
  @scala.inline
  implicit class BrowserifyOptionsOps[Self <: BrowserifyOptions] (val x: Self) extends AnyVal {
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
    def setConfigure(value: /* bundle */ BrowserifyObject => Unit): Self = this.set("configure", js.Any.fromFunction1(value))
    @scala.inline
    def deleteConfigure: Self = this.set("configure", js.undefined)
  }
  
}

