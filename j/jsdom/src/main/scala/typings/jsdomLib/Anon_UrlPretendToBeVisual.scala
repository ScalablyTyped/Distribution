package typings
package jsdomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_UrlPretendToBeVisual extends js.Object {
  /**
    * contentType affects the value read from document.contentType, and how the document is parsed: as HTML or as XML.
    * Values that are not "text/html" or an XML mime type will throw. It defaults to "text/html".
    */
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * jsdom does not have the capability to render visual content, and will act like a headless browser by default.
    * It provides hints to web pages through APIs such as document.hidden that their content is not visible.
    *
    * When the pretendToBeVisual option is set to true, jsdom will pretend that it is rendering and displaying
    * content.
    */
  var pretendToBeVisual: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The maximum size in code units for the separate storage areas used by localStorage and sessionStorage.
    * Attempts to store data larger than this limit will cause a DOMException to be thrown. By default, it is set
    * to 5,000,000 code units per origin, as inspired by the HTML specification.
    */
  var storageQuota: js.UndefOr[scala.Double] = js.undefined
  /**
    * url sets the value returned by window.location, document.URL, and document.documentURI,
    * and affects things like resolution of relative URLs within the document
    * and the same-origin restrictions and referrer used while fetching subresources.
    * It defaults to "about:blank".
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

