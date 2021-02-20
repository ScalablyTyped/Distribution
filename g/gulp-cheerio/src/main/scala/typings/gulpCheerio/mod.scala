package typings.gulpCheerio

import org.scalablytyped.runtime.Shortcut
import typings.cheerio.cheerio.CheerioParserOptions
import typings.cheerio.cheerio.Root
import typings.node.NodeJS.ReadWriteStream
import typings.vinyl.mod.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait Option extends StObject {
    
    var cheerio: js.UndefOr[Root] = js.native
    
    var parserOptions: js.UndefOr[CheerioParserOptions] = js.native
    
    var run: js.UndefOr[Callback] = js.native
  }
  object Option {
    
    @scala.inline
    def apply(): Option = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Option]
    }
    
    @scala.inline
    implicit class OptionMutableBuilder[Self <: Option] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheerio(value: Root): Self = StObject.set(x, "cheerio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheerioUndefined: Self = StObject.set(x, "cheerio", js.undefined)
      
      @scala.inline
      def setParserOptions(value: CheerioParserOptions): Self = StObject.set(x, "parserOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParserOptionsUndefined: Self = StObject.set(x, "parserOptions", js.undefined)
      
      @scala.inline
      def setRun(value: (/* $ */ Root, /* file */ File, /* done */ js.UndefOr[js.Function]) => js.Any): Self = StObject.set(x, "run", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRunUndefined: Self = StObject.set(x, "run", js.undefined)
    }
  }
  
  type _To = GulpCheerio
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: GulpCheerio = ^
}
