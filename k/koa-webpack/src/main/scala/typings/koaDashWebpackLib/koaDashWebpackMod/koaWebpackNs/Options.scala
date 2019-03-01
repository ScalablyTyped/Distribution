package typings
package koaDashWebpackLib.koaDashWebpackMod.koaWebpackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var compiler: js.UndefOr[webpackLib.webpackMod.Compiler] = js.undefined
  var config: js.UndefOr[webpackLib.webpackMod.webpackNs.Configuration] = js.undefined
  var devMiddleware: js.UndefOr[
    webpackDashDevDashMiddlewareLib.webpackDashDevDashMiddlewareMod.WebpackDevMiddlewareNs.Options
  ] = js.undefined
  var hotClient: js.UndefOr[
    webpackDashHotDashClientLib.webpackDashHotDashClientMod.WebpackHotClientNs.Options | scala.Boolean
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    compiler: webpackLib.webpackMod.Compiler = null,
    config: webpackLib.webpackMod.webpackNs.Configuration = null,
    devMiddleware: webpackDashDevDashMiddlewareLib.webpackDashDevDashMiddlewareMod.WebpackDevMiddlewareNs.Options = null,
    hotClient: webpackDashHotDashClientLib.webpackDashHotDashClientMod.WebpackHotClientNs.Options | scala.Boolean = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (compiler != null) __obj.updateDynamic("compiler")(compiler)
    if (config != null) __obj.updateDynamic("config")(config)
    if (devMiddleware != null) __obj.updateDynamic("devMiddleware")(devMiddleware)
    if (hotClient != null) __obj.updateDynamic("hotClient")(hotClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

