package typings.gulpInstall

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-install", JSImport.Namespace)
  @js.native
  val ^ : Install = js.native
  
  type Install = js.Function1[
    /* options */ js.UndefOr[Options], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ReadWriteStream */ Any
  ]
  
  trait Options extends StObject {
    
    var allowRoot: js.UndefOr[Boolean] = js.undefined
    
    var args: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var ignoreScripts: js.UndefOr[Boolean] = js.undefined
    
    var noOptional: js.UndefOr[Boolean] = js.undefined
    
    var production: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAllowRoot(value: Boolean): Self = StObject.set(x, "allowRoot", value.asInstanceOf[js.Any])
      
      inline def setAllowRootUndefined: Self = StObject.set(x, "allowRoot", js.undefined)
      
      inline def setArgs(value: String | js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setIgnoreScripts(value: Boolean): Self = StObject.set(x, "ignoreScripts", value.asInstanceOf[js.Any])
      
      inline def setIgnoreScriptsUndefined: Self = StObject.set(x, "ignoreScripts", js.undefined)
      
      inline def setNoOptional(value: Boolean): Self = StObject.set(x, "noOptional", value.asInstanceOf[js.Any])
      
      inline def setNoOptionalUndefined: Self = StObject.set(x, "noOptional", js.undefined)
      
      inline def setProduction(value: Boolean): Self = StObject.set(x, "production", value.asInstanceOf[js.Any])
      
      inline def setProductionUndefined: Self = StObject.set(x, "production", js.undefined)
    }
  }
  
  type _To = Install
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Install = ^
}
