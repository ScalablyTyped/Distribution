package typings
package i18nextDashBrowserDashLanguagedetectorLib.i18nextDashBrowserDashLanguagedetectorMod.I18nextBrowserLanguageDetectorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectorOptions extends js.Object {
  /**
    * cache user language on
    */
  var caches: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var cookieDomain: js.UndefOr[java.lang.String] = js.undefined
  /**
    * optional expire and domain for set cookie
    * @default 10
    */
  var cookieMinutes: js.UndefOr[scala.Double] = js.undefined
  /**
    * languages to not persist (cookie, localStorage)
    */
  var excludeCacheFor: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * optional htmlTag with lang attribute
    * @default document.documentElement
    */
  var htmlTag: js.UndefOr[stdLib.HTMLElement | scala.Null] = js.undefined
  var lookupCookie: js.UndefOr[java.lang.String] = js.undefined
  var lookupLocalStorage: js.UndefOr[java.lang.String] = js.undefined
  /**
    * keys or params to lookup language from
    */
  var lookupQuerystring: js.UndefOr[java.lang.String] = js.undefined
  /**
    * order and from where user language should be detected
    */
  var order: js.UndefOr[
    js.Array[
      i18nextDashBrowserDashLanguagedetectorLib.i18nextDashBrowserDashLanguagedetectorLibStrings.querystring | i18nextDashBrowserDashLanguagedetectorLib.i18nextDashBrowserDashLanguagedetectorLibStrings.cookie | i18nextDashBrowserDashLanguagedetectorLib.i18nextDashBrowserDashLanguagedetectorLibStrings.localStorage | i18nextDashBrowserDashLanguagedetectorLib.i18nextDashBrowserDashLanguagedetectorLibStrings.navigator | i18nextDashBrowserDashLanguagedetectorLib.i18nextDashBrowserDashLanguagedetectorLibStrings.htmlTag | java.lang.String
    ]
  ] = js.undefined
}

