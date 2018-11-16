package typings
package greasemonkeyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////
// XMLHttpRequest
////////////////
/**
 * Request options for {@link GM_xmlhttpRequest}.
 * @see {@link http://wiki.greasespot.net/GM_xmlhttpRequest#Arguments}
 */

trait GMXMLHttpRequestOptions extends js.Object {
  var binary: js.UndefOr[scala.Boolean] = js.undefined
  var context: js.UndefOr[js.Any] = js.undefined
  var data: js.UndefOr[java.lang.String] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var method: java.lang.String
  var onabort: js.UndefOr[js.Function1[/* response */ GMXMLHttpRequestResponse, _]] = js.undefined
  var onerror: js.UndefOr[js.Function1[/* response */ GMXMLHttpRequestResponse, _]] = js.undefined
  var onload: js.UndefOr[js.Function1[/* response */ GMXMLHttpRequestResponse, _]] = js.undefined
  var onprogress: js.UndefOr[js.Function1[/* response */ GMXMLHttpRequestProgressResponse, _]] = js.undefined
  var onreadystatechange: js.UndefOr[js.Function1[/* response */ GMXMLHttpRequestResponse, _]] = js.undefined
  var ontimeout: js.UndefOr[js.Function1[/* response */ GMXMLHttpRequestResponse, _]] = js.undefined
  var overrideMimeType: js.UndefOr[java.lang.String] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var synchronous: js.UndefOr[scala.Boolean] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var upload: js.UndefOr[Anon_Onerror] = js.undefined
  var url: java.lang.String
  var user: js.UndefOr[java.lang.String] = js.undefined
}

