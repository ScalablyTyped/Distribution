package typings.i18n.anon

import typings.i18n.i18n.GlobalCatalog
import typings.i18n.i18n.HashedList
import typings.i18n.i18n.TranslateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<i18n.i18nAPI> */
@js.native
trait Partiali18nAPI extends js.Object {
  
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
  implicit class Partiali18nAPIOps[Self <: Partiali18nAPI] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set__(value: (/* phraseOrOptions */ String | TranslateOptions, /* repeated */ String) => String): Self = this.set("__", js.Any.fromFunction2(value))
    
    @scala.inline
    def delete__ : Self = this.set("__", js.undefined)
    
    @scala.inline
    def set__h(value: /* phrase */ String => js.Array[HashedList]): Self = this.set("__h", js.Any.fromFunction1(value))
    
    @scala.inline
    def delete__h: Self = this.set("__h", js.undefined)
    
    @scala.inline
    def set__l(value: /* phrase */ String => js.Array[String]): Self = this.set("__l", js.Any.fromFunction1(value))
    
    @scala.inline
    def delete__l: Self = this.set("__l", js.undefined)
    
    @scala.inline
    def set__mf(value: (/* phraseOrOptions */ String | TranslateOptions, /* repeated */ js.Any) => String): Self = this.set("__mf", js.Any.fromFunction2(value))
    
    @scala.inline
    def delete__mf: Self = this.set("__mf", js.undefined)
    
    @scala.inline
    def set__n(value: (/* phrase */ String, /* count */ Double) => String): Self = this.set("__n", js.Any.fromFunction2(value))
    
    @scala.inline
    def delete__n: Self = this.set("__n", js.undefined)
    
    @scala.inline
    def setGetCatalog(value: () => GlobalCatalog): Self = this.set("getCatalog", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetCatalog: Self = this.set("getCatalog", js.undefined)
    
    @scala.inline
    def setGetLocale(value: () => String): Self = this.set("getLocale", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetLocale: Self = this.set("getLocale", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setSetLocale(value: /* locale */ String => Unit): Self = this.set("setLocale", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetLocale: Self = this.set("setLocale", js.undefined)
  }
}
