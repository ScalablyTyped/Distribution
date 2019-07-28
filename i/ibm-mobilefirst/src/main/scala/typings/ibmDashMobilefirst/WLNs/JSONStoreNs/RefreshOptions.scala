package typings.ibmDashMobilefirst.WLNs.JSONStoreNs

import typings.ibmDashMobilefirst.WLNs.IResponse
import typings.ibmDashMobilefirst.WLNs.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshOptions extends Options {
  var push: Boolean
}

object RefreshOptions {
  @scala.inline
  def apply(
    push: Boolean,
    invocationContext: js.Any = null,
    onFailure: /* response */ IResponse => Unit = null,
    onSuccess: /* response */ IResponse => Unit = null
  ): RefreshOptions = {
    val __obj = js.Dynamic.literal(push = push)
    if (invocationContext != null) __obj.updateDynamic("invocationContext")(invocationContext)
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction1(onFailure))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction1(onSuccess))
    __obj.asInstanceOf[RefreshOptions]
  }
}

