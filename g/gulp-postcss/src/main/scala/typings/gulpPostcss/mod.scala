package typings.gulpPostcss

import typings.node.NodeJS.ReadWriteStream
import typings.vinyl.mod.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gulp-postcss", JSImport.Namespace)
  @js.native
  def apply(): ReadWriteStream = js.native
  @JSImport("gulp-postcss", JSImport.Namespace)
  @js.native
  def apply(callback: js.Function1[/* file */ File, typings.gulpPostcss.anon.Options]): ReadWriteStream = js.native
  @JSImport("gulp-postcss", JSImport.Namespace)
  @js.native
  def apply(plugins: js.UndefOr[scala.Nothing], options: Options): ReadWriteStream = js.native
  @JSImport("gulp-postcss", JSImport.Namespace)
  @js.native
  def apply(plugins: js.Array[_]): ReadWriteStream = js.native
  @JSImport("gulp-postcss", JSImport.Namespace)
  @js.native
  def apply(plugins: js.Array[_], options: Options): ReadWriteStream = js.native
  
  @js.native
  trait Options extends StObject {
    
    var parser: js.UndefOr[js.Any] = js.native
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
      def setParser(value: js.Any): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
    }
  }
}
