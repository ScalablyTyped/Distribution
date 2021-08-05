package typings.gulpHtmlPrettify

import org.scalablytyped.runtime.Shortcut
import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-html-prettify", JSImport.Namespace)
  @js.native
  val ^ : GulpHtmlPrettify = js.native
  
  type GulpHtmlPrettify = js.Function1[/* options */ js.UndefOr[GulpHtmlPrettifyOptions], ReadWriteStream]
  
  trait GulpHtmlPrettifyOptions extends StObject {
    
    var indent_char: js.UndefOr[String] = js.undefined
    
    var indent_size: js.UndefOr[Double] = js.undefined
  }
  object GulpHtmlPrettifyOptions {
    
    inline def apply(): GulpHtmlPrettifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GulpHtmlPrettifyOptions]
    }
    
    extension [Self <: GulpHtmlPrettifyOptions](x: Self) {
      
      inline def setIndent_char(value: String): Self = StObject.set(x, "indent_char", value.asInstanceOf[js.Any])
      
      inline def setIndent_charUndefined: Self = StObject.set(x, "indent_char", js.undefined)
      
      inline def setIndent_size(value: Double): Self = StObject.set(x, "indent_size", value.asInstanceOf[js.Any])
      
      inline def setIndent_sizeUndefined: Self = StObject.set(x, "indent_size", js.undefined)
    }
  }
  
  type _To = GulpHtmlPrettify
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: GulpHtmlPrettify = ^
}
