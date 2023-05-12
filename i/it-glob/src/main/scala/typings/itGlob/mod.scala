package typings.itGlob

import typings.minimatch.mod.MinimatchOptions
import typings.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("it-glob", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(dir: String, pattern: String): AsyncGenerator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dir.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[String, Unit, Unit]]
  inline def default(dir: String, pattern: String, options: GlobOptions): AsyncGenerator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dir.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[String, Unit, Unit]]
  
  trait GlobOptions
    extends StObject
       with MinimatchOptions {
    
    /**
      * If true produces absolute paths (default: false)
      */
    var absolute: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The current working directory
      */
    var cwd: js.UndefOr[String] = js.undefined
    
    /**
      * If true yields file paths and skip directories (default: false)
      */
    var nodir: js.UndefOr[Boolean] = js.undefined
  }
  object GlobOptions {
    
    inline def apply(): GlobOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GlobOptions] (val x: Self) extends AnyVal {
      
      inline def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
      
      inline def setAbsoluteUndefined: Self = StObject.set(x, "absolute", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setNodir(value: Boolean): Self = StObject.set(x, "nodir", value.asInstanceOf[js.Any])
      
      inline def setNodirUndefined: Self = StObject.set(x, "nodir", js.undefined)
    }
  }
}
