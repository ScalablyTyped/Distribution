package typings.handlebars.Handlebars

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseOptions extends js.Object {
  var ignoreStandalone: js.UndefOr[Boolean] = js.native
  var srcName: js.UndefOr[String] = js.native
}

object ParseOptions {
  @scala.inline
  def apply(): ParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseOptions]
  }
  @scala.inline
  implicit class ParseOptionsOps[Self <: ParseOptions] (val x: Self) extends AnyVal {
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
    def setIgnoreStandalone(value: Boolean): Self = this.set("ignoreStandalone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreStandalone: Self = this.set("ignoreStandalone", js.undefined)
    @scala.inline
    def setSrcName(value: String): Self = this.set("srcName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrcName: Self = this.set("srcName", js.undefined)
  }
  
}

