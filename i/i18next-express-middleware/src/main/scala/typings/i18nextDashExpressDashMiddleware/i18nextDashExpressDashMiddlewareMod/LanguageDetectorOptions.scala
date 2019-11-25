package typings.i18nextDashExpressDashMiddleware.i18nextDashExpressDashMiddlewareMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageDetectorOptions extends js.Object {
  var caches: js.UndefOr[LanguageDetectorCaches] = js.undefined
  var cookieDomain: js.UndefOr[String] = js.undefined
  var cookieExpirationDate: js.UndefOr[Date] = js.undefined
  var lookupCookie: js.UndefOr[String] = js.undefined
  var lookupFromPathIndex: js.UndefOr[Double] = js.undefined
  var lookupQuerystring: js.UndefOr[String] = js.undefined
  var lookupSession: js.UndefOr[String] = js.undefined
  var order: js.UndefOr[LanguageDetectorOrder] = js.undefined
}

object LanguageDetectorOptions {
  @scala.inline
  def apply(
    caches: LanguageDetectorCaches = null,
    cookieDomain: String = null,
    cookieExpirationDate: Date = null,
    lookupCookie: String = null,
    lookupFromPathIndex: Int | Double = null,
    lookupQuerystring: String = null,
    lookupSession: String = null,
    order: LanguageDetectorOrder = null
  ): LanguageDetectorOptions = {
    val __obj = js.Dynamic.literal()
    if (caches != null) __obj.updateDynamic("caches")(caches.asInstanceOf[js.Any])
    if (cookieDomain != null) __obj.updateDynamic("cookieDomain")(cookieDomain.asInstanceOf[js.Any])
    if (cookieExpirationDate != null) __obj.updateDynamic("cookieExpirationDate")(cookieExpirationDate.asInstanceOf[js.Any])
    if (lookupCookie != null) __obj.updateDynamic("lookupCookie")(lookupCookie.asInstanceOf[js.Any])
    if (lookupFromPathIndex != null) __obj.updateDynamic("lookupFromPathIndex")(lookupFromPathIndex.asInstanceOf[js.Any])
    if (lookupQuerystring != null) __obj.updateDynamic("lookupQuerystring")(lookupQuerystring.asInstanceOf[js.Any])
    if (lookupSession != null) __obj.updateDynamic("lookupSession")(lookupSession.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageDetectorOptions]
  }
}

