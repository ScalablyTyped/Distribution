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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("koa-hbs", JSImport.Namespace)
  @js.native
  val ^ : Hbs = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("koa-hbs", "SafeString")
  @js.native
  open class SafeString protected ()
    extends typings.handlebars.mod.SafeString {
    def this(str: String) = this()
  }
  
  trait Hbs extends StObject {
    
    var SafeString: Instantiable1[/* str */ String, typings.handlebars.mod.SafeString]
    
    var Utils: TypeofUtils
    
    def middleware(opts: Middleware): Any
    
    def registerHelper(name: String, fn: HelperDelegate): Unit
    def registerHelper(name: HelperDeclareSpec): Unit
    @JSName("registerHelper")
    var registerHelper_Original: FnCall
  }
  object Hbs {
    
    inline def apply(
      SafeString: Instantiable1[/* str */ String, typings.handlebars.mod.SafeString],
      Utils: TypeofUtils,
      middleware: Middleware => Any,
      registerHelper: FnCall
    ): Hbs = {
      val __obj = js.Dynamic.literal(SafeString = SafeString.asInstanceOf[js.Any], Utils = Utils.asInstanceOf[js.Any], middleware = js.Any.fromFunction1(middleware), registerHelper = registerHelper.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hbs]
    }
    
    extension [Self <: Hbs](x: Self) {
      
      inline def setMiddleware(value: Middleware => Any): Self = StObject.set(x, "middleware", js.Any.fromFunction1(value))
      
      inline def setRegisterHelper(value: FnCall): Self = StObject.set(x, "registerHelper", value.asInstanceOf[js.Any])
      
      inline def setSafeString(value: Instantiable1[/* str */ String, typings.handlebars.mod.SafeString]): Self = StObject.set(x, "SafeString", value.asInstanceOf[js.Any])
      
      inline def setUtils(value: TypeofUtils): Self = StObject.set(x, "Utils", value.asInstanceOf[js.Any])
    }
    
    trait Middleware extends StObject {
      
      var blockHelperName: js.UndefOr[String] = js.undefined
      
      var contentHelperName: js.UndefOr[String] = js.undefined
      
      var defaultLayout: js.UndefOr[String] = js.undefined
      
      var disableCache: js.UndefOr[Boolean] = js.undefined
      
      var extname: js.UndefOr[String] = js.undefined
      
      var handlebars: js.UndefOr[js.Function] = js.undefined
      
      var layoutsPath: js.UndefOr[String] = js.undefined
      
      var partialsPath: js.UndefOr[js.Array[String] | String] = js.undefined
      
      var templateOptions: js.UndefOr[js.Object] = js.undefined
      
      var viewPath: js.Array[String] | String
    }
    object Middleware {
      
      inline def apply(viewPath: js.Array[String] | String): Middleware = {
        val __obj = js.Dynamic.literal(viewPath = viewPath.asInstanceOf[js.Any])
        __obj.asInstanceOf[Middleware]
      }
      
      extension [Self <: Middleware](x: Self) {
        
        inline def setBlockHelperName(value: String): Self = StObject.set(x, "blockHelperName", value.asInstanceOf[js.Any])
        
        inline def setBlockHelperNameUndefined: Self = StObject.set(x, "blockHelperName", js.undefined)
        
        inline def setContentHelperName(value: String): Self = StObject.set(x, "contentHelperName", value.asInstanceOf[js.Any])
        
        inline def setContentHelperNameUndefined: Self = StObject.set(x, "contentHelperName", js.undefined)
        
        inline def setDefaultLayout(value: String): Self = StObject.set(x, "defaultLayout", value.asInstanceOf[js.Any])
        
        inline def setDefaultLayoutUndefined: Self = StObject.set(x, "defaultLayout", js.undefined)
        
        inline def setDisableCache(value: Boolean): Self = StObject.set(x, "disableCache", value.asInstanceOf[js.Any])
        
        inline def setDisableCacheUndefined: Self = StObject.set(x, "disableCache", js.undefined)
        
        inline def setExtname(value: String): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
        
        inline def setExtnameUndefined: Self = StObject.set(x, "extname", js.undefined)
        
        inline def setHandlebars(value: js.Function): Self = StObject.set(x, "handlebars", value.asInstanceOf[js.Any])
        
        inline def setHandlebarsUndefined: Self = StObject.set(x, "handlebars", js.undefined)
        
        inline def setLayoutsPath(value: String): Self = StObject.set(x, "layoutsPath", value.asInstanceOf[js.Any])
        
        inline def setLayoutsPathUndefined: Self = StObject.set(x, "layoutsPath", js.undefined)
        
        inline def setPartialsPath(value: js.Array[String] | String): Self = StObject.set(x, "partialsPath", value.asInstanceOf[js.Any])
        
        inline def setPartialsPathUndefined: Self = StObject.set(x, "partialsPath", js.undefined)
        
        inline def setPartialsPathVarargs(value: String*): Self = StObject.set(x, "partialsPath", js.Array(value*))
        
        inline def setTemplateOptions(value: js.Object): Self = StObject.set(x, "templateOptions", value.asInstanceOf[js.Any])
        
        inline def setTemplateOptionsUndefined: Self = StObject.set(x, "templateOptions", js.undefined)
        
        inline def setViewPath(value: js.Array[String] | String): Self = StObject.set(x, "viewPath", value.asInstanceOf[js.Any])
        
        inline def setViewPathVarargs(value: String*): Self = StObject.set(x, "viewPath", js.Array(value*))
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
      def render(tpl: String, locals: StringDictionary[Any]): js.Promise[Unit] = js.native
    }
  }
}
