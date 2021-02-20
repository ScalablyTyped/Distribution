package typings.itGlob

import typings.minimatch.mod.IOptions
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("it-glob/dist", JSImport.Namespace)
  @js.native
  def apply(dir: String, pattern: String): AsyncIterable[String] = js.native
  @JSImport("it-glob/dist", JSImport.Namespace)
  @js.native
  def apply(dir: String, pattern: String, options: OptionsExt with IOptions): AsyncIterable[String] = js.native
  
  type Glob = String
  
  type Options = OptionsExt with IOptions
  
  @js.native
  trait OptionsExt extends StObject {
    
    /**
      * - If true produces absolute paths
      */
    var absolute: js.UndefOr[Boolean] = js.native
    
    var cwd: js.UndefOr[String] = js.native
    
    /**
      * - Glob patterns to ignore
      */
    var ignore: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * - If true yields file paths and skip directories
      */
    var nodir: js.UndefOr[Boolean] = js.native
  }
  object OptionsExt {
    
    @scala.inline
    def apply(): OptionsExt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsExt]
    }
    
    @scala.inline
    implicit class OptionsExtMutableBuilder[Self <: OptionsExt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbsoluteUndefined: Self = StObject.set(x, "absolute", js.undefined)
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value :_*))
      
      @scala.inline
      def setNodir(value: Boolean): Self = StObject.set(x, "nodir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodirUndefined: Self = StObject.set(x, "nodir", js.undefined)
    }
  }
}
