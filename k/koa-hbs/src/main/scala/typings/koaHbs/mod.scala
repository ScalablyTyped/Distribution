package typings.koaHbs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.handlebars.Handlebars.HelperDeclareSpec
import typings.handlebars.Handlebars.HelperDelegate
import typings.koaHbs.anon.FnCall
import typings.koaHbs.anon.TypeofUtils
import typings.koaHbs.mod.Hbs.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("koa-hbs", JSImport.Namespace)
  @js.native
  val ^ : Hbs = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("koa-hbs", "SafeString")
  @js.native
  class SafeString protected ()
    extends typings.handlebars.mod.SafeString {
    def this(str: String) = this()
  }
  
  @js.native
  trait Hbs extends StObject {
    
    var SafeString: Instantiable1[/* str */ String, typings.handlebars.mod.SafeString] = js.native
    
    var Utils: TypeofUtils = js.native
    
    def middleware(opts: Middleware): js.Any = js.native
    
    def registerHelper(name: String, fn: HelperDelegate): Unit = js.native
    def registerHelper(name: HelperDeclareSpec): Unit = js.native
    @JSName("registerHelper")
    var registerHelper_Original: FnCall = js.native
  }
  object Hbs {
    
    @js.native
    trait Middleware extends StObject {
      
      var blockHelperName: js.UndefOr[String] = js.native
      
      var contentHelperName: js.UndefOr[String] = js.native
      
      var defaultLayout: js.UndefOr[String] = js.native
      
      var disableCache: js.UndefOr[Boolean] = js.native
      
      var extname: js.UndefOr[String] = js.native
      
      var handlebars: js.UndefOr[js.Function] = js.native
      
      var layoutsPath: js.UndefOr[String] = js.native
      
      var partialsPath: js.UndefOr[js.Array[String] | String] = js.native
      
      var templateOptions: js.UndefOr[js.Object] = js.native
      
      var viewPath: js.Array[String] | String = js.native
    }
    object Middleware {
      
      @scala.inline
      def apply(viewPath: js.Array[String] | String): Middleware = {
        val __obj = js.Dynamic.literal(viewPath = viewPath.asInstanceOf[js.Any])
        __obj.asInstanceOf[Middleware]
      }
      
      @scala.inline
      implicit class MiddlewareMutableBuilder[Self <: Middleware] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBlockHelperName(value: String): Self = StObject.set(x, "blockHelperName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBlockHelperNameUndefined: Self = StObject.set(x, "blockHelperName", js.undefined)
        
        @scala.inline
        def setContentHelperName(value: String): Self = StObject.set(x, "contentHelperName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContentHelperNameUndefined: Self = StObject.set(x, "contentHelperName", js.undefined)
        
        @scala.inline
        def setDefaultLayout(value: String): Self = StObject.set(x, "defaultLayout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultLayoutUndefined: Self = StObject.set(x, "defaultLayout", js.undefined)
        
        @scala.inline
        def setDisableCache(value: Boolean): Self = StObject.set(x, "disableCache", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisableCacheUndefined: Self = StObject.set(x, "disableCache", js.undefined)
        
        @scala.inline
        def setExtname(value: String): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExtnameUndefined: Self = StObject.set(x, "extname", js.undefined)
        
        @scala.inline
        def setHandlebars(value: js.Function): Self = StObject.set(x, "handlebars", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHandlebarsUndefined: Self = StObject.set(x, "handlebars", js.undefined)
        
        @scala.inline
        def setLayoutsPath(value: String): Self = StObject.set(x, "layoutsPath", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLayoutsPathUndefined: Self = StObject.set(x, "layoutsPath", js.undefined)
        
        @scala.inline
        def setPartialsPath(value: js.Array[String] | String): Self = StObject.set(x, "partialsPath", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPartialsPathUndefined: Self = StObject.set(x, "partialsPath", js.undefined)
        
        @scala.inline
        def setPartialsPathVarargs(value: String*): Self = StObject.set(x, "partialsPath", js.Array(value :_*))
        
        @scala.inline
        def setTemplateOptions(value: js.Object): Self = StObject.set(x, "templateOptions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTemplateOptionsUndefined: Self = StObject.set(x, "templateOptions", js.undefined)
        
        @scala.inline
        def setViewPath(value: js.Array[String] | String): Self = StObject.set(x, "viewPath", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setViewPathVarargs(value: String*): Self = StObject.set(x, "viewPath", js.Array(value :_*))
      }
    }
  }
  
  type _To = Hbs
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Hbs = ^
  
  /* augmented module */
  object koaAugmentingMod {
    
    @js.native
    trait Context extends StObject {
      
      def render(tpl: String): js.Promise[Unit] = js.native
      def render(tpl: String, locals: StringDictionary[js.Any]): js.Promise[Unit] = js.native
    }
  }
}
