package typings.jquery.JQuery.Ajax

import typings.std.Event
import typings.std.XMLHttpRequestResponseType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// Writable properties on XMLHttpRequest
/* Inlined parent std.Partial<std.Pick<std.XMLHttpRequest, 'onreadystatechange' | 'responseType' | 'timeout' | 'withCredentials'>> */
trait XHRFields extends js.Object {
  var msCaching: js.UndefOr[String] = js.undefined
  var onreadystatechange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.undefined
  var responseType: js.UndefOr[XMLHttpRequestResponseType] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object XHRFields {
  @scala.inline
  def apply(
    msCaching: String = null,
    onreadystatechange: js.ThisFunction1[XHRFields, /* ev */ Event, _] = null,
    responseType: XMLHttpRequestResponseType = null,
    timeout: js.UndefOr[Double] = js.undefined,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): XHRFields = {
    val __obj = js.Dynamic.literal()
    if (msCaching != null) __obj.updateDynamic("msCaching")(msCaching.asInstanceOf[js.Any])
    if (onreadystatechange != null) __obj.updateDynamic("onreadystatechange")(onreadystatechange.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[XHRFields]
  }
}

