package typings.karmaDashWebpack.karmaMod

import org.scalablytyped.runtime.StringDictionary
import typings.webpack.webpackMod.OptionsNs.Stats
import typings.webpack.webpackMod.OptionsNs.WatchOptions
import typings.webpackDashDevDashMiddleware.webpackDashDevDashMiddlewareMod.Reporter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Note: karma-webpack will set publicPath for us, so it is optional here.
// Unfortuantely, Typescript doesn't let you overload properties, so
// the entire definition is duplicated here.
trait KarmaWebpackMiddlewareOptions extends js.Object {
  var error: js.UndefOr[Logger] = js.undefined
  var filename: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var index: js.UndefOr[String] = js.undefined
  var `lazy`: js.UndefOr[Boolean] = js.undefined
  var log: js.UndefOr[Logger] = js.undefined
  var noInfo: js.UndefOr[Boolean] = js.undefined
  var publicPath: js.UndefOr[String] = js.undefined
  var quiet: js.UndefOr[Boolean] = js.undefined
  var reporter: js.UndefOr[Reporter | Null] = js.undefined
  var serverSideRender: js.UndefOr[Boolean] = js.undefined
  var stats: js.UndefOr[Stats] = js.undefined
  var warn: js.UndefOr[Logger] = js.undefined
  var watchOptions: js.UndefOr[WatchOptions] = js.undefined
}

object KarmaWebpackMiddlewareOptions {
  @scala.inline
  def apply(
    error: Logger = null,
    filename: String = null,
    headers: StringDictionary[String] = null,
    index: String = null,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    log: Logger = null,
    noInfo: js.UndefOr[Boolean] = js.undefined,
    publicPath: String = null,
    quiet: js.UndefOr[Boolean] = js.undefined,
    reporter: Reporter = null,
    serverSideRender: js.UndefOr[Boolean] = js.undefined,
    stats: Stats = null,
    warn: Logger = null,
    watchOptions: WatchOptions = null
  ): KarmaWebpackMiddlewareOptions = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (index != null) __obj.updateDynamic("index")(index)
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`)
    if (log != null) __obj.updateDynamic("log")(log)
    if (!js.isUndefined(noInfo)) __obj.updateDynamic("noInfo")(noInfo)
    if (publicPath != null) __obj.updateDynamic("publicPath")(publicPath)
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet)
    if (reporter != null) __obj.updateDynamic("reporter")(reporter)
    if (!js.isUndefined(serverSideRender)) __obj.updateDynamic("serverSideRender")(serverSideRender)
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    if (warn != null) __obj.updateDynamic("warn")(warn)
    if (watchOptions != null) __obj.updateDynamic("watchOptions")(watchOptions)
    __obj.asInstanceOf[KarmaWebpackMiddlewareOptions]
  }
}

