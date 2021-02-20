package typings.gulpFilter

import typings.minimatch.mod.IOptions
import typings.node.NodeJS.ReadWriteStream
import typings.vinyl.mod.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gulp-filter", JSImport.Namespace)
  @js.native
  def apply(pattern: String): Filter = js.native
  @JSImport("gulp-filter", JSImport.Namespace)
  @js.native
  def apply(pattern: String, options: Options): Filter = js.native
  @JSImport("gulp-filter", JSImport.Namespace)
  @js.native
  def apply(pattern: js.Array[String]): Filter = js.native
  @JSImport("gulp-filter", JSImport.Namespace)
  @js.native
  def apply(pattern: js.Array[String], options: Options): Filter = js.native
  @JSImport("gulp-filter", JSImport.Namespace)
  @js.native
  def apply(pattern: FileFunction): Filter = js.native
  @JSImport("gulp-filter", JSImport.Namespace)
  @js.native
  def apply(pattern: FileFunction, options: Options): Filter = js.native
  
  type FileFunction = js.Function1[/* file */ File, Boolean]
  
  // A transform stream with a .restore object
  @js.native
  trait Filter extends ReadWriteStream {
    
    var restore: ReadWriteStream = js.native
  }
  
  @js.native
  trait Options extends IOptions {
    
    var passthrough: js.UndefOr[Boolean] = js.native
    
    var restore: js.UndefOr[Boolean] = js.native
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
      def setPassthrough(value: Boolean): Self = StObject.set(x, "passthrough", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassthroughUndefined: Self = StObject.set(x, "passthrough", js.undefined)
      
      @scala.inline
      def setRestore(value: Boolean): Self = StObject.set(x, "restore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestoreUndefined: Self = StObject.set(x, "restore", js.undefined)
    }
  }
}
