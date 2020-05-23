package typings.lambdaWrapper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Handler[THandlerName /* <: String */] extends js.Object {
  var handler: js.UndefOr[THandlerName] = js.undefined
}

object Handler {
  @scala.inline
  def apply[THandlerName](handler: THandlerName = null): Handler[THandlerName] = {
    val __obj = js.Dynamic.literal()
    if (handler != null) __obj.updateDynamic("handler")(handler.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handler[THandlerName]]
  }
}

