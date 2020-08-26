package typings.gulpHtmlPrettify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GulpHtmlPrettifyOptions extends js.Object {
  var indent_char: js.UndefOr[String] = js.native
  var indent_size: js.UndefOr[Double] = js.native
}

object GulpHtmlPrettifyOptions {
  @scala.inline
  def apply(): GulpHtmlPrettifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GulpHtmlPrettifyOptions]
  }
  @scala.inline
  implicit class GulpHtmlPrettifyOptionsOps[Self <: GulpHtmlPrettifyOptions] (val x: Self) extends AnyVal {
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
    def setIndent_char(value: String): Self = this.set("indent_char", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndent_char: Self = this.set("indent_char", js.undefined)
    @scala.inline
    def setIndent_size(value: Double): Self = this.set("indent_size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndent_size: Self = this.set("indent_size", js.undefined)
  }
  
}

