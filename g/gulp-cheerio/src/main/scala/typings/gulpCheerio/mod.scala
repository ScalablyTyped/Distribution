package typings.gulpCheerio

import org.scalablytyped.runtime.Shortcut
import typings.vinyl.mod.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-cheerio", JSImport.Namespace)
  @js.native
  val ^ : GulpCheerio = js.native
  
  type Callback = js.Function3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify cheerio.Root */ /* $ */ Any, 
    /* file */ File, 
    /* done */ js.UndefOr[js.Function], 
    Any
  ]
  
  @js.native
  trait GulpCheerio extends StObject {
    
    def apply(callback: Callback): Any = js.native
    def apply(option: Option): Any = js.native
  }
  
  trait Option extends StObject {
    
    var cheerio: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify cheerio.Root */ Any
      ] = js.undefined
    
    var parserOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify cheerio.CheerioParserOptions */ Any
      ] = js.undefined
    
    var run: js.UndefOr[Callback] = js.undefined
  }
  object Option {
    
    inline def apply(): Option = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Option]
    }
    
    extension [Self <: Option](x: Self) {
      
      inline def setCheerio(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify cheerio.Root */ Any
      ): Self = StObject.set(x, "cheerio", value.asInstanceOf[js.Any])
      
      inline def setCheerioUndefined: Self = StObject.set(x, "cheerio", js.undefined)
      
      inline def setParserOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify cheerio.CheerioParserOptions */ Any
      ): Self = StObject.set(x, "parserOptions", value.asInstanceOf[js.Any])
      
      inline def setParserOptionsUndefined: Self = StObject.set(x, "parserOptions", js.undefined)
      
      inline def setRun(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify cheerio.Root */ /* $ */ Any, /* file */ File, /* done */ js.UndefOr[js.Function]) => Any
      ): Self = StObject.set(x, "run", js.Any.fromFunction3(value))
      
      inline def setRunUndefined: Self = StObject.set(x, "run", js.undefined)
    }
  }
  
  type _To = GulpCheerio
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: GulpCheerio = ^
}
