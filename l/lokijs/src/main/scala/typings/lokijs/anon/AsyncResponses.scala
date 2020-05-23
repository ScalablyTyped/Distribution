package typings.lokijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncResponses extends js.Object {
  var asyncResponses: js.UndefOr[Boolean] = js.undefined
  var asyncTimeout: js.UndefOr[Double] = js.undefined
}

object AsyncResponses {
  @scala.inline
  def apply(
    asyncResponses: js.UndefOr[Boolean] = js.undefined,
    asyncTimeout: js.UndefOr[Double] = js.undefined
  ): AsyncResponses = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(asyncResponses)) __obj.updateDynamic("asyncResponses")(asyncResponses.get.asInstanceOf[js.Any])
    if (!js.isUndefined(asyncTimeout)) __obj.updateDynamic("asyncTimeout")(asyncTimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncResponses]
  }
}

