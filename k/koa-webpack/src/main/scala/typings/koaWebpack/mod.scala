package typings.koaWebpack

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.koaWebpack.anon.Close
import typings.webpackDevMiddleware.mod.WebpackDevMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): js.Promise[(Middleware[DefaultState, DefaultContext]) & CombinedWebpackMiddleware] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[(Middleware[DefaultState, DefaultContext]) & CombinedWebpackMiddleware]]
  @scala.inline
  def apply(options: Options): js.Promise[(Middleware[DefaultState, DefaultContext]) & CombinedWebpackMiddleware] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[(Middleware[DefaultState, DefaultContext]) & CombinedWebpackMiddleware]]
  
  @JSImport("koa-webpack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait CombinedWebpackMiddleware extends StObject {
    
    def close(): Unit = js.native
    def close(callback: js.Function0[js.Any]): Unit = js.native
    
    var devMiddleware: WebpackDevMiddleware = js.native
    
    /**
      * @todo make this a `webpack-hot-client@^4.0.0` instance, no typings for v4 available yet
      */
    var hotClient: Close = js.native
  }
  
  trait Options extends StObject {
    
    var compiler: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
      ] = js.undefined
    
    var config: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration */ js.Any
      ] = js.undefined
    
    var devMiddleware: js.UndefOr[typings.webpackDevMiddleware.mod.Options] = js.undefined
    
    var hotClient: js.UndefOr[typings.webpackHotClient.mod.Options | Boolean] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompiler(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
      ): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompilerUndefined: Self = StObject.set(x, "compiler", js.undefined)
      
      @scala.inline
      def setConfig(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration */ js.Any
      ): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setDevMiddleware(value: typings.webpackDevMiddleware.mod.Options): Self = StObject.set(x, "devMiddleware", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevMiddlewareUndefined: Self = StObject.set(x, "devMiddleware", js.undefined)
      
      @scala.inline
      def setHotClient(value: typings.webpackHotClient.mod.Options | Boolean): Self = StObject.set(x, "hotClient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHotClientUndefined: Self = StObject.set(x, "hotClient", js.undefined)
    }
  }
  
  /* augmented module */
  object koaAugmentingMod {
    
    trait DefaultState extends StObject {
      
      var fs: js.UndefOr[typings.memoryFs.mod.^] = js.undefined
      
      var stats: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Stats */ js.Any
    }
    object DefaultState {
      
      @scala.inline
      def apply(
        stats: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Stats */ js.Any
      ): typings.koaWebpack.mod.koaAugmentingMod.DefaultState = {
        val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.koaWebpack.mod.koaAugmentingMod.DefaultState]
      }
      
      @scala.inline
      implicit class DefaultStateMutableBuilder[Self <: typings.koaWebpack.mod.koaAugmentingMod.DefaultState] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFs(value: typings.memoryFs.mod.^): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
        
        @scala.inline
        def setStats(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Stats */ js.Any
        ): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      }
    }
  }
}
