package typings.jsdom.mod

import typings.jsdom.jsdomStrings.`outside-only`
import typings.jsdom.jsdomStrings.dangerously
import typings.jsdom.jsdomStrings.usable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOptions extends js.Object {
  var beforeParse: js.UndefOr[js.Function1[/* window */ DOMWindow, Unit]] = js.undefined
  var cookieJar: js.UndefOr[CookieJar] = js.undefined
  /**
  		 * includeNodeLocations preserves the location info produced by the HTML parser,
  		 * allowing you to retrieve it with the nodeLocation() method (described below).
  		 * It defaults to false to give the best performance,
  		 * and cannot be used with an XML content type since our XML parser does not support location info.
  		 */
  var includeNodeLocations: js.UndefOr[Boolean] = js.undefined
  /**
  		 * jsdom does not have the capability to render visual content, and will act like a headless browser by default.
  		 * It provides hints to web pages through APIs such as document.hidden that their content is not visible.
  		 *
  		 * When the pretendToBeVisual option is set to true, jsdom will pretend that it is rendering and displaying
  		 * content.
  		 */
  var pretendToBeVisual: js.UndefOr[Boolean] = js.undefined
  /**
  		 * referrer just affects the value read from document.referrer.
  		 * It defaults to no referrer (which reflects as the empty string).
  		 */
  var referrer: js.UndefOr[String] = js.undefined
  var resources: js.UndefOr[usable | ResourceLoader] = js.undefined
  var runScripts: js.UndefOr[dangerously | `outside-only`] = js.undefined
  /**
  		 * userAgent affects the value read from navigator.userAgent, as well as the User-Agent header sent while fetching subresources.
  		 * It defaults to `Mozilla/5.0 (${process.platform}) AppleWebKit/537.36 (KHTML, like Gecko) jsdom/${jsdomVersion}`.
  		 */
  var userAgent: js.UndefOr[String] = js.undefined
  var virtualConsole: js.UndefOr[VirtualConsole] = js.undefined
}

object BaseOptions {
  @scala.inline
  def apply(
    beforeParse: /* window */ DOMWindow => Unit = null,
    cookieJar: CookieJar = null,
    includeNodeLocations: js.UndefOr[Boolean] = js.undefined,
    pretendToBeVisual: js.UndefOr[Boolean] = js.undefined,
    referrer: String = null,
    resources: usable | ResourceLoader = null,
    runScripts: dangerously | `outside-only` = null,
    userAgent: String = null,
    virtualConsole: VirtualConsole = null
  ): BaseOptions = {
    val __obj = js.Dynamic.literal()
    if (beforeParse != null) __obj.updateDynamic("beforeParse")(js.Any.fromFunction1(beforeParse))
    if (cookieJar != null) __obj.updateDynamic("cookieJar")(cookieJar.asInstanceOf[js.Any])
    if (!js.isUndefined(includeNodeLocations)) __obj.updateDynamic("includeNodeLocations")(includeNodeLocations.asInstanceOf[js.Any])
    if (!js.isUndefined(pretendToBeVisual)) __obj.updateDynamic("pretendToBeVisual")(pretendToBeVisual.asInstanceOf[js.Any])
    if (referrer != null) __obj.updateDynamic("referrer")(referrer.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (runScripts != null) __obj.updateDynamic("runScripts")(runScripts.asInstanceOf[js.Any])
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent.asInstanceOf[js.Any])
    if (virtualConsole != null) __obj.updateDynamic("virtualConsole")(virtualConsole.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseOptions]
  }
}

