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
import scala.scalajs.js.`|`
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
  
  @js.native
  trait Logger extends StObject {
    
    def warn(data: js.Any*): Unit = js.native
    @JSName("warn")
    var warn_Original: js.Function1[/* repeated */ js.Any, Unit] = js.native
  }
  
  @js.native
  trait Uglify extends StObject {
    
    def minify(files: String): MinifyOutput = js.native
    def minify(files: String, options: MinifyOptions): MinifyOutput = js.native
    def minify(files: js.Array[String]): MinifyOutput = js.native
    def minify(files: js.Array[String], options: MinifyOptions): MinifyOutput = js.native
    def minify(files: StringDictionary[String]): MinifyOutput = js.native
    def minify(files: StringDictionary[String], options: MinifyOptions): MinifyOutput = js.native
    @JSName("minify")
    var minify_Original: FnCall = js.native
  }
  
  type _To = Composer
  
  /* This means you don't have to write `^`, but can instead just say `composerMod.foo` */
  override def _to: Composer = ^
}
