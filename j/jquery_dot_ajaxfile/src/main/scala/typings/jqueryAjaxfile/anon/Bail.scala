package typings.jqueryAjaxfile.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bail extends js.Object {
  var bail: js.UndefOr[Boolean] = js.native
  var grep: js.UndefOr[RegExp] = js.native
  var reporter: js.UndefOr[String] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var ui: js.UndefOr[String] = js.native
}

object Bail {
  @scala.inline
  def apply(): Bail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bail]
  }
  @scala.inline
  implicit class BailOps[Self <: Bail] (val x: Self) extends AnyVal {
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
    def setBail(value: Boolean): Self = this.set("bail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBail: Self = this.set("bail", js.undefined)
    @scala.inline
    def setGrep(value: RegExp): Self = this.set("grep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrep: Self = this.set("grep", js.undefined)
    @scala.inline
    def setReporter(value: String): Self = this.set("reporter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReporter: Self = this.set("reporter", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setUi(value: String): Self = this.set("ui", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUi: Self = this.set("ui", js.undefined)
  }
  
}

