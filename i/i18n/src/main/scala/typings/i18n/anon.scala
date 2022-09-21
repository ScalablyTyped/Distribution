package typings.i18n

import typings.i18n.i18n.GlobalCatalog
import typings.i18n.i18n.HashedList
import typings.i18n.i18n.TranslateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Disable extends StObject {
    
    /**
      * @default false
      */
    var disable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default ['{{', '}}']
      */
    var tags: js.UndefOr[js.Tuple2[String, String]] = js.undefined
  }
  object Disable {
    
    inline def apply(): Disable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Disable]
    }
    
    extension [Self <: Disable](x: Self) {
      
      inline def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      inline def setTags(value: js.Tuple2[String, String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  /* Inlined std.Partial<i18n.i18nAPI> */
  trait Partiali18nAPI extends StObject {
    
    var __ : js.UndefOr[
        js.Function2[/* phraseOrOptions */ String | TranslateOptions, /* repeated */ String, String]
      ] = js.undefined
    
    var __h: js.UndefOr[js.Function1[/* phrase */ String, js.Array[HashedList]]] = js.undefined
    
    var __l: js.UndefOr[js.Function1[/* phrase */ String, js.Array[String]]] = js.undefined
    
    var __mf: js.UndefOr[
        js.Function2[/* phraseOrOptions */ String | TranslateOptions, /* repeated */ Any, String]
      ] = js.undefined
    
    var __n: js.UndefOr[js.Function2[/* phrase */ String, /* count */ Double, String]] = js.undefined
    
    var getCatalog: js.UndefOr[js.Function0[GlobalCatalog]] = js.undefined
    
    var getLocale: js.UndefOr[js.Function0[String]] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var setLocale: js.UndefOr[js.Function1[/* locale */ String, Unit]] = js.undefined
  }
  object Partiali18nAPI {
    
    inline def apply(): Partiali18nAPI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Partiali18nAPI]
    }
    
    extension [Self <: Partiali18nAPI](x: Self) {
      
      inline def setGetCatalog(value: () => GlobalCatalog): Self = StObject.set(x, "getCatalog", js.Any.fromFunction0(value))
      
      inline def setGetCatalogUndefined: Self = StObject.set(x, "getCatalog", js.undefined)
      
      inline def setGetLocale(value: () => String): Self = StObject.set(x, "getLocale", js.Any.fromFunction0(value))
      
      inline def setGetLocaleUndefined: Self = StObject.set(x, "getLocale", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setSetLocale(value: /* locale */ String => Unit): Self = StObject.set(x, "setLocale", js.Any.fromFunction1(value))
      
      inline def setSetLocaleUndefined: Self = StObject.set(x, "setLocale", js.undefined)
      
      inline def set__(value: (/* phraseOrOptions */ String | TranslateOptions, /* repeated */ String) => String): Self = StObject.set(x, "__", js.Any.fromFunction2(value))
      
      inline def set__Undefined: Self = StObject.set(x, "__", js.undefined)
      
      inline def set__h(value: /* phrase */ String => js.Array[HashedList]): Self = StObject.set(x, "__h", js.Any.fromFunction1(value))
      
      inline def set__hUndefined: Self = StObject.set(x, "__h", js.undefined)
      
      inline def set__l(value: /* phrase */ String => js.Array[String]): Self = StObject.set(x, "__l", js.Any.fromFunction1(value))
      
      inline def set__lUndefined: Self = StObject.set(x, "__l", js.undefined)
      
      inline def set__mf(value: (/* phraseOrOptions */ String | TranslateOptions, /* repeated */ Any) => String): Self = StObject.set(x, "__mf", js.Any.fromFunction2(value))
      
      inline def set__mfUndefined: Self = StObject.set(x, "__mf", js.undefined)
      
      inline def set__n(value: (/* phrase */ String, /* count */ Double) => String): Self = StObject.set(x, "__n", js.Any.fromFunction2(value))
      
      inline def set__nUndefined: Self = StObject.set(x, "__n", js.undefined)
    }
  }
}
