package typings.gulpSize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var gzip: js.UndefOr[Boolean] = js.native
  var pretty: js.UndefOr[Boolean] = js.native
  var showFiles: js.UndefOr[Boolean] = js.native
  var showTotal: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[String] = js.native
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
    def setGzip(value: Boolean): Self = this.set("gzip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGzip: Self = this.set("gzip", js.undefined)
    @scala.inline
    def setPretty(value: Boolean): Self = this.set("pretty", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePretty: Self = this.set("pretty", js.undefined)
    @scala.inline
    def setShowFiles(value: Boolean): Self = this.set("showFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowFiles: Self = this.set("showFiles", js.undefined)
    @scala.inline
    def setShowTotal(value: Boolean): Self = this.set("showTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTotal: Self = this.set("showTotal", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

