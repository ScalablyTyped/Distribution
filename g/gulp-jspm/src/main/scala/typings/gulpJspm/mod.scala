package typings.gulpJspm

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-jspm", JSImport.Namespace)
  @js.native
  val ^ : GulpJspm = js.native
  
  type GulpJspm = js.Function1[
    /* options */ js.UndefOr[Options], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ReadWriteStream */ Any
  ]
  
  trait Options extends StObject {
    
    var arithmetic: js.UndefOr[String] = js.undefined
    
    var inject: js.UndefOr[Boolean] = js.undefined
    
    var minify: js.UndefOr[Boolean] = js.undefined
    
    var plugin: js.UndefOr[Boolean | String] = js.undefined
    
    var selfExecutingBundle: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setArithmetic(value: String): Self = StObject.set(x, "arithmetic", value.asInstanceOf[js.Any])
      
      inline def setArithmeticUndefined: Self = StObject.set(x, "arithmetic", js.undefined)
      
      inline def setInject(value: Boolean): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
      
      inline def setInjectUndefined: Self = StObject.set(x, "inject", js.undefined)
      
      inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      inline def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
      
      inline def setPlugin(value: Boolean | String): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
      
      inline def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
      
      inline def setSelfExecutingBundle(value: Boolean): Self = StObject.set(x, "selfExecutingBundle", value.asInstanceOf[js.Any])
      
      inline def setSelfExecutingBundleUndefined: Self = StObject.set(x, "selfExecutingBundle", js.undefined)
    }
  }
  
  type _To = GulpJspm
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: GulpJspm = ^
}
