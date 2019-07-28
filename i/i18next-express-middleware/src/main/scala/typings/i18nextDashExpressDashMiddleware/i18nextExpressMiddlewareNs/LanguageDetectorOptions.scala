package typings.i18nextDashExpressDashMiddleware.i18nextExpressMiddlewareNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @summary Interface for Language detector options.
  * @interface
  */
trait LanguageDetectorOptions extends js.Object {
  var caches: js.UndefOr[js.Array[String] | Boolean] = js.undefined
  var cookieDomain: js.UndefOr[String] = js.undefined
  var cookieExpirationDate: js.UndefOr[Date] = js.undefined
  var lookupCookie: js.UndefOr[String] = js.undefined
  var lookupFromPathIndex: js.UndefOr[Double] = js.undefined
  var lookupQuerystring: js.UndefOr[String] = js.undefined
  var lookupSession: js.UndefOr[String] = js.undefined
  var order: js.UndefOr[js.Array[String]] = js.undefined
}

object LanguageDetectorOptions {
  @scala.inline
  def apply(
    caches: js.Array[String] | Boolean = null,
    cookieDomain: String = null,
    cookieExpirationDate: Date = null,
    lookupCookie: String = null,
    lookupFromPathIndex: Int | Double = null,
    lookupQuerystring: String = null,
    lookupSession: String = null,
    order: js.Array[String] = null
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

