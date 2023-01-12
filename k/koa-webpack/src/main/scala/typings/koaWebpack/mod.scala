package typings.koaWebpack

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.koaWebpack.anon.Close
import typings.node.httpMod.IncomingMessage
import typings.webpack.mod.Compiler
import typings.webpack.mod.Configuration
import typings.webpack.mod.MultiCompiler
import typings.webpack.mod.Stats
import typings.webpackDevMiddleware.mod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): js.Promise[(Middleware[DefaultState, DefaultContext, Any]) & CombinedWebpackMiddleware] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[(Middleware[DefaultState, DefaultContext, Any]) & CombinedWebpackMiddleware]]
  inline def apply(options: Options): js.Promise[(Middleware[DefaultState, DefaultContext, Any]) & CombinedWebpackMiddleware] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[(Middleware[DefaultState, DefaultContext, Any]) & CombinedWebpackMiddleware]]
  
  @JSImport("koa-webpack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait CombinedWebpackMiddleware extends StObject {
    
    def close(): Unit = js.native
    def close(callback: js.Function0[Any]): Unit = js.native
    
    var devMiddleware: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpackDevMiddleware.WebpackDevMiddleware */ Any = js.native
    
    /**
      * @todo make this a `webpack-hot-client@^4.0.0` instance, no typings for v4 available yet
      */
    var hotClient: Close = js.native
  }
  
  trait Options extends StObject {
    
    var compiler: js.UndefOr[Compiler | MultiCompiler] = js.undefined
    
    var config: js.UndefOr[Configuration] = js.undefined
    
    var devMiddleware: js.UndefOr[typings.webpackDevMiddleware.mod.Options[IncomingMessage, ServerResponse]] = js.undefined
    
    var hotClient: js.UndefOr[typings.webpackHotClient.mod.Options | Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCompiler(value: Compiler | MultiCompiler): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
      
      inline def setCompilerUndefined: Self = StObject.set(x, "compiler", js.undefined)
      
      inline def setConfig(value: Configuration): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setDevMiddleware(value: typings.webpackDevMiddleware.mod.Options[IncomingMessage, ServerResponse]): Self = StObject.set(x, "devMiddleware", value.asInstanceOf[js.Any])
      
      inline def setDevMiddlewareUndefined: Self = StObject.set(x, "devMiddleware", js.undefined)
      
      inline def setHotClient(value: typings.webpackHotClient.mod.Options | Boolean): Self = StObject.set(x, "hotClient", value.asInstanceOf[js.Any])
      
      inline def setHotClientUndefined: Self = StObject.set(x, "hotClient", js.undefined)
    }
  }
  
  /* augmented module */
  object koaAugmentingMod {
    
    trait DefaultState extends StObject {
      
      var fs: /* import warning: importer.ImportType#apply Failed type conversion: webpack-dev-middleware.webpack-dev-middleware.Options<node.http.IncomingMessage, webpack-dev-middleware.webpack-dev-middleware.ServerResponse>['fs'] */ js.Any
      
      var stats: Stats
    }
    object DefaultState {
      
      inline def apply(
        fs: /* import warning: importer.ImportType#apply Failed type conversion: webpack-dev-middleware.webpack-dev-middleware.Options<node.http.IncomingMessage, webpack-dev-middleware.webpack-dev-middleware.ServerResponse>['fs'] */ js.Any,
        stats: Stats
      ): typings.koaWebpack.mod.koaAugmentingMod.DefaultState = {
        val __obj = js.Dynamic.literal(fs = fs.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.koaWebpack.mod.koaAugmentingMod.DefaultState]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.koaWebpack.mod.koaAugmentingMod.DefaultState] (val x: Self) extends AnyVal {
        
        inline def setFs(
          value: /* import warning: importer.ImportType#apply Failed type conversion: webpack-dev-middleware.webpack-dev-middleware.Options<node.http.IncomingMessage, webpack-dev-middleware.webpack-dev-middleware.ServerResponse>['fs'] */ js.Any
        ): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
        
        inline def setStats(value: Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      }
    }
  }
}
