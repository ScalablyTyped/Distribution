package typings
package jsdomLib.jsdomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchOptions extends js.Object {
  var accept: js.UndefOr[java.lang.String] = js.undefined
  var cookieJar: js.UndefOr[CookieJar] = js.undefined
  var element: js.UndefOr[
    stdLib.HTMLScriptElement | stdLib.HTMLLinkElement | stdLib.HTMLIFrameElement | stdLib.HTMLImageElement
  ] = js.undefined
  var referrer: js.UndefOr[java.lang.String] = js.undefined
}

object FetchOptions {
  @scala.inline
  def apply(
    accept: java.lang.String = null,
    cookieJar: CookieJar = null,
    element: stdLib.HTMLScriptElement | stdLib.HTMLLinkElement | stdLib.HTMLIFrameElement | stdLib.HTMLImageElement = null,
    referrer: java.lang.String = null
  ): FetchOptions = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(accept)
    if (cookieJar != null) __obj.updateDynamic("cookieJar")(cookieJar)
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (referrer != null) __obj.updateDynamic("referrer")(referrer)
    __obj.asInstanceOf[FetchOptions]
  }
}

