package typings.karmaWebpack.mod

import org.scalablytyped.runtime.StringDictionary
import typings.webpackDevMiddleware.mod.Options
import typings.webpackDevMiddleware.mod.Reporter
import typings.webpackDevMiddleware.mod.ReporterOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Note: karma-webpack will set publicPath for us, so it is optional here.
// Unfortuantely, Typescript doesn't let you overload properties, so
// the entire definition is duplicated here.
@js.native
trait KarmaWebpackMiddlewareOptions extends js.Object {
  var error: js.UndefOr[Logger] = js.native
  var filename: js.UndefOr[String] = js.native
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  var index: js.UndefOr[String] = js.native
  var `lazy`: js.UndefOr[Boolean] = js.native
  var log: js.UndefOr[Logger] = js.native
  var noInfo: js.UndefOr[Boolean] = js.native
  var publicPath: js.UndefOr[String] = js.native
  var quiet: js.UndefOr[Boolean] = js.native
  var reporter: js.UndefOr[Reporter | Null] = js.native
  var serverSideRender: js.UndefOr[Boolean] = js.native
  var stats: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Webpack.Options.Stats */ js.Any
  ] = js.native
  var warn: js.UndefOr[Logger] = js.native
  var watchOptions: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Webpack.Options.WatchOptions */ js.Any
  ] = js.native
}

object KarmaWebpackMiddlewareOptions {
  @scala.inline
  def apply(): KarmaWebpackMiddlewareOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KarmaWebpackMiddlewareOptions]
  }
  @scala.inline
  implicit class KarmaWebpackMiddlewareOptionsOps[Self <: KarmaWebpackMiddlewareOptions] (val x: Self) extends AnyVal {
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
    def setError(value: (/* message */ js.UndefOr[js.Any], /* repeated */ js.Any) => Unit): Self = this.set("error", js.Any.fromFunction2(value))
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setLazy(value: Boolean): Self = this.set("lazy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLazy: Self = this.set("lazy", js.undefined)
    @scala.inline
    def setLog(value: (/* message */ js.UndefOr[js.Any], /* repeated */ js.Any) => Unit): Self = this.set("log", js.Any.fromFunction2(value))
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    @scala.inline
    def setNoInfo(value: Boolean): Self = this.set("noInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoInfo: Self = this.set("noInfo", js.undefined)
    @scala.inline
    def setPublicPath(value: String): Self = this.set("publicPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicPath: Self = this.set("publicPath", js.undefined)
    @scala.inline
    def setQuiet(value: Boolean): Self = this.set("quiet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuiet: Self = this.set("quiet", js.undefined)
    @scala.inline
    def setReporter(value: (/* middlewareOptions */ Options, /* reporterOptions */ ReporterOptions) => Unit): Self = this.set("reporter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteReporter: Self = this.set("reporter", js.undefined)
    @scala.inline
    def setReporterNull: Self = this.set("reporter", null)
    @scala.inline
    def setServerSideRender(value: Boolean): Self = this.set("serverSideRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerSideRender: Self = this.set("serverSideRender", js.undefined)
    @scala.inline
    def setStats(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Webpack.Options.Stats */ js.Any
    ): Self = this.set("stats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStats: Self = this.set("stats", js.undefined)
    @scala.inline
    def setWarn(value: (/* message */ js.UndefOr[js.Any], /* repeated */ js.Any) => Unit): Self = this.set("warn", js.Any.fromFunction2(value))
    @scala.inline
    def deleteWarn: Self = this.set("warn", js.undefined)
    @scala.inline
    def setWatchOptions(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Webpack.Options.WatchOptions */ js.Any
    ): Self = this.set("watchOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWatchOptions: Self = this.set("watchOptions", js.undefined)
  }
  
}

