package typings.httperr.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Configuration object for constructing HttpErrors. */
trait Config extends js.Object {
  /**
    *  The methods allowed for this URL.
    *  This property is only available for 405 Method Not Allowed errors
    *  and can be used to populate the Allow header.
    */
  var allowed: js.UndefOr[js.Array[String]] = js.undefined
  /** The underlying exception that caused the HTTP error. */
  var cause: js.UndefOr[Error] = js.undefined
  /** A detailed human-readable description of the error's cause and possible solutions. */
  var details: js.UndefOr[String] = js.undefined
  /**
    *  The location for which the request should be repeated.
    *  This property is only available for 451 Redirect (Microsoft) errors and can be
    *  used to populate the proprietary X-MS-Location response header.
    */
  var location: js.UndefOr[js.Any] = js.undefined
  /** A descriptive human-readable title describing the error's cause. */
  var message: js.UndefOr[String] = js.undefined
  /**
    *  The parameters with which the request should be retried.
    *  This property is only available for 449 Retry With (Microsoft) errors and can be
    *  used to populate the response status message.
    */
  var parameters: js.UndefOr[js.Any] = js.undefined
  /**
    *  The minimum delay before the request should be attempted again.
    *  This property is only available for 429 Too Many Requests and 420 Enhance Your Calm
    *  (Twitter API) errors and can be used to populate the Retry-After header.
    */
  var retryAfter: js.UndefOr[js.Any] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    allowed: js.Array[String] = null,
    cause: Error = null,
    details: String = null,
    location: js.Any = null,
    message: String = null,
    parameters: js.Any = null,
    retryAfter: js.Any = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (allowed != null) __obj.updateDynamic("allowed")(allowed.asInstanceOf[js.Any])
    if (cause != null) __obj.updateDynamic("cause")(cause.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (retryAfter != null) __obj.updateDynamic("retryAfter")(retryAfter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

