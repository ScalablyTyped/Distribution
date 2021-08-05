package typings.itGlob

import typings.minimatch.mod.IOptions
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(dir: String, pattern: String): AsyncIterable[String] = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[String]]
  inline def apply(dir: String, pattern: String, options: OptionsExt & IOptions): AsyncIterable[String] = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[String]]
  
  @JSImport("it-glob/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Glob = String
  
  trait Options
    extends StObject
       with OptionsExt
       with IOptions
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
  }
  
  trait OptionsExt extends StObject {
    
    /**
      * - If true produces absolute paths
      */
    var absolute: js.UndefOr[Boolean] = js.undefined
    
    var cwd: js.UndefOr[String] = js.undefined
    
    /**
      * - Glob patterns to ignore
      */
    var ignore: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * - If true yields file paths and skip directories
      */
    var nodir: js.UndefOr[Boolean] = js.undefined
  }
  object OptionsExt {
    
    inline def apply(): OptionsExt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsExt]
    }
    
    extension [Self <: OptionsExt](x: Self) {
      
      inline def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
      
      inline def setAbsoluteUndefined: Self = StObject.set(x, "absolute", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value :_*))
      
      inline def setNodir(value: Boolean): Self = StObject.set(x, "nodir", value.asInstanceOf[js.Any])
      
      inline def setNodirUndefined: Self = StObject.set(x, "nodir", js.undefined)
    }
  }
}
