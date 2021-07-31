package typings.gulpReplace

import typings.node.NodeJS.ReadWriteStream
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(pattern: String, replacement: String): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  @scala.inline
  def apply(pattern: String, replacement: String, opts: Options): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  @scala.inline
  def apply(pattern: String, replacement: Replacer): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  @scala.inline
  def apply(pattern: String, replacement: Replacer, opts: Options): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  @scala.inline
  def apply(pattern: RegExp, replacement: String): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  @scala.inline
  def apply(pattern: RegExp, replacement: String, opts: Options): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  @scala.inline
  def apply(pattern: RegExp, replacement: Replacer): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  @scala.inline
  def apply(pattern: RegExp, replacement: Replacer, opts: Options): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  
  @JSImport("gulp-replace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var skipBinary: js.UndefOr[Boolean] = js.undefined
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
