package typings
package greasemonkeyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Onabort extends js.Object {
  var onabort: js.UndefOr[js.Function1[/* response */ GMXMLHttpRequestResponse, _]] = js.undefined
  var onerror: js.UndefOr[js.Function1[/* response */ GMXMLHttpRequestResponse, _]] = js.undefined
  var onload: js.UndefOr[js.Function1[/* response */ GMXMLHttpRequestResponse, _]] = js.undefined
  var onprogress: js.UndefOr[js.Function1[/* response */ GMXMLHttpRequestProgressResponse, _]] = js.undefined
}

object Anon_Onabort {
  @scala.inline
  def apply(
    onabort: /* response */ GMXMLHttpRequestResponse => _ = null,
    onerror: /* response */ GMXMLHttpRequestResponse => _ = null,
    onload: /* response */ GMXMLHttpRequestResponse => _ = null,
    onprogress: /* response */ GMXMLHttpRequestProgressResponse => _ = null
  ): Anon_Onabort = {
    val __obj = js.Dynamic.literal()
    if (onabort != null) __obj.updateDynamic("onabort")(js.Any.fromFunction1(onabort))
    if (onerror != null) __obj.updateDynamic("onerror")(js.Any.fromFunction1(onerror))
    if (onload != null) __obj.updateDynamic("onload")(js.Any.fromFunction1(onload))
    if (onprogress != null) __obj.updateDynamic("onprogress")(js.Any.fromFunction1(onprogress))
    __obj.asInstanceOf[Anon_Onabort]
  }
}

