package typings
package httperrLib.httperrMod

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
  var allowed: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The underlying exception that caused the HTTP error. */
  var cause: js.UndefOr[stdLib.Error] = js.undefined
  /** A detailed human-readable description of the error's cause and possible solutions. */
  var details: js.UndefOr[java.lang.String] = js.undefined
  /**
       *  The location for which the request should be repeated.
       *  This property is only available for 451 Redirect (Microsoft) errors and can be
       *  used to populate the proprietary X-MS-Location response header.
       */
  var location: js.UndefOr[js.Any] = js.undefined
  /** A descriptive human-readable title describing the error's cause. */
  var message: js.UndefOr[java.lang.String] = js.undefined
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

