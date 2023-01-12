package typings.jquerySlugify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Inlined std.Partial<{preSlug (source : string): string, postSlug (source : string): string, slugFunc (input : string, options : jquery-slugify.jquery-slugify.Options): string,   separator :string,   lang :string | boolean,   symbols :boolean,   maintainCase :boolean,   titleCase :std.Array<string> | boolean,   truncate :number,   uric :boolean,   uricNoSlash :boolean,   mark :boolean,   custom :std.Array<string>}> */
  trait Options extends StObject {
    
    var custom: js.UndefOr[js.Array[String]] = js.undefined
    
    var lang: js.UndefOr[String | Boolean] = js.undefined
    
    var maintainCase: js.UndefOr[Boolean] = js.undefined
    
    var mark: js.UndefOr[Boolean] = js.undefined
    
    var postSlug: js.UndefOr[js.Function1[/* source */ String, String]] = js.undefined
    
    var preSlug: js.UndefOr[js.Function1[/* source */ String, String]] = js.undefined
    
    var separator: js.UndefOr[String] = js.undefined
    
    var slugFunc: js.UndefOr[js.Function2[/* input */ String, /* options */ this.type, String]] = js.undefined
    
    var symbols: js.UndefOr[Boolean] = js.undefined
    
    var titleCase: js.UndefOr[js.Array[String] | Boolean] = js.undefined
    
    var truncate: js.UndefOr[Double] = js.undefined
    
    var uric: js.UndefOr[Boolean] = js.undefined
    
    var uricNoSlash: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCustom(value: js.Array[String]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      inline def setCustomVarargs(value: String*): Self = StObject.set(x, "custom", js.Array(value*))
      
      inline def setLang(value: String | Boolean): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setMaintainCase(value: Boolean): Self = StObject.set(x, "maintainCase", value.asInstanceOf[js.Any])
      
      inline def setMaintainCaseUndefined: Self = StObject.set(x, "maintainCase", js.undefined)
      
      inline def setMark(value: Boolean): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      inline def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
      
      inline def setPostSlug(value: /* source */ String => String): Self = StObject.set(x, "postSlug", js.Any.fromFunction1(value))
      
      inline def setPostSlugUndefined: Self = StObject.set(x, "postSlug", js.undefined)
      
      inline def setPreSlug(value: /* source */ String => String): Self = StObject.set(x, "preSlug", js.Any.fromFunction1(value))
      
      inline def setPreSlugUndefined: Self = StObject.set(x, "preSlug", js.undefined)
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setSlugFunc(value: (/* input */ String, Options) => String): Self = StObject.set(x, "slugFunc", js.Any.fromFunction2(value))
      
      inline def setSlugFuncUndefined: Self = StObject.set(x, "slugFunc", js.undefined)
      
      inline def setSymbols(value: Boolean): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
      
      inline def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
      
      inline def setTitleCase(value: js.Array[String] | Boolean): Self = StObject.set(x, "titleCase", value.asInstanceOf[js.Any])
      
      inline def setTitleCaseUndefined: Self = StObject.set(x, "titleCase", js.undefined)
      
      inline def setTitleCaseVarargs(value: String*): Self = StObject.set(x, "titleCase", js.Array(value*))
      
      inline def setTruncate(value: Double): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
      
      inline def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
      
      inline def setUric(value: Boolean): Self = StObject.set(x, "uric", value.asInstanceOf[js.Any])
      
      inline def setUricNoSlash(value: Boolean): Self = StObject.set(x, "uricNoSlash", value.asInstanceOf[js.Any])
      
      inline def setUricNoSlashUndefined: Self = StObject.set(x, "uricNoSlash", js.undefined)
      
      inline def setUricUndefined: Self = StObject.set(x, "uric", js.undefined)
    }
  }
  
  object global {
    
    @js.native
    trait JQuery extends StObject {
      
      def slugify(source: String): JQuery = js.native
      def slugify(source: String, options: Options): JQuery = js.native
    }
    
    @js.native
    trait JQueryStatic extends StObject {
      
      def slugify(source: String): String = js.native
      def slugify(source: String, options: Options): String = js.native
    }
  }
}
