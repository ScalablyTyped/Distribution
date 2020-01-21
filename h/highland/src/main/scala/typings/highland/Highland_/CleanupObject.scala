package typings.highland.Highland_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CleanupObject extends js.Object {
  var continueOnError: js.UndefOr[Boolean] = js.undefined
  var onDestroy: js.UndefOr[js.Function] = js.undefined
}

object CleanupObject {
  @scala.inline
  def apply(continueOnError: js.UndefOr[Boolean] = js.undefined, onDestroy: js.Function = null): CleanupObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(continueOnError)) __obj.updateDynamic("continueOnError")(continueOnError.asInstanceOf[js.Any])
    if (onDestroy != null) __obj.updateDynamic("onDestroy")(onDestroy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CleanupObject]
  }
}

