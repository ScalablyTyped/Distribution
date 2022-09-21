package typings.gulpEspower

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-espower", JSImport.Namespace)
  @js.native
  val ^ : Espower = js.native
  
  type Espower = js.Function1[
    /* options */ js.UndefOr[Options], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ReadWriteStream */ Any
  ]
  
  trait Options extends StObject {
    
    var patterns: js.Array[String]
  }
  object Options {
    
    inline def apply(patterns: js.Array[String]): Options = {
      val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setPatterns(value: js.Array[String]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
      
      inline def setPatternsVarargs(value: String*): Self = StObject.set(x, "patterns", js.Array(value*))
    }
  }
  
  type _To = Espower
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Espower = ^
}
