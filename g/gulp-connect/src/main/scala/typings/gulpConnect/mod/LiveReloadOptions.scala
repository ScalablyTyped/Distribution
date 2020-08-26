package typings.gulpConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveReloadOptions extends js.Object {
  /** Hostname to bind live reload server to */
  var hostname: js.UndefOr[String] = js.native
  /** Port to run live reload server on. Defauls to 35729. */
  var port: Double = js.native
}

object LiveReloadOptions {
  @scala.inline
  def apply(port: Double): LiveReloadOptions = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveReloadOptions]
  }
  @scala.inline
  implicit class LiveReloadOptionsOps[Self <: LiveReloadOptions] (val x: Self) extends AnyVal {
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
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
  }
  
}

