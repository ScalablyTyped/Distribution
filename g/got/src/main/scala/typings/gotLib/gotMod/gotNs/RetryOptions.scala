package typings
package gotLib.gotMod.gotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetryOptions extends js.Object {
  /**
    * Allowed error codes.
    */
  var errorCodes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var maxRetryAfter: js.UndefOr[scala.Double] = js.undefined
  var methods: js.UndefOr[
    js.Array[
      gotLib.gotLibStrings.GET | gotLib.gotLibStrings.PUT | gotLib.gotLibStrings.HEAD | gotLib.gotLibStrings.DELETE | gotLib.gotLibStrings.OPTIONS | gotLib.gotLibStrings.TRACE
    ]
  ] = js.undefined
  var retries: js.UndefOr[scala.Double | RetryFunction] = js.undefined
  var statusCodes: js.UndefOr[
    js.Array[
      gotLib.gotLibNumbers.`408` | gotLib.gotLibNumbers.`413` | gotLib.gotLibNumbers.`429` | gotLib.gotLibNumbers.`500` | gotLib.gotLibNumbers.`502` | gotLib.gotLibNumbers.`503` | gotLib.gotLibNumbers.`504`
    ]
  ] = js.undefined
}

object RetryOptions {
  @scala.inline
  def apply(
    errorCodes: js.Array[java.lang.String] = null,
    maxRetryAfter: scala.Int | scala.Double = null,
    methods: js.Array[
      gotLib.gotLibStrings.GET | gotLib.gotLibStrings.PUT | gotLib.gotLibStrings.HEAD | gotLib.gotLibStrings.DELETE | gotLib.gotLibStrings.OPTIONS | gotLib.gotLibStrings.TRACE
    ] = null,
    retries: scala.Double | RetryFunction = null,
    statusCodes: js.Array[
      gotLib.gotLibNumbers.`408` | gotLib.gotLibNumbers.`413` | gotLib.gotLibNumbers.`429` | gotLib.gotLibNumbers.`500` | gotLib.gotLibNumbers.`502` | gotLib.gotLibNumbers.`503` | gotLib.gotLibNumbers.`504`
    ] = null
  ): RetryOptions = {
    val __obj = js.Dynamic.literal()
    if (errorCodes != null) __obj.updateDynamic("errorCodes")(errorCodes)
    if (maxRetryAfter != null) __obj.updateDynamic("maxRetryAfter")(maxRetryAfter.asInstanceOf[js.Any])
    if (methods != null) __obj.updateDynamic("methods")(methods)
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    if (statusCodes != null) __obj.updateDynamic("statusCodes")(statusCodes)
    __obj.asInstanceOf[RetryOptions]
  }
}

