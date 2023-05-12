package typings.gulpRewriteCss

import org.scalablytyped.runtime.Shortcut
import typings.gulpRewriteCss.anon.AdaptPath
import typings.gulpRewriteCss.anon.DestinationDir
import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-rewrite-css", JSImport.Namespace)
  @js.native
  val ^ : GulpRewriteCss = js.native
  
  @js.native
  trait GulpRewriteCss extends StObject {
    
    def apply(options: AdaptPath): ReadWriteStream = js.native
    
    def adaptPath(context: DestinationDir): String = js.native
    @JSName("adaptPath")
    var adaptPath_Original: GulpRewriteCssPathAdapter = js.native
  }
  
  type GulpRewriteCssPathAdapter = js.Function1[/* context */ DestinationDir, String]
  
  type _To = GulpRewriteCss
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: GulpRewriteCss = ^
}
