package typings.istextorbinary.istextorbinaryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var chunkBegin: js.UndefOr[Double] = js.undefined
  var chunkLength: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(chunkBegin: Int | Double = null, chunkLength: Int | Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (chunkBegin != null) __obj.updateDynamic("chunkBegin")(chunkBegin.asInstanceOf[js.Any])
    if (chunkLength != null) __obj.updateDynamic("chunkLength")(chunkLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

