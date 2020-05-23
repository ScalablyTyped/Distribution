package typings.i18nextBrowserLanguagedetector.mod

import typings.i18nextBrowserLanguagedetector.i18nextBrowserLanguagedetectorStrings.cookie
import typings.i18nextBrowserLanguagedetector.i18nextBrowserLanguagedetectorStrings.htmlTag
import typings.i18nextBrowserLanguagedetector.i18nextBrowserLanguagedetectorStrings.localStorage
import typings.i18nextBrowserLanguagedetector.i18nextBrowserLanguagedetectorStrings.navigator
import typings.i18nextBrowserLanguagedetector.i18nextBrowserLanguagedetectorStrings.querystring
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
    cookieMinutes: js.UndefOr[Double] = js.undefined,
    excludeCacheFor: js.Array[String] = null,
    htmlTag: js.UndefOr[Null | HTMLElement] = js.undefined,
    lookupCookie: String = null,
    lookupLocalStorage: String = null,
    lookupQuerystring: String = null,
    order: js.Array[querystring | cookie | localStorage | navigator | htmlTag | String] = null
  ): DetectorOptions = {
    val __obj = js.Dynamic.literal()
    if (caches != null) __obj.updateDynamic("caches")(caches.asInstanceOf[js.Any])
    if (cookieDomain != null) __obj.updateDynamic("cookieDomain")(cookieDomain.asInstanceOf[js.Any])
    if (!js.isUndefined(cookieMinutes)) __obj.updateDynamic("cookieMinutes")(cookieMinutes.get.asInstanceOf[js.Any])
    if (excludeCacheFor != null) __obj.updateDynamic("excludeCacheFor")(excludeCacheFor.asInstanceOf[js.Any])
    if (!js.isUndefined(htmlTag)) __obj.updateDynamic("htmlTag")(htmlTag.asInstanceOf[js.Any])
    if (lookupCookie != null) __obj.updateDynamic("lookupCookie")(lookupCookie.asInstanceOf[js.Any])
    if (lookupLocalStorage != null) __obj.updateDynamic("lookupLocalStorage")(lookupLocalStorage.asInstanceOf[js.Any])
    if (lookupQuerystring != null) __obj.updateDynamic("lookupQuerystring")(lookupQuerystring.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectorOptions]
  }
}

