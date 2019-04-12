package typings
package atHapiShotLib.atHapiShotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  /** a string specifying the HTTP HOST header value to be used if no header is provided, and the url does not include an authority component. Defaults to 'localhost'. */
  var authority: js.UndefOr[java.lang.String] = js.undefined
  /** an optional object containing request headers. */
  var headers: js.UndefOr[Headers] = js.undefined
  /** a string specifying the HTTP request method, defaulting to 'GET'. */
  var method: js.UndefOr[java.lang.String] = js.undefined
  /** an optional request payload. Can be a string, Buffer, Stream or object. */
  var payload: js.UndefOr[java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Stream | js.Object] = js.undefined
  /** an optional string specifying the client remote address. Defaults to '127.0.0.1'. */
  var remoteAddress: js.UndefOr[java.lang.String] = js.undefined
  /** an object containing flags to simulate various conditions: */
  var simulate: js.UndefOr[atHapiShotLib.Anon_Close] = js.undefined
  /** a string specifying the request URL. */
  var url: java.lang.String
  /** Optional flag to validate this options object. Defaults to true. */
  var validate: js.UndefOr[scala.Boolean] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    url: java.lang.String,
    authority: java.lang.String = null,
    headers: Headers = null,
    method: java.lang.String = null,
    payload: java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Stream | js.Object = null,
    remoteAddress: java.lang.String = null,
    simulate: atHapiShotLib.Anon_Close = null,
    validate: js.UndefOr[scala.Boolean] = js.undefined
  ): RequestOptions = {
    val __obj = js.Dynamic.literal(url = url)
    if (authority != null) __obj.updateDynamic("authority")(authority)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (method != null) __obj.updateDynamic("method")(method)
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (remoteAddress != null) __obj.updateDynamic("remoteAddress")(remoteAddress)
    if (simulate != null) __obj.updateDynamic("simulate")(simulate)
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[RequestOptions]
  }
}

