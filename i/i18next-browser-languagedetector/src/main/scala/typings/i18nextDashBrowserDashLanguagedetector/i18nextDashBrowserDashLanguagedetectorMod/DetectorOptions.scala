package typings.i18nextDashBrowserDashLanguagedetector.i18nextDashBrowserDashLanguagedetectorMod

import typings.i18nextDashBrowserDashLanguagedetector.i18nextDashBrowserDashLanguagedetectorStrings.cookie
import typings.i18nextDashBrowserDashLanguagedetector.i18nextDashBrowserDashLanguagedetectorStrings.htmlTag
import typings.i18nextDashBrowserDashLanguagedetector.i18nextDashBrowserDashLanguagedetectorStrings.localStorage
import typings.i18nextDashBrowserDashLanguagedetector.i18nextDashBrowserDashLanguagedetectorStrings.navigator
import typings.i18nextDashBrowserDashLanguagedetector.i18nextDashBrowserDashLanguagedetectorStrings.querystring
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectorOptions extends js.Object {
  /**
    * cache user language on
    */
  var caches: js.UndefOr[js.Array[String]] = js.undefined
  var cookieDomain: js.UndefOr[String] = js.undefined
  /**
    * optional expire and domain for set cookie
    * @default 10
    */
  var cookieMinutes: js.UndefOr[Double] = js.undefined
  /**
    * languages to not persist (cookie, localStorage)
    */
  var excludeCacheFor: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * optional htmlTag with lang attribute
    * @default document.documentElement
    */
  var htmlTag: js.UndefOr[HTMLElement | Null] = js.undefined
  var lookupCookie: js.UndefOr[String] = js.undefined
  var lookupLocalStorage: js.UndefOr[String] = js.undefined
  /**
    * keys or params to lookup language from
    */
  var lookupQuerystring: js.UndefOr[String] = js.undefined
  /**
    * order and from where user language should be detected
    */
  var order: js.UndefOr[js.Array[querystring | cookie | localStorage | navigator | htmlTag | String]] = js.undefined
}

object DetectorOptions {
  @scala.inline
  def apply(
    caches: js.Array[String] = null,
    cookieDomain: String = null,
    cookieMinutes: Int | Double = null,
    excludeCacheFor: js.Array[String] = null,
    htmlTag: HTMLElement = null,
    lookupCookie: String = null,
    lookupLocalStorage: String = null,
    lookupQuerystring: String = null,
    order: js.Array[querystring | cookie | localStorage | navigator | htmlTag | String] = null
  ): DetectorOptions = {
    val __obj = js.Dynamic.literal()
    if (caches != null) __obj.updateDynamic("caches")(caches.asInstanceOf[js.Any])
    if (cookieDomain != null) __obj.updateDynamic("cookieDomain")(cookieDomain.asInstanceOf[js.Any])
    if (cookieMinutes != null) __obj.updateDynamic("cookieMinutes")(cookieMinutes.asInstanceOf[js.Any])
    if (excludeCacheFor != null) __obj.updateDynamic("excludeCacheFor")(excludeCacheFor.asInstanceOf[js.Any])
    if (htmlTag != null) __obj.updateDynamic("htmlTag")(htmlTag.asInstanceOf[js.Any])
    if (lookupCookie != null) __obj.updateDynamic("lookupCookie")(lookupCookie.asInstanceOf[js.Any])
    if (lookupLocalStorage != null) __obj.updateDynamic("lookupLocalStorage")(lookupLocalStorage.asInstanceOf[js.Any])
    if (lookupQuerystring != null) __obj.updateDynamic("lookupQuerystring")(lookupQuerystring.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectorOptions]
  }
}

