package typings
package ibmDashMobilefirstLib.WLNs.ClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChallengeHandlerSubmitLoginFormOptions extends js.Object {
  var headers: js.UndefOr[js.Object] = js.undefined
  var parameters: js.UndefOr[js.Object] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object ChallengeHandlerSubmitLoginFormOptions {
  @scala.inline
  def apply(headers: js.Object = null, parameters: js.Object = null, timeout: scala.Int | scala.Double = null): ChallengeHandlerSubmitLoginFormOptions = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChallengeHandlerSubmitLoginFormOptions]
  }
}

