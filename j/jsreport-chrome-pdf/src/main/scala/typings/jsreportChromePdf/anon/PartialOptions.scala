package typings.jsreportChromePdf.anon

import typings.jsreportChromePdf.jsreportChromePdfStrings.`dedicated-process`
import typings.jsreportChromePdf.jsreportChromePdfStrings.`http-server`
import typings.jsreportChromePdf.jsreportChromePdfStrings.`in-process`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<jsreport-chrome-pdf.jsreport-chrome-pdf.Options> */
@js.native
trait PartialOptions extends js.Object {
  var allowLocalFilesAccess: js.UndefOr[Boolean] = js.native
  var allowedModules: js.UndefOr[js.Array[String]] = js.native
  var host: js.UndefOr[String] = js.native
  var launchOptions: js.UndefOr[PartialLaunchOptions] = js.native
  var numberOfWorkers: js.UndefOr[Double] = js.native
  var portLeftBoundary: js.UndefOr[Double] = js.native
  var portRightBoundary: js.UndefOr[Double] = js.native
  var strategy: js.UndefOr[`dedicated-process` | `http-server` | `in-process`] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object PartialOptions {
  @scala.inline
  def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  @scala.inline
  implicit class PartialOptionsOps[Self <: PartialOptions] (val x: Self) extends AnyVal {
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
    def setAllowLocalFilesAccess(value: Boolean): Self = this.set("allowLocalFilesAccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowLocalFilesAccess: Self = this.set("allowLocalFilesAccess", js.undefined)
    @scala.inline
    def setAllowedModulesVarargs(value: String*): Self = this.set("allowedModules", js.Array(value :_*))
    @scala.inline
    def setAllowedModules(value: js.Array[String]): Self = this.set("allowedModules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedModules: Self = this.set("allowedModules", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setLaunchOptions(value: PartialLaunchOptions): Self = this.set("launchOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchOptions: Self = this.set("launchOptions", js.undefined)
    @scala.inline
    def setNumberOfWorkers(value: Double): Self = this.set("numberOfWorkers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfWorkers: Self = this.set("numberOfWorkers", js.undefined)
    @scala.inline
    def setPortLeftBoundary(value: Double): Self = this.set("portLeftBoundary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePortLeftBoundary: Self = this.set("portLeftBoundary", js.undefined)
    @scala.inline
    def setPortRightBoundary(value: Double): Self = this.set("portRightBoundary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePortRightBoundary: Self = this.set("portRightBoundary", js.undefined)
    @scala.inline
    def setStrategy(value: `dedicated-process` | `http-server` | `in-process`): Self = this.set("strategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrategy: Self = this.set("strategy", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

