package typings.gulpJspm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var arithmetic: js.UndefOr[String] = js.native
  var inject: js.UndefOr[Boolean] = js.native
  var minify: js.UndefOr[Boolean] = js.native
  var plugin: js.UndefOr[Boolean | String] = js.native
  var selfExecutingBundle: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setArithmetic(value: String): Self = this.set("arithmetic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArithmetic: Self = this.set("arithmetic", js.undefined)
    @scala.inline
    def setInject(value: Boolean): Self = this.set("inject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInject: Self = this.set("inject", js.undefined)
    @scala.inline
    def setMinify(value: Boolean): Self = this.set("minify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinify: Self = this.set("minify", js.undefined)
    @scala.inline
    def setPlugin(value: Boolean | String): Self = this.set("plugin", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugin: Self = this.set("plugin", js.undefined)
    @scala.inline
    def setSelfExecutingBundle(value: Boolean): Self = this.set("selfExecutingBundle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfExecutingBundle: Self = this.set("selfExecutingBundle", js.undefined)
  }
  
}

