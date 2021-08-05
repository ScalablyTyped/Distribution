package typings.gulpCheerio

import org.scalablytyped.runtime.Shortcut
import typings.cheerio.cheerio.CheerioParserOptions
import typings.cheerio.cheerio.Root
import typings.node.NodeJS.ReadWriteStream
import typings.vinyl.mod.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-cheerio", JSImport.Namespace)
  @js.native
  val ^ : GulpCheerio = js.native
  
  type Callback = js.Function3[/* $ */ Root, /* file */ File, /* done */ js.UndefOr[js.Function], js.Any]
  
  @js.native
  trait GulpCheerio extends StObject {
    
    def apply(callback: Callback): ReadWriteStream = js.native
    def apply(option: Option): ReadWriteStream = js.native
  }
  
  trait Option extends StObject {
    
    var cheerio: js.UndefOr[Root] = js.undefined
    
    var parserOptions: js.UndefOr[CheerioParserOptions] = js.undefined
    
    var run: js.UndefOr[Callback] = js.undefined
  }
  object Option {
    
    inline def apply(): Option = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Option]
    }
    
    extension [Self <: Option](x: Self) {
      
      inline def setCheerio(value: Root): Self = StObject.set(x, "cheerio", value.asInstanceOf[js.Any])
      
      inline def setCheerioUndefined: Self = StObject.set(x, "cheerio", js.undefined)
      
      inline def setParserOptions(value: CheerioParserOptions): Self = StObject.set(x, "parserOptions", value.asInstanceOf[js.Any])
      
      inline def setParserOptionsUndefined: Self = StObject.set(x, "parserOptions", js.undefined)
      
      inline def setRun(value: (/* $ */ Root, /* file */ File, /* done */ js.UndefOr[js.Function]) => js.Any): Self = StObject.set(x, "run", js.Any.fromFunction3(value))
      
      inline def setRunUndefined: Self = StObject.set(x, "run", js.undefined)
    }
  }
  
  type _To = GulpCheerio
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: GulpCheerio = ^
}
