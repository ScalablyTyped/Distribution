package typings.jqueryAjaxfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MochaSetupOptions extends js.Object {
  // bail on the first test failure
  var bail: js.UndefOr[Boolean] = js.native
  //array of accepted globals
  var globals: js.UndefOr[js.Array[_]] = js.native
  // grep string or regexp to filter tests with
  var grep: js.UndefOr[js.Any] = js.native
  // ignore global leaks
  var ignoreLeaks: js.UndefOr[Boolean] = js.native
  // reporter instance (function or string), defaults to `mocha.reporters.Spec`
  var reporter: js.UndefOr[js.Any] = js.native
  //milliseconds to wait before considering a test slow
  var slow: js.UndefOr[Double] = js.native
  // timeout in milliseconds
  var timeout: js.UndefOr[Double] = js.native
  // ui name "bdd", "tdd", "exports" etc
  var ui: js.UndefOr[String] = js.native
}

object MochaSetupOptions {
  @scala.inline
  def apply(): MochaSetupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MochaSetupOptions]
  }
  @scala.inline
  implicit class MochaSetupOptionsOps[Self <: MochaSetupOptions] (val x: Self) extends AnyVal {
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
    def setGlobalsVarargs(value: js.Any*): Self = this.set("globals", js.Array(value :_*))
    @scala.inline
    def setGlobals(value: js.Array[_]): Self = this.set("globals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobals: Self = this.set("globals", js.undefined)
    @scala.inline
    def setGrep(value: js.Any): Self = this.set("grep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrep: Self = this.set("grep", js.undefined)
    @scala.inline
    def setIgnoreLeaks(value: Boolean): Self = this.set("ignoreLeaks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreLeaks: Self = this.set("ignoreLeaks", js.undefined)
    @scala.inline
    def setReporter(value: js.Any): Self = this.set("reporter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReporter: Self = this.set("reporter", js.undefined)
    @scala.inline
    def setSlow(value: Double): Self = this.set("slow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlow: Self = this.set("slow", js.undefined)
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

