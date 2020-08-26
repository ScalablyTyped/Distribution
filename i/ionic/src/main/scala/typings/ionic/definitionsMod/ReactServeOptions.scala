package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactServeOptions extends ServeOptions {
  var ci: js.UndefOr[Boolean] = js.native
  var https: js.UndefOr[Boolean] = js.native
  var reactEditor: js.UndefOr[String] = js.native
}

object ReactServeOptions {
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
  ): ReactServeOptions = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], devapp = devapp.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], lab = lab.asInstanceOf[js.Any], labHost = labHost.asInstanceOf[js.Any], labPort = labPort.asInstanceOf[js.Any], livereload = livereload.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], proxy = proxy.asInstanceOf[js.Any])
    __obj.updateDynamic("--")(`--`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactServeOptions]
  }
  @scala.inline
  implicit class ReactServeOptionsOps[Self <: ReactServeOptions] (val x: Self) extends AnyVal {
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
    def setCi(value: Boolean): Self = this.set("ci", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCi: Self = this.set("ci", js.undefined)
    @scala.inline
    def setHttps(value: Boolean): Self = this.set("https", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttps: Self = this.set("https", js.undefined)
    @scala.inline
    def setReactEditor(value: String): Self = this.set("reactEditor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReactEditor: Self = this.set("reactEditor", js.undefined)
  }
  
}

