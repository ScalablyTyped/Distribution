package typings
package gotLib.gotMod.gotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RetryOptions extends js.Object {
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

