package typings.liveServer.mod

import typings.liveServer.liveServerNumbers.`0`
import typings.liveServer.liveServerNumbers.`1`
import typings.liveServer.liveServerNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveServerParams extends js.Object {
  /** When set, serve this file (server root relative) for every 404 (useful for single-page applications). */
  var file: js.UndefOr[String] = js.undefined
  /**  Set the address to bind to. Defaults to 0.0.0.0 or process.env.IP. */
  var host: js.UndefOr[String] = js.undefined
  /** Comma-separated string for paths to ignore. */
  var ignore: js.UndefOr[String] = js.undefined
  /** 0 = errors only, 1 = some, 2 = lots */
  var logLevel: js.UndefOr[`0` | `1` | `2`] = js.undefined
  /** Takes an array of Connect-compatible middleware that are injected into the server middleware stack. */
  var middleware: js.UndefOr[js.Array[js.Function3[/* req */ _, /* res */ _, /* next */ _, Unit]]] = js.undefined
  /** Mount a directory to a route. */
  var mount: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  /** When false, it won't load your browser by default. */
  var open: js.UndefOr[Boolean] = js.undefined
  /** Set the server port. Defaults to 8080. */
  var port: js.UndefOr[Double] = js.undefined
  /** Set root directory that's being served. Defaults to cwd. */
  var root: js.UndefOr[String] = js.undefined
  /** Waits for all changes, before reloading. Defaults to 0 sec. */
  @JSName("wait")
  var wait_FLiveServerParams: js.UndefOr[Double] = js.undefined
}

object LiveServerParams {
  @scala.inline
  def apply(
    file: String = null,
    host: String = null,
    ignore: String = null,
    logLevel: `0` | `1` | `2` = null,
    middleware: js.Array[js.Function3[/* req */ _, /* res */ _, /* next */ _, Unit]] = null,
    mount: js.Array[js.Array[String]] = null,
    open: js.UndefOr[Boolean] = js.undefined,
    port: js.UndefOr[Double] = js.undefined,
    root: String = null,
    wait: js.UndefOr[Double] = js.undefined
  ): LiveServerParams = {
    val __obj = js.Dynamic.literal()
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (middleware != null) __obj.updateDynamic("middleware")(middleware.asInstanceOf[js.Any])
    if (mount != null) __obj.updateDynamic("mount")(mount.asInstanceOf[js.Any])
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.get.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveServerParams]
  }
}

