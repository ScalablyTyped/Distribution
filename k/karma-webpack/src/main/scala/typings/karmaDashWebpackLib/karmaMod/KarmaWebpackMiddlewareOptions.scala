package typings
package karmaDashWebpackLib.karmaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Note: karma-webpack will set publicPath for us, so it is optional here.
// Unfortuantely, Typescript doesn't let you overload properties, so
// the entire definition is duplicated here.
trait KarmaWebpackMiddlewareOptions extends js.Object {
  var error: js.UndefOr[Logger] = js.undefined
  var filename: js.UndefOr[java.lang.String] = js.undefined
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var index: js.UndefOr[java.lang.String] = js.undefined
  var `lazy`: js.UndefOr[scala.Boolean] = js.undefined
  var log: js.UndefOr[Logger] = js.undefined
  var noInfo: js.UndefOr[scala.Boolean] = js.undefined
  var publicPath: js.UndefOr[java.lang.String] = js.undefined
  var quiet: js.UndefOr[scala.Boolean] = js.undefined
  var reporter: js.UndefOr[
    webpackDashDevDashMiddlewareLib.webpackDashDevDashMiddlewareMod.WebpackDevMiddlewareNs.Reporter | scala.Null
  ] = js.undefined
  var serverSideRender: js.UndefOr[scala.Boolean] = js.undefined
  var stats: js.UndefOr[webpackLib.webpackMod.webpackNs.OptionsNs.Stats] = js.undefined
  var warn: js.UndefOr[Logger] = js.undefined
  var watchOptions: js.UndefOr[webpackLib.webpackMod.webpackNs.OptionsNs.WatchOptions] = js.undefined
}

object KarmaWebpackMiddlewareOptions {
  @scala.inline
  def apply(
    error: Logger = null,
    filename: java.lang.String = null,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    index: java.lang.String = null,
    `lazy`: js.UndefOr[scala.Boolean] = js.undefined,
    log: Logger = null,
    noInfo: js.UndefOr[scala.Boolean] = js.undefined,
    publicPath: java.lang.String = null,
    quiet: js.UndefOr[scala.Boolean] = js.undefined,
    reporter: webpackDashDevDashMiddlewareLib.webpackDashDevDashMiddlewareMod.WebpackDevMiddlewareNs.Reporter = null,
    serverSideRender: js.UndefOr[scala.Boolean] = js.undefined,
    stats: webpackLib.webpackMod.webpackNs.OptionsNs.Stats = null,
    warn: Logger = null,
    watchOptions: webpackLib.webpackMod.webpackNs.OptionsNs.WatchOptions = null
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

