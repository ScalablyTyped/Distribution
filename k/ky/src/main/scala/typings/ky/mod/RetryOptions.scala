package typings.ky.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetryOptions extends js.Object {
  /**
  	The HTTP status codes allowed to retry with a `Retry-After` header.
  	@default [413, 429, 503]
  	*/
  var afterStatusCodes: js.UndefOr[js.Array[Double]] = js.undefined
  /**
  	The number of times to retry failed requests.
  	@default 2
  	*/
  var limit: js.UndefOr[Double] = js.undefined
  /**
  	If the `Retry-After` header is greater than `maxRetryAfter`, the request will be canceled.
  	@default Infinity
  	*/
  var maxRetryAfter: js.UndefOr[Double] = js.undefined
  /**
  	The HTTP methods allowed to retry.
  	@default ['get', 'put', 'head', 'delete', 'options', 'trace']
  	*/
  var methods: js.UndefOr[js.Array[String]] = js.undefined
  /**
  	The HTTP status codes allowed to retry.
  	@default [408, 413, 429, 500, 502, 503, 504]
  	*/
  var statusCodes: js.UndefOr[js.Array[Double]] = js.undefined
}

object RetryOptions {
  @scala.inline
  def apply(
    afterStatusCodes: js.Array[Double] = null,
    limit: Int | Double = null,
    maxRetryAfter: Int | Double = null,
    methods: js.Array[String] = null,
    statusCodes: js.Array[Double] = null
  ): RetryOptions = {
    val __obj = js.Dynamic.literal()
    if (afterStatusCodes != null) __obj.updateDynamic("afterStatusCodes")(afterStatusCodes.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (maxRetryAfter != null) __obj.updateDynamic("maxRetryAfter")(maxRetryAfter.asInstanceOf[js.Any])
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    if (statusCodes != null) __obj.updateDynamic("statusCodes")(statusCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryOptions]
  }
}

