package typings.jquerySlugify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Inlined std.Partial<{preSlug (source : string): string, postSlug (source : string): string, slugFunc (input : string, options : jquery-slugify.jquery-slugify.Options): string,   separator :string,   lang :string | boolean,   symbols :boolean,   maintainCase :boolean,   titleCase :std.Array<string> | boolean,   truncate :number,   uric :boolean,   uricNoSlash :boolean,   mark :boolean,   custom :std.Array<string>}> */
  @js.native
  trait Options extends StObject {
    
    var custom: js.UndefOr[js.Array[String]] = js.native
    
    var lang: js.UndefOr[String | Boolean] = js.native
    
    var maintainCase: js.UndefOr[Boolean] = js.native
    
    var mark: js.UndefOr[Boolean] = js.native
    
    var postSlug: js.UndefOr[js.Function1[/* source */ String, String]] = js.native
    
    var preSlug: js.UndefOr[js.Function1[/* source */ String, String]] = js.native
    
    var separator: js.UndefOr[String] = js.native
    
    var slugFunc: js.UndefOr[js.Function2[/* input */ String, /* options */ this.type, String]] = js.native
    
    var symbols: js.UndefOr[Boolean] = js.native
    
    var titleCase: js.UndefOr[js.Array[String] | Boolean] = js.native
    
    var truncate: js.UndefOr[Double] = js.native
    
    var uric: js.UndefOr[Boolean] = js.native
    
    var uricNoSlash: js.UndefOr[Boolean] = js.native
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
      def setCustom(value: js.Array[String]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      @scala.inline
      def setCustomVarargs(value: String*): Self = StObject.set(x, "custom", js.Array(value :_*))
      
      @scala.inline
      def setLang(value: String | Boolean): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setMaintainCase(value: Boolean): Self = StObject.set(x, "maintainCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaintainCaseUndefined: Self = StObject.set(x, "maintainCase", js.undefined)
      
      @scala.inline
      def setMark(value: Boolean): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
      
      @scala.inline
      def setPostSlug(value: /* source */ String => String): Self = StObject.set(x, "postSlug", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPostSlugUndefined: Self = StObject.set(x, "postSlug", js.undefined)
      
      @scala.inline
      def setPreSlug(value: /* source */ String => String): Self = StObject.set(x, "preSlug", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPreSlugUndefined: Self = StObject.set(x, "preSlug", js.undefined)
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setSlugFunc(value: (/* input */ String, Options) => String): Self = StObject.set(x, "slugFunc", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSlugFuncUndefined: Self = StObject.set(x, "slugFunc", js.undefined)
      
      @scala.inline
      def setSymbols(value: Boolean): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
      
      @scala.inline
      def setTitleCase(value: js.Array[String] | Boolean): Self = StObject.set(x, "titleCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleCaseUndefined: Self = StObject.set(x, "titleCase", js.undefined)
      
      @scala.inline
      def setTitleCaseVarargs(value: String*): Self = StObject.set(x, "titleCase", js.Array(value :_*))
      
      @scala.inline
      def setTruncate(value: Double): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
      
      @scala.inline
      def setUric(value: Boolean): Self = StObject.set(x, "uric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUricNoSlash(value: Boolean): Self = StObject.set(x, "uricNoSlash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUricNoSlashUndefined: Self = StObject.set(x, "uricNoSlash", js.undefined)
      
      @scala.inline
      def setUricUndefined: Self = StObject.set(x, "uric", js.undefined)
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
