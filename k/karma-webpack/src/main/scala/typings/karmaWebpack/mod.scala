package typings.karmaWebpack

import org.scalablytyped.runtime.StringDictionary
import typings.webpackDevMiddleware.mod.Options
import typings.webpackDevMiddleware.mod.Reporter
import typings.webpackDevMiddleware.mod.ReporterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @js.native
  trait ConfigOptions extends StObject {
    
    var webpack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Webpack.Configuration */ js.Any = js.native
    
    var webpackMiddleware: KarmaWebpackMiddlewareOptions = js.native
  }
  object ConfigOptions {
    
    @scala.inline
    def apply(
      webpack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Webpack.Configuration */ js.Any,
      webpackMiddleware: KarmaWebpackMiddlewareOptions
    ): ConfigOptions = {
      val __obj = js.Dynamic.literal(webpack = webpack.asInstanceOf[js.Any], webpackMiddleware = webpackMiddleware.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit class ConfigOptionsMutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWebpack(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Webpack.Configuration */ js.Any
      ): Self = StObject.set(x, "webpack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebpackMiddleware(value: KarmaWebpackMiddlewareOptions): Self = StObject.set(x, "webpackMiddleware", value.asInstanceOf[js.Any])
    }
  }
  
  // Note: karma-webpack will set publicPath for us, so it is optional here.
  // Unfortuantely, Typescript doesn't let you overload properties, so
  // the entire definition is duplicated here.
  @js.native
  trait KarmaWebpackMiddlewareOptions extends StObject {
    
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
    implicit class KarmaWebpackMiddlewareOptionsMutableBuilder[Self <: KarmaWebpackMiddlewareOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: (/* message */ js.UndefOr[js.Any], /* repeated */ js.Any) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      @scala.inline
      def setLog(value: (/* message */ js.UndefOr[js.Any], /* repeated */ js.Any) => Unit): Self = StObject.set(x, "log", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      @scala.inline
      def setNoInfo(value: Boolean): Self = StObject.set(x, "noInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoInfoUndefined: Self = StObject.set(x, "noInfo", js.undefined)
      
      @scala.inline
      def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
      
      @scala.inline
      def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      @scala.inline
      def setReporter(value: (/* middlewareOptions */ Options, /* reporterOptions */ ReporterOptions) => Unit): Self = StObject.set(x, "reporter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReporterNull: Self = StObject.set(x, "reporter", null)
      
      @scala.inline
      def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
      
      @scala.inline
      def setServerSideRender(value: Boolean): Self = StObject.set(x, "serverSideRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerSideRenderUndefined: Self = StObject.set(x, "serverSideRender", js.undefined)
      
      @scala.inline
      def setStats(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Webpack.Options.Stats */ js.Any
      ): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      
      @scala.inline
      def setWarn(value: (/* message */ js.UndefOr[js.Any], /* repeated */ js.Any) => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
      
      @scala.inline
      def setWatchOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Webpack.Options.WatchOptions */ js.Any
      ): Self = StObject.set(x, "watchOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatchOptionsUndefined: Self = StObject.set(x, "watchOptions", js.undefined)
    }
  }
  
  type Logger = js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit]
}
