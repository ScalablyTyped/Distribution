package typings.karmaWebpack

import org.scalablytyped.runtime.StringDictionary
import typings.webpack.mod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object karmaMod {
  
  trait ConfigOptions extends StObject {
    
    var webpack: Configuration
    
    var webpackMiddleware: KarmaWebpackMiddlewareOptions
  }
  object ConfigOptions {
    
    inline def apply(webpack: Configuration, webpackMiddleware: KarmaWebpackMiddlewareOptions): ConfigOptions = {
      val __obj = js.Dynamic.literal(webpack = webpack.asInstanceOf[js.Any], webpackMiddleware = webpackMiddleware.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setWebpack(value: Configuration): Self = StObject.set(x, "webpack", value.asInstanceOf[js.Any])
      
      inline def setWebpackMiddleware(value: KarmaWebpackMiddlewareOptions): Self = StObject.set(x, "webpackMiddleware", value.asInstanceOf[js.Any])
    }
  }
  
  // Note: karma-webpack will set publicPath for us, so it is optional here.
  // Unfortuantely, Typescript doesn't let you overload properties, so
  // the entire definition is duplicated here.
  trait KarmaWebpackMiddlewareOptions extends StObject {
    
    var error: js.UndefOr[Logger] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var index: js.UndefOr[String] = js.undefined
    
    var `lazy`: js.UndefOr[Boolean] = js.undefined
    
    var log: js.UndefOr[Logger] = js.undefined
    
    var noInfo: js.UndefOr[Boolean] = js.undefined
    
    var publicPath: js.UndefOr[String] = js.undefined
    
    var quiet: js.UndefOr[Boolean] = js.undefined
    
    var reporter: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reporter */ Any) | Null
      ] = js.undefined
    
    var serverSideRender: js.UndefOr[Boolean] = js.undefined
    
    var stats: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Webpack.Options.Stats */ Any
      ] = js.undefined
    
    var warn: js.UndefOr[Logger] = js.undefined
    
    var watchOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Webpack.Options.WatchOptions */ Any
      ] = js.undefined
  }
  object KarmaWebpackMiddlewareOptions {
    
    inline def apply(): KarmaWebpackMiddlewareOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KarmaWebpackMiddlewareOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KarmaWebpackMiddlewareOptions] (val x: Self) extends AnyVal {
      
      inline def setError(value: Logger): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      inline def setLog(value: Logger): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setNoInfo(value: Boolean): Self = StObject.set(x, "noInfo", value.asInstanceOf[js.Any])
      
      inline def setNoInfoUndefined: Self = StObject.set(x, "noInfo", js.undefined)
      
      inline def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      inline def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      inline def setReporter(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reporter */ Any
      ): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
      
      inline def setReporterNull: Self = StObject.set(x, "reporter", null)
      
      inline def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
      
      inline def setServerSideRender(value: Boolean): Self = StObject.set(x, "serverSideRender", value.asInstanceOf[js.Any])
      
      inline def setServerSideRenderUndefined: Self = StObject.set(x, "serverSideRender", js.undefined)
      
      inline def setStats(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Webpack.Options.Stats */ Any
      ): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      
      inline def setWarn(value: Logger): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
      
      inline def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
      
      inline def setWatchOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Webpack.Options.WatchOptions */ Any
      ): Self = StObject.set(x, "watchOptions", value.asInstanceOf[js.Any])
      
      inline def setWatchOptionsUndefined: Self = StObject.set(x, "watchOptions", js.undefined)
    }
  }
  
  @js.native
  trait Logger extends StObject {
    
    def apply(message: Any, optionalParams: Any*): Unit = js.native
    def apply(message: Unit, optionalParams: Any*): Unit = js.native
  }
}
