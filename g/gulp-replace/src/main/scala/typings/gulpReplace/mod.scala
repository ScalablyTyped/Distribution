package typings.gulpReplace

import typings.node.NodeJS.ReadWriteStream
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gulp-replace", JSImport.Namespace)
  @js.native
  def apply(pattern: String, replacement: String): ReadWriteStream = js.native
  @JSImport("gulp-replace", JSImport.Namespace)
  @js.native
  def apply(pattern: String, replacement: String, opts: Options): ReadWriteStream = js.native
  @JSImport("gulp-replace", JSImport.Namespace)
  @js.native
  def apply(pattern: String, replacement: Replacer): ReadWriteStream = js.native
  @JSImport("gulp-replace", JSImport.Namespace)
  @js.native
  def apply(pattern: String, replacement: Replacer, opts: Options): ReadWriteStream = js.native
  @JSImport("gulp-replace", JSImport.Namespace)
  @js.native
  def apply(pattern: RegExp, replacement: String): ReadWriteStream = js.native
  @JSImport("gulp-replace", JSImport.Namespace)
  @js.native
  def apply(pattern: RegExp, replacement: String, opts: Options): ReadWriteStream = js.native
  @JSImport("gulp-replace", JSImport.Namespace)
  @js.native
  def apply(pattern: RegExp, replacement: Replacer): ReadWriteStream = js.native
  @JSImport("gulp-replace", JSImport.Namespace)
  @js.native
  def apply(pattern: RegExp, replacement: Replacer, opts: Options): ReadWriteStream = js.native
  
  @js.native
  trait Options extends StObject {
    
    var skipBinary: js.UndefOr[Boolean] = js.native
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
      def setSkipBinary(value: Boolean): Self = StObject.set(x, "skipBinary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipBinaryUndefined: Self = StObject.set(x, "skipBinary", js.undefined)
    }
  }
  
  type Replacer = js.Function1[/* match */ String, String]
}
