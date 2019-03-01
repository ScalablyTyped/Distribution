package typings
package i18nextDashExpressDashMiddlewareLib.i18nextExpressMiddlewareNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @summary Interface for Language detector options.
  * @interface
  */
trait LanguageDetectorOptions extends js.Object {
  var caches: js.UndefOr[js.Array[java.lang.String] | scala.Boolean] = js.undefined
  var cookieDomain: js.UndefOr[java.lang.String] = js.undefined
  var cookieExpirationDate: js.UndefOr[stdLib.Date] = js.undefined
  var lookupCookie: js.UndefOr[java.lang.String] = js.undefined
  var lookupFromPathIndex: js.UndefOr[scala.Double] = js.undefined
  var lookupQuerystring: js.UndefOr[java.lang.String] = js.undefined
  var lookupSession: js.UndefOr[java.lang.String] = js.undefined
  var order: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object LanguageDetectorOptions {
  @scala.inline
  def apply(
    caches: js.Array[java.lang.String] | scala.Boolean = null,
    cookieDomain: java.lang.String = null,
    cookieExpirationDate: stdLib.Date = null,
    lookupCookie: java.lang.String = null,
    lookupFromPathIndex: scala.Int | scala.Double = null,
    lookupQuerystring: java.lang.String = null,
    lookupSession: java.lang.String = null,
    order: js.Array[java.lang.String] = null
  ): LanguageDetectorOptions = {
    val __obj = js.Dynamic.literal()
    if (caches != null) __obj.updateDynamic("caches")(caches.asInstanceOf[js.Any])
    if (cookieDomain != null) __obj.updateDynamic("cookieDomain")(cookieDomain)
    if (cookieExpirationDate != null) __obj.updateDynamic("cookieExpirationDate")(cookieExpirationDate)
    if (lookupCookie != null) __obj.updateDynamic("lookupCookie")(lookupCookie)
    if (lookupFromPathIndex != null) __obj.updateDynamic("lookupFromPathIndex")(lookupFromPathIndex.asInstanceOf[js.Any])
    if (lookupQuerystring != null) __obj.updateDynamic("lookupQuerystring")(lookupQuerystring)
    if (lookupSession != null) __obj.updateDynamic("lookupSession")(lookupSession)
    if (order != null) __obj.updateDynamic("order")(order)
    __obj.asInstanceOf[LanguageDetectorOptions]
  }
}

