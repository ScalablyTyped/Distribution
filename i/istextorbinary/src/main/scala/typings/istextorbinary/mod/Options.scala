package typings.istextorbinary.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var chunkBegin: js.UndefOr[Double] = js.undefined
  var chunkLength: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(chunkBegin: js.UndefOr[Double] = js.undefined, chunkLength: js.UndefOr[Double] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chunkBegin)) __obj.updateDynamic("chunkBegin")(chunkBegin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(chunkLength)) __obj.updateDynamic("chunkLength")(chunkLength.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

