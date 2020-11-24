package typings.i18nextBrowserLanguagedetector.mod

import typings.i18nextBrowserLanguagedetector.i18nextBrowserLanguagedetectorStrings.cookie
import typings.i18nextBrowserLanguagedetector.i18nextBrowserLanguagedetectorStrings.htmlTag
import typings.i18nextBrowserLanguagedetector.i18nextBrowserLanguagedetectorStrings.localStorage
import typings.i18nextBrowserLanguagedetector.i18nextBrowserLanguagedetectorStrings.navigator
import typings.i18nextBrowserLanguagedetector.i18nextBrowserLanguagedetectorStrings.querystring
import typings.i18nextBrowserLanguagedetector.i18nextBrowserLanguagedetectorStrings.sessionStorage
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectorOptions extends js.Object {
  
  /**
    * cache user language on
    */
  var caches: js.UndefOr[js.Array[String]] = js.native
  
  var cookieDomain: js.UndefOr[String] = js.native
  
  /**
    * optional expire and domain for set cookie
    * @default 10
    */
  var cookieMinutes: js.UndefOr[Double] = js.native
  
  /**
    * languages to not persist (cookie, localStorage)
    */
  var excludeCacheFor: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * optional htmlTag with lang attribute
    * @default document.documentElement
    */
  var htmlTag: js.UndefOr[HTMLElement | Null] = js.native
  
  var lookupCookie: js.UndefOr[String] = js.native
  
  var lookupFromPathIndex: js.UndefOr[Double] = js.native
  
  var lookupFromSubdomainIndex: js.UndefOr[Double] = js.native
  
  var lookupLocalStorage: js.UndefOr[String] = js.native
  
  /**
    * keys or params to lookup language from
    */
  var lookupQuerystring: js.UndefOr[String] = js.native
  
  var lookupSessionStorage: js.UndefOr[String] = js.native
  
  /**
    * order and from where user language should be detected
    */
  var order: js.UndefOr[
    js.Array[
      querystring | cookie | sessionStorage | localStorage | navigator | htmlTag | String
    ]
  ] = js.native
}
object DetectorOptions {
  
  @scala.inline
  def apply(): DetectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectorOptions]
  }
  
  @scala.inline
  implicit class DetectorOptionsOps[Self <: DetectorOptions] (val x: Self) extends AnyVal {
    
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
    def setCachesVarargs(value: String*): Self = this.set("caches", js.Array(value :_*))
    
    @scala.inline
    def setCaches(value: js.Array[String]): Self = this.set("caches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaches: Self = this.set("caches", js.undefined)
    
    @scala.inline
    def setCookieDomain(value: String): Self = this.set("cookieDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookieDomain: Self = this.set("cookieDomain", js.undefined)
    
    @scala.inline
    def setCookieMinutes(value: Double): Self = this.set("cookieMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookieMinutes: Self = this.set("cookieMinutes", js.undefined)
    
    @scala.inline
    def setExcludeCacheForVarargs(value: String*): Self = this.set("excludeCacheFor", js.Array(value :_*))
    
    @scala.inline
    def setExcludeCacheFor(value: js.Array[String]): Self = this.set("excludeCacheFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeCacheFor: Self = this.set("excludeCacheFor", js.undefined)
    
    @scala.inline
    def setHtmlTag(value: HTMLElement): Self = this.set("htmlTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlTag: Self = this.set("htmlTag", js.undefined)
    
    @scala.inline
    def setHtmlTagNull: Self = this.set("htmlTag", null)
    
    @scala.inline
    def setLookupCookie(value: String): Self = this.set("lookupCookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLookupCookie: Self = this.set("lookupCookie", js.undefined)
    
    @scala.inline
    def setLookupFromPathIndex(value: Double): Self = this.set("lookupFromPathIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLookupFromPathIndex: Self = this.set("lookupFromPathIndex", js.undefined)
    
    @scala.inline
    def setLookupFromSubdomainIndex(value: Double): Self = this.set("lookupFromSubdomainIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLookupFromSubdomainIndex: Self = this.set("lookupFromSubdomainIndex", js.undefined)
    
    @scala.inline
    def setLookupLocalStorage(value: String): Self = this.set("lookupLocalStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLookupLocalStorage: Self = this.set("lookupLocalStorage", js.undefined)
    
    @scala.inline
    def setLookupQuerystring(value: String): Self = this.set("lookupQuerystring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLookupQuerystring: Self = this.set("lookupQuerystring", js.undefined)
    
    @scala.inline
    def setLookupSessionStorage(value: String): Self = this.set("lookupSessionStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLookupSessionStorage: Self = this.set("lookupSessionStorage", js.undefined)
    
    @scala.inline
    def setOrderVarargs(value: (querystring | cookie | sessionStorage | localStorage | navigator | htmlTag | String)*): Self = this.set("order", js.Array(value :_*))
    
    @scala.inline
    def setOrder(
      value: js.Array[
          querystring | cookie | sessionStorage | localStorage | navigator | htmlTag | String
        ]
    ): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
  }
}
