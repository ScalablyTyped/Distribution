package typings.koaDashWebpack.koaDashWebpackMod

import typings.webpack.webpackMod.Compiler
import typings.webpack.webpackMod.Configuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var compiler: js.UndefOr[Compiler] = js.undefined
  var config: js.UndefOr[Configuration] = js.undefined
  var devMiddleware: js.UndefOr[typings.webpackDashDevDashMiddleware.webpackDashDevDashMiddlewareMod.Options] = js.undefined
  var hotClient: js.UndefOr[typings.webpackDashHotDashClient.webpackDashHotDashClientMod.Options | Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    compiler: Compiler = null,
    config: Configuration = null,
    devMiddleware: typings.webpackDashDevDashMiddleware.webpackDashDevDashMiddlewareMod.Options = null,
    hotClient: typings.webpackDashHotDashClient.webpackDashHotDashClientMod.Options | Boolean = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (compiler != null) __obj.updateDynamic("compiler")(compiler)
    if (config != null) __obj.updateDynamic("config")(config)
    if (devMiddleware != null) __obj.updateDynamic("devMiddleware")(devMiddleware)
    if (hotClient != null) __obj.updateDynamic("hotClient")(hotClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

