package typings.i18n

import typings.i18n.i18n.GlobalCatalog
import typings.i18n.i18n.HashedList
import typings.i18n.i18n.TranslateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<i18n.i18nAPI> */
  @js.native
  trait Partiali18nAPI extends StObject {
    
    var __ : js.UndefOr[
        js.Function2[/* phraseOrOptions */ String | TranslateOptions, /* repeated */ String, String]
      ] = js.native
    
    var __h: js.UndefOr[js.Function1[/* phrase */ String, js.Array[HashedList]]] = js.native
    
    var __l: js.UndefOr[js.Function1[/* phrase */ String, js.Array[String]]] = js.native
    
    var __mf: js.UndefOr[
        js.Function2[/* phraseOrOptions */ String | TranslateOptions, /* repeated */ js.Any, String]
      ] = js.native
    
    var __n: js.UndefOr[js.Function2[/* phrase */ String, /* count */ Double, String]] = js.native
    
    var getCatalog: js.UndefOr[js.Function0[GlobalCatalog]] = js.native
    
    var getLocale: js.UndefOr[js.Function0[String]] = js.native
    
    var locale: js.UndefOr[String] = js.native
    
    var setLocale: js.UndefOr[js.Function1[/* locale */ String, Unit]] = js.native
  }
  object Partiali18nAPI {
    
    @scala.inline
    def apply(): Partiali18nAPI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Partiali18nAPI]
    }
    
    @scala.inline
    implicit class Partiali18nAPIMutableBuilder[Self <: Partiali18nAPI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetCatalog(value: () => GlobalCatalog): Self = StObject.set(x, "getCatalog", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCatalogUndefined: Self = StObject.set(x, "getCatalog", js.undefined)
      
      @scala.inline
      def setGetLocale(value: () => String): Self = StObject.set(x, "getLocale", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLocaleUndefined: Self = StObject.set(x, "getLocale", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setSetLocale(value: /* locale */ String => Unit): Self = StObject.set(x, "setLocale", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetLocaleUndefined: Self = StObject.set(x, "setLocale", js.undefined)
      
      @scala.inline
      def set__(value: (/* phraseOrOptions */ String | TranslateOptions, /* repeated */ String) => String): Self = StObject.set(x, "__", js.Any.fromFunction2(value))
      
      @scala.inline
      def set__Undefined: Self = StObject.set(x, "__", js.undefined)
      
      @scala.inline
      def set__h(value: /* phrase */ String => js.Array[HashedList]): Self = StObject.set(x, "__h", js.Any.fromFunction1(value))
      
      @scala.inline
      def set__hUndefined: Self = StObject.set(x, "__h", js.undefined)
      
      @scala.inline
      def set__l(value: /* phrase */ String => js.Array[String]): Self = StObject.set(x, "__l", js.Any.fromFunction1(value))
      
      @scala.inline
      def set__lUndefined: Self = StObject.set(x, "__l", js.undefined)
      
      @scala.inline
      def set__mf(value: (/* phraseOrOptions */ String | TranslateOptions, /* repeated */ js.Any) => String): Self = StObject.set(x, "__mf", js.Any.fromFunction2(value))
      
      @scala.inline
      def set__mfUndefined: Self = StObject.set(x, "__mf", js.undefined)
      
      @scala.inline
      def set__n(value: (/* phrase */ String, /* count */ Double) => String): Self = StObject.set(x, "__n", js.Any.fromFunction2(value))
      
      @scala.inline
      def set__nUndefined: Self = StObject.set(x, "__n", js.undefined)
    }
  }
}
