package typings.ibmDashMobilefirst.WL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResponse extends js.Object {
  var invocationContext: js.UndefOr[js.Any] = js.undefined
}

object IResponse {
  @scala.inline
  def apply(invocationContext: js.Any = null): IResponse = {
    val __obj = js.Dynamic.literal()
    if (invocationContext != null) __obj.updateDynamic("invocationContext")(invocationContext)
    __obj.asInstanceOf[IResponse]
  }
}

