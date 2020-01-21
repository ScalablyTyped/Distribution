package typings.hapiShot.mod

import typings.hapiShot.AnonClose
import typings.node.Buffer
import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  /** a string specifying the HTTP HOST header value to be used if no header is provided, and the url does not include an authority component. Defaults to 'localhost'. */
  var authority: js.UndefOr[String] = js.undefined
  /** an optional object containing request headers. */
  var headers: js.UndefOr[Headers] = js.undefined
  /** a string specifying the HTTP request method, defaulting to 'GET'. */
  var method: js.UndefOr[String] = js.undefined
  /** an optional request payload. Can be a string, Buffer, Stream or object. */
  var payload: js.UndefOr[String | Buffer | Stream | js.Object] = js.undefined
  /** an optional string specifying the client remote address. Defaults to '127.0.0.1'. */
  var remoteAddress: js.UndefOr[String] = js.undefined
  /** an object containing flags to simulate various conditions: */
  var simulate: js.UndefOr[AnonClose] = js.undefined
  /** a string specifying the request URL. */
  var url: String
  /** Optional flag to validate this options object. Defaults to true. */
  var validate: js.UndefOr[Boolean] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    url: String,
    authority: String = null,
    headers: Headers = null,
    method: String = null,
    payload: String | Buffer | Stream | js.Object = null,
    remoteAddress: String = null,
    simulate: AnonClose = null,
    validate: js.UndefOr[Boolean] = js.undefined
  ): RequestOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (authority != null) __obj.updateDynamic("authority")(authority.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (remoteAddress != null) __obj.updateDynamic("remoteAddress")(remoteAddress.asInstanceOf[js.Any])
    if (simulate != null) __obj.updateDynamic("simulate")(simulate.asInstanceOf[js.Any])
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
}

