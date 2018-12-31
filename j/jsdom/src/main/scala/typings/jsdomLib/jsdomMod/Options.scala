package typings
package jsdomLib.jsdomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var beforeParse: js.UndefOr[js.Function1[/* window */ DOMWindow, scala.Unit]] = js.undefined
  var cookieJar: js.UndefOr[CookieJar] = js.undefined
  /**
    * includeNodeLocations preserves the location info produced by the HTML parser,
    * allowing you to retrieve it with the nodeLocation() method (described below).
    * It defaults to false to give the best performance,
    * and cannot be used with an XML content type since our XML parser does not support location info.
    */
  var includeNodeLocations: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * referrer just affects the value read from document.referrer.
    * It defaults to no referrer (which reflects as the empty string).
    */
  var referrer: js.UndefOr[java.lang.String] = js.undefined
  var resources: js.UndefOr[jsdomLib.jsdomLibStrings.usable | ResourceLoader] = js.undefined
  var runScripts: js.UndefOr[jsdomLib.jsdomLibStrings.dangerously | jsdomLib.jsdomLibStrings.`outside-only`] = js.undefined
  /**
    * userAgent affects the value read from navigator.userAgent, as well as the User-Agent header sent while fetching subresources.
    * It defaults to `Mozilla/5.0 (${process.platform}) AppleWebKit/537.36 (KHTML, like Gecko) jsdom/${jsdomVersion}`.
    */
  var userAgent: js.UndefOr[java.lang.String] = js.undefined
  var virtualConsole: js.UndefOr[VirtualConsole] = js.undefined
}

