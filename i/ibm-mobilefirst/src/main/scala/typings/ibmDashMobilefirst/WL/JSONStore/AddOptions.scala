package typings.ibmDashMobilefirst.WL.JSONStore

import typings.ibmDashMobilefirst.WL.IResponse
import typings.ibmDashMobilefirst.WL.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddOptions extends Options {
  var additionalSearchFields: js.UndefOr[js.Any] = js.undefined
  var markDirty: js.UndefOr[Boolean] = js.undefined
  /**
    * @deprecated
    */
  var push: js.UndefOr[Boolean] = js.undefined
}

object AddOptions {
  @scala.inline
  def apply(
    additionalSearchFields: js.Any = null,
    invocationContext: js.Any = null,
    markDirty: js.UndefOr[Boolean] = js.undefined,
    onFailure: /* response */ IResponse => Unit = null,
    onSuccess: /* response */ IResponse => Unit = null,
    push: js.UndefOr[Boolean] = js.undefined
  ): AddOptions = {
    val __obj = js.Dynamic.literal()
    if (additionalSearchFields != null) __obj.updateDynamic("additionalSearchFields")(additionalSearchFields)
    if (invocationContext != null) __obj.updateDynamic("invocationContext")(invocationContext)
    if (!js.isUndefined(markDirty)) __obj.updateDynamic("markDirty")(markDirty)
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction1(onFailure))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction1(onSuccess))
    if (!js.isUndefined(push)) __obj.updateDynamic("push")(push)
    __obj.asInstanceOf[AddOptions]
  }
}

