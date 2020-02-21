package typings.jsdom.mod

import typings.jsdom.jsdomStrings.`outside-only`
import typings.jsdom.jsdomStrings.dangerously
import typings.jsdom.jsdomStrings.usable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstructorOptions extends BaseOptions {
  /**
  		 * contentType affects the value read from document.contentType, and how the document is parsed: as HTML or as XML.
  		 * Values that are not "text/html" or an XML mime type will throw. It defaults to "text/html".
  		 */
  var contentType: js.UndefOr[String] = js.undefined
  /**
  		 * The maximum size in code units for the separate storage areas used by localStorage and sessionStorage.
  		 * Attempts to store data larger than this limit will cause a DOMException to be thrown. By default, it is set
  		 * to 5,000,000 code units per origin, as inspired by the HTML specification.
  		 *
  		 * @default 5_000_000
  		 */
  var storageQuota: js.UndefOr[Double] = js.undefined
  /**
  		 * url sets the value returned by window.location, document.URL, and document.documentURI,
  		 * and affects things like resolution of relative URLs within the document
  		 * and the same-origin restrictions and referrer used while fetching subresources.
  		 * It defaults to "about:blank".
  		 */
  var url: js.UndefOr[String] = js.undefined
}

object ConstructorOptions {
  @scala.inline
  def apply(
    beforeParse: /* window */ DOMWindow => Unit = null,
    contentType: String = null,
    cookieJar: CookieJar = null,
    includeNodeLocations: js.UndefOr[Boolean] = js.undefined,
    pretendToBeVisual: js.UndefOr[Boolean] = js.undefined,
    referrer: String = null,
    resources: usable | ResourceLoader = null,
    runScripts: dangerously | `outside-only` = null,
    storageQuota: Int | Double = null,
    url: String = null,
    userAgent: String = null,
    virtualConsole: VirtualConsole = null
  ): ConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (beforeParse != null) __obj.updateDynamic("beforeParse")(js.Any.fromFunction1(beforeParse))
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (cookieJar != null) __obj.updateDynamic("cookieJar")(cookieJar.asInstanceOf[js.Any])
    if (!js.isUndefined(includeNodeLocations)) __obj.updateDynamic("includeNodeLocations")(includeNodeLocations.asInstanceOf[js.Any])
    if (!js.isUndefined(pretendToBeVisual)) __obj.updateDynamic("pretendToBeVisual")(pretendToBeVisual.asInstanceOf[js.Any])
    if (referrer != null) __obj.updateDynamic("referrer")(referrer.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (runScripts != null) __obj.updateDynamic("runScripts")(runScripts.asInstanceOf[js.Any])
    if (storageQuota != null) __obj.updateDynamic("storageQuota")(storageQuota.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent.asInstanceOf[js.Any])
    if (virtualConsole != null) __obj.updateDynamic("virtualConsole")(virtualConsole.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructorOptions]
  }
}

