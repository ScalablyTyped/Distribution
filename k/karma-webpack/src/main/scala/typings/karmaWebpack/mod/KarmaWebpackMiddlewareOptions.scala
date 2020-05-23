package typings.karmaWebpack.mod

import org.scalablytyped.runtime.StringDictionary
import typings.webpack.mod.Options.Stats
import typings.webpack.mod.Options.WatchOptions
import typings.webpackDevMiddleware.mod.Options
import typings.webpackDevMiddleware.mod.Reporter
import typings.webpackDevMiddleware.mod.ReporterOptions
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
    error: (/* message */ js.UndefOr[js.Any], /* repeated */ js.Any) => Unit = null,
    filename: String = null,
    headers: StringDictionary[String] = null,
    index: String = null,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    log: (/* message */ js.UndefOr[js.Any], /* repeated */ js.Any) => Unit = null,
    noInfo: js.UndefOr[Boolean] = js.undefined,
    publicPath: String = null,
    quiet: js.UndefOr[Boolean] = js.undefined,
    reporter: js.UndefOr[
      Null | ((/* middlewareOptions */ Options, /* reporterOptions */ ReporterOptions) => Unit)
    ] = js.undefined,
    serverSideRender: js.UndefOr[Boolean] = js.undefined,
    stats: Stats = null,
    warn: (/* message */ js.UndefOr[js.Any], /* repeated */ js.Any) => Unit = null,
    watchOptions: WatchOptions = null
  ): KarmaWebpackMiddlewareOptions = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction2(error))
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`.get.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction2(log))
    if (!js.isUndefined(noInfo)) __obj.updateDynamic("noInfo")(noInfo.get.asInstanceOf[js.Any])
    if (publicPath != null) __obj.updateDynamic("publicPath")(publicPath.asInstanceOf[js.Any])
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reporter)) __obj.updateDynamic("reporter")(if (reporter != null) js.Any.fromFunction2(reporter.asInstanceOf[(/* middlewareOptions */ Options, /* reporterOptions */ ReporterOptions) => Unit]) else null)
    if (!js.isUndefined(serverSideRender)) __obj.updateDynamic("serverSideRender")(serverSideRender.get.asInstanceOf[js.Any])
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    if (warn != null) __obj.updateDynamic("warn")(js.Any.fromFunction2(warn))
    if (watchOptions != null) __obj.updateDynamic("watchOptions")(watchOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[KarmaWebpackMiddlewareOptions]
  }
}

