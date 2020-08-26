package typings.jsreportChromePdf.mod

import typings.jsreportChromePdf.anon.PartialLaunchOptions
import typings.jsreportChromePdf.jsreportChromePdfStrings.`dedicated-process`
import typings.jsreportChromePdf.jsreportChromePdfStrings.`http-server`
import typings.jsreportChromePdf.jsreportChromePdfStrings.`in-process`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://jsreport.net/learn/configuration
@js.native
trait Options extends js.Object {
  var allowLocalFilesAccess: Boolean = js.native
  var allowedModules: js.Array[String] = js.native
  var host: String = js.native
  var launchOptions: PartialLaunchOptions = js.native
  var numberOfWorkers: Double = js.native
  var portLeftBoundary: Double = js.native
  var portRightBoundary: Double = js.native
  var strategy: `dedicated-process` | `http-server` | `in-process` = js.native
  var timeout: Double = js.native
}

object Options {
  @scala.inline
  def apply(
    allowLocalFilesAccess: Boolean,
    allowedModules: js.Array[String],
    host: String,
    launchOptions: PartialLaunchOptions,
    numberOfWorkers: Double,
    portLeftBoundary: Double,
    portRightBoundary: Double,
    strategy: `dedicated-process` | `http-server` | `in-process`,
    timeout: Double
  ): Options = {
    val __obj = js.Dynamic.literal(allowLocalFilesAccess = allowLocalFilesAccess.asInstanceOf[js.Any], allowedModules = allowedModules.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], launchOptions = launchOptions.asInstanceOf[js.Any], numberOfWorkers = numberOfWorkers.asInstanceOf[js.Any], portLeftBoundary = portLeftBoundary.asInstanceOf[js.Any], portRightBoundary = portRightBoundary.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
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
    def setAllowLocalFilesAccess(value: Boolean): Self = this.set("allowLocalFilesAccess", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowedModulesVarargs(value: String*): Self = this.set("allowedModules", js.Array(value :_*))
    @scala.inline
    def setAllowedModules(value: js.Array[String]): Self = this.set("allowedModules", value.asInstanceOf[js.Any])
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def setLaunchOptions(value: PartialLaunchOptions): Self = this.set("launchOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberOfWorkers(value: Double): Self = this.set("numberOfWorkers", value.asInstanceOf[js.Any])
    @scala.inline
    def setPortLeftBoundary(value: Double): Self = this.set("portLeftBoundary", value.asInstanceOf[js.Any])
    @scala.inline
    def setPortRightBoundary(value: Double): Self = this.set("portRightBoundary", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrategy(value: `dedicated-process` | `http-server` | `in-process`): Self = this.set("strategy", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
  }
  
}

