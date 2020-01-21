package typings.losslessJson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCircularRefs extends js.Object {
  var circularRefs: js.UndefOr[Boolean] = js.undefined
}

object AnonCircularRefs {
  @scala.inline
  def apply(circularRefs: js.UndefOr[Boolean] = js.undefined): AnonCircularRefs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(circularRefs)) __obj.updateDynamic("circularRefs")(circularRefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCircularRefs]
  }
}

