package typings.gulpUglify

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.gulpUglify.anon.FnCall
import typings.gulpUglify.mod.Options
import typings.node.NodeJS.ReadWriteStream
import typings.uglifyJs.mod.MinifyOptions
import typings.uglifyJs.mod.MinifyOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object composerMod extends Shortcut {
  
  @JSImport("gulp-uglify/composer", JSImport.Namespace)
  @js.native
  val ^ : Composer = js.native
  
  type Composer = js.Function2[
    /* uglify */ Uglify, 
    /* log */ Logger, 
    js.Function1[/* options */ js.UndefOr[Options], ReadWriteStream]
  ]
  
  trait Logger extends StObject {
    
    def warn(data: Any*): Unit
    @JSName("warn")
    var warn_Original: js.Function1[/* repeated */ Any, Unit]
  }
  object Logger {
    
    inline def apply(warn: /* repeated */ Any => Unit): Logger = {
      val __obj = js.Dynamic.literal(warn = js.Any.fromFunction1(warn))
      __obj.asInstanceOf[Logger]
    }
    
    extension [Self <: Logger](x: Self) {
      
      inline def setWarn(value: /* repeated */ Any => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
    }
  }
  
  trait Uglify extends StObject {
    
    def minify(files: String): MinifyOutput
    def minify(files: String, options: MinifyOptions): MinifyOutput
    def minify(files: js.Array[String]): MinifyOutput
    def minify(files: js.Array[String], options: MinifyOptions): MinifyOutput
    def minify(files: StringDictionary[String]): MinifyOutput
    def minify(files: StringDictionary[String], options: MinifyOptions): MinifyOutput
    @JSName("minify")
    var minify_Original: FnCall
  }
  object Uglify {
    
    inline def apply(minify: FnCall): Uglify = {
      val __obj = js.Dynamic.literal(minify = minify.asInstanceOf[js.Any])
      __obj.asInstanceOf[Uglify]
    }
    
    extension [Self <: Uglify](x: Self) {
      
      inline def setMinify(value: FnCall): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Composer
  
  /* This means you don't have to write `^`, but can instead just say `composerMod.foo` */
  override def _to: Composer = ^
}
