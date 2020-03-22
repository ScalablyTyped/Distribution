package typings.lambdaWrapper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHandler[THandlerName /* <: String */] extends js.Object {
  var handler: js.UndefOr[THandlerName] = js.undefined
}

object AnonHandler {
  @scala.inline
  def apply[THandlerName /* <: String */](handler: THandlerName = null): AnonHandler[THandlerName] = {
    val __obj = js.Dynamic.literal()
    if (handler != null) __obj.updateDynamic("handler")(handler.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHandler[THandlerName]]
  }
}

