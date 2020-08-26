package typings.gulpTslint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginOptions extends js.Object {
  var configuration: js.UndefOr[js.Any] = js.native
  var fix: js.UndefOr[Boolean] = js.native
  var formatter: js.UndefOr[String | js.Function] = js.native
  var formattersDirectory: js.UndefOr[String] = js.native
  var program: js.UndefOr[js.Any] = js.native
  var rulesDirectory: js.UndefOr[String] = js.native
  var tslint: js.UndefOr[js.Any] = js.native
}

object PluginOptions {
  @scala.inline
  def apply(): PluginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginOptions]
  }
  @scala.inline
  implicit class PluginOptionsOps[Self <: PluginOptions] (val x: Self) extends AnyVal {
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
    def setConfiguration(value: js.Any): Self = this.set("configuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfiguration: Self = this.set("configuration", js.undefined)
    @scala.inline
    def setFix(value: Boolean): Self = this.set("fix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFix: Self = this.set("fix", js.undefined)
    @scala.inline
    def setFormatter(value: String | js.Function): Self = this.set("formatter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    @scala.inline
    def setFormattersDirectory(value: String): Self = this.set("formattersDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormattersDirectory: Self = this.set("formattersDirectory", js.undefined)
    @scala.inline
    def setProgram(value: js.Any): Self = this.set("program", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgram: Self = this.set("program", js.undefined)
    @scala.inline
    def setRulesDirectory(value: String): Self = this.set("rulesDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRulesDirectory: Self = this.set("rulesDirectory", js.undefined)
    @scala.inline
    def setTslint(value: js.Any): Self = this.set("tslint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTslint: Self = this.set("tslint", js.undefined)
  }
  
}

