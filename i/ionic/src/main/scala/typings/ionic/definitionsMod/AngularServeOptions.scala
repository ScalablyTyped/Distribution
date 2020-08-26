package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AngularServeOptions extends ServeOptions {
  var configuration: js.UndefOr[String] = js.native
  var consolelogs: js.UndefOr[Boolean] = js.native
  var consolelogsPort: js.UndefOr[Double] = js.native
  var sourcemaps: js.UndefOr[Boolean] = js.native
  var ssl: js.UndefOr[Boolean] = js.native
}

object AngularServeOptions {
  @scala.inline
  def apply(
    `--`: js.Array[String],
    address: String,
    devapp: Boolean,
    engine: String,
    lab: Boolean,
    labHost: String,
    labPort: Double,
    livereload: Boolean,
    open: Boolean,
    port: Double,
    proxy: Boolean
  ): AngularServeOptions = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], devapp = devapp.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], lab = lab.asInstanceOf[js.Any], labHost = labHost.asInstanceOf[js.Any], labPort = labPort.asInstanceOf[js.Any], livereload = livereload.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], proxy = proxy.asInstanceOf[js.Any])
    __obj.updateDynamic("--")(`--`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AngularServeOptions]
  }
  @scala.inline
  implicit class AngularServeOptionsOps[Self <: AngularServeOptions] (val x: Self) extends AnyVal {
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
    def setConfiguration(value: String): Self = this.set("configuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfiguration: Self = this.set("configuration", js.undefined)
    @scala.inline
    def setConsolelogs(value: Boolean): Self = this.set("consolelogs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsolelogs: Self = this.set("consolelogs", js.undefined)
    @scala.inline
    def setConsolelogsPort(value: Double): Self = this.set("consolelogsPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsolelogsPort: Self = this.set("consolelogsPort", js.undefined)
    @scala.inline
    def setSourcemaps(value: Boolean): Self = this.set("sourcemaps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourcemaps: Self = this.set("sourcemaps", js.undefined)
    @scala.inline
    def setSsl(value: Boolean): Self = this.set("ssl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSsl: Self = this.set("ssl", js.undefined)
  }
  
}

