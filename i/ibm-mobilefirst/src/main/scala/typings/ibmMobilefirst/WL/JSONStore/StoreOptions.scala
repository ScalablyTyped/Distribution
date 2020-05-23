package typings.ibmMobilefirst.WL.JSONStore

import typings.ibmMobilefirst.WL.IResponse
import typings.ibmMobilefirst.WL.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreOptions extends Options {
  var additionalSearchFields: js.UndefOr[js.Object] = js.undefined
  var push: js.UndefOr[Boolean] = js.undefined
}

object StoreOptions {
  @scala.inline
  def apply(
    additionalSearchFields: js.Object = null,
    invocationContext: js.Any = null,
    onFailure: /* response */ IResponse => Unit = null,
    onSuccess: /* response */ IResponse => Unit = null,
    push: js.UndefOr[Boolean] = js.undefined
  ): StoreOptions = {
    val __obj = js.Dynamic.literal()
    if (additionalSearchFields != null) __obj.updateDynamic("additionalSearchFields")(additionalSearchFields.asInstanceOf[js.Any])
    if (invocationContext != null) __obj.updateDynamic("invocationContext")(invocationContext.asInstanceOf[js.Any])
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction1(onFailure))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction1(onSuccess))
    if (!js.isUndefined(push)) __obj.updateDynamic("push")(push.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreOptions]
  }
}

