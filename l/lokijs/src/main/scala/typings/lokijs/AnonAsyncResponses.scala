package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAsyncResponses extends js.Object {
  var asyncResponses: js.UndefOr[Boolean] = js.undefined
  var asyncTimeout: js.UndefOr[Double] = js.undefined
}

object AnonAsyncResponses {
  @scala.inline
  def apply(asyncResponses: js.UndefOr[Boolean] = js.undefined, asyncTimeout: Int | Double = null): AnonAsyncResponses = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(asyncResponses)) __obj.updateDynamic("asyncResponses")(asyncResponses.asInstanceOf[js.Any])
    if (asyncTimeout != null) __obj.updateDynamic("asyncTimeout")(asyncTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAsyncResponses]
  }
}

