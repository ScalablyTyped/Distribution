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
    onFailure: /* response */ IResponse => scala.Unit = null,
    onSuccess: /* response */ IResponse => scala.Unit = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (invocationContext != null) __obj.updateDynamic("invocationContext")(invocationContext)
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction1(onFailure))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction1(onSuccess))
    __obj.asInstanceOf[Options]
  }
}

