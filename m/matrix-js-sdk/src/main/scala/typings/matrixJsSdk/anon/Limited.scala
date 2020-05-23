package typings.matrixJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Limited extends js.Object {
  var limited: js.UndefOr[Boolean] = js.undefined
  var results: js.Array[Displayname]
}

object Limited {
  @scala.inline
  def apply(results: js.Array[Displayname], limited: js.UndefOr[Boolean] = js.undefined): Limited = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    if (!js.isUndefined(limited)) __obj.updateDynamic("limited")(limited.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Limited]
  }
}

