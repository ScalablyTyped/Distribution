package typings.ibmDashMobilefirst.WLNs.JSONStoreNs

import typings.ibmDashMobilefirst.WLNs.IResponse
import typings.ibmDashMobilefirst.WLNs.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EraseOptions extends Options {
  var push: js.UndefOr[Boolean] = js.undefined
}

object EraseOptions {
  @scala.inline
  def apply(
    invocationContext: js.Any = null,
    onFailure: /* response */ IResponse => Unit = null,
    onSuccess: /* response */ IResponse => Unit = null,
    push: js.UndefOr[Boolean] = js.undefined
  ): EraseOptions = {
    val __obj = js.Dynamic.literal()
    if (invocationContext != null) __obj.updateDynamic("invocationContext")(invocationContext)
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction1(onFailure))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction1(onSuccess))
    if (!js.isUndefined(push)) __obj.updateDynamic("push")(push)
    __obj.asInstanceOf[EraseOptions]
  }
}

