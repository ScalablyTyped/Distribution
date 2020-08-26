package typings.liveServer.mod

import typings.liveServer.liveServerNumbers.`0`
import typings.liveServer.liveServerNumbers.`1`
import typings.liveServer.liveServerNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveServerParams extends js.Object {
  /** When set, serve this file (server root relative) for every 404 (useful for single-page applications). */
  var file: js.UndefOr[String] = js.native
  /**  Set the address to bind to. Defaults to 0.0.0.0 or process.env.IP. */
  var host: js.UndefOr[String] = js.native
  /** Comma-separated string for paths to ignore. */
  var ignore: js.UndefOr[String] = js.native
  /** 0 = errors only, 1 = some, 2 = lots */
  var logLevel: js.UndefOr[`0` | `1` | `2`] = js.native
  /** Takes an array of Connect-compatible middleware that are injected into the server middleware stack. */
  var middleware: js.UndefOr[js.Array[js.Function3[/* req */ _, /* res */ _, /* next */ _, Unit]]] = js.native
  /** Mount a directory to a route. */
  var mount: js.UndefOr[js.Array[js.Array[String]]] = js.native
  /** When false, it won't load your browser by default. */
  var open: js.UndefOr[Boolean] = js.native
  /** Set the server port. Defaults to 8080. */
  var port: js.UndefOr[Double] = js.native
  /** Set root directory that's being served. Defaults to cwd. */
  var root: js.UndefOr[String] = js.native
  /** Waits for all changes, before reloading. Defaults to 0 sec. */
  @JSName("wait")
  var wait_FLiveServerParams: js.UndefOr[Double] = js.native
}

object LiveServerParams {
  @scala.inline
  def apply(): LiveServerParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveServerParams]
  }
  @scala.inline
  implicit class LiveServerParamsOps[Self <: LiveServerParams] (val x: Self) extends AnyVal {
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
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setIgnore(value: String): Self = this.set("ignore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    @scala.inline
    def setLogLevel(value: `0` | `1` | `2`): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    @scala.inline
    def setMiddlewareVarargs(value: (js.Function3[js.Any, js.Any, js.Any, Unit])*): Self = this.set("middleware", js.Array(value :_*))
    @scala.inline
    def setMiddleware(value: js.Array[js.Function3[/* req */ _, /* res */ _, /* next */ _, Unit]]): Self = this.set("middleware", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMiddleware: Self = this.set("middleware", js.undefined)
    @scala.inline
    def setMountVarargs(value: js.Array[String]*): Self = this.set("mount", js.Array(value :_*))
    @scala.inline
    def setMount(value: js.Array[js.Array[String]]): Self = this.set("mount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMount: Self = this.set("mount", js.undefined)
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setWait(value: Double): Self = this.set("wait", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWait: Self = this.set("wait", js.undefined)
  }
  
}

