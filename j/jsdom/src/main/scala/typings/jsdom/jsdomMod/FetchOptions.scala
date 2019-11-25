package typings.jsdom.jsdomMod

import typings.std.HTMLIFrameElement
import typings.std.HTMLImageElement
import typings.std.HTMLLinkElement
import typings.std.HTMLScriptElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchOptions extends js.Object {
  var accept: js.UndefOr[String] = js.undefined
  var cookieJar: js.UndefOr[CookieJar] = js.undefined
  var element: js.UndefOr[HTMLScriptElement | HTMLLinkElement | HTMLIFrameElement | HTMLImageElement] = js.undefined
  var referrer: js.UndefOr[String] = js.undefined
}

object FetchOptions {
  @scala.inline
  def apply(
    accept: String = null,
    cookieJar: CookieJar = null,
    element: HTMLScriptElement | HTMLLinkElement | HTMLIFrameElement | HTMLImageElement = null,
    referrer: String = null
  ): FetchOptions = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (cookieJar != null) __obj.updateDynamic("cookieJar")(cookieJar.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (referrer != null) __obj.updateDynamic("referrer")(referrer.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchOptions]
  }
}

