package typings.koaViews

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * return Function or Koa.middleware
    * @param root Where your views are located. Must be an absolute path. All rendered views are relative to this path
    * @param opts (optional)
    */
  inline def apply(root: String): Middleware[DefaultState, DefaultContext, Any] = ^.asInstanceOf[js.Dynamic].apply(root.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  inline def apply(root: String, opts: viewsOptions): Middleware[DefaultState, DefaultContext, Any] = (^.asInstanceOf[js.Dynamic].apply(root.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  
  @JSImport("koa-views", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait viewsOptions extends StObject {
    
    /*
      * Whether to use ctx.body to receive the rendered template string. Defaults to true.
      */
    var autoRender: js.UndefOr[Boolean] = js.undefined
    
    /*
      * replace consolidate as default engine source
      */
    var engineSource: js.UndefOr[Any] = js.undefined
    
    /*
      * Default extension for your views
      */
    var `extension`: js.UndefOr[String] = js.undefined
    
    /*
      * Map a file extension to an engine
      */
    var map: js.UndefOr[Any] = js.undefined
    
    /*
      * These options will get passed to the view engine. This is the time to add partials and helpers etc.
      */
    var options: js.UndefOr[Any] = js.undefined
  }
  object viewsOptions {
    
    @JSImport("koa-views", "viewsOptions")
    @js.native
    val ^ : viewsOptions = js.native
    
    @scala.inline
    implicit open class MutableBuilder[Self <: viewsOptions] (val x: Self) extends AnyVal {
      
      inline def setAutoRender(value: Boolean): Self = StObject.set(x, "autoRender", value.asInstanceOf[js.Any])
      
      inline def setAutoRenderUndefined: Self = StObject.set(x, "autoRender", js.undefined)
      
      inline def setEngineSource(value: Any): Self = StObject.set(x, "engineSource", value.asInstanceOf[js.Any])
      
      inline def setEngineSourceUndefined: Self = StObject.set(x, "engineSource", js.undefined)
      
      inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
      
      inline def setMap(value: Any): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  /* augmented module */
  object koaAugmentingMod {
    
    @js.native
    trait ExtendableContext extends StObject {
      
      def render(viewPath: String): js.Promise[Unit] = js.native
      def render(viewPath: String, locals: Any): js.Promise[Unit] = js.native
    }
  }
}
