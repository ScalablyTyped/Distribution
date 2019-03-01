package typings
package ibmDashMobilefirstLib.WLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var invocationContext: js.UndefOr[js.Any] = js.undefined
  var onFailure: js.UndefOr[js.Function1[/* response */ IResponse, scala.Unit]] = js.undefined
  var onSuccess: js.UndefOr[js.Function1[/* response */ IResponse, scala.Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    invocationContext: js.Any = null,
    onFailure: js.Function1[/* response */ IResponse, scala.Unit] = null,
    onSuccess: js.Function1[/* response */ IResponse, scala.Unit] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (invocationContext != null) __obj.updateDynamic("invocationContext")(invocationContext)
    if (onFailure != null) __obj.updateDynamic("onFailure")(onFailure)
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(onSuccess)
    __obj.asInstanceOf[Options]
  }
}

