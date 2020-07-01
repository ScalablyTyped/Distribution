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
import scala.scalajs.js.annotation._

trait DetectorOptions extends js.Object {
  /**
    * cache user language on
    */
  var caches: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * fallback to a similar whitelist language
    * Example 1: Browser language is 'es'
    * if 'es' is not found in whitelist, first fallback to any whitelist language that starts with 'es-', then fallback to fallbackLng ('es' -> 'es-*' -> fallbackLng)
    * Example 2: Browser language is 'es-MX'
    * if 'es-MX' is not found in whitelist, first fallback to 'es', then fallback to 'es-*', then fallback to fallbackLng ('es-MX' -> 'es' -> 'es-*' -> fallbackLng)
    * @default false
    */
  var checkForSimilarInWhitelist: js.UndefOr[Boolean] = js.undefined
  /**
    * only detect languages that are in the whitelist
    * @default true
    */
  var checkWhitelist: js.UndefOr[Boolean] = js.undefined
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
  var lookupFromPathIndex: js.UndefOr[Double] = js.undefined
  var lookupFromSubdomainIndex: js.UndefOr[Double] = js.undefined
  var lookupLocalStorage: js.UndefOr[String] = js.undefined
  /**
    * keys or params to lookup language from
    */
  var lookupQuerystring: js.UndefOr[String] = js.undefined
  /**
    * order and from where user language should be detected
    */
  var order: js.UndefOr[
    js.Array[
      querystring | cookie | sessionStorage | localStorage | navigator | htmlTag | String
    ]
  ] = js.undefined
}

object DetectorOptions {
  @scala.inline
  def apply(
    caches: js.Array[String] = null,
    checkForSimilarInWhitelist: js.UndefOr[Boolean] = js.undefined,
    checkWhitelist: js.UndefOr[Boolean] = js.undefined,
    cookieDomain: String = null,
    cookieMinutes: js.UndefOr[Double] = js.undefined,
    excludeCacheFor: js.Array[String] = null,
    htmlTag: js.UndefOr[Null | HTMLElement] = js.undefined,
    lookupCookie: String = null,
    lookupFromPathIndex: js.UndefOr[Double] = js.undefined,
    lookupFromSubdomainIndex: js.UndefOr[Double] = js.undefined,
    lookupLocalStorage: String = null,
    lookupQuerystring: String = null,
    order: js.Array[
      querystring | cookie | sessionStorage | localStorage | navigator | htmlTag | String
    ] = null
  ): DetectorOptions = {
    val __obj = js.Dynamic.literal()
    if (caches != null) __obj.updateDynamic("caches")(caches.asInstanceOf[js.Any])
    if (!js.isUndefined(checkForSimilarInWhitelist)) __obj.updateDynamic("checkForSimilarInWhitelist")(checkForSimilarInWhitelist.get.asInstanceOf[js.Any])
    if (!js.isUndefined(checkWhitelist)) __obj.updateDynamic("checkWhitelist")(checkWhitelist.get.asInstanceOf[js.Any])
    if (cookieDomain != null) __obj.updateDynamic("cookieDomain")(cookieDomain.asInstanceOf[js.Any])
    if (!js.isUndefined(cookieMinutes)) __obj.updateDynamic("cookieMinutes")(cookieMinutes.get.asInstanceOf[js.Any])
    if (excludeCacheFor != null) __obj.updateDynamic("excludeCacheFor")(excludeCacheFor.asInstanceOf[js.Any])
    if (!js.isUndefined(htmlTag)) __obj.updateDynamic("htmlTag")(htmlTag.asInstanceOf[js.Any])
    if (lookupCookie != null) __obj.updateDynamic("lookupCookie")(lookupCookie.asInstanceOf[js.Any])
    if (!js.isUndefined(lookupFromPathIndex)) __obj.updateDynamic("lookupFromPathIndex")(lookupFromPathIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lookupFromSubdomainIndex)) __obj.updateDynamic("lookupFromSubdomainIndex")(lookupFromSubdomainIndex.get.asInstanceOf[js.Any])
    if (lookupLocalStorage != null) __obj.updateDynamic("lookupLocalStorage")(lookupLocalStorage.asInstanceOf[js.Any])
    if (lookupQuerystring != null) __obj.updateDynamic("lookupQuerystring")(lookupQuerystring.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectorOptions]
  }
}

